import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!od", name = "e", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array5;

	@OriginalMember(owner = "client!od", name = "q", descriptor = "Lclient!ee;")
	public static Class1_Sub1_Sub7 aClass1_Sub1_Sub7_4;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "[I")
	public static int[] anIntArray236;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1174 = Static15.method178("You have only just left another world)3");

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1180 = Static15.method178("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1175 = aClass23_1180;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1176 = Static15.method178("backleft2");

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1177 = Static15.method178(" )2> @whi@");

	@OriginalMember(owner = "client!od", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1178 = aClass23_1174;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!oe;")
	public static Class45 aClass45_5 = new Class45();

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public static int anInt2006 = 1;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1179 = Static15.method178("Offline");

	@OriginalMember(owner = "client!od", name = "m", descriptor = "I")
	public static int anInt2008 = 0;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1181 = Static15.method178("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!od", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1182 = Static15.method178(":tradereq:");

	@OriginalMember(owner = "client!od", name = "r", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1183 = Static15.method178("::");

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1184 = Static15.method178(")1");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBIIIIII)V")
	public static void method1285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg3 < 1 || arg0 > 102 || arg3 > 102) {
			return;
		}
		if (Static9.aBoolean7 && arg1 != Static79.anInt2137) {
			return;
		}
		@Pc(31) int local31 = 0;
		if (arg2 == 0) {
			local31 = Static19.aClass65_1.method1743(arg1, arg0, arg3);
		}
		if (arg2 == 1) {
			local31 = Static19.aClass65_1.method1750(arg1, arg0, arg3);
		}
		if (arg2 == 2) {
			local31 = Static19.aClass65_1.method1733(arg1, arg0, arg3);
		}
		if (arg2 == 3) {
			local31 = Static19.aClass65_1.method1762(arg1, arg0, arg3);
		}
		@Pc(91) int local91;
		if (local31 != 0) {
			local91 = Static19.aClass65_1.method1730(arg1, arg0, arg3, local31);
			@Pc(95) int local95 = local91 & 0x1F;
			@Pc(101) int local101 = local31 >> 14 & 0x7FFF;
			@Pc(107) int local107 = local91 >> 6 & 0x3;
			@Pc(121) Class1_Sub1_Sub4 local121;
			if (arg2 == 0) {
				Static19.aClass65_1.method1763(arg1, arg0, arg3);
				local121 = Static97.method1645(local101);
				if (local121.aBoolean21) {
					Static45.aClass50Array1[arg1].method1363(local121.aBoolean14, arg3, arg0, local107, local95);
				}
			}
			if (arg2 == 1) {
				Static19.aClass65_1.method1745(arg1, arg0, arg3);
			}
			if (arg2 == 2) {
				Static19.aClass65_1.method1729(arg1, arg0, arg3);
				local121 = Static97.method1645(local101);
				if (local121.anInt299 + arg0 > 103 || local121.anInt299 + arg3 > 103 || local121.anInt305 + arg0 > 103 || local121.anInt305 + arg3 > 103) {
					return;
				}
				if (local121.aBoolean21) {
					Static45.aClass50Array1[arg1].method1364(local121.aBoolean14, arg3, local107, arg0, local121.anInt305, local121.anInt299);
				}
			}
			if (arg2 == 3) {
				Static19.aClass65_1.method1738(arg1, arg0, arg3);
				local121 = Static97.method1645(local101);
				if (local121.aBoolean21 && local121.anInt298 == 1) {
					Static45.aClass50Array1[arg1].method1361(arg0, arg3);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		local91 = arg1;
		if (arg1 < 3 && (Static95.aByteArrayArrayArray5[1][arg0][arg3] & 0x2) == 2) {
			local91 = arg1 + 1;
		}
		Static110.method1902(arg1, arg3, Static45.aClass50Array1[arg1], arg5, arg0, arg4, local91, Static19.aClass65_1, arg6);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method1286() {
		aClass23_1176 = null;
		aClass23_1184 = null;
		aClass1_Sub1_Sub7_4 = null;
		aClass23_1183 = null;
		anIntArray236 = null;
		aClass23_1179 = null;
		aClass23_1181 = null;
		aClass23_1175 = null;
		aClass23_1177 = null;
		aClass1_Sub1_Sub6_Sub1Array5 = null;
		aClass23_1174 = null;
		aClass23_1180 = null;
		aClass23_1178 = null;
		aClass23_1182 = null;
		aClass45_5 = null;
	}
}
