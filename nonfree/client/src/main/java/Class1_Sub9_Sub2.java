import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class1_Sub9_Sub2 extends Class1_Sub9 {

	@OriginalMember(owner = "client!ps", name = "s", descriptor = "Lclient!am;")
	public final Class14 aClass14_37 = new Class14();

	@OriginalMember(owner = "client!ps", name = "H", descriptor = "Lclient!po;")
	public final Class1_Sub9_Sub1 aClass1_Sub9_Sub1_2 = new Class1_Sub9_Sub1();

	@OriginalMember(owner = "client!ps", name = "z", descriptor = "Lclient!ri;")
	private final Class1_Sub9_Sub3 aClass1_Sub9_Sub3_3;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!ri;)V")
	public Class1_Sub9_Sub2(@OriginalArg(0) Class1_Sub9_Sub3 arg0) {
		this.aClass1_Sub9_Sub3_3 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "()Lclient!cv;")
	@Override
	public Class1_Sub9 method5014() {
		@Pc(9) Class1_Sub43 local9;
		do {
			local9 = (Class1_Sub43) this.aClass14_37.method208();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass1_Sub9_Sub4_4 == null);
		return local9.aClass1_Sub9_Sub4_4;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "([III)V")
	@Override
	public void method5012(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub9_Sub1_2.method5012(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub43 local17 = (Class1_Sub43) this.aClass14_37.method203(); local17 != null; local17 = (Class1_Sub43) this.aClass14_37.method208()) {
			if (!this.aClass1_Sub9_Sub3_3.method4643(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local17.anInt6154 >= local27) {
						this.method4319(local27, local17, local27 + local29, local29, arg0);
						local17.anInt6154 -= local27;
						break;
					}
					this.method4319(local17.anInt6154, local17, local27 + local29, local29, arg0);
					local29 += local17.anInt6154;
					local27 -= local17.anInt6154;
				} while (!this.aClass1_Sub9_Sub3_3.method4657(local17, local29, local27, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!ss;III[I)V")
	private void method4319(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub43 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if ((this.aClass1_Sub9_Sub3_3.anIntArray431[arg1.anInt6147] & 0x4) != 0 && arg1.anInt6163 < 0) {
			@Pc(30) int local30 = this.aClass1_Sub9_Sub3_3.anIntArray427[arg1.anInt6147] / Static234.anInt4244;
			while (true) {
				@Pc(40) int local40 = (local30 + 1048575 - arg1.anInt6150) / local30;
				if (local40 > arg0) {
					arg1.anInt6150 += arg0 * local30;
					break;
				}
				arg1.aClass1_Sub9_Sub4_4.method5012(arg4, arg3, local40);
				arg0 -= local40;
				arg1.anInt6150 += local30 * local40 - 1048576;
				arg3 += local40;
				@Pc(71) int local71 = Static234.anInt4244 / 100;
				@Pc(75) int local75 = 262144 / local30;
				if (local75 < local71) {
					local71 = local75;
				}
				@Pc(87) Class1_Sub9_Sub4 local87 = arg1.aClass1_Sub9_Sub4_4;
				if (this.aClass1_Sub9_Sub3_3.anIntArray436[arg1.anInt6147] == 0) {
					arg1.aClass1_Sub9_Sub4_4 = Static474.method5028(arg1.aClass1_Sub8_Sub1_2, local87.method5053(), local87.method5021(), local87.method5054());
				} else {
					arg1.aClass1_Sub9_Sub4_4 = Static474.method5028(arg1.aClass1_Sub8_Sub1_2, local87.method5053(), 0, local87.method5054());
					this.aClass1_Sub9_Sub3_3.method4653(arg1, arg1.aClass1_Sub7_1.aShortArray11[arg1.anInt6144] < 0);
					arg1.aClass1_Sub9_Sub4_4.method5039(local71, local87.method5021());
				}
				if (arg1.aClass1_Sub7_1.aShortArray11[arg1.anInt6144] < 0) {
					arg1.aClass1_Sub9_Sub4_4.method5040(-1);
				}
				local87.method5045(local71);
				local87.method5012(arg4, arg3, arg2 - arg3);
				if (local87.method5023()) {
					this.aClass1_Sub9_Sub1_2.method4260(local87);
				}
			}
		}
		arg1.aClass1_Sub9_Sub4_4.method5012(arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!ss;II)V")
	private void method4321(@OriginalArg(0) Class1_Sub43 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub9_Sub3_3.anIntArray431[arg0.anInt6147] & 0x4) != 0 && arg0.anInt6163 < 0) {
			@Pc(23) int local23 = this.aClass1_Sub9_Sub3_3.anIntArray427[arg0.anInt6147] / Static234.anInt4244;
			@Pc(34) int local34 = (local23 + 1048575 - arg0.anInt6150) / local23;
			arg0.anInt6150 = arg0.anInt6150 + local23 * arg1 & 0xFFFFF;
			if (local34 <= arg1) {
				if (this.aClass1_Sub9_Sub3_3.anIntArray436[arg0.anInt6147] == 0) {
					arg0.aClass1_Sub9_Sub4_4 = Static474.method5028(arg0.aClass1_Sub8_Sub1_2, arg0.aClass1_Sub9_Sub4_4.method5053(), arg0.aClass1_Sub9_Sub4_4.method5021(), arg0.aClass1_Sub9_Sub4_4.method5054());
				} else {
					arg0.aClass1_Sub9_Sub4_4 = Static474.method5028(arg0.aClass1_Sub8_Sub1_2, arg0.aClass1_Sub9_Sub4_4.method5053(), 0, arg0.aClass1_Sub9_Sub4_4.method5054());
					this.aClass1_Sub9_Sub3_3.method4653(arg0, arg0.aClass1_Sub7_1.aShortArray11[arg0.anInt6144] < 0);
				}
				if (arg0.aClass1_Sub7_1.aShortArray11[arg0.anInt6144] < 0) {
					arg0.aClass1_Sub9_Sub4_4.method5040(-1);
				}
				arg1 = arg0.anInt6150 / local23;
			}
		}
		arg0.aClass1_Sub9_Sub4_4.method5016(arg1);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "()I")
	@Override
	public int method5011() {
		return 0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	@Override
	public void method5016(@OriginalArg(0) int arg0) {
		this.aClass1_Sub9_Sub1_2.method5016(arg0);
		for (@Pc(15) Class1_Sub43 local15 = (Class1_Sub43) this.aClass14_37.method203(); local15 != null; local15 = (Class1_Sub43) this.aClass14_37.method208()) {
			if (!this.aClass1_Sub9_Sub3_3.method4643(local15)) {
				@Pc(25) int local25 = arg0;
				do {
					if (local25 <= local15.anInt6154) {
						this.method4321(local15, local25);
						local15.anInt6154 -= local25;
						break;
					}
					this.method4321(local15, local15.anInt6154);
					local25 -= local15.anInt6154;
				} while (!this.aClass1_Sub9_Sub3_3.method4657(local15, 0, local25, null));
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "()Lclient!cv;")
	@Override
	public Class1_Sub9 method5013() {
		@Pc(9) Class1_Sub43 local9 = (Class1_Sub43) this.aClass14_37.method203();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub9_Sub4_4 == null) {
			return this.method5014();
		} else {
			return local9.aClass1_Sub9_Sub4_4;
		}
	}
}
