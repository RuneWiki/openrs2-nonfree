import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
	public static int anInt806;

	@OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "Lclient!sa;")
	public static Class4_Sub14 aClass4_Sub14_5;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray3 = new boolean[8];

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!od;")
	public static Class60 aClass60_248 = Static41.method597("sl_stars");

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_249 = Static41.method597("Art");

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Lclient!od;")
	private static Class60 aClass60_250 = Static41.method597("FULL");

	@OriginalMember(owner = "client!dd", name = "n", descriptor = "Lclient!od;")
	public static Class60 aClass60_253 = Static41.method597("");

	@OriginalMember(owner = "client!dd", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_251 = aClass60_253;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_252 = aClass60_250;

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_254 = Static41.method597("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	public static int anInt808 = -1;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	public static final int anInt809 = 0;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "Lclient!od;")
	public static Class60 aClass60_255 = Static41.method597("jolt");

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "Lclient!od;")
	private static Class60 aClass60_256 = Static41.method597("Examine");

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "Lclient!od;")
	public static Class60 aClass60_257 = Static41.method597(" <col=ffffff>");

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "Lclient!od;")
	public static Class60 aClass60_258 = aClass60_256;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method424() {
		aClass4_Sub14_5 = null;
		aClass60_251 = null;
		aClass60_253 = null;
		aClass60_257 = null;
		aClass60_256 = null;
		aClass60_249 = null;
		aClass60_252 = null;
		aClass60_250 = null;
		aClass60_255 = null;
		aClass60_248 = null;
		aClass60_258 = null;
		aClass60_254 = null;
		aBooleanArray3 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
	public static void method426(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static56.aBooleanArray9[arg0]) {
			return;
		}
		Static32.aClass10_12.method1784(arg0);
		if (Static82.aClass4_Sub14ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(33) boolean local33 = true;
		for (@Pc(35) int local35 = 0; local35 < Static82.aClass4_Sub14ArrayArray1[arg0].length; local35++) {
			if (Static82.aClass4_Sub14ArrayArray1[arg0][local35] != null) {
				if (Static82.aClass4_Sub14ArrayArray1[arg0][local35].anInt2389 == 2) {
					local33 = false;
				} else {
					Static82.aClass4_Sub14ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local33) {
			Static82.aClass4_Sub14ArrayArray1[arg0] = null;
		}
		Static56.aBooleanArray9[arg0] = false;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[Lclient!od;)[Lclient!od;")
	public static Class60[] method427(@OriginalArg(1) Class60[] arg0) {
		@Pc(6) Class60[] local6 = new Class60[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = Static12.method1761(new Class60[] { Static65.method1051(local8), Static86.aClass60_839 });
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = Static12.method1761(new Class60[] { local6[local8], arg0[local8] });
			}
		}
		return local6;
	}
}
