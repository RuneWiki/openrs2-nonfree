import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "k", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	public static int anInt122;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	public static int anInt123;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "I")
	public static volatile int anInt116 = -1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_82 = Static193.method3027(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_83 = Static193.method3027("::tele 0)1");

	@OriginalMember(owner = "client!af", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!af", name = "f", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_84 = Static193.method3027("k");

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public static int anInt117 = 0;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Z")
	public static volatile boolean aBoolean9 = true;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_85 = Static193.method3027("Free world");

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_86 = Static193.method3027("blinken2:");

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!oc;")
	public static Class70 aClass70_87 = aClass70_85;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IBIIIIII)V")
	public static void method101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg1 < 1 || arg2 > 102 || arg1 > 102) {
			return;
		}
		if (Static50.aBoolean66 && arg5 != Static137.anInt2795) {
			return;
		}
		@Pc(29) int local29 = arg5;
		if (arg5 < 3 && (Static17.aByteArrayArrayArray2[1][arg2][arg1] & 0x2) == 2) {
			local29 = arg5 + 1;
		}
		Static146.method2123(arg2, arg1, arg4, arg5, local29, Static28.aClass77Array1[arg5]);
		if (arg3 >= 0) {
			Static138.method1976(arg5, arg1, Static28.aClass77Array1[arg5], arg3, false, arg2, arg6, local29, arg0, false);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!ke;BI)[Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2[] method103(@OriginalArg(0) Class52 arg0, @OriginalArg(2) int arg1) {
		return Static212.method3340(arg0, arg1) ? Static45.method739() : null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!uc;")
	public static Class3_Sub3_Sub22 method104(@OriginalArg(0) int arg0) {
		@Pc(6) Class3_Sub3_Sub22 local6 = (Class3_Sub3_Sub22) Static76.aClass85_16.method2558((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static113.aClass52_Sub1_18.method1581(arg0, 0);
		if (local20 == null) {
			return null;
		}
		local6 = new Class3_Sub3_Sub22();
		@Pc(38) Class3_Sub4 local38 = new Class3_Sub4(local20);
		local38.anInt1758 = local38.aByteArray12.length - 2;
		@Pc(49) int local49 = local38.method1270();
		@Pc(60) int local60 = local38.aByteArray12.length - local49 - 2 - 12;
		local38.anInt1758 = local60;
		@Pc(67) int local67 = local38.method1245();
		local6.anInt3864 = local38.method1270();
		local6.anInt3868 = local38.method1270();
		local6.anInt3869 = local38.method1270();
		local6.anInt3867 = local38.method1270();
		@Pc(91) int local91 = local38.method1278();
		@Pc(102) int local102;
		@Pc(107) int local107;
		if (local91 > 0) {
			local6.aClass40Array1 = new Class40[local91];
			for (local102 = 0; local102 < local91; local102++) {
				local107 = local38.method1270();
				@Pc(114) Class40 local114 = new Class40(Static91.method1315(local107));
				local6.aClass40Array1[local102] = local114;
				while (local107-- > 0) {
					@Pc(124) int local124 = local38.method1245();
					@Pc(128) int local128 = local38.method1245();
					local114.method1027(new Class3_Sub16(local128), (long) local124);
				}
			}
		}
		local38.anInt1758 = 0;
		local102 = 0;
		local6.aClass70_1887 = local38.method1249();
		local6.anIntArray328 = new int[local67];
		local6.anIntArray329 = new int[local67];
		local6.aClass70Array70 = new Class70[local67];
		while (local38.anInt1758 < local60) {
			local107 = local38.method1270();
			if (local107 == 3) {
				local6.aClass70Array70[local102] = local38.method1246();
			} else if (local107 >= 100 || local107 == 21 || local107 == 38 || local107 == 39) {
				local6.anIntArray329[local102] = local38.method1278();
			} else {
				local6.anIntArray329[local102] = local38.method1245();
			}
			local6.anIntArray328[local102++] = local107;
		}
		Static76.aClass85_16.method2560(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILclient!ke;)[Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2[] method105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class52 arg2) {
		return Static141.method2009(arg2, arg1, arg0) ? Static45.method739() : null;
	}
}
