import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "Lclient!of;")
	public final Class70 aClass70_15 = new Class70();

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "Lclient!ld;")
	public final Class3_Sub4_Sub2 aClass3_Sub4_Sub2_1 = new Class3_Sub4_Sub2();

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "Lclient!bb;")
	private final Class3_Sub4_Sub1 aClass3_Sub4_Sub1_2;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!bb;)V")
	public Class3_Sub4_Sub3(@OriginalArg(0) Class3_Sub4_Sub1 arg0) {
		this.aClass3_Sub4_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	@Override
	public void method1975(@OriginalArg(0) int arg0) {
		this.aClass3_Sub4_Sub2_1.method1975(arg0);
		for (@Pc(11) Class3_Sub10 local11 = (Class3_Sub10) this.aClass70_15.method1953(); local11 != null; local11 = (Class3_Sub10) this.aClass70_15.method1948()) {
			if (!this.aClass3_Sub4_Sub1_2.method210(local11)) {
				@Pc(21) int local21 = arg0;
				do {
					if (local11.anInt1189 >= local21) {
						this.method1826(local11, local21);
						local11.anInt1189 -= local21;
						break;
					}
					this.method1826(local11, local11.anInt1189);
					local21 -= local11.anInt1189;
				} while (!this.aClass3_Sub4_Sub1_2.method233(local11, local21, 0, null));
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "()Lclient!pg;")
	@Override
	public Class3_Sub4 method1973() {
		@Pc(9) Class3_Sub10 local9;
		do {
			local9 = (Class3_Sub10) this.aClass70_15.method1948();
			if (local9 == null) {
				return null;
			}
		} while (local9.aClass3_Sub4_Sub4_1 == null);
		return local9.aClass3_Sub4_Sub4_1;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "()Lclient!pg;")
	@Override
	public Class3_Sub4 method1976() {
		@Pc(5) Class3_Sub10 local5 = (Class3_Sub10) this.aClass70_15.method1953();
		if (local5 == null) {
			return null;
		} else if (local5.aClass3_Sub4_Sub4_1 == null) {
			return this.method1973();
		} else {
			return local5.aClass3_Sub4_Sub4_1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!fi;II)V")
	private void method1826(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass3_Sub4_Sub1_2.anIntArray45[arg0.anInt1191] & 0x4) != 0 && arg0.anInt1176 < 0) {
			@Pc(35) int local35 = this.aClass3_Sub4_Sub1_2.anIntArray43[arg0.anInt1191] / Static47.anInt1073;
			@Pc(45) int local45 = (local35 + 1048575 - arg0.anInt1187) / local35;
			arg0.anInt1187 = arg0.anInt1187 + arg1 * local35 & 0xFFFFF;
			if (arg1 >= local45) {
				if (this.aClass3_Sub4_Sub1_2.anIntArray48[arg0.anInt1191] == 0) {
					arg0.aClass3_Sub4_Sub4_1 = Static202.method1996(arg0.aClass3_Sub19_Sub1_1, arg0.aClass3_Sub4_Sub4_1.method1978(), arg0.aClass3_Sub4_Sub4_1.method2013(), arg0.aClass3_Sub4_Sub4_1.method2015());
				} else {
					arg0.aClass3_Sub4_Sub4_1 = Static202.method1996(arg0.aClass3_Sub19_Sub1_1, arg0.aClass3_Sub4_Sub4_1.method1978(), 0, arg0.aClass3_Sub4_Sub4_1.method2015());
					this.aClass3_Sub4_Sub1_2.method224(arg0, arg0.aClass3_Sub23_1.aShortArray48[arg0.anInt1182] < 0);
				}
				if (arg0.aClass3_Sub23_1.aShortArray48[arg0.anInt1182] < 0) {
					arg0.aClass3_Sub4_Sub4_1.method1994(-1);
				}
				arg1 = arg0.anInt1187 / local35;
			}
		}
		arg0.aClass3_Sub4_Sub4_1.method1975(arg1);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[IIILclient!fi;)V")
	private void method1827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub10 arg4) {
		if ((this.aClass3_Sub4_Sub1_2.anIntArray45[arg4.anInt1191] & 0x4) != 0 && arg4.anInt1176 < 0) {
			@Pc(29) int local29 = this.aClass3_Sub4_Sub1_2.anIntArray43[arg4.anInt1191] / Static47.anInt1073;
			while (true) {
				@Pc(39) int local39 = (local29 + 1048575 - arg4.anInt1187) / local29;
				if (local39 > arg1) {
					arg4.anInt1187 += local29 * arg1;
					break;
				}
				arg1 -= local39;
				@Pc(50) int local50 = 262144 / local29;
				arg4.aClass3_Sub4_Sub4_1.method1971(arg2, arg0, local39);
				@Pc(60) int local60 = Static47.anInt1073 / 100;
				if (local60 > local50) {
					local60 = local50;
				}
				@Pc(72) Class3_Sub4_Sub4 local72 = arg4.aClass3_Sub4_Sub4_1;
				arg0 += local39;
				arg4.anInt1187 += local29 * local39 - 1048576;
				if (this.aClass3_Sub4_Sub1_2.anIntArray48[arg4.anInt1191] == 0) {
					arg4.aClass3_Sub4_Sub4_1 = Static202.method1996(arg4.aClass3_Sub19_Sub1_1, local72.method1978(), local72.method2013(), local72.method2015());
				} else {
					arg4.aClass3_Sub4_Sub4_1 = Static202.method1996(arg4.aClass3_Sub19_Sub1_1, local72.method1978(), 0, local72.method2015());
					this.aClass3_Sub4_Sub1_2.method224(arg4, arg4.aClass3_Sub23_1.aShortArray48[arg4.anInt1182] < 0);
					arg4.aClass3_Sub4_Sub4_1.method1988(local60, local72.method2013());
				}
				if (arg4.aClass3_Sub23_1.aShortArray48[arg4.anInt1182] < 0) {
					arg4.aClass3_Sub4_Sub4_1.method1994(-1);
				}
				local72.method1991(local60);
				local72.method1971(arg2, arg0, arg3 - arg0);
				if (local72.method1997()) {
					this.aClass3_Sub4_Sub2_1.method1516(local72);
				}
			}
		}
		arg4.aClass3_Sub4_Sub4_1.method1971(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([III)V")
	@Override
	public void method1971(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass3_Sub4_Sub2_1.method1971(arg0, arg1, arg2);
		for (@Pc(17) Class3_Sub10 local17 = (Class3_Sub10) this.aClass70_15.method1953(); local17 != null; local17 = (Class3_Sub10) this.aClass70_15.method1948()) {
			if (!this.aClass3_Sub4_Sub1_2.method210(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1189) {
						this.method1827(local29, local27, arg0, local27 + local29, local17);
						local17.anInt1189 -= local27;
						break;
					}
					this.method1827(local29, local17.anInt1189, arg0, local29 + local27, local17);
					local27 -= local17.anInt1189;
					local29 += local17.anInt1189;
				} while (!this.aClass3_Sub4_Sub1_2.method233(local17, local27, local29, arg0));
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "()I")
	@Override
	public int method1970() {
		return 0;
	}
}
