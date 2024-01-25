import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "Lclient!oq;")
	public static Class251 aClass251_22;

	@OriginalMember(owner = "client!taa", name = "d", descriptor = "[Lclient!rha;")
	public static Class288[] aClass288Array1;

	@OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
	public static int anInt9157;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V")
	public static void method7546() {
		@Pc(7) client local7 = Static321.aClient2;
		synchronized (Static321.aClient2) {
			if (Static385.aFrame149 == null) {
				@Pc(28) Container local28;
				if (Static599.aFrame141 != null) {
					local28 = Static599.aFrame141;
				} else if (Static632.anApplet2 == null) {
					local28 = Static36.anApplet_Sub1_1;
				} else {
					local28 = Static632.anApplet2;
				}
				Static354.anInt6929 = local28.getSize().width;
				Static396.anInt7575 = local28.getSize().height;
				@Pc(50) Insets local50;
				if (local28 == Static599.aFrame141) {
					local50 = Static599.aFrame141.getInsets();
					Static354.anInt6929 -= local50.left + local50.right;
					Static396.anInt7575 -= local50.top + local50.bottom;
				}
				if (Static626.method8490() == 1) {
					Static114.anInt2970 = Static199.anInt4634;
					Static342.anInt6741 = (Static354.anInt6929 - Static199.anInt4634) / 2;
					Static256.anInt5669 = Static523.anInt9075;
					Static159.anInt3855 = 0;
				} else {
					Static523.method7472();
				}
				if (Static85.aClass107_2 != Static624.aClass107_7) {
					@Pc(105) boolean local105;
					if (Static114.anInt2970 < 1024 && Static256.anInt5669 < 768) {
						local105 = true;
					} else {
						local105 = false;
					}
				}
				Static177.aCanvas10.setSize(Static114.anInt2970, Static256.anInt5669);
				if (Static47.aClass33_3 != null) {
					if (Static349.aBoolean590) {
						Static555.method7818(Static177.aCanvas10);
					} else {
						Static47.aClass33_3.method6189(Static177.aCanvas10, Static114.anInt2970, Static256.anInt5669);
					}
				}
				if (Static599.aFrame141 == local28) {
					local50 = Static599.aFrame141.getInsets();
					Static177.aCanvas10.setLocation(local50.left + Static342.anInt6741, local50.top - -Static159.anInt3855);
				} else {
					Static177.aCanvas10.setLocation(Static342.anInt6741, Static159.anInt3855);
				}
				if (Static530.anInt9144 != -1) {
					Static557.method7852(true);
				}
				Static140.method3138();
			}
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method7550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static87.method2250(arg5, arg4, arg3)) {
			return false;
		}
		@Pc(15) int local15 = Static446.anIntArray507[1];
		@Pc(19) int local19 = Static446.anIntArray507[0];
		@Pc(23) int local23 = Static446.anIntArray507[2];
		if (!Static87.method2250(arg2, arg6, arg7)) {
			return false;
		}
		@Pc(35) int local35 = Static446.anIntArray507[2];
		@Pc(39) int local39 = Static446.anIntArray507[0];
		@Pc(43) int local43 = Static446.anIntArray507[1];
		if (Static87.method2250(arg1, arg8, arg0)) {
			@Pc(55) int local55 = Static446.anIntArray507[1];
			@Pc(59) int local59 = Static446.anIntArray507[0];
			@Pc(63) int local63 = Static446.anIntArray507[2];
			return Static439.method6675(local43, local39, local23, local59, local55, local63, local35, local19, local15);
		} else {
			return false;
		}
	}
}
