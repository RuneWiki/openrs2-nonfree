import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	public static int anInt3234;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	public static int anInt3235;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public static int anInt3240;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
	public static int anInt3242;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "[[Lclient!bl;")
	public static Class4_Sub8[][] aClass4_Sub8ArrayArray1;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	public static int anInt3243;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "Lclient!ul;")
	public static Class172 aClass172_27 = new Class172(16);

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString112 = "K";

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString113 = "glow1:";

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V")
	public static void method2543(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static261.aClass4_Sub21ArrayArrayArray4 = Static199.aClass4_Sub21ArrayArrayArray3;
			Static154.anIntArrayArrayArray5 = Static127.anIntArrayArrayArray3;
			aClass4_Sub8ArrayArray1 = Static244.aClass4_Sub8ArrayArray3;
		} else {
			Static261.aClass4_Sub21ArrayArrayArray4 = Static75.aClass4_Sub21ArrayArrayArray1;
			Static154.anIntArrayArrayArray5 = Static230.anIntArrayArrayArray12;
			aClass4_Sub8ArrayArray1 = Static213.aClass4_Sub8ArrayArray2;
		}
		Static139.anInt2755 = Static261.aClass4_Sub21ArrayArrayArray4.length;
	}
}
