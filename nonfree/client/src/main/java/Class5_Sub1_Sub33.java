import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class5_Sub1_Sub33 extends Class5_Sub1 {

	@OriginalMember(owner = "client!sv", name = "C", descriptor = "I")
	private int anInt7913 = 2048;

	@OriginalMember(owner = "client!sv", name = "B", descriptor = "I")
	private int anInt7912 = 1;

	@OriginalMember(owner = "client!sv", name = "E", descriptor = "I")
	private int anInt7915 = 2;

	@OriginalMember(owner = "client!sv", name = "D", descriptor = "I")
	private int anInt7914 = 5;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
	private int anInt7920 = 5;

	@OriginalMember(owner = "client!sv", name = "R", descriptor = "[B")
	private byte[] aByteArray112 = new byte[512];

	@OriginalMember(owner = "client!sv", name = "P", descriptor = "I")
	private int anInt7923 = 0;

	@OriginalMember(owner = "client!sv", name = "F", descriptor = "[S")
	private short[] aShortArray121 = new short[512];

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		this.aByteArray112 = Static328.method5197(this.anInt7923);
		this.method6413();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(24) int local24 = this.anInt7920 * Static295.anIntArray403[arg0] + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static147.anInt3075; local34++) {
				Static97.anInt2209 = Integer.MAX_VALUE;
				Static200.anInt3817 = Integer.MAX_VALUE;
				Static282.anInt5718 = Integer.MAX_VALUE;
				Static385.anInt7010 = Integer.MAX_VALUE;
				@Pc(53) int local53 = Static315.anIntArray425[local34] * this.anInt7914 + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(148) int local148;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(90) int local90 = this.aByteArray112[(local65 < this.anInt7920 ? local65 : local65 - this.anInt7920) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local57 - 1; local94 <= local61; local94++) {
						@Pc(119) int local119 = (this.aByteArray112[local90 + (local94 >= this.anInt7914 ? local94 - this.anInt7914 : local94) & 0xFF] & 0xFF) * 2;
						@Pc(123) int local123 = -(local94 << 12);
						@Pc(127) int local127 = local119 + 1;
						@Pc(132) int local132 = local123 + local53 - this.aShortArray121[local119];
						@Pc(145) int local145 = local24 - this.aShortArray121[local127] - (local65 << 12);
						local148 = this.anInt7912;
						@Pc(175) int local175;
						if (local148 == 1) {
							local175 = local145 * local145 + local132 * local132 >> 12;
						} else if (local148 == 3) {
							local145 = local145 >= 0 ? local145 : -local145;
							local132 = local132 >= 0 ? local132 : -local132;
							local175 = local145 >= local132 ? local145 : local132;
						} else if (local148 == 4) {
							local132 = (int) (Math.sqrt((double) ((float) (local132 >= 0 ? local132 : -local132) / 4096.0F)) * 4096.0D);
							local145 = (int) (Math.sqrt((double) ((float) (local145 < 0 ? -local145 : local145) / 4096.0F)) * 4096.0D);
							local175 = local132 + local145;
							local175 = local175 * local175 >> 12;
						} else if (local148 == 5) {
							local145 *= local145;
							local132 *= local132;
							local175 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local132 + local145) / 1.6777216E7F))) * 4096.0D);
						} else if (local148 == 2) {
							local175 = (local132 < 0 ? -local132 : local132) + (local145 < 0 ? -local145 : local145);
						} else {
							local175 = (int) (Math.sqrt((double) ((float) (local132 * local132 + local145 * local145) / 1.6777216E7F)) * 4096.0D);
						}
						if (local175 < Static385.anInt7010) {
							Static97.anInt2209 = Static200.anInt3817;
							Static200.anInt3817 = Static282.anInt5718;
							Static282.anInt5718 = Static385.anInt7010;
							Static385.anInt7010 = local175;
						} else if (Static282.anInt5718 > local175) {
							Static97.anInt2209 = Static200.anInt3817;
							Static200.anInt3817 = Static282.anInt5718;
							Static282.anInt5718 = local175;
						} else if (local175 < Static200.anInt3817) {
							Static97.anInt2209 = Static200.anInt3817;
							Static200.anInt3817 = local175;
						} else if (local175 < Static97.anInt2209) {
							Static97.anInt2209 = local175;
						}
					}
				}
				local148 = this.anInt7915;
				if (local148 == 0) {
					local11[local34] = Static385.anInt7010;
				} else if (local148 == 1) {
					local11[local34] = Static282.anInt5718;
				} else if (local148 == 3) {
					local11[local34] = Static200.anInt3817;
				} else if (local148 == 4) {
					local11[local34] = Static97.anInt2209;
				} else if (local148 == 2) {
					local11[local34] = Static282.anInt5718 - Static385.anInt7010;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "(I)V")
	private void method6413() {
		@Pc(12) Random local12 = new Random((long) this.anInt7923);
		this.aShortArray121 = new short[512];
		if (this.anInt7913 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray121[local24] = (short) Static542.method7398(local12, this.anInt7913);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7914 = this.anInt7920 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt7923 = arg1.method4220();
		} else if (arg0 == 2) {
			this.anInt7913 = arg1.method4227();
		} else if (arg0 == 3) {
			this.anInt7915 = arg1.method4220();
		} else if (arg0 == 4) {
			this.anInt7912 = arg1.method4220();
		} else if (arg0 == 5) {
			this.anInt7914 = arg1.method4220();
		} else if (arg0 == 6) {
			this.anInt7920 = arg1.method4220();
		}
	}
}
