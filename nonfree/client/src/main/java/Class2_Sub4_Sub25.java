import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class2_Sub4_Sub25 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
	private int anInt2928 = 5;

	@OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
	private int anInt2933 = 2048;

	@OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
	private int anInt2936 = 1;

	@OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
	private int anInt2934 = 0;

	@OriginalMember(owner = "client!ob", name = "eb", descriptor = "[B")
	private byte[] aByteArray34 = new byte[512];

	@OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
	private int anInt2937 = 5;

	@OriginalMember(owner = "client!ob", name = "bb", descriptor = "[S")
	private short[] aShortArray107 = new short[512];

	@OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
	private int anInt2938 = 2;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V")
	private void method2076() {
		@Pc(19) Random local19 = new Random((long) this.anInt2934);
		this.aShortArray107 = new short[512];
		if (this.anInt2933 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray107[local31] = (short) Static120.method1889(local19, this.anInt2933);
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	@Override
	public void method3133() {
		this.aByteArray34 = Static204.method2971(this.anInt2934);
		this.method2076();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2928 = this.anInt2937 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt2934 = arg1.method1534();
		} else if (arg0 == 2) {
			this.anInt2933 = arg1.method1557();
		} else if (arg0 == 3) {
			this.anInt2938 = arg1.method1534();
		} else if (arg0 == 4) {
			this.anInt2936 = arg1.method1534();
		} else if (arg0 == 5) {
			this.anInt2928 = arg1.method1534();
		} else if (arg0 == 6) {
			this.anInt2937 = arg1.method1534();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(24) int local24 = Static2.anIntArray5[arg0] * this.anInt2937 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static118.anInt2608; local34++) {
				Static185.anInt3860 = Integer.MAX_VALUE;
				Static146.anInt3132 = Integer.MAX_VALUE;
				Static61.anInt1285 = Integer.MAX_VALUE;
				Static158.anInt3383 = Integer.MAX_VALUE;
				@Pc(54) int local54 = Static141.anIntArray130[local34] * this.anInt2928 + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(150) int local150;
				for (@Pc(66) int local66 = local28 - 1; local66 <= local32; local66++) {
					@Pc(87) int local87 = this.aByteArray34[(local66 >= this.anInt2937 ? local66 - this.anInt2937 : local66) & 0xFF] & 0xFF;
					for (@Pc(91) int local91 = local58 - 1; local91 <= local62; local91++) {
						@Pc(120) int local120 = (this.aByteArray34[(this.anInt2928 > local91 ? local91 : local91 - this.anInt2928) + local87 & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = -(local91 << 12);
						@Pc(128) int local128 = local120 + 1;
						@Pc(134) int local134 = local124 + local54 - this.aShortArray107[local120];
						@Pc(147) int local147 = local24 - this.aShortArray107[local128] - (local66 << 12);
						local150 = this.anInt2936;
						@Pc(183) int local183;
						if (local150 == 1) {
							local183 = local147 * local147 + local134 * local134 >> 12;
						} else if (local150 == 3) {
							local134 = local134 < 0 ? -local134 : local134;
							local147 = local147 < 0 ? -local147 : local147;
							local183 = local147 >= local134 ? local147 : local134;
						} else if (local150 == 4) {
							local134 = (int) (Math.sqrt((double) ((float) (local134 >= 0 ? local134 : -local134) / 4096.0F)) * 4096.0D);
							local147 = (int) (Math.sqrt((double) ((float) (local147 >= 0 ? local147 : -local147) / 4096.0F)) * 4096.0D);
							local183 = local134 + local147;
							local183 = local183 * local183 >> 12;
						} else if (local150 == 5) {
							local147 *= local147;
							local134 *= local134;
							local183 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local134 + local147) / 1.6777216E7F))) * 4096.0D);
						} else if (local150 == 2) {
							local183 = (local134 < 0 ? -local134 : local134) + (local147 >= 0 ? local147 : -local147);
						} else {
							local183 = (int) (Math.sqrt((double) ((float) (local134 * local134 + local147 * local147) / 1.6777216E7F)) * 4096.0D);
						}
						if (local183 < Static158.anInt3383) {
							Static185.anInt3860 = Static146.anInt3132;
							Static146.anInt3132 = Static61.anInt1285;
							Static61.anInt1285 = Static158.anInt3383;
							Static158.anInt3383 = local183;
						} else if (local183 < Static61.anInt1285) {
							Static185.anInt3860 = Static146.anInt3132;
							Static146.anInt3132 = Static61.anInt1285;
							Static61.anInt1285 = local183;
						} else if (Static146.anInt3132 > local183) {
							Static185.anInt3860 = Static146.anInt3132;
							Static146.anInt3132 = local183;
						} else if (Static185.anInt3860 > local183) {
							Static185.anInt3860 = local183;
						}
					}
				}
				local150 = this.anInt2938;
				if (local150 == 0) {
					local11[local34] = Static158.anInt3383;
				} else if (local150 == 1) {
					local11[local34] = Static61.anInt1285;
				} else if (local150 == 3) {
					local11[local34] = Static146.anInt3132;
				} else if (local150 == 4) {
					local11[local34] = Static185.anInt3860;
				} else if (local150 == 2) {
					local11[local34] = Static61.anInt1285 - Static158.anInt3383;
				}
			}
		}
		return local11;
	}
}
