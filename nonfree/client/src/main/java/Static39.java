import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_32 = new Class221(10, 6);

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_26 = new Class157(6, -1);

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_33 = new Class221(37, -1);

	@OriginalMember(owner = "client!cb", name = "S", descriptor = "Z")
	public static boolean aBoolean48 = true;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)[Lclient!od;")
	public static Class147[] method491() {
		if (Static258.aClass147Array1 == null) {
			@Pc(11) Class147[] local11 = Static363.method5800(Static62.aClass179_2);
			@Pc(15) Class147[] local15 = new Class147[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(68) int local68;
			@Pc(74) Class147 local74;
			label63: for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(25) Class147 local25 = local11[local19];
				if ((local25.anInt4945 <= 0 || local25.anInt4945 >= 24) && local25.anInt4940 >= 800 && local25.anInt4943 >= 600 && (Static147.anInt3175 >= 96 || Static114.anInt2421 != 0 || local25.anInt4940 <= 1024 && local25.anInt4943 <= 768)) {
					for (local68 = 0; local68 < local17; local68++) {
						local74 = local15[local68];
						if (local25.anInt4940 == local74.anInt4940 && local74.anInt4943 == local25.anInt4943) {
							if (local74.anInt4945 < local25.anInt4945) {
								local15[local68] = local25;
							}
							continue label63;
						}
					}
					local15[local17] = local25;
					local17++;
				}
			}
			Static258.aClass147Array1 = new Class147[local17];
			Static369.method2581(local15, 0, Static258.aClass147Array1, 0, local17);
			@Pc(138) int[] local138 = new int[Static258.aClass147Array1.length];
			for (local68 = 0; local68 < Static258.aClass147Array1.length; local68++) {
				local74 = Static258.aClass147Array1[local68];
				local138[local68] = local74.anInt4943 * local74.anInt4940;
			}
			Static24.method859(local138, Static258.aClass147Array1);
		}
		return Static258.aClass147Array1;
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
	public static void method492() {
		if (Static229.aFrame3 != null) {
			return;
		}
		@Pc(18) Container local18;
		if (Static291.aFrame4 == null) {
			local18 = Static62.aClass179_2.anApplet1;
		} else {
			local18 = Static291.aFrame4;
		}
		Static286.anInt5753 = local18.getSize().width;
		Static38.anInt556 = local18.getSize().height;
		@Pc(36) Insets local36;
		if (local18 == Static291.aFrame4) {
			local36 = Static291.aFrame4.getInsets();
			Static286.anInt5753 -= local36.right + local36.left;
			Static38.anInt556 -= local36.bottom + local36.top;
		}
		if (Static26.method3361() == 1) {
			Static25.anInt396 = Static30.anInt482;
			Static177.anInt3977 = 0;
			Static335.anInt6496 = Static2.anInt54;
			Static10.anInt185 = (Static286.anInt5753 - Static2.anInt54) / 2;
		} else if (Static147.anInt3175 < 96 && Static114.anInt2421 == 0) {
			@Pc(83) int local83 = Static286.anInt5753 > 1024 ? 1024 : Static286.anInt5753;
			@Pc(92) int local92 = Static38.anInt556 <= 768 ? Static38.anInt556 : 768;
			Static335.anInt6496 = local83;
			Static10.anInt185 = (Static286.anInt5753 - local83) / 2;
			Static25.anInt396 = local92;
			Static177.anInt3977 = 0;
		} else {
			Static335.anInt6496 = Static286.anInt5753;
			Static177.anInt3977 = 0;
			Static25.anInt396 = Static38.anInt556;
			Static10.anInt185 = 0;
		}
		if (Static260.anInt5453 != 0) {
			@Pc(128) boolean local128;
			if (Static335.anInt6496 < 1024 && Static25.anInt396 < 768) {
				local128 = true;
			} else {
				local128 = false;
			}
		}
		Static95.aCanvas3.setSize(Static335.anInt6496, Static25.anInt396);
		if (Static51.aClass37_1 != null) {
			Static51.aClass37_1.method3721();
		}
		if (local18 == Static291.aFrame4) {
			local36 = Static291.aFrame4.getInsets();
			Static95.aCanvas3.setLocation(local36.left + Static10.anInt185, local36.top + Static177.anInt3977);
		} else {
			Static95.aCanvas3.setLocation(Static10.anInt185, Static177.anInt3977);
		}
		if (Static269.anInt6658 != -1) {
			Static205.method3918(true);
		}
		Static162.method3263();
	}
}
