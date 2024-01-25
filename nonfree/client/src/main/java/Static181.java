import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Lclient!pu;")
	public static Class270 aClass270_39;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
	public static int anInt3185;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt3169 = 0;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Z")
	public static final boolean aBoolean241 = false;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "Z")
	public static final boolean aBoolean242 = false;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method2555(@OriginalArg(0) int arg0) {
		Static567.anInt9400 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static27.anInt373; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static507.anInt8645; local6++) {
				if (Static292.aClass39ArrayArrayArray2[arg0][local3][local6] == null) {
					Static292.aClass39ArrayArrayArray2[arg0][local3][local6] = new Class39(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method2556(@OriginalArg(1) Class1_Sub35 arg0) {
		if (arg0.aByteArray85.length - arg0.anInt7214 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method5750();
		if (local19 < 0 || local19 > 1 || arg0.aByteArray85.length - arg0.anInt7214 < 2) {
			return;
		}
		@Pc(39) int local39 = arg0.method5771();
		if (arg0.aByteArray85.length - arg0.anInt7214 < local39 * 6) {
			return;
		}
		for (@Pc(53) int local53 = 0; local53 < local39; local53++) {
			@Pc(59) int local59 = arg0.method5771();
			@Pc(63) int local63 = arg0.method5804();
			if (local59 < Static257.anIntArray365.length && Static574.aBooleanArray27[local59] && (Static53.aClass277_1.method6091(local59).aChar1 != '1' || local63 >= -1 && local63 <= 1)) {
				Static257.anIntArray365[local59] = local63;
			}
		}
	}
}
