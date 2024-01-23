import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public static int anInt1918;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "J")
	public static long aLong70 = 0L;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString67 = "Walk here";

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
	public static int anInt1927 = -1;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public static void method1482() {
		if (!Static287.aBoolean373) {
			return;
		}
		@Pc(14) Class56 local14 = Static15.method273(Static220.anInt4519, Static239.anInt4787);
		if (local14 != null && local14.anObjectArray8 != null) {
			@Pc(26) Class2_Sub12 local26 = new Class2_Sub12();
			local26.anObjectArray1 = local14.anObjectArray8;
			local26.aClass56_6 = local14;
			Static204.method3467(local26);
		}
		Static287.aBoolean373 = false;
		Static203.anInt4260 = -1;
		Static287.method4466(local14);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!g;I)Z")
	public static boolean method1486(@OriginalArg(0) Class56 arg0) {
		if (arg0.anInt2074 == 205) {
			Static142.anInt3132 = 250;
			return true;
		} else {
			return false;
		}
	}
}
