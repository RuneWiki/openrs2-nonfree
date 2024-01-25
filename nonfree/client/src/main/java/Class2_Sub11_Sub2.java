import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class2_Sub11_Sub2 extends Class2_Sub11 {

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "Lclient!sf;")
	public final Class180 aClass180_13 = new Class180();

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "Lclient!nj;")
	public final Class2_Sub11_Sub3 aClass2_Sub11_Sub3_2 = new Class2_Sub11_Sub3();

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "Lclient!e;")
	private final Class2_Sub11_Sub1 aClass2_Sub11_Sub1_3;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!e;)V")
	public Class2_Sub11_Sub2(@OriginalArg(0) Class2_Sub11_Sub1 arg0) {
		this.aClass2_Sub11_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "()I")
	@Override
	public int method4944() {
		return 0;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
	@Override
	public void method4946(@OriginalArg(0) int arg0) {
		this.aClass2_Sub11_Sub3_2.method4946(arg0);
		for (@Pc(15) Class2_Sub29 local15 = (Class2_Sub29) this.aClass180_13.method4919(); local15 != null; local15 = (Class2_Sub29) this.aClass180_13.method4916()) {
			if (!this.aClass2_Sub11_Sub1_3.method1404(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local15.anInt5297 >= local25) {
						this.method1987(local15, local25);
						local15.anInt5297 -= local25;
						break;
					}
					this.method1987(local15, local15.anInt5297);
					local25 -= local15.anInt5297;
				} while (!this.aClass2_Sub11_Sub1_3.method1396(null, local15, local25, 0));
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLclient!po;I)V")
	private void method1987(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub11_Sub1_3.anIntArray107[arg0.anInt5308] & 0x4) != 0 && arg0.anInt5298 < 0) {
			@Pc(24) int local24 = this.aClass2_Sub11_Sub1_3.anIntArray108[arg0.anInt5308] / Static36.anInt551;
			@Pc(34) int local34 = (local24 + 1048575 - arg0.anInt5296) / local24;
			arg0.anInt5296 = arg1 * local24 + arg0.anInt5296 & 0xFFFFF;
			if (local34 <= arg1) {
				if (this.aClass2_Sub11_Sub1_3.anIntArray115[arg0.anInt5308] == 0) {
					arg0.aClass2_Sub11_Sub4_1 = Static377.method4985(arg0.aClass2_Sub5_Sub1_1, arg0.aClass2_Sub11_Sub4_1.method4979(), arg0.aClass2_Sub11_Sub4_1.method4986(), arg0.aClass2_Sub11_Sub4_1.method4953());
				} else {
					arg0.aClass2_Sub11_Sub4_1 = Static377.method4985(arg0.aClass2_Sub5_Sub1_1, arg0.aClass2_Sub11_Sub4_1.method4979(), 0, arg0.aClass2_Sub11_Sub4_1.method4953());
					this.aClass2_Sub11_Sub1_3.method1418(arg0, arg0.aClass2_Sub28_1.aShortArray94[arg0.anInt5293] < 0);
				}
				if (arg0.aClass2_Sub28_1.aShortArray94[arg0.anInt5293] < 0) {
					arg0.aClass2_Sub11_Sub4_1.method4977(-1);
				}
				arg1 = arg0.anInt5296 / local24;
			}
		}
		arg0.aClass2_Sub11_Sub4_1.method4946(arg1);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!po;[IIZ)V")
	private void method1989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub29 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass2_Sub11_Sub1_3.anIntArray107[arg2.anInt5308] & 0x4) != 0 && arg2.anInt5298 < 0) {
			@Pc(25) int local25 = this.aClass2_Sub11_Sub1_3.anIntArray108[arg2.anInt5308] / Static36.anInt551;
			while (true) {
				@Pc(36) int local36 = (local25 + 1048575 - arg2.anInt5296) / local25;
				if (arg4 < local36) {
					arg2.anInt5296 += local25 * arg4;
					break;
				}
				arg2.aClass2_Sub11_Sub4_1.method4945(arg3, arg1, local36);
				arg2.anInt5296 += local36 * local25 - 1048576;
				arg4 -= local36;
				arg1 += local36;
				@Pc(67) int local67 = Static36.anInt551 / 100;
				@Pc(71) int local71 = 262144 / local25;
				if (local67 > local71) {
					local67 = local71;
				}
				@Pc(79) Class2_Sub11_Sub4 local79 = arg2.aClass2_Sub11_Sub4_1;
				if (this.aClass2_Sub11_Sub1_3.anIntArray115[arg2.anInt5308] == 0) {
					arg2.aClass2_Sub11_Sub4_1 = Static377.method4985(arg2.aClass2_Sub5_Sub1_1, local79.method4979(), local79.method4986(), local79.method4953());
				} else {
					arg2.aClass2_Sub11_Sub4_1 = Static377.method4985(arg2.aClass2_Sub5_Sub1_1, local79.method4979(), 0, local79.method4953());
					this.aClass2_Sub11_Sub1_3.method1418(arg2, arg2.aClass2_Sub28_1.aShortArray94[arg2.anInt5293] < 0);
					arg2.aClass2_Sub11_Sub4_1.method4973(local67, local79.method4986());
				}
				if (arg2.aClass2_Sub28_1.aShortArray94[arg2.anInt5293] < 0) {
					arg2.aClass2_Sub11_Sub4_1.method4977(-1);
				}
				local79.method4962(local67);
				local79.method4945(arg3, arg1, arg0 - arg1);
				if (local79.method4988()) {
					this.aClass2_Sub11_Sub3_2.method4108(local79);
				}
			}
		}
		arg2.aClass2_Sub11_Sub4_1.method4945(arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "()Lclient!wf;")
	@Override
	public Class2_Sub11 method4947() {
		@Pc(9) Class2_Sub29 local9;
		do {
			local9 = (Class2_Sub29) this.aClass180_13.method4916();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass2_Sub11_Sub4_1 == null);
		return local9.aClass2_Sub11_Sub4_1;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([III)V")
	@Override
	public void method4945(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub11_Sub3_2.method4945(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub29 local17 = (Class2_Sub29) this.aClass180_13.method4919(); local17 != null; local17 = (Class2_Sub29) this.aClass180_13.method4916()) {
			if (!this.aClass2_Sub11_Sub1_3.method1404(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt5297 >= local27) {
						this.method1989(local29 + local27, local29, local17, arg0, local27);
						local17.anInt5297 -= local27;
						break;
					}
					this.method1989(local27 + local29, local29, local17, arg0, local17.anInt5297);
					local27 -= local17.anInt5297;
					local29 += local17.anInt5297;
				} while (!this.aClass2_Sub11_Sub1_3.method1396(arg0, local17, local27, local29));
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "()Lclient!wf;")
	@Override
	public Class2_Sub11 method4948() {
		@Pc(9) Class2_Sub29 local9 = (Class2_Sub29) this.aClass180_13.method4919();
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub11_Sub4_1 == null) {
			return this.method4947();
		} else {
			return local9.aClass2_Sub11_Sub4_1;
		}
	}
}
