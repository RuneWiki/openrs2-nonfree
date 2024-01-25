import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
	public static boolean aBoolean688 = false;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Z")
	public static boolean aBoolean689 = true;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I")
	public static int method7767() {
		@Pc(7) int local7 = Static382.aClass350_1.method7664();
		if (local7 < Static295.aClass350Array1.length - 1) {
			Static382.aClass350_1 = Static295.aClass350Array1[local7 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZIIII)Lclient!fca;")
	public static Class1_Sub16 method7768(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub16 local7 = new Class1_Sub16();
		local7.anInt2683 = arg1;
		local7.anInt2681 = arg3;
		Static68.aClass356_4.method7800((long) arg2, local7);
		Static40.method5276(arg3);
		@Pc(26) Class365 local26 = Static374.method5437(arg2);
		if (local26 != null) {
			Static201.method5537(local26);
		}
		if (Static211.aClass365_8 != null) {
			Static201.method5537(Static211.aClass365_8);
			Static211.aClass365_8 = null;
		}
		Static98.method1830();
		if (local26 != null) {
			Static26.method716(local26, !arg0);
		}
		if (!arg0) {
			Static145.method2351(arg3);
		}
		if (!arg0 && Static219.anInt4263 != -1) {
			Static463.method6579(Static219.anInt4263, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
	public static int method7769() {
		return 46;
	}
}
