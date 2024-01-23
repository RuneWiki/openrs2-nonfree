import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class8_Sub3_Sub23 extends Class8_Sub3 {

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "[S")
	private short[] aShortArray26 = new short[512];

	@OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
	private int anInt3307 = 2048;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
	private int anInt3315 = 0;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
	private int anInt3311 = 2;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
	private int anInt3305 = 5;

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
	private int anInt3314 = 5;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "[B")
	private byte[] aByteArray29 = new byte[512];

	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
	private int anInt3318 = 1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3314 = this.anInt3305 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt3315 = arg1.method2334();
		} else if (arg0 == 2) {
			this.anInt3307 = arg1.method2375();
		} else if (arg0 == 3) {
			this.anInt3311 = arg1.method2334();
		} else if (arg0 == 4) {
			this.anInt3318 = arg1.method2334();
		} else if (arg0 == 5) {
			this.anInt3314 = arg1.method2334();
		} else if (arg0 == 6) {
			this.anInt3305 = arg1.method2334();
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		this.aByteArray29 = Static119.method1928(this.anInt3315);
		this.method2606();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(30) int local30 = Static33.anIntArray50[arg0] * this.anInt3305 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static239.anInt4789; local40++) {
				Static266.anInt5294 = Integer.MAX_VALUE;
				Static2.anInt7 = Integer.MAX_VALUE;
				Static284.anInt5587 = Integer.MAX_VALUE;
				Static161.anInt3264 = Integer.MAX_VALUE;
				@Pc(65) int local65 = this.anInt3314 * Static171.anIntArray258[local40] + 2048;
				@Pc(69) int local69 = local65 >> 12;
				@Pc(73) int local73 = local69 + 1;
				@Pc(161) int local161;
				for (@Pc(77) int local77 = local34 - 1; local77 <= local38; local77++) {
					@Pc(103) int local103 = this.aByteArray29[(local77 < this.anInt3305 ? local77 : local77 - this.anInt3305) & 0xFF] & 0xFF;
					for (@Pc(107) int local107 = local69 - 1; local107 <= local73; local107++) {
						@Pc(133) int local133 = (this.aByteArray29[local103 + (local107 < this.anInt3314 ? local107 : local107 - this.anInt3314) & 0xFF] & 0xFF) * 2;
						@Pc(137) int local137 = -(local107 << 12);
						@Pc(141) int local141 = local133 + 1;
						@Pc(146) int local146 = local137 + local65 - this.aShortArray26[local133];
						@Pc(158) int local158 = local30 - this.aShortArray26[local141] - (local77 << 12);
						local161 = this.anInt3318;
						@Pc(200) int local200;
						if (local161 == 1) {
							local200 = local146 * local146 + local158 * local158 >> 12;
						} else if (local161 == 3) {
							local158 = local158 < 0 ? -local158 : local158;
							local146 = local146 < 0 ? -local146 : local146;
							local200 = local158 >= local146 ? local158 : local146;
						} else if (local161 == 4) {
							local146 = (int) (Math.sqrt((double) ((float) (local146 >= 0 ? local146 : -local146) / 4096.0F)) * 4096.0D);
							local158 = (int) (Math.sqrt((double) ((float) (local158 < 0 ? -local158 : local158) / 4096.0F)) * 4096.0D);
							local200 = local158 + local146;
							local200 = local200 * local200 >> 12;
						} else if (local161 == 5) {
							local158 *= local158;
							local146 *= local146;
							local200 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local146 + local158) / 1.6777216E7F))) * 4096.0D);
						} else if (local161 == 2) {
							local200 = (local146 < 0 ? -local146 : local146) + (local158 < 0 ? -local158 : local158);
						} else {
							local200 = (int) (Math.sqrt((double) ((float) (local146 * local146 + local158 * local158) / 1.6777216E7F)) * 4096.0D);
						}
						if (local200 < Static161.anInt3264) {
							Static266.anInt5294 = Static2.anInt7;
							Static2.anInt7 = Static284.anInt5587;
							Static284.anInt5587 = Static161.anInt3264;
							Static161.anInt3264 = local200;
						} else if (Static284.anInt5587 > local200) {
							Static266.anInt5294 = Static2.anInt7;
							Static2.anInt7 = Static284.anInt5587;
							Static284.anInt5587 = local200;
						} else if (local200 < Static2.anInt7) {
							Static266.anInt5294 = Static2.anInt7;
							Static2.anInt7 = local200;
						} else if (local200 < Static266.anInt5294) {
							Static266.anInt5294 = local200;
						}
					}
				}
				local161 = this.anInt3311;
				if (local161 == 0) {
					local17[local40] = Static161.anInt3264;
				} else if (local161 == 1) {
					local17[local40] = Static284.anInt5587;
				} else if (local161 == 3) {
					local17[local40] = Static2.anInt7;
				} else if (local161 == 4) {
					local17[local40] = Static266.anInt5294;
				} else if (local161 == 2) {
					local17[local40] = Static284.anInt5587 - Static161.anInt3264;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(Z)V")
	private void method2606() {
		@Pc(12) Random local12 = new Random((long) this.anInt3315);
		this.aShortArray26 = new short[512];
		if (this.anInt3307 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray26[local25] = (short) Static293.method4280(this.anInt3307, local12);
			}
		}
	}
}
