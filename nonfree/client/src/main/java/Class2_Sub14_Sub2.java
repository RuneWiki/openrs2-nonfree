import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class2_Sub14_Sub2 extends Class2_Sub14 {

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "Lclient!tf;")
	public final Class81 aClass81_9 = new Class81();

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "Lclient!t;")
	public final Class2_Sub14_Sub4 aClass2_Sub14_Sub4_1 = new Class2_Sub14_Sub4();

	@OriginalMember(owner = "client!mf", name = "r", descriptor = "Lclient!sh;")
	private final Class2_Sub14_Sub3 aClass2_Sub14_Sub3_2;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!sh;)V")
	public Class2_Sub14_Sub2(@OriginalArg(0) Class2_Sub14_Sub3 arg0) {
		this.aClass2_Sub14_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()I")
	@Override
	public int method2589() {
		return 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BILclient!vf;)V")
	private void method1782(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub25 arg1) {
		if ((this.aClass2_Sub14_Sub3_2.anIntArray307[arg1.anInt3815] & 0x4) != 0 && arg1.anInt3798 < 0) {
			@Pc(30) int local30 = this.aClass2_Sub14_Sub3_2.anIntArray304[arg1.anInt3815] / Static22.anInt472;
			@Pc(40) int local40 = (local30 + 1048575 - arg1.anInt3810) / local30;
			arg1.anInt3810 = arg0 * local30 + arg1.anInt3810 & 0xFFFFF;
			if (local40 <= arg0) {
				if (this.aClass2_Sub14_Sub3_2.anIntArray295[arg1.anInt3815] == 0) {
					arg1.aClass2_Sub14_Sub1_3 = Static188.method1361(arg1.aClass2_Sub5_Sub1_1, arg1.aClass2_Sub14_Sub1_3.method1347(), arg1.aClass2_Sub14_Sub1_3.method1370(), arg1.aClass2_Sub14_Sub1_3.method1366());
				} else {
					arg1.aClass2_Sub14_Sub1_3 = Static188.method1361(arg1.aClass2_Sub5_Sub1_1, arg1.aClass2_Sub14_Sub1_3.method1347(), 0, arg1.aClass2_Sub14_Sub1_3.method1366());
					this.aClass2_Sub14_Sub3_2.method2555(arg1, arg1.aClass2_Sub20_1.aShortArray23[arg1.anInt3820] < 0);
				}
				if (arg1.aClass2_Sub20_1.aShortArray23[arg1.anInt3820] < 0) {
					arg1.aClass2_Sub14_Sub1_3.method1349(-1);
				}
				arg0 = arg1.anInt3810 / local30;
			}
		}
		arg1.aClass2_Sub14_Sub1_3.method2587(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()Lclient!kc;")
	@Override
	public Class2_Sub14 method2588() {
		@Pc(9) Class2_Sub25 local9;
		do {
			local9 = (Class2_Sub25) this.aClass81_9.method2686();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub14_Sub1_3 == null);
		return local9.aClass2_Sub14_Sub1_3;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[ILclient!vf;III)V")
	private void method1783(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class2_Sub25 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if ((this.aClass2_Sub14_Sub3_2.anIntArray307[arg2.anInt3815] & 0x4) != 0 && arg2.anInt3798 < 0) {
			@Pc(25) int local25 = this.aClass2_Sub14_Sub3_2.anIntArray304[arg2.anInt3815] / Static22.anInt472;
			while (true) {
				@Pc(35) int local35 = (local25 + 1048575 - arg2.anInt3810) / local25;
				if (local35 > arg0) {
					arg2.anInt3810 += arg0 * local25;
					break;
				}
				arg2.aClass2_Sub14_Sub1_3.method2584(arg1, arg3, local35);
				@Pc(52) int local52 = Static22.anInt472 / 100;
				arg0 -= local35;
				@Pc(59) Class2_Sub14_Sub1 local59 = arg2.aClass2_Sub14_Sub1_3;
				arg2.anInt3810 += local35 * local25 - 1048576;
				@Pc(73) int local73 = 262144 / local25;
				arg3 += local35;
				if (local73 < local52) {
					local52 = local73;
				}
				if (this.aClass2_Sub14_Sub3_2.anIntArray295[arg2.anInt3815] == 0) {
					arg2.aClass2_Sub14_Sub1_3 = Static188.method1361(arg2.aClass2_Sub5_Sub1_1, local59.method1347(), local59.method1370(), local59.method1366());
				} else {
					arg2.aClass2_Sub14_Sub1_3 = Static188.method1361(arg2.aClass2_Sub5_Sub1_1, local59.method1347(), 0, local59.method1366());
					this.aClass2_Sub14_Sub3_2.method2555(arg2, arg2.aClass2_Sub20_1.aShortArray23[arg2.anInt3820] < 0);
					arg2.aClass2_Sub14_Sub1_3.method1355(local52, local59.method1370());
				}
				if (arg2.aClass2_Sub20_1.aShortArray23[arg2.anInt3820] < 0) {
					arg2.aClass2_Sub14_Sub1_3.method1349(-1);
				}
				local59.method1382(local52);
				local59.method2584(arg1, arg3, arg4 - arg3);
				if (local59.method1360()) {
					this.aClass2_Sub14_Sub4_1.method2590(local59);
				}
			}
		}
		arg2.aClass2_Sub14_Sub1_3.method2584(arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()Lclient!kc;")
	@Override
	public Class2_Sub14 method2586() {
		@Pc(9) Class2_Sub25 local9 = (Class2_Sub25) this.aClass81_9.method2682();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub14_Sub1_3 == null) {
			return this.method2588();
		} else {
			return local9.aClass2_Sub14_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	@Override
	public void method2587(@OriginalArg(0) int arg0) {
		this.aClass2_Sub14_Sub4_1.method2587(arg0);
		for (@Pc(15) Class2_Sub25 local15 = (Class2_Sub25) this.aClass81_9.method2682(); local15 != null; local15 = (Class2_Sub25) this.aClass81_9.method2686()) {
			if (!this.aClass2_Sub14_Sub3_2.method2576(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt3817) {
						this.method1782(local25, local15);
						local15.anInt3817 -= local25;
						break;
					}
					this.method1782(local15.anInt3817, local15);
					local25 -= local15.anInt3817;
				} while (!this.aClass2_Sub14_Sub3_2.method2560(0, null, local25, local15));
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([III)V")
	@Override
	public void method2584(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub14_Sub4_1.method2584(arg0, arg1, arg2);
		for (@Pc(13) Class2_Sub25 local13 = (Class2_Sub25) this.aClass81_9.method2682(); local13 != null; local13 = (Class2_Sub25) this.aClass81_9.method2686()) {
			if (!this.aClass2_Sub14_Sub3_2.method2576(local13)) {
				@Pc(23) int local23 = arg2;
				@Pc(25) int local25 = arg1;
				do {
					if (local13.anInt3817 >= local23) {
						this.method1783(local23, arg0, local13, local25, local23 + local25);
						local13.anInt3817 -= local23;
						break;
					}
					this.method1783(local13.anInt3817, arg0, local13, local25, local25 + local23);
					local23 -= local13.anInt3817;
					local25 += local13.anInt3817;
				} while (!this.aClass2_Sub14_Sub3_2.method2560(local25, arg0, local23, local13));
			}
		}
	}
}
