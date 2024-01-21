import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!ua", name = "S", descriptor = "Lclient!bg;")
	public static Class11 aClass11_32;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
	public static int[] anIntArray56 = new int[4000];

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Lclient!wa;")
	public static Class2_Sub13_Sub1 aClass2_Sub13_Sub1_5 = new Class2_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "Lclient!lf;")
	private static Class49 aClass49_364 = Static32.method683("Login");

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "Lclient!lf;")
	public static Class49 aClass49_365 = Static32.method683("hitmarks");

	@OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
	public static int anInt693 = 0;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "Lclient!lf;")
	public static Class49 aClass49_366 = aClass49_364;

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
	public static int anInt694 = 0;

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "[I")
	public static int[] anIntArray58 = new int[25];

	@OriginalMember(owner = "client!ua", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_367 = Static32.method683("Titelbild geladen)3");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)V")
	public static void method530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub2_Sub13 local7 = Static108.method1831(arg0);
		@Pc(10) int local10 = local7.anInt3038;
		@Pc(18) int local18 = local7.anInt3043;
		@Pc(21) int local21 = local7.anInt3044;
		@Pc(28) int local28 = client.anIntArray60[local21 - local18];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local18;
		Static165.anIntArray317[local10] = Static165.anIntArray317[local10] & ~local28 | local28 & arg1 << local18;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)Z")
	public static boolean method531(@OriginalArg(1) int arg0) {
		if (Static33.aBooleanArray4[arg0]) {
			return true;
		} else if (Static51.aClass11_47.method2061(arg0)) {
			@Pc(23) int local23 = Static51.aClass11_47.method2069(arg0);
			if (local23 == 0) {
				Static33.aBooleanArray4[arg0] = true;
				return true;
			}
			if (Static149.aClass85ArrayArray1[arg0] == null) {
				Static149.aClass85ArrayArray1[arg0] = new Class85[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static149.aClass85ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static51.aClass11_47.method2049(local45, arg0);
					if (local59 != null) {
						Static149.aClass85ArrayArray1[arg0][local45] = new Class85();
						Static149.aClass85ArrayArray1[arg0][local45].anInt3849 = local45 + (arg0 << 16);
						if (local59[0] == -1) {
							Static149.aClass85ArrayArray1[arg0][local45].method2893(new Class2_Sub13(local59));
						} else {
							Static149.aClass85ArrayArray1[arg0][local45].method2892(new Class2_Sub13(local59));
						}
					}
				}
			}
			Static33.aBooleanArray4[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public static void method532() {
		aClass49_366 = null;
		aClass49_367 = null;
		aClass2_Sub13_Sub1_5 = null;
		aClass49_364 = null;
		aClass49_365 = null;
		anIntArray58 = null;
		anIntArray57 = null;
		anIntArray56 = null;
		aClass11_32 = null;
	}
}
