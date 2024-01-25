import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_53 = new Class221(0, -1);

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public static int anInt1272 = -1;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString12 = null;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
	public static int anInt1273 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!nr;ILclient!nr;)V")
	public static void method1442(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_252 != null) {
			arg1.method5723();
		}
		arg1.aClass2_251 = arg0;
		arg1.aClass2_252 = arg0.aClass2_252;
		arg1.aClass2_252.aClass2_251 = arg1;
		arg1.aClass2_251.aClass2_252 = arg1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public static void method1443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null && local7.aClass1_Sub4_1 != null) {
			local7.aClass1_Sub4_1 = null;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public static void method1445(@OriginalArg(0) int arg0) {
		Static298.anInt5924 = arg0;
		Static160.anInt3750 = -1;
		Static49.anInt819 = -1;
		Static220.method4160();
	}
}
