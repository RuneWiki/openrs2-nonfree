import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "[I")
	public static int[] anIntArray528;

	@OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
	public static int anInt8774 = 0;

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
	public static int anInt8777 = -1;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)I")
	public static int method7085(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local19 | local19 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	public static void method7086() {
		Static215.anInt3929 = -1;
		Static23.anInt578 = 2;
		Static2.anInt71 = 1;
		Static167.aBoolean229 = false;
		Static148.aClass308_59 = null;
		Static403.anInt7226 = -1;
		Static144.aClass1_Sub6_Sub2_4 = null;
		Static429.anInt7683 = 0;
	}
}
