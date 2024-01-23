import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bl", name = "eb", descriptor = "I")
	public static int anInt379;

	@OriginalMember(owner = "client!bl", name = "cb", descriptor = "Lclient!cc;")
	public static Class26 aClass26_4 = new Class26(20);

	@OriginalMember(owner = "client!bl", name = "db", descriptor = "Lclient!cc;")
	public static Class26 aClass26_5 = new Class26(4);

	@OriginalMember(owner = "client!bl", name = "fb", descriptor = "J")
	public static long aLong20 = 0L;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)V")
	public static void method344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class186 local13 = local7.aClass186_1;
		if (local13 != null) {
			local13.anInt5637 = local13.anInt5637 * arg3 / 16;
			local13.anInt5629 = local13.anInt5629 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)Lclient!bh;")
	public static Class19 method345() {
		try {
			return (Class19) Class.forName("Class19_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method346(@OriginalArg(1) Class58 arg0) {
		Static155.aClass58_54 = arg0;
	}
}
