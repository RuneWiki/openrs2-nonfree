import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class2_Sub1_Sub28 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "[I")
	public static int[] anIntArray453 = new int[32];

	@OriginalMember(owner = "client!pe", name = "db", descriptor = "I")
	private int anInt3015;

	@OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
	private int anInt3022;

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
	private int anInt3023;

	static {
		@Pc(15) int local15 = 2;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			anIntArray453[local17] = local15 - 1;
			local15 += local15;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			for (@Pc(13) int local13 = 0; local13 < Static129.anInt3118; local13++) {
				@Pc(19) int local19 = Static166.anIntArray619[arg0];
				@Pc(26) int local26 = local19 * this.anInt3023 >> 12;
				@Pc(30) int local30 = Static163.anIntArray577[local13];
				@Pc(37) int local37 = local30 * this.anInt3015 >> 12;
				@Pc(47) int local47 = this.anInt3015 * (local30 % (4096 / this.anInt3015));
				@Pc(57) int local57 = local19 % (4096 / this.anInt3023) * this.anInt3023;
				if (this.anInt3022 > local57) {
					for (local37 -= local26; local37 < 0; local37 += 4) {
					}
					while (local37 > 3) {
						local37 -= 4;
					}
					if (local37 != 1) {
						local7[local13] = 0;
						continue;
					}
					if (this.anInt3022 > local47) {
						local7[local13] = 0;
						continue;
					}
				}
				if (local47 < this.anInt3022) {
					for (local37 -= local26; local37 < 0; local37 += 4) {
					}
					while (local37 > 3) {
						local37 -= 4;
					}
					if (local37 > 0) {
						local7[local13] = 0;
						continue;
					}
				}
				local7[local13] = 4096;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3015 = arg0.method2387();
		} else if (arg1 == 1) {
			this.anInt3023 = arg0.method2387();
		} else if (arg1 == 2) {
			this.anInt3022 = arg0.method2353();
		}
	}
}
