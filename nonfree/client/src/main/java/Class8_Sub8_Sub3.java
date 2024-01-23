import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class8_Sub8_Sub3 extends Class8_Sub8 {

	@OriginalMember(owner = "client!ni", name = "E", descriptor = "Lclient!wn;")
	public Class182 aClass182_21 = new Class182();

	@OriginalMember(owner = "client!ni", name = "G", descriptor = "Lclient!dg;")
	public Class8_Sub8_Sub1 aClass8_Sub8_Sub1_2 = new Class8_Sub8_Sub1();

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "Lclient!ka;")
	private Class8_Sub8_Sub2 aClass8_Sub8_Sub2_1;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!ka;)V")
	public Class8_Sub8_Sub3(@OriginalArg(0) Class8_Sub8_Sub2 arg0) {
		this.aClass8_Sub8_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "([III)V")
	@Override
	public void method3707(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass8_Sub8_Sub1_2.method3707(arg0, arg1, arg2);
		for (@Pc(17) Class8_Sub5 local17 = (Class8_Sub5) this.aClass182_21.method4319(); local17 != null; local17 = (Class8_Sub5) this.aClass182_21.method4329()) {
			if (!this.aClass8_Sub8_Sub2_1.method2131(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt597 >= local27) {
						this.method2708(local17, local29, arg0, local27 + local29, local27);
						local17.anInt597 -= local27;
						break;
					}
					this.method2708(local17, local29, arg0, local27 + local29, local17.anInt597);
					local27 -= local17.anInt597;
					local29 += local17.anInt597;
				} while (!this.aClass8_Sub8_Sub2_1.method2127(arg0, local29, local27, local17));
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "()Lclient!kn;")
	@Override
	public Class8_Sub8 method3704() {
		while (true) {
			@Pc(9) Class8_Sub5 local9 = (Class8_Sub5) this.aClass182_21.method4329();
			if (local9 != null) {
				if (local9.aClass8_Sub8_Sub4_1 == null) {
					continue;
				}
				return local9.aClass8_Sub8_Sub4_1;
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	@Override
	public void method3705(@OriginalArg(0) int arg0) {
		this.aClass8_Sub8_Sub1_2.method3705(arg0);
		for (@Pc(15) Class8_Sub5 local15 = (Class8_Sub5) this.aClass182_21.method4319(); local15 != null; local15 = (Class8_Sub5) this.aClass182_21.method4329()) {
			if (!this.aClass8_Sub8_Sub2_1.method2131(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt597) {
						this.method2707(local25, local15);
						local15.anInt597 -= local25;
						break;
					}
					this.method2707(local15.anInt597, local15);
					local25 -= local15.anInt597;
				} while (!this.aClass8_Sub8_Sub2_1.method2127(null, 0, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZLclient!bg;)V")
	private void method2707(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub5 arg1) {
		if ((this.aClass8_Sub8_Sub2_1.anIntArray214[arg1.anInt599] & 0x4) != 0 && arg1.anInt607 < 0) {
			@Pc(36) int local36 = this.aClass8_Sub8_Sub2_1.anIntArray212[arg1.anInt599] / Static264.anInt5577;
			@Pc(47) int local47 = (local36 + 1048575 - arg1.anInt602) / local36;
			arg1.anInt602 = local36 * arg0 + arg1.anInt602 & 0xFFFFF;
			if (arg0 >= local47) {
				if (this.aClass8_Sub8_Sub2_1.anIntArray217[arg1.anInt599] == 0) {
					arg1.aClass8_Sub8_Sub4_1 = Static309.method3740(arg1.aClass8_Sub20_Sub1_1, arg1.aClass8_Sub8_Sub4_1.method3721(), arg1.aClass8_Sub8_Sub4_1.method3713(), arg1.aClass8_Sub8_Sub4_1.method3730());
				} else {
					arg1.aClass8_Sub8_Sub4_1 = Static309.method3740(arg1.aClass8_Sub20_Sub1_1, arg1.aClass8_Sub8_Sub4_1.method3721(), 0, arg1.aClass8_Sub8_Sub4_1.method3730());
					this.aClass8_Sub8_Sub2_1.method2143(arg1.aClass8_Sub33_1.aShortArray64[arg1.anInt598] < 0, arg1);
				}
				if (arg1.aClass8_Sub33_1.aShortArray64[arg1.anInt598] < 0) {
					arg1.aClass8_Sub8_Sub4_1.method3716(-1);
				}
				arg0 = arg1.anInt602 / local36;
			}
		}
		arg1.aClass8_Sub8_Sub4_1.method3705(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!bg;I[IIII)V")
	private void method2708(@OriginalArg(0) Class8_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass8_Sub8_Sub2_1.anIntArray214[arg0.anInt599] & 0x4) != 0 && arg0.anInt607 < 0) {
			@Pc(36) int local36 = this.aClass8_Sub8_Sub2_1.anIntArray212[arg0.anInt599] / Static264.anInt5577;
			while (true) {
				@Pc(46) int local46 = (local36 + 1048575 - arg0.anInt602) / local36;
				if (arg4 < local46) {
					arg0.anInt602 += local36 * arg4;
					break;
				}
				arg4 -= local46;
				arg0.aClass8_Sub8_Sub4_1.method3707(arg2, arg1, local46);
				@Pc(64) Class8_Sub8_Sub4 local64 = arg0.aClass8_Sub8_Sub4_1;
				arg0.anInt602 += local36 * local46 - 1048576;
				arg1 += local46;
				@Pc(82) int local82 = Static264.anInt5577 / 100;
				@Pc(86) int local86 = 262144 / local36;
				if (local86 < local82) {
					local82 = local86;
				}
				if (this.aClass8_Sub8_Sub2_1.anIntArray217[arg0.anInt599] == 0) {
					arg0.aClass8_Sub8_Sub4_1 = Static309.method3740(arg0.aClass8_Sub20_Sub1_1, local64.method3721(), local64.method3713(), local64.method3730());
				} else {
					arg0.aClass8_Sub8_Sub4_1 = Static309.method3740(arg0.aClass8_Sub20_Sub1_1, local64.method3721(), 0, local64.method3730());
					this.aClass8_Sub8_Sub2_1.method2143(arg0.aClass8_Sub33_1.aShortArray64[arg0.anInt598] < 0, arg0);
					arg0.aClass8_Sub8_Sub4_1.method3728(local82, local64.method3713());
				}
				if (arg0.aClass8_Sub33_1.aShortArray64[arg0.anInt598] < 0) {
					arg0.aClass8_Sub8_Sub4_1.method3716(-1);
				}
				local64.method3725(local82);
				local64.method3707(arg2, arg1, arg3 - arg1);
				if (local64.method3734()) {
					this.aClass8_Sub8_Sub1_2.method834(local64);
				}
			}
		}
		arg0.aClass8_Sub8_Sub4_1.method3707(arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "()Lclient!kn;")
	@Override
	public Class8_Sub8 method3706() {
		@Pc(9) Class8_Sub5 local9 = (Class8_Sub5) this.aClass182_21.method4319();
		if (local9 == null) {
			return null;
		} else if (local9.aClass8_Sub8_Sub4_1 == null) {
			return this.method3704();
		} else {
			return local9.aClass8_Sub8_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "()I")
	@Override
	public int method3709() {
		return 0;
	}
}
