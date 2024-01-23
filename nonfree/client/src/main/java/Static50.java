import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
	public static int anInt1382;

	@OriginalMember(owner = "client!dk", name = "w", descriptor = "Lclient!tl;")
	public static Class155 aClass155_10 = new Class155(64);

	@OriginalMember(owner = "client!dk", name = "E", descriptor = "Ljava/lang/String;")
	public static String aString46 = "Continue";

	@OriginalMember(owner = "client!dk", name = "F", descriptor = "Z")
	public static boolean aBoolean80 = true;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	public static void method1053() {
		@Pc(3) int local3;
		@Pc(11) int local11;
		for (local3 = -1; local3 < Static266.anInt5789; local3++) {
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static39.anIntArray108[local3];
			}
			@Pc(21) Class25_Sub1_Sub1 local21 = Static271.aClass25_Sub1_Sub1Array1[local11];
			if (local21 != null && local21.anInt1675 > 0) {
				local21.anInt1675--;
				if (local21.anInt1675 == 0) {
					local21.aString52 = null;
				}
			}
		}
		for (local3 = 0; local3 < Static147.anInt3493; local3++) {
			local11 = Static65.anIntArray25[local3];
			@Pc(62) Class25_Sub1_Sub2 local62 = Static27.aClass25_Sub1_Sub2Array1[local11];
			if (local62 != null && local62.anInt1675 > 0) {
				local62.anInt1675--;
				if (local62.anInt1675 == 0) {
					local62.aString52 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
	public static void method1054() {
		Static275.aClass155_44.method4362();
		Static290.aClass155_47.method4362();
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lclient!uh;")
	public static Class159 method1056(@OriginalArg(0) int arg0) {
		@Pc(6) Class159 local6 = (Class159) Static129.aClass155_23.method4358((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static44.aClass83_29.method2306(4, arg0);
		local6 = new Class159();
		if (local21 != null) {
			local6.method4507(new Class1_Sub16(local21), arg0);
		}
		Static129.aClass155_23.method4360((long) arg0, local6);
		return local6;
	}
}
