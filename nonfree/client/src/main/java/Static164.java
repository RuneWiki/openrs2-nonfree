import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!vc;")
	public static Class154_Sub1 aClass154_Sub1_1;

	@OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
	public static int anInt2901;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_51 = new Class57("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "Lclient!ug;")
	public static final Class175 aClass175_1 = Static59.method1068();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public static void method2513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = aClass154_Sub1_1.anInt6064 * arg1 >> 8;
		if (local6 != 0 && arg0 != -1) {
			Static323.method4975(local6, Static352.aClass20_93, arg0);
			Static298.aBoolean402 = true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!b;BLclient!np;)V")
	public static void method2515(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(10) Class127[] local10 = Static402.method2809(arg0, Static382.anInt6412);
		Static243.aClass110Array10 = new Class110[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static243.aClass110Array10[local16] = arg1.method4869(local10[local16]);
		}
		local10 = Static402.method2809(arg0, Static139.anInt2632);
		Static74.aClass110Array2 = new Class110[local10.length];
		for (@Pc(47) int local47 = 0; local47 < local10.length; local47++) {
			Static74.aClass110Array2[local47] = arg1.method4869(local10[local47]);
		}
		local10 = Static402.method2809(arg0, Static92.anInt1898);
		Static377.aClass110Array16 = new Class110[local10.length];
		for (@Pc(78) int local78 = 0; local78 < local10.length; local78++) {
			Static377.aClass110Array16[local78] = arg1.method4869(local10[local78]);
		}
		local10 = Static402.method2809(arg0, Static389.anInt6459);
		Static210.aClass110Array8 = new Class110[local10.length];
		for (@Pc(110) int local110 = 0; local110 < local10.length; local110++) {
			Static210.aClass110Array8[local110] = arg1.method4869(local10[local110]);
		}
		local10 = Static402.method2809(arg0, Static50.anInt1073);
		Static376.aClass110Array15 = new Class110[local10.length];
		for (@Pc(141) int local141 = 0; local141 < local10.length; local141++) {
			Static376.aClass110Array15[local141] = arg1.method4869(local10[local141]);
		}
		local10 = Static402.method2809(arg0, Static229.anInt4044);
		Static161.aClass110Array7 = new Class110[local10.length];
		for (@Pc(172) int local172 = 0; local172 < local10.length; local172++) {
			Static161.aClass110Array7[local172] = arg1.method4869(local10[local172]);
		}
		local10 = Static402.method2809(arg0, Static308.anInt5327);
		Static333.aClass110Array13 = new Class110[local10.length];
		for (@Pc(203) int local203 = 0; local203 < local10.length; local203++) {
			Static333.aClass110Array13[local203] = arg1.method4869(local10[local203]);
		}
		local10 = Static402.method2809(arg0, Static83.anInt1724);
		Static30.aClass110Array1 = new Class110[local10.length];
		for (@Pc(234) int local234 = 0; local234 < local10.length; local234++) {
			Static30.aClass110Array1[local234] = arg1.method4869(local10[local234]);
		}
		local10 = Static402.method2809(arg0, Static308.anInt5330);
		Static323.aClass110Array12 = new Class110[local10.length];
		for (@Pc(261) int local261 = 0; local261 < local10.length; local261++) {
			Static323.aClass110Array12[local261] = arg1.method4869(local10[local261]);
		}
		local10 = Static402.method2809(arg0, Static318.anInt2155);
		Static81.aClass110Array3 = new Class110[local10.length];
		for (@Pc(288) int local288 = 0; local288 < local10.length; local288++) {
			Static81.aClass110Array3[local288] = arg1.method4869(local10[local288]);
		}
		local10 = Static402.method2809(arg0, Static316.anInt5435);
		Static235.aClass110Array9 = new Class110[local10.length];
		for (@Pc(315) int local315 = 0; local315 < local10.length; local315++) {
			Static235.aClass110Array9[local315] = arg1.method4869(local10[local315]);
		}
		local10 = Static402.method2809(arg0, Static289.anInt5034);
		Static110.aClass110Array4 = new Class110[local10.length];
		for (@Pc(346) int local346 = 0; local346 < local10.length; local346++) {
			Static110.aClass110Array4[local346] = arg1.method4869(local10[local346]);
		}
		Static327.aClass110_15 = arg1.method4869(Static402.method2800(arg0, Static8.anInt6463, 0));
		Static362.aClass110_19 = arg1.method4869(Static402.method2800(arg0, Static366.anInt4864, 0));
		local10 = Static402.method2809(arg0, Static199.anInt3570);
		Static289.aClass110Array11 = new Class110[local10.length];
		for (@Pc(389) int local389 = 0; local389 < local10.length; local389++) {
			Static289.aClass110Array11[local389] = arg1.method4869(local10[local389]);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZZLclient!mj;Ljava/lang/String;)V")
	public static void method2516(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class156 arg2, @OriginalArg(4) String arg3) {
		if (!arg0) {
			Static95.method5463(arg2, 3, arg3);
			return;
		}
		@Pc(29) String local29;
		if (Static218.aString43.startsWith("win") && Static218.anInt3887 != 3) {
			local29 = null;
			if (arg2.anApplet1 != null) {
				local29 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local29 == null || !local29.equals("1")) {
				@Pc(49) Class133 local49 = Static95.method5463(arg2, 0, arg3);
				Static155.aString27 = arg3;
				Static155.aClass156_2 = arg2;
				Static381.aClass133_10 = local49;
				return;
			}
		}
		if (Static218.aString43.startsWith("mac")) {
			local29 = null;
			if (arg2.anApplet1 != null) {
				local29 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local29 != null && local29.equals("1") && arg1) {
				Static95.method5463(arg2, 1, arg3);
				return;
			}
		}
		Static95.method5463(arg2, 2, arg3);
	}
}
