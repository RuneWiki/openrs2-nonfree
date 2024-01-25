import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ev", name = "b", descriptor = "Lclient!pi;")
	public static Class199 aClass199_131;

	@OriginalMember(owner = "client!ev", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray152;

	@OriginalMember(owner = "client!ev", name = "j", descriptor = "Lclient!ul;")
	public static Class252 aClass252_140;

	@OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
	public static int anInt7395;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Z")
	public static boolean aBoolean649 = false;

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_282 = new Class67(77, 2);

	@OriginalMember(owner = "client!ev", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray162 = new boolean[100];

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "(I)V")
	public static void method5955(@OriginalArg(0) int arg0) {
		Static193.anInt3335 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static174.anInt2873; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static325.anInt5351; local6++) {
				if (Static259.aClass216ArrayArrayArray3[arg0][local3][local6] == null) {
					Static259.aClass216ArrayArrayArray3[arg0][local3][local6] = new Class216(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZLclient!hm;)V")
	public static void method5957(@OriginalArg(1) Class107 arg0) {
		if (arg0.anInt2598 == 5 && arg0.anInt2631 != -1) {
			Static309.method4098(arg0, Static186.aClass117_3);
		}
	}
}
