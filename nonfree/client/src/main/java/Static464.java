import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "[Lclient!mea;")
	public static Class212[] aClass212Array1;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
	public static int anInt8682;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	public static int anInt8684;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Z")
	public static boolean aBoolean710 = true;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Lclient!cg;")
	public static Class3_Sub9 method7107() {
		@Pc(6) Class3_Sub9 local6 = Static228.method3902();
		local6.aClass230_14 = null;
		local6.anInt1624 = 0;
		local6.aClass3_Sub7_Sub1_1 = new Class3_Sub7_Sub1(5000);
		return local6;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IBI)Z")
	public static boolean method7108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
