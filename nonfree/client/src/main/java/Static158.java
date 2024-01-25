import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "I")
	public static final int anInt3416 = -1;

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "I")
	public static int anInt3421 = 0;

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "Lclient!wq;")
	public static final Class359 aClass359_6 = new Class359();

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIZ)V")
	public static void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static578.aFrame2 != null && (arg1 != 3 || Static455.aClass3_Sub27_Sub1_1.anInt4786 != arg3 || arg0 != Static455.aClass3_Sub27_Sub1_1.anInt4787)) {
			Static281.method4845(Static578.aFrame2, Static480.aClass326_3);
			Static578.aFrame2 = null;
		}
		if (arg1 == 3 && Static578.aFrame2 == null) {
			Static578.aFrame2 = Static557.method1638(Static480.aClass326_3, arg3, arg0, 0);
			if (Static578.aFrame2 != null) {
				Static455.aClass3_Sub27_Sub1_1.anInt4787 = arg0;
				Static455.aClass3_Sub27_Sub1_1.anInt4786 = arg3;
				Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
			}
		}
		if (arg1 == 3 && Static578.aFrame2 == null) {
			method3010(-1, Static455.aClass3_Sub27_Sub1_1.anInt4801, arg2, -1, true);
			return;
		}
		@Pc(73) Container local73;
		@Pc(83) Insets local83;
		if (Static578.aFrame2 != null) {
			local73 = Static578.aFrame2;
			Static232.anInt4725 = arg0;
			Static3.anInt172 = arg3;
		} else if (Static531.aFrame1 == null) {
			if (Static253.anApplet3 == null) {
				local73 = Static329.anApplet_Sub1_1;
			} else {
				local73 = Static253.anApplet3;
			}
			Static3.anInt172 = local73.getSize().width;
			Static232.anInt4725 = local73.getSize().height;
		} else {
			local83 = Static531.aFrame1.getInsets();
			Static3.anInt172 = Static531.aFrame1.getSize().width - local83.left - local83.right;
			@Pc(100) int local100 = -local83.top;
			Static232.anInt4725 = Static531.aFrame1.getSize().height + local100 - local83.bottom;
			local73 = Static531.aFrame1;
		}
		if (arg1 == 1) {
			Static524.anInt9579 = (Static3.anInt172 - Static507.anInt9382) / 2;
			Static582.anInt10234 = Static507.anInt9382;
			Static294.anInt10217 = Static227.anInt4616;
			Static426.anInt8255 = 0;
		} else {
			Static185.method3274();
		}
		if (Static508.aClass109_7 != Static51.aClass109_2) {
			@Pc(157) boolean local157;
			if (Static582.anInt10234 < 1024 && Static294.anInt10217 < 768) {
				local157 = true;
			} else {
				local157 = false;
			}
		}
		if (arg4) {
			Static493.method7482();
		} else {
			Static545.aCanvas14.setSize(Static582.anInt10234, Static294.anInt10217);
			Static546.aClass15_16.method5311(Static545.aCanvas14);
			if (local73 == Static531.aFrame1) {
				local83 = Static531.aFrame1.getInsets();
				Static545.aCanvas14.setLocation(Static524.anInt9579 + local83.left, local83.top - -Static426.anInt8255);
			} else {
				Static545.aCanvas14.setLocation(Static524.anInt9579, Static426.anInt8255);
			}
		}
		if (arg1 >= 2) {
			Static535.aBoolean812 = true;
		} else {
			Static535.aBoolean812 = false;
		}
		if (Static25.anInt779 != -1) {
			Static48.method1238(true);
		}
		if (Static393.aClass8_2 != null && Static16.method466(Static75.anInt1880)) {
			Static355.method4578();
		}
		for (@Pc(219) int local219 = 0; local219 < 100; local219++) {
			Static518.aBooleanArray37[local219] = true;
		}
		Static344.aBoolean590 = true;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILclient!sa;II)V")
	public static void method3019(@OriginalArg(1) int arg0, @OriginalArg(2) Class292 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) Class3_Sub37 local8 = (Class3_Sub37) Static516.aClass183_18.method4795(); local8 != null; local8 = (Class3_Sub37) Static516.aClass183_18.method4793()) {
			if (arg2 == local8.anInt7029 && local8.anInt7023 == arg0 << 9 && arg3 << 9 == local8.anInt7019 && arg1.anInt8757 == local8.aClass292_1.anInt8757) {
				if (local8.aClass3_Sub14_Sub2_4 != null) {
					Static485.aClass3_Sub14_Sub1_2.method2816(local8.aClass3_Sub14_Sub2_4);
					local8.aClass3_Sub14_Sub2_4 = null;
				}
				if (local8.aClass3_Sub14_Sub2_3 != null) {
					Static485.aClass3_Sub14_Sub1_2.method2816(local8.aClass3_Sub14_Sub2_3);
					local8.aClass3_Sub14_Sub2_3 = null;
				}
				local8.method8412();
				return;
			}
		}
	}
}
