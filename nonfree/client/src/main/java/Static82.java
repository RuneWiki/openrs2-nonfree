import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!cw", name = "D", descriptor = "[Lclient!dia;")
	public static Class63[] aClass63Array1;

	@OriginalMember(owner = "client!cw", name = "G", descriptor = "Lclient!us;")
	public static final Class344 aClass344_24 = new Class344(35, 3);

	@OriginalMember(owner = "client!cw", name = "H", descriptor = "Z")
	public static boolean aBoolean192 = false;

	@OriginalMember(owner = "client!cw", name = "I", descriptor = "S")
	public static short aShort12 = 1;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZIIIII)V")
	public static void method2190(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static385.aFrame149 != null && (arg1 != 3 || Static389.anInt7389 != arg3 || arg4 != Static483.anInt8602)) {
			Static624.method8487(Static379.aClass228_6, Static385.aFrame149);
			Static385.aFrame149 = null;
		}
		if (arg1 == 3 && Static385.aFrame149 == null) {
			Static385.aFrame149 = Static234.method4499(arg3, 0, arg4, Static379.aClass228_6);
			if (Static385.aFrame149 != null) {
				Static483.anInt8602 = arg4;
				Static389.anInt7389 = arg3;
				Static152.method3314();
			}
		}
		if (arg1 == 3 && Static385.aFrame149 == null) {
			method2190(true, Static552.aClass3_Sub48_30.aClass23_Sub9_2.method3448(), arg2, -1, -1);
			return;
		}
		@Pc(97) Container local97;
		@Pc(74) Insets local74;
		if (Static385.aFrame149 != null) {
			Static396.anInt7575 = arg4;
			local97 = Static385.aFrame149;
			Static354.anInt6929 = arg3;
		} else if (Static599.aFrame141 == null) {
			if (Static632.anApplet2 == null) {
				local97 = Static36.anApplet_Sub1_1;
			} else {
				local97 = Static632.anApplet2;
			}
			Static354.anInt6929 = local97.getSize().width;
			Static396.anInt7575 = local97.getSize().height;
		} else {
			local74 = Static599.aFrame141.getInsets();
			@Pc(83) int local83 = local74.left + local74.right;
			Static354.anInt6929 = Static599.aFrame141.getSize().width - local83;
			Static396.anInt7575 = Static599.aFrame141.getSize().height - local74.bottom - local74.top;
			local97 = Static599.aFrame141;
		}
		if (arg1 == 1) {
			Static159.anInt3855 = 0;
			Static114.anInt2970 = Static199.anInt4634;
			Static342.anInt6741 = (Static354.anInt6929 - Static199.anInt4634) / 2;
			Static256.anInt5669 = Static523.anInt9075;
		} else {
			Static523.method7472();
		}
		if (Static624.aClass107_7 != Static85.aClass107_2) {
			@Pc(159) boolean local159;
			if (Static114.anInt2970 < 1024 && Static256.anInt5669 < 768) {
				local159 = true;
			} else {
				local159 = false;
			}
		}
		if (arg0) {
			Static605.method8262();
		} else {
			Static177.aCanvas10.setSize(Static114.anInt2970, Static256.anInt5669);
			if (Static349.aBoolean590) {
				Static555.method7818(Static177.aCanvas10);
			} else {
				Static47.aClass33_3.method6189(Static177.aCanvas10, Static114.anInt2970, Static256.anInt5669);
			}
			if (Static599.aFrame141 == local97) {
				local74 = Static599.aFrame141.getInsets();
				Static177.aCanvas10.setLocation(local74.left + Static342.anInt6741, Static159.anInt3855 + local74.top);
			} else {
				Static177.aCanvas10.setLocation(Static342.anInt6741, Static159.anInt3855);
			}
		}
		if (arg1 < 2) {
			Static374.aBoolean618 = false;
		} else {
			Static374.aBoolean618 = true;
		}
		if (Static530.anInt9144 != -1) {
			Static557.method7852(true);
		}
		if (Static412.aClass51_25 != null && Static405.method6400(Static581.anInt9720)) {
			Static387.method6102();
		}
		for (@Pc(234) int local234 = 0; local234 < 100; local234++) {
			Static178.aBooleanArray12[local234] = true;
		}
		Static70.aBoolean147 = true;
	}
}
