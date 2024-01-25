import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class6_Sub3_Sub19 extends Class6_Sub3 {

	@OriginalMember(owner = "client!il", name = "K", descriptor = "I")
	private int anInt4152 = 2048;

	@OriginalMember(owner = "client!il", name = "M", descriptor = "I")
	private int anInt4154 = 5;

	@OriginalMember(owner = "client!il", name = "R", descriptor = "I")
	private int anInt4155 = 0;

	@OriginalMember(owner = "client!il", name = "N", descriptor = "[B")
	private byte[] aByteArray56 = new byte[512];

	@OriginalMember(owner = "client!il", name = "T", descriptor = "I")
	private int anInt4157 = 5;

	@OriginalMember(owner = "client!il", name = "L", descriptor = "I")
	private int anInt4153 = 1;

	@OriginalMember(owner = "client!il", name = "S", descriptor = "I")
	private int anInt4156 = 2;

	@OriginalMember(owner = "client!il", name = "V", descriptor = "[S")
	private short[] aShortArray63 = new short[512];

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt4157 = this.anInt4154 = arg1.method6019();
		} else if (arg0 == 1) {
			this.anInt4155 = arg1.method6019();
		} else if (arg0 == 2) {
			this.anInt4152 = arg1.method6044();
		} else if (arg0 == 3) {
			this.anInt4156 = arg1.method6019();
		} else if (arg0 == 4) {
			this.anInt4153 = arg1.method6019();
		} else if (arg0 == 5) {
			this.anInt4157 = arg1.method6019();
		} else if (arg0 == 6) {
			this.anInt4154 = arg1.method6019();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(30) int local30 = Static77.anIntArray116[arg0] * this.anInt4154 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static35.anInt670; local40++) {
				Static473.anInt8327 = Integer.MAX_VALUE;
				Static563.anInt9784 = Integer.MAX_VALUE;
				Static400.anInt7262 = Integer.MAX_VALUE;
				Static510.anInt8785 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static372.anIntArray481[local40] * this.anInt4157 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(158) int local158;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(96) int local96 = this.aByteArray56[(local71 < this.anInt4154 ? local71 : local71 - this.anInt4154) & 0xFF] & 0xFF;
					for (@Pc(100) int local100 = local63 - 1; local100 <= local67; local100++) {
						@Pc(129) int local129 = (this.aByteArray56[(local100 >= this.anInt4157 ? local100 - this.anInt4157 : local100) + local96 & 0xFF] & 0xFF) * 2;
						@Pc(134) int local134 = local129 + 1;
						@Pc(142) int local142 = local59 - this.aShortArray63[local129] - (local100 << 12);
						@Pc(155) int local155 = local30 - (local71 << 12) - this.aShortArray63[local134];
						local158 = this.anInt4153;
						@Pc(190) int local190;
						if (local158 == 1) {
							local190 = local142 * local142 + local155 * local155 >> 12;
						} else if (local158 == 3) {
							local142 = local142 >= 0 ? local142 : -local142;
							local155 = local155 >= 0 ? local155 : -local155;
							local190 = local155 >= local142 ? local155 : local142;
						} else if (local158 == 4) {
							local142 = (int) (Math.sqrt((double) ((float) (local142 < 0 ? -local142 : local142) / 4096.0F)) * 4096.0D);
							local155 = (int) (Math.sqrt((double) ((float) (local155 < 0 ? -local155 : local155) / 4096.0F)) * 4096.0D);
							local190 = local142 + local155;
							local190 = local190 * local190 >> 12;
						} else if (local158 == 5) {
							local142 *= local142;
							local155 *= local155;
							local190 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local142 + local155) / 1.6777216E7F))) * 4096.0D);
						} else if (local158 == 2) {
							local190 = (local155 >= 0 ? local155 : -local155) + (local142 < 0 ? -local142 : local142);
						} else {
							local190 = (int) (Math.sqrt((double) ((float) (local142 * local142 + local155 * local155) / 1.6777216E7F)) * 4096.0D);
						}
						if (local190 < Static510.anInt8785) {
							Static473.anInt8327 = Static563.anInt9784;
							Static563.anInt9784 = Static400.anInt7262;
							Static400.anInt7262 = Static510.anInt8785;
							Static510.anInt8785 = local190;
						} else if (local190 < Static400.anInt7262) {
							Static473.anInt8327 = Static563.anInt9784;
							Static563.anInt9784 = Static400.anInt7262;
							Static400.anInt7262 = local190;
						} else if (local190 < Static563.anInt9784) {
							Static473.anInt8327 = Static563.anInt9784;
							Static563.anInt9784 = local190;
						} else if (local190 < Static473.anInt8327) {
							Static473.anInt8327 = local190;
						}
					}
				}
				local158 = this.anInt4156;
				if (local158 == 0) {
					local17[local40] = Static510.anInt8785;
				} else if (local158 == 1) {
					local17[local40] = Static400.anInt7262;
				} else if (local158 == 3) {
					local17[local40] = Static563.anInt9784;
				} else if (local158 == 4) {
					local17[local40] = Static473.anInt8327;
				} else if (local158 == 2) {
					local17[local40] = Static400.anInt7262 - Static510.anInt8785;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
	@Override
	public void method7957() {
		this.aByteArray56 = Static160.method2482(this.anInt4155);
		this.method3557();
	}

	@OriginalMember(owner = "client!il", name = "j", descriptor = "(I)V")
	private void method3557() {
		@Pc(12) Random local12 = new Random((long) this.anInt4155);
		this.aShortArray63 = new short[512];
		if (this.anInt4152 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray63[local24] = (short) Static309.method4643(local12, this.anInt4152);
			}
		}
	}
}
