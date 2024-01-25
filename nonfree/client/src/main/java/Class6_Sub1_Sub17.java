import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class6_Sub1_Sub17 extends Class6_Sub1 {

	@OriginalMember(owner = "client!kw", name = "E", descriptor = "I")
	private int anInt5461 = 2048;

	@OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
	private int anInt5462 = 5;

	@OriginalMember(owner = "client!kw", name = "D", descriptor = "I")
	private int anInt5460 = 5;

	@OriginalMember(owner = "client!kw", name = "M", descriptor = "[B")
	private byte[] aByteArray63 = new byte[512];

	@OriginalMember(owner = "client!kw", name = "Q", descriptor = "I")
	private int anInt5467 = 1;

	@OriginalMember(owner = "client!kw", name = "O", descriptor = "I")
	private int anInt5465 = 2;

	@OriginalMember(owner = "client!kw", name = "P", descriptor = "I")
	private int anInt5466 = 0;

	@OriginalMember(owner = "client!kw", name = "L", descriptor = "[S")
	private short[] aShortArray61 = new short[512];

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kw", name = "h", descriptor = "(I)V")
	private void method4685() {
		@Pc(12) Random local12 = new Random((long) this.anInt5466);
		this.aShortArray61 = new short[512];
		if (this.anInt5461 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray61[local29] = (short) Static326.method5252(local12, this.anInt5461);
			}
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(24) int local24 = this.anInt5462 * Static346.anIntArray472[arg0] + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static289.anInt5549; local34++) {
				Static30.anInt1018 = Integer.MAX_VALUE;
				Static543.anInt9314 = Integer.MAX_VALUE;
				Static262.anInt5266 = Integer.MAX_VALUE;
				Static427.anInt9632 = Integer.MAX_VALUE;
				@Pc(53) int local53 = this.anInt5460 * Static473.anIntArray730[local34] + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(146) int local146;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(89) int local89 = this.aByteArray63[(local65 >= this.anInt5462 ? local65 - this.anInt5462 : local65) & 0xFF] & 0xFF;
					for (@Pc(93) int local93 = local57 - 1; local93 <= local61; local93++) {
						@Pc(118) int local118 = (this.aByteArray63[(this.anInt5460 <= local93 ? local93 - this.anInt5460 : local93) + local89 & 0xFF] & 0xFF) * 2;
						@Pc(123) int local123 = local118 + 1;
						@Pc(130) int local130 = local53 - this.aShortArray61[local118] - (local93 << 12);
						@Pc(143) int local143 = local24 - (local65 << 12) - this.aShortArray61[local123];
						local146 = this.anInt5467;
						@Pc(177) int local177;
						if (local146 == 1) {
							local177 = local143 * local143 + local130 * local130 >> 12;
						} else if (local146 == 3) {
							local143 = local143 < 0 ? -local143 : local143;
							local130 = local130 >= 0 ? local130 : -local130;
							local177 = local130 > local143 ? local130 : local143;
						} else if (local146 == 4) {
							local130 = (int) (Math.sqrt((double) ((float) (local130 >= 0 ? local130 : -local130) / 4096.0F)) * 4096.0D);
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local177 = local130 + local143;
							local177 = local177 * local177 >> 12;
						} else if (local146 == 5) {
							local143 *= local143;
							local130 *= local130;
							local177 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local130 + local143) / 1.6777216E7F))) * 4096.0D);
						} else if (local146 == 2) {
							local177 = (local130 < 0 ? -local130 : local130) + (local143 >= 0 ? local143 : -local143);
						} else {
							local177 = (int) (Math.sqrt((double) ((float) (local130 * local130 + local143 * local143) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static427.anInt9632 > local177) {
							Static30.anInt1018 = Static543.anInt9314;
							Static543.anInt9314 = Static262.anInt5266;
							Static262.anInt5266 = Static427.anInt9632;
							Static427.anInt9632 = local177;
						} else if (Static262.anInt5266 > local177) {
							Static30.anInt1018 = Static543.anInt9314;
							Static543.anInt9314 = Static262.anInt5266;
							Static262.anInt5266 = local177;
						} else if (Static543.anInt9314 > local177) {
							Static30.anInt1018 = Static543.anInt9314;
							Static543.anInt9314 = local177;
						} else if (local177 < Static30.anInt1018) {
							Static30.anInt1018 = local177;
						}
					}
				}
				local146 = this.anInt5465;
				if (local146 == 0) {
					local11[local34] = Static427.anInt9632;
				} else if (local146 == 1) {
					local11[local34] = Static262.anInt5266;
				} else if (local146 == 3) {
					local11[local34] = Static543.anInt9314;
				} else if (local146 == 4) {
					local11[local34] = Static30.anInt1018;
				} else if (local146 == 2) {
					local11[local34] = Static262.anInt5266 - Static427.anInt9632;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		this.aByteArray63 = Static106.method2195(this.anInt5466);
		this.method4685();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt5460 = this.anInt5462 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt5466 = arg1.method4966();
		} else if (arg0 == 2) {
			this.anInt5461 = arg1.method4999();
		} else if (arg0 == 3) {
			this.anInt5465 = arg1.method4966();
		} else if (arg0 == 4) {
			this.anInt5467 = arg1.method4966();
		} else if (arg0 == 5) {
			this.anInt5460 = arg1.method4966();
		} else if (arg0 == 6) {
			this.anInt5462 = arg1.method4966();
		}
	}
}
