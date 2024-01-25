import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!la", name = "v", descriptor = "[I")
	public static final int[] anIntArray538 = new int[2048];

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public static int anInt10006 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static486.anInt8866 <= arg6 && Static214.anInt3975 >= arg2 && Static290.anInt5903 <= arg4 && arg5 <= Static530.anInt9437) {
			Static58.method986(arg5, arg2, arg6, arg0, arg4, arg3, arg1);
		} else {
			Static283.method8395(arg3, arg2, arg0, arg6, arg1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIZIII)V")
	public static void method8171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static13.aFrame1 != null && (arg4 != 3 || arg0 != Static214.aClass4_Sub19_Sub1_1.anInt3050 || Static214.aClass4_Sub19_Sub1_1.anInt3054 != arg3)) {
			Static200.method3419(Static13.aFrame1, Static406.aClass354_5);
			Static13.aFrame1 = null;
		}
		if (arg4 == 3 && Static13.aFrame1 == null) {
			Static13.aFrame1 = Static176.method3192(Static406.aClass354_5, arg3, 0, arg0);
			if (Static13.aFrame1 != null) {
				Static214.aClass4_Sub19_Sub1_1.anInt3050 = arg0;
				Static214.aClass4_Sub19_Sub1_1.anInt3054 = arg3;
				Static214.aClass4_Sub19_Sub1_1.method2779(Static406.aClass354_5);
			}
		}
		if (arg4 == 3 && Static13.aFrame1 == null) {
			method8171(-1, arg1, true, -1, Static214.aClass4_Sub19_Sub1_1.anInt3060);
			return;
		}
		@Pc(75) Container local75;
		@Pc(104) Insets local104;
		if (Static13.aFrame1 != null) {
			local75 = Static13.aFrame1;
			Static238.anInt4332 = arg3;
			Static286.anInt5862 = arg0;
		} else if (Static475.aFrame3 == null) {
			if (Static110.anApplet1 == null) {
				local75 = Static162.anApplet_Sub1_1;
			} else {
				local75 = Static110.anApplet1;
			}
			Static286.anInt5862 = local75.getSize().width;
			Static238.anInt4332 = local75.getSize().height;
		} else {
			local104 = Static475.aFrame3.getInsets();
			@Pc(112) int local112 = local104.right + local104.left;
			Static286.anInt5862 = Static475.aFrame3.getSize().width - local112;
			Static238.anInt4332 = Static475.aFrame3.getSize().height - local104.bottom - local104.top;
			local75 = Static475.aFrame3;
		}
		if (arg4 == 1) {
			Static554.anInt9828 = Static501.anInt6750;
			Static179.anInt3617 = 0;
			Static375.anInt7256 = Static212.anInt3952;
			Static580.anInt2905 = (Static286.anInt5862 - Static501.anInt6750) / 2;
		} else {
			Static557.method1156();
		}
		if (Static565.aClass145_11 != Static296.aClass145_5) {
			@Pc(160) boolean local160;
			if (Static554.anInt9828 < 1024 && Static375.anInt7256 < 768) {
				local160 = true;
			} else {
				local160 = false;
			}
		}
		if (arg2) {
			Static253.method4073();
		} else {
			Static475.aCanvas12.setSize(Static554.anInt9828, Static375.anInt7256);
			Static440.aClass44_12.method4968(Static475.aCanvas12);
			if (local75 == Static475.aFrame3) {
				local104 = Static475.aFrame3.getInsets();
				Static475.aCanvas12.setLocation(local104.left + Static580.anInt2905, Static179.anInt3617 + local104.top);
			} else {
				Static475.aCanvas12.setLocation(Static580.anInt2905, Static179.anInt3617);
			}
		}
		if (arg4 < 2) {
			Static450.aBoolean601 = false;
		} else {
			Static450.aBoolean601 = true;
		}
		if (Static332.anInt6370 != -1) {
			Static487.method7235(true);
		}
		if (Static299.aClass241_3 != null && Static270.method4668(Static203.anInt3855)) {
			Static186.method3294();
		}
		for (@Pc(227) int local227 = 0; local227 < 100; local227++) {
			Static261.aBooleanArray18[local227] = true;
		}
		Static530.aBoolean664 = true;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!jn;III)Lclient!gda;")
	public static Class114 method8172(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) byte[] local9 = arg0.method3994(0, arg1);
		return local9 == null ? null : new Class114(local9);
	}
}
