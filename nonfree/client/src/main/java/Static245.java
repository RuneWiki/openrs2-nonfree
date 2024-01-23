import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
	public static int anInt4683;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString160 = "glow3:";

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(IB)V")
	public static void method3745(@OriginalArg(0) int arg0) {
		if (!Static222.method3559(arg0)) {
			return;
		}
		@Pc(17) Class22[] local17 = Static148.aClass22ArrayArray1[arg0];
		for (@Pc(29) int local29 = 0; local29 < local17.length; local29++) {
			@Pc(41) Class22 local41 = local17[local29];
			if (local41 != null) {
				local41.anInt632 = 0;
				local41.anInt576 = 1;
				local41.anInt578 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lclient!hd;")
	public static Class57 method3746(@OriginalArg(1) int arg0) {
		@Pc(10) Class57 local10 = (Class57) Static139.aClass33_23.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static176.aClass98_24.method2396(arg0, 3);
		local10 = new Class57();
		if (local28 != null) {
			local10.method1567(new Class4_Sub17(local28));
		}
		Static139.aClass33_23.method845(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIILclient!cc;I)V")
	public static void method3747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) int arg3) {
		if (Static178.aBoolean216) {
			Static186.method2963(arg1, arg0, arg2.anInt546 + arg1, arg2.anInt602 + arg0);
		}
		if (Static47.anInt949 >= 3) {
			if (Static178.aBoolean216) {
				@Pc(34) Class4_Sub2_Sub1 local34 = arg2.method461(false);
				if (local34 != null) {
					local34.method3454(arg1, arg0);
				}
			} else {
				Static166.method2607(arg1, arg0, arg2.anIntArray52, arg2.anIntArray60);
			}
		} else if (Static178.aBoolean216) {
			((Class4_Sub2_Sub1_Sub2) Static111.aClass4_Sub2_Sub1_3).method2582(arg1, arg0, arg2.anInt546, arg2.anInt602, Static111.aClass4_Sub2_Sub1_3.anInt4301 / 2, Static111.aClass4_Sub2_Sub1_3.anInt4308 / 2, (int) Static270.aFloat49, 256, (Class4_Sub2_Sub1_Sub2) arg2.method461(false));
		} else {
			((Class4_Sub2_Sub1_Sub1) Static111.aClass4_Sub2_Sub1_3).method3474(arg1, arg0, arg2.anInt546, arg2.anInt602, Static111.aClass4_Sub2_Sub1_3.anInt4301 / 2, Static111.aClass4_Sub2_Sub1_3.anInt4308 / 2, (int) Static270.aFloat49, arg2.anIntArray52, arg2.anIntArray60);
		}
		Static72.aBooleanArray11[arg3] = true;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(Z)V")
	public static void method3748() {
		aString160 = null;
	}
}
