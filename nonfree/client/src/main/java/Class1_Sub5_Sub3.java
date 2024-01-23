import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class1_Sub5_Sub3 extends Class1_Sub5 {

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Lclient!hi;")
	public Class61 aClass61_29 = new Class61();

	@OriginalMember(owner = "client!un", name = "H", descriptor = "Lclient!wd;")
	public Class1_Sub5_Sub4 aClass1_Sub5_Sub4_2 = new Class1_Sub5_Sub4();

	@OriginalMember(owner = "client!un", name = "A", descriptor = "Lclient!gn;")
	private Class1_Sub5_Sub2 aClass1_Sub5_Sub2_3;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class1_Sub5_Sub3(@OriginalArg(0) Class1_Sub5_Sub2 arg0) {
		this.aClass1_Sub5_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLclient!ea;I)V")
	private void method4155(@OriginalArg(1) Class1_Sub12 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass1_Sub5_Sub2_3.anIntArray200[arg0.anInt1223] & 0x4) != 0 && arg0.anInt1220 < 0) {
			@Pc(34) int local34 = this.aClass1_Sub5_Sub2_3.anIntArray196[arg0.anInt1223] / Static13.anInt256;
			@Pc(45) int local45 = (local34 + 1048575 - arg0.anInt1206) / local34;
			arg0.anInt1206 = arg0.anInt1206 + arg1 * local34 & 0xFFFFF;
			if (local45 <= arg1) {
				if (this.aClass1_Sub5_Sub2_3.anIntArray197[arg0.anInt1223] == 0) {
					arg0.aClass1_Sub5_Sub1_3 = Static301.method1173(arg0.aClass1_Sub10_Sub1_1, arg0.aClass1_Sub5_Sub1_3.method1179(), arg0.aClass1_Sub5_Sub1_3.method1155(), arg0.aClass1_Sub5_Sub1_3.method1152());
				} else {
					arg0.aClass1_Sub5_Sub1_3 = Static301.method1173(arg0.aClass1_Sub10_Sub1_1, arg0.aClass1_Sub5_Sub1_3.method1179(), 0, arg0.aClass1_Sub5_Sub1_3.method1152());
					this.aClass1_Sub5_Sub2_3.method1653(arg0, arg0.aClass1_Sub6_1.aShortArray2[arg0.anInt1205] < 0);
				}
				if (arg0.aClass1_Sub6_1.aShortArray2[arg0.anInt1205] < 0) {
					arg0.aClass1_Sub5_Sub1_3.method1182(-1);
				}
				arg1 = arg0.anInt1206 / local34;
			}
		}
		arg0.aClass1_Sub5_Sub1_3.method4372(arg1);
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "()Lclient!an;")
	@Override
	public Class1_Sub5 method4375() {
		while (true) {
			@Pc(9) Class1_Sub12 local9 = (Class1_Sub12) this.aClass61_29.method1836();
			if (local9 != null) {
				if (local9.aClass1_Sub5_Sub1_3 == null) {
					continue;
				}
				return local9.aClass1_Sub5_Sub1_3;
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "([III)V")
	@Override
	public void method4374(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass1_Sub5_Sub4_2.method4374(arg0, arg1, arg2);
		for (@Pc(17) Class1_Sub12 local17 = (Class1_Sub12) this.aClass61_29.method1835(); local17 != null; local17 = (Class1_Sub12) this.aClass61_29.method1836()) {
			if (!this.aClass1_Sub5_Sub2_3.method1648(local17)) {
				@Pc(27) int local27 = arg2;
				@Pc(29) int local29 = arg1;
				do {
					if (local27 <= local17.anInt1216) {
						this.method4156(local29, local29 + local27, arg0, local27, local17);
						local17.anInt1216 -= local27;
						break;
					}
					this.method4156(local29, local27 + local29, arg0, local17.anInt1216, local17);
					local27 -= local17.anInt1216;
					local29 += local17.anInt1216;
				} while (!this.aClass1_Sub5_Sub2_3.method1652(local29, arg0, local17, local27));
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II[IILclient!ea;I)V")
	private void method4156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub12 arg4) {
		if ((this.aClass1_Sub5_Sub2_3.anIntArray200[arg4.anInt1223] & 0x4) != 0 && arg4.anInt1220 < 0) {
			@Pc(27) int local27 = this.aClass1_Sub5_Sub2_3.anIntArray196[arg4.anInt1223] / Static13.anInt256;
			while (true) {
				@Pc(36) int local36 = (local27 + 1048575 - arg4.anInt1206) / local27;
				if (local36 > arg3) {
					arg4.anInt1206 += arg3 * local27;
					break;
				}
				arg3 -= local36;
				arg4.aClass1_Sub5_Sub1_3.method4374(arg2, arg0, local36);
				@Pc(54) Class1_Sub5_Sub1 local54 = arg4.aClass1_Sub5_Sub1_3;
				arg4.anInt1206 += local36 * local27 - 1048576;
				@Pc(68) int local68 = Static13.anInt256 / 100;
				@Pc(72) int local72 = 262144 / local27;
				if (local72 < local68) {
					local68 = local72;
				}
				if (this.aClass1_Sub5_Sub2_3.anIntArray197[arg4.anInt1223] == 0) {
					arg4.aClass1_Sub5_Sub1_3 = Static301.method1173(arg4.aClass1_Sub10_Sub1_1, local54.method1179(), local54.method1155(), local54.method1152());
				} else {
					arg4.aClass1_Sub5_Sub1_3 = Static301.method1173(arg4.aClass1_Sub10_Sub1_1, local54.method1179(), 0, local54.method1152());
					this.aClass1_Sub5_Sub2_3.method1653(arg4, arg4.aClass1_Sub6_1.aShortArray2[arg4.anInt1205] < 0);
					arg4.aClass1_Sub5_Sub1_3.method1170(local68, local54.method1155());
				}
				if (arg4.aClass1_Sub6_1.aShortArray2[arg4.anInt1205] < 0) {
					arg4.aClass1_Sub5_Sub1_3.method1182(-1);
				}
				local54.method1160(local68);
				arg0 += local36;
				local54.method4374(arg2, arg0, arg1 - arg0);
				if (local54.method1172()) {
					this.aClass1_Sub5_Sub4_2.method4376(local54);
				}
			}
		}
		arg4.aClass1_Sub5_Sub1_3.method4374(arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "()I")
	@Override
	public int method4373() {
		return 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()Lclient!an;")
	@Override
	public Class1_Sub5 method4370() {
		@Pc(9) Class1_Sub12 local9 = (Class1_Sub12) this.aClass61_29.method1835();
		if (local9 == null) {
			return null;
		} else if (local9.aClass1_Sub5_Sub1_3 == null) {
			return this.method4375();
		} else {
			return local9.aClass1_Sub5_Sub1_3;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	@Override
	public void method4372(@OriginalArg(0) int arg0) {
		this.aClass1_Sub5_Sub4_2.method4372(arg0);
		for (@Pc(15) Class1_Sub12 local15 = (Class1_Sub12) this.aClass61_29.method1835(); local15 != null; local15 = (Class1_Sub12) this.aClass61_29.method1836()) {
			if (!this.aClass1_Sub5_Sub2_3.method1648(local15)) {
				@Pc(26) int local26 = arg0;
				do {
					if (local26 <= local15.anInt1216) {
						this.method4155(local15, local26);
						local15.anInt1216 -= local26;
						break;
					}
					this.method4155(local15, local15.anInt1216);
					local26 -= local15.anInt1216;
				} while (!this.aClass1_Sub5_Sub2_3.method1652(0, null, local15, local26));
			}
		}
	}
}
