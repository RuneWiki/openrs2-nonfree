import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "I")
	public static int anInt3723;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Z")
	public static boolean aBoolean296 = false;

	@OriginalMember(owner = "client!il", name = "j", descriptor = "[Lclient!gea;")
	public static final Class99[] aClass99Array1 = new Class99[4];

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)Lclient!gea;")
	public static Class99 method3298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class99 local12 = new Class99();
		local12.anInt2805 = -1;
		local12.anInt2795 = arg1 + 5 + 1;
		local12.anInt2817 = -1;
		local12.anInt2809 = arg0 + 5 + 1;
		local12.anIntArrayArray42 = new int[local12.anInt2795][local12.anInt2809];
		local12.method2648();
		return local12;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3299(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static12.anInt264 >= 100 && !Static415.aBoolean571 || Static12.anInt264 >= 200) {
			Static215.method6797(Static441.aClass202_222.method5139(Static172.anInt6352));
			return;
		}
		@Pc(27) String local27 = Static111.method2163(arg0);
		if (local27 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(36) int local36 = 0; local36 < Static12.anInt264; local36++) {
			@Pc(44) String local44 = Static111.method2163(Static145.aStringArray15[local36]);
			if (local44 != null && local44.equals(local27)) {
				Static215.method6797(arg0 + Static17.aClass202_13.method5139(Static172.anInt6352));
				return;
			}
			if (Static8.aStringArray1[local36] != null) {
				local74 = Static111.method2163(Static8.aStringArray1[local36]);
				if (local74 != null && local74.equals(local27)) {
					Static215.method6797(arg0 + Static17.aClass202_13.method5139(Static172.anInt6352));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < Static60.anInt1162; local104++) {
			local74 = Static111.method2163(Static73.aStringArray6[local104]);
			if (local74 != null && local74.equals(local27)) {
				Static215.method6797(Static238.aClass202_134.method5139(Static172.anInt6352) + arg0 + Static220.aClass202_127.method5139(Static172.anInt6352));
				return;
			}
			if (Static185.aStringArray19[local104] != null) {
				@Pc(147) String local147 = Static111.method2163(Static185.aStringArray19[local104]);
				if (local147 != null && local147.equals(local27)) {
					Static215.method6797(Static238.aClass202_134.method5139(Static172.anInt6352) + arg0 + Static220.aClass202_127.method5139(Static172.anInt6352));
					return;
				}
			}
		}
		if (Static111.method2163(Static266.aClass1_Sub1_Sub2_Sub1_1.aString83).equals(local27)) {
			Static215.method6797(Static4.aClass202_7.method5139(Static172.anInt6352));
		} else {
			Static93.method1721(Static48.aClass243_10);
			Static381.aClass2_Sub29_Sub2_2.method5172(Static332.method5299(arg0));
			Static381.aClass2_Sub29_Sub2_2.method5189(arg0);
		}
	}
}
