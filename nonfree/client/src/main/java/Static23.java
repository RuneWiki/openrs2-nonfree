import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dd", name = "u", descriptor = "[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub4_Sub2Array4;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "Lclient!ad;")
	private static Class4 aClass4_261 = Static75.method1216("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_258 = aClass4_261;

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!gb;")
	public static Class3_Sub4 aClass3_Sub4_2 = new Class3_Sub4(8);

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt504 = 0;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "Lclient!ad;")
	public static Class4 aClass4_259 = Static75.method1216("title)3jpg");

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public static int anInt514 = -1;

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "Lclient!ad;")
	public static Class4 aClass4_260 = Static75.method1216(" ");

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
	public static int anInt516 = 0;

	@OriginalMember(owner = "client!dd", name = "z", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "Lclient!ad;")
	public static Class4 aClass4_262 = Static75.method1216("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "[I")
	public static int[] anIntArray39 = new int[128];

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!fe;)V")
	public static void method305(@OriginalArg(1) Class29 arg0) {
		Static44.aClass29_1 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
	public static void method306() {
		if (Static100.aClass60_1 != null) {
			@Pc(12) Class60 local12 = Static100.aClass60_1;
			synchronized (Static100.aClass60_1) {
				Static100.aClass60_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
	public static void method315() {
		aClass4_262 = null;
		aClass4_259 = null;
		aClass3_Sub4_2 = null;
		aCRC32_1 = null;
		aClass4_261 = null;
		aClass4_260 = null;
		aClass3_Sub1_Sub4_Sub2Array4 = null;
		anIntArray39 = null;
		aClass4_258 = null;
	}
}
