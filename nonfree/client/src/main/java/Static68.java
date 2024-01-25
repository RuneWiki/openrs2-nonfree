import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!di", name = "s", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_11 = new Class126(8);

	@OriginalMember(owner = "client!di", name = "u", descriptor = "I")
	public static int anInt1324 = 0;

	@OriginalMember(owner = "client!di", name = "v", descriptor = "I")
	public static int anInt1325 = -1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I")
	public static int method1147(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!ya;Lclient!ok;I)V")
	public static void method1148(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class178 arg1) {
		@Pc(10) Class246[] local10 = Static469.method5146(arg1, Static292.anInt4876);
		Static368.aClass11Array10 = new Class11[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static368.aClass11Array10[local16] = arg0.method5308(local10[local16]);
		}
		local10 = Static469.method5146(arg1, Static309.anInt5154);
		Static18.aClass11Array2 = new Class11[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static18.aClass11Array2[local43] = arg0.method5308(local10[local43]);
		}
		local10 = Static469.method5146(arg1, Static393.anInt6288);
		Static58.aClass11Array4 = new Class11[local10.length];
		for (@Pc(70) int local70 = 0; local70 < local10.length; local70++) {
			Static58.aClass11Array4[local70] = arg0.method5308(local10[local70]);
		}
		local10 = Static469.method5146(arg1, Static374.anInt6085);
		Static313.aClass11Array8 = new Class11[local10.length];
		for (@Pc(97) int local97 = 0; local97 < local10.length; local97++) {
			Static313.aClass11Array8[local97] = arg0.method5308(local10[local97]);
		}
		local10 = Static469.method5146(arg1, Static409.anInt6472);
		Static378.aClass11Array11 = new Class11[local10.length];
		for (@Pc(128) int local128 = 0; local128 < local10.length; local128++) {
			Static378.aClass11Array11[local128] = arg0.method5308(local10[local128]);
		}
		local10 = Static469.method5146(arg1, Static225.anInt4944);
		Static378.aClass11Array12 = new Class11[local10.length];
		for (@Pc(155) int local155 = 0; local155 < local10.length; local155++) {
			Static378.aClass11Array12[local155] = arg0.method5308(local10[local155]);
		}
		local10 = Static469.method5146(arg1, Static301.anInt5047);
		Static21.aClass11Array3 = new Class11[local10.length];
		for (@Pc(182) int local182 = 0; local182 < local10.length; local182++) {
			Static21.aClass11Array3[local182] = arg0.method5308(local10[local182]);
		}
		local10 = Static469.method5146(arg1, Static350.anInt5615);
		Static67.aClass11Array5 = new Class11[local10.length];
		for (@Pc(213) int local213 = 0; local213 < local10.length; local213++) {
			Static67.aClass11Array5[local213] = arg0.method5308(local10[local213]);
		}
		local10 = Static469.method5146(arg1, Static386.anInt6224);
		Static2.aClass11Array1 = new Class11[local10.length];
		for (@Pc(240) int local240 = 0; local240 < local10.length; local240++) {
			Static2.aClass11Array1[local240] = arg0.method5308(local10[local240]);
		}
		local10 = Static469.method5146(arg1, Static170.anInt4637);
		Static256.aClass11Array7 = new Class11[local10.length];
		for (@Pc(267) int local267 = 0; local267 < local10.length; local267++) {
			Static256.aClass11Array7[local267] = arg0.method5308(local10[local267]);
		}
		local10 = Static469.method5146(arg1, Static297.anInt4921);
		Static82.aClass11Array6 = new Class11[local10.length];
		for (@Pc(298) int local298 = 0; local298 < local10.length; local298++) {
			Static82.aClass11Array6[local298] = arg0.method5308(local10[local298]);
		}
		local10 = Static469.method5146(arg1, Static280.anInt4685);
		Static321.aClass11Array9 = new Class11[local10.length];
		for (@Pc(329) int local329 = 0; local329 < local10.length; local329++) {
			Static321.aClass11Array9[local329] = arg0.method5308(local10[local329]);
		}
		Static97.aClass11_6 = arg0.method5308(Static469.method5145(arg1, Static76.anInt1556, 0));
		Static454.aClass11_21 = arg0.method5308(Static469.method5145(arg1, Static328.anInt5383, 0));
		local10 = Static469.method5146(arg1, Static387.anInt3380);
		Static407.aClass11Array14 = new Class11[local10.length];
		for (@Pc(376) int local376 = 0; local376 < local10.length; local376++) {
			Static407.aClass11Array14[local376] = arg0.method5308(local10[local376]);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIBII)V")
	public static void method1149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static130.aClass153_Sub1_1.anInt5237 != 0 && arg3 != 0 && Static225.anInt4941 < 50 && arg2 != -1) {
			Static205.aClass252Array1[Static225.anInt4941++] = new Class252((byte) 1, arg2, arg3, arg4, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
	public static void method1150(@OriginalArg(1) int arg0) {
		@Pc(8) Class7_Sub4_Sub14 local8 = Static54.method750(arg0, 2);
		local8.method4710();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBII)V")
	public static void method1151(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(19) int local19 = arg0 << 3;
		Static67.aFloat36 = local19;
		Static97.aFloat52 = local3;
		if (Static9.anInt60 == 2) {
			Static92.anInt1897 = local3;
			Static408.anInt6454 = 0;
			Static9.anInt55 = local19;
		}
		Static10.method94();
		Static213.aBoolean230 = true;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIZ)I")
	public static int method1152(@OriginalArg(0) int arg0) {
		@Pc(14) Class7_Sub27 local14 = Static288.method3810(false, arg0);
		if (local14 == null) {
			return Static395.aClass207_1.method4332(arg0).anInt7334;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray323.length; local31++) {
			if (local14.anIntArray323[local31] == -1) {
				local24++;
			}
		}
		return local24 + Static395.aClass207_1.method4332(arg0).anInt7334 - local14.anIntArray323.length;
	}
}
