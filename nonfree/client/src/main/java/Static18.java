import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!as", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "Lclient!iq;")
	public static Class104 aClass104_13;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!fh;")
	public static Class68 aClass68_1 = null;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public static int anInt304 = 2;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "[I")
	public static final int[] anIntArray32 = new int[1000];

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V")
	public static void method268(@OriginalArg(1) boolean arg0) {
		Static276.method4761();
		if (Static176.anInt3971 != 30 && Static176.anInt3971 != 25) {
			return;
		}
		Static87.anInt1641++;
		if (Static87.anInt1641 < 50 && !arg0) {
			return;
		}
		Static87.anInt1641 = 0;
		if (!Static107.aBoolean215 && Static129.aClass117_2 != null) {
			Static300.method5057(Static132.aClass157_95);
			try {
				Static129.aClass117_2.method3279(Static197.aClass2_Sub12_Sub2_2.anInt3606, Static197.aClass2_Sub12_Sub2_2.aByteArray30);
				Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
			} catch (@Pc(52) IOException local52) {
				Static107.aBoolean215 = true;
			}
		}
		Static276.method4761();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method269(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static221.anInt4878; local16++) {
			if (arg0.equalsIgnoreCase(Static26.aStringArray25[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static2.aStringArray1[local16])) {
				return true;
			}
		}
		return false;
	}
}
