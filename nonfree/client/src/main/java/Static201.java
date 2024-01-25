import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!na", name = "p", descriptor = "Z")
	public static volatile boolean aBoolean344 = true;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Z")
	public static boolean aBoolean345 = false;

	@OriginalMember(owner = "client!na", name = "s", descriptor = "[I")
	public static final int[] anIntArray483 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!na", name = "t", descriptor = "Ljava/lang/String;")
	public static final String aString163 = "glow3:";

	@OriginalMember(owner = "client!na", name = "u", descriptor = "[I")
	public static final int[] anIntArray484 = new int[500];

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method3756(@OriginalArg(1) Class165 arg0) {
		Static6.aClass165_5 = arg0;
		Static45.anInt991 = Static6.aClass165_5.method4499(19);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "([Lclient!lf;I)V")
	public static void method3757(@OriginalArg(0) Class90[] arg0) {
		Static352.anInt6527 = arg0.length;
		Static6.anIntArray20 = new int[Static352.anInt6527 + 10];
		Static335.aClass90Array16 = new Class90[Static352.anInt6527 + 10];
		Static367.method5381(arg0, 0, Static335.aClass90Array16, 0, Static352.anInt6527);
		for (@Pc(26) int local26 = 0; local26 < Static352.anInt6527; local26++) {
			Static6.anIntArray20[local26] = Static335.aClass90Array16[local26].method5467();
		}
		for (@Pc(45) int local45 = Static352.anInt6527; local45 < Static335.aClass90Array16.length; local45++) {
			Static6.anIntArray20[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Z")
	public static boolean method3758(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static33.anInt805; local1 < Static56.anInt1240; local1++) {
			@Pc(6) Class204[][] local6 = Static138.aClass204ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static346.anInt6451; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static199.anInt4061 + local9;
				@Pc(18) int local18 = Static199.anInt4061 - local9;
				if (local14 >= Static285.anInt5515 || local18 < Static132.anInt2570) {
					for (@Pc(27) int local27 = -Static346.anInt6451; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static268.anInt5167 + local27;
						@Pc(36) int local36 = Static268.anInt5167 - local27;
						@Pc(48) Class204 local48;
						if (local14 >= Static285.anInt5515) {
							if (local32 >= Static129.anInt2513) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean537) {
									Static186.aBoolean330 = arg0;
									Static202.aClass28_1.method3474(local48);
									Static202.aClass28_1.method3464();
								}
							}
							if (local36 < Static70.anInt1449) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean537) {
									Static186.aBoolean330 = arg0;
									Static202.aClass28_1.method3474(local48);
									Static202.aClass28_1.method3464();
								}
							}
						}
						if (local18 < Static132.anInt2570) {
							if (local32 >= Static129.anInt2513) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean537) {
									Static186.aBoolean330 = arg0;
									Static202.aClass28_1.method3474(local48);
									Static202.aClass28_1.method3464();
								}
							}
							if (local36 < Static70.anInt1449) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean537) {
									Static186.aBoolean330 = arg0;
									Static202.aClass28_1.method3474(local48);
									Static202.aClass28_1.method3464();
								}
							}
						}
						if (Static200.anInt4070 == 0) {
							if (Static244.aBoolean397) {
								Static202.aClass28_1.method3473(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
