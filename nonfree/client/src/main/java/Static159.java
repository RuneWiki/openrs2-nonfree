import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
	public static int anInt3497;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	public static int anInt3503;

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "Lclient!sc;")
	private static Class107 aClass107_932 = Static231.method3737("glow3:");

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_929 = aClass107_932;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	public static int anInt3500 = 0;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "[Lclient!be;")
	public static Class13[] aClass13Array1 = new Class13[27];

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	public static int anInt3501 = -1;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "Lclient!sc;")
	public static Class107 aClass107_930 = Static231.method3737("(Y");

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
	public static int anInt3502 = 2;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
	public static int anInt3504 = 0;

	@OriginalMember(owner = "client!oj", name = "u", descriptor = "Lclient!sc;")
	public static Class107 aClass107_931 = aClass107_932;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "[B")
	public static byte[] aByteArray47 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)V")
	public static void method2576(@OriginalArg(1) int arg0) {
		Static96.anIntArray211 = new int[arg0];
		Static165.anIntArray226 = new int[arg0];
		Static191.anIntArray348 = new int[arg0];
		Static158.anIntArray304 = new int[arg0];
		Static230.anIntArray381 = new int[arg0];
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!vf;B)Lclient!nd;")
	public static Class3_Sub3 method2578(@OriginalArg(0) Class1_Sub26 arg0) {
		return new Class3_Sub3(arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2944(), arg0.method2937(), arg0.method2937(), arg0.method2945());
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	public static void method2579() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < 104; local14++) {
			for (@Pc(18) int local18 = 0; local18 < 104; local18++) {
				if (Static184.method3038(local14, Static174.aClass1_Sub9ArrayArrayArray2, true, local7, local18)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
