import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_653 = Static94.method1596("backhmid1");

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_654 = Static94.method1596("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "Lclient!a;")
	private static Class1 aClass1_656 = Static94.method1596("The server is being updated)3");

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Lclient!a;")
	public static Class1 aClass1_655 = aClass1_656;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public static int anInt693 = 0;

	@OriginalMember(owner = "client!cd", name = "r", descriptor = "[I")
	public static int[] anIntArray67 = new int[4000];

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_657 = Static94.method1596("Neuer Benutzer");

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub14 aClass2_Sub1_Sub14_1 = null;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "[I")
	public static int[] anIntArray68 = new int[25];

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
	public static int anInt696 = 0;

	@OriginalMember(owner = "client!cd", name = "x", descriptor = "[[[Lclient!pb;")
	public static Class46[][][] aClass46ArrayArrayArray1 = new Class46[4][104][104];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	public static void method452() {
		aClass1_657 = null;
		aClass1_655 = null;
		aClass1_653 = null;
		anIntArray68 = null;
		aClass46ArrayArrayArray1 = null;
		aClass1_654 = null;
		aClass1_656 = null;
		anIntArray67 = null;
		aClass2_Sub1_Sub14_1 = null;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V")
	public static void method453() {
		if (Static5.anInt403 == 0) {
			return;
		}
		@Pc(13) Class2_Sub1_Sub2_Sub1 local13 = Static88.aClass2_Sub1_Sub2_Sub1_1;
		@Pc(15) int local15 = 0;
		if (Static95.anInt2397 != 0) {
			local15 = 1;
		}
		for (@Pc(21) int local21 = 0; local21 < 100; local21++) {
			if (Static67.aClass1Array29[local21] != null) {
				@Pc(31) Class1 local31 = Static107.aClass1Array28[local21];
				@Pc(33) byte local33 = 0;
				@Pc(37) int local37 = Static111.anIntArray351[local21];
				if (local31 != null && local31.method26(Static85.aClass1_2374)) {
					local31 = local31.method1(5);
					local33 = 1;
				}
				if (local31 != null && local31.method26(Static83.aClass1_2344)) {
					local31 = local31.method1(5);
					local33 = 2;
				}
				@Pc(93) int local93;
				if ((local37 == 3 || local37 == 7) && (local37 == 7 || Static6.anInt409 == 0 || Static6.anInt409 == 1 && Static11.method410(local31))) {
					local93 = 329 - local15 * 13;
					local15++;
					local13.method375(Static41.aClass1_1380, 4, local93, 0);
					local13.method375(Static41.aClass1_1380, 4, local93 - 1, 65535);
					@Pc(116) int local116 = local13.method370(Static41.aClass1_1380) + 4;
					local116 += local13.method374(32);
					if (local33 == 1) {
						Static86.aClass2_Sub1_Sub2_Sub2Array8[0].method637(local116, local93 - 12);
						local116 += 14;
					}
					if (local33 == 2) {
						Static86.aClass2_Sub1_Sub2_Sub2Array8[1].method637(local116, local93 - 12);
						local116 += 14;
					}
					local13.method375(Static97.method1655(new Class1[] { local31, Static34.aClass1_1236, Static67.aClass1Array29[local21] }), local116, local93, 0);
					local13.method375(Static97.method1655(new Class1[] { local31, Static34.aClass1_1236, Static67.aClass1Array29[local21] }), local116, local93 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local37 == 5 && Static6.anInt409 < 2) {
					local93 = 329 - local15 * 13;
					local15++;
					local13.method375(Static67.aClass1Array29[local21], 4, local93, 0);
					local13.method375(Static67.aClass1Array29[local21], 4, local93 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
				if (local37 == 6 && Static6.anInt409 < 2) {
					local93 = 329 - local15 * 13;
					local15++;
					local13.method375(Static97.method1655(new Class1[] { Static14.aClass1_650, Static81.aClass1_2273, local31, Static34.aClass1_1236, Static67.aClass1Array29[local21] }), 4, local93, 0);
					local13.method375(Static97.method1655(new Class1[] { Static14.aClass1_650, Static81.aClass1_2273, local31, Static34.aClass1_1236, Static67.aClass1Array29[local21] }), 4, local93 - 1, 65535);
					if (local15 >= 5) {
						return;
					}
				}
			}
		}
	}
}
