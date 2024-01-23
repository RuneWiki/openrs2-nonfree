import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!db", name = "F", descriptor = "I")
	public static int anInt1068;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString35 = " from your friend list first.";

	@OriginalMember(owner = "client!db", name = "B", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!db", name = "D", descriptor = "I")
	public static int anInt1067 = 1;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "Z")
	public static boolean aBoolean101 = false;

	@OriginalMember(owner = "client!db", name = "G", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public static void method893() {
		Static64.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V")
	public static void method896(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static254.aClass1_Sub16ArrayArrayArray3 = Static184.aClass1_Sub16ArrayArrayArray1;
			Static280.anIntArrayArrayArray13 = Static124.anIntArrayArrayArray5;
			Static230.aClass1_Sub15ArrayArray30 = Static142.aClass1_Sub15ArrayArray16;
		} else {
			Static254.aClass1_Sub16ArrayArrayArray3 = Static193.aClass1_Sub16ArrayArrayArray2;
			Static280.anIntArrayArrayArray13 = Static24.anIntArrayArrayArray3;
			Static230.aClass1_Sub15ArrayArray30 = Static213.aClass1_Sub15ArrayArray37;
		}
		Static311.anInt5590 = Static254.aClass1_Sub16ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!od;)V")
	public static void method897(@OriginalArg(1) Class11_Sub4_Sub2 arg0) {
		for (@Pc(15) Class1_Sub28 local15 = (Class1_Sub28) Static28.aClass96_2.method2340(); local15 != null; local15 = (Class1_Sub28) Static28.aClass96_2.method2342()) {
			if (local15.aClass11_Sub4_Sub2_1 == arg0) {
				if (local15.aClass1_Sub7_Sub1_2 != null) {
					Static173.aClass1_Sub7_Sub3_1.method3613(local15.aClass1_Sub7_Sub1_2);
					local15.aClass1_Sub7_Sub1_2 = null;
				}
				local15.method4573();
				return;
			}
		}
	}
}
