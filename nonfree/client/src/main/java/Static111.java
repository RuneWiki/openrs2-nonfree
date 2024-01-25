import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_43 = new Class253(58, -1);

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString20 = null;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lclient!tv;")
	public static Class241 method1912(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			if ((double) Static93.aFloat126 == 3.0D) {
				return Static71.aClass241_3;
			}
			if ((double) Static93.aFloat126 == 4.0D) {
				return Static186.aClass241_6;
			}
			if ((double) Static93.aFloat126 == 6.0D) {
				return Static36.aClass241_1;
			}
			if ((double) Static93.aFloat126 >= 8.0D) {
				return Static291.aClass241_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static93.aFloat126 == 3.0D) {
				return Static36.aClass241_1;
			}
			if ((double) Static93.aFloat126 == 4.0D) {
				return Static291.aClass241_8;
			}
			if ((double) Static93.aFloat126 == 6.0D) {
				return Static234.aClass241_7;
			}
			if ((double) Static93.aFloat126 >= 8.0D) {
				return Static82.aClass241_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static93.aFloat126 == 3.0D) {
				return Static234.aClass241_7;
			}
			if ((double) Static93.aFloat126 == 4.0D) {
				return Static82.aClass241_4;
			}
			if ((double) Static93.aFloat126 == 6.0D) {
				return Static129.aClass241_5;
			}
			if ((double) Static93.aFloat126 >= 8.0D) {
				return Static46.aClass241_2;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!ig;III)V")
	public static void method1914(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) long local16 = (long) (arg3 << 14 | arg2 << 28 | arg0);
		@Pc(22) Class7_Sub34 local22 = (Class7_Sub34) Static345.aClass164_33.method3512(local16);
		if (local22 == null) {
			local22 = new Class7_Sub34();
			Static345.aClass164_33.method3508(local16, local22);
			local22.aClass85_31.method2011(arg1);
			return;
		}
		@Pc(45) Class45 local45 = Static259.aClass206_2.method4320(arg1.anInt3082);
		@Pc(48) int local48 = local45.anInt997;
		if (local45.anInt961 == 1) {
			local48 *= arg1.anInt3083 + 1;
		}
		for (@Pc(67) Class7_Sub24 local67 = (Class7_Sub24) local22.aClass85_31.method2010(); local67 != null; local67 = (Class7_Sub24) local22.aClass85_31.method2000()) {
			local45 = Static259.aClass206_2.method4320(local67.anInt3082);
			@Pc(78) int local78 = local45.anInt997;
			if (local45.anInt961 == 1) {
				local78 *= local67.anInt3083 + 1;
			}
			if (local48 > local78) {
				Static213.method3050(arg1, local67);
				return;
			}
		}
		local22.aClass85_31.method2011(arg1);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
	public static void method1916() {
		Static21.aClass11Array3 = null;
		Static321.aClass11Array9 = null;
		Static82.aClass11Array6 = null;
		Static378.aClass11Array11 = null;
		Static67.aClass11Array5 = null;
		Static97.aClass11_6 = null;
		Static407.aClass11Array14 = null;
		Static58.aClass11Array4 = null;
		Static378.aClass11Array12 = null;
		Static313.aClass11Array8 = null;
		Static18.aClass11Array2 = null;
		Static305.aClass63_15 = null;
		Static256.aClass11Array7 = null;
		Static454.aClass11_21 = null;
		Static368.aClass11Array10 = null;
		Static259.aClass63_7 = null;
		Static359.aClass63_11 = null;
		Static2.aClass11Array1 = null;
	}
}
