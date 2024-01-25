import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public static int anInt10547 = 0;

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[S")
	public static final short[] aShortArray156 = new short[] { 6, 52, 4, 11, 16, 20, 59, 47 };

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!aga;")
	public static final Class10 aClass10_4 = new Class10();

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIII)V")
	public static void method9134(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static442.aFrame3 != null && (arg3 != 3 || Static115.anInt2379 != arg2 || Static69.anInt1324 != arg4)) {
			Static439.method6242(Static247.aClass291_1, Static442.aFrame3);
			Static442.aFrame3 = null;
		}
		if (arg3 == 3 && Static442.aFrame3 == null) {
			Static442.aFrame3 = Static27.method665(Static247.aClass291_1, arg2, 0, arg4);
			if (Static442.aFrame3 != null) {
				Static69.anInt1324 = arg4;
				Static115.anInt2379 = arg2;
				Static441.method6272();
			}
		}
		if (arg3 == 3 && Static442.aFrame3 == null) {
			method9134(arg0, true, -1, Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506(), -1);
			return;
		}
		@Pc(80) Container local80;
		@Pc(105) Insets local105;
		if (Static442.aFrame3 != null) {
			Static512.anInt8242 = arg2;
			Static203.anInt3986 = arg4;
			local80 = Static442.aFrame3;
		} else if (Static380.aFrame2 == null) {
			if (Static124.anApplet1 == null) {
				local80 = Static95.anApplet_Sub1_1;
			} else {
				local80 = Static124.anApplet1;
			}
			Static512.anInt8242 = local80.getSize().width;
			Static203.anInt3986 = local80.getSize().height;
		} else {
			local105 = Static380.aFrame2.getInsets();
			Static512.anInt8242 = Static380.aFrame2.getSize().width - local105.left - local105.right;
			Static203.anInt3986 = Static380.aFrame2.getSize().height - local105.bottom - local105.top;
			local80 = Static380.aFrame2;
		}
		if (arg3 == 1) {
			Static270.anInt4747 = 0;
			Static312.anInt5191 = Static33.anInt10742;
			Static222.anInt4196 = Static602.anInt9666;
			Static282.anInt4895 = (Static512.anInt8242 - Static33.anInt10742) / 2;
		} else {
			Static34.method901();
		}
		if (Static202.aClass147_5 != Static487.aClass147_8) {
			@Pc(159) boolean local159;
			if (Static312.anInt5191 < 1024 && Static222.anInt4196 < 768) {
				local159 = true;
			} else {
				local159 = false;
			}
		}
		if (arg1) {
			Static402.method5685();
		} else {
			Static126.aCanvas6.setSize(Static312.anInt5191, Static222.anInt4196);
			if (Static82.aBoolean134) {
				Static651.method9018(Static126.aCanvas6);
			} else {
				Static674.aClass13_22.method8445(Static126.aCanvas6, Static312.anInt5191, Static222.anInt4196);
			}
			if (local80 == Static380.aFrame2) {
				local105 = Static380.aFrame2.getInsets();
				Static126.aCanvas6.setLocation(Static282.anInt4895 + local105.left, Static270.anInt4747 + local105.top);
			} else {
				Static126.aCanvas6.setLocation(Static282.anInt4895, Static270.anInt4747);
			}
		}
		if (arg3 >= 2) {
			Static632.aBoolean764 = true;
		} else {
			Static632.aBoolean764 = false;
		}
		if (Static110.anInt2265 != -1) {
			Static198.method9275(true);
		}
		if (Static559.aClass269_1 != null && Static409.method5810(Static406.anInt6454)) {
			Static215.method3742();
		}
		for (@Pc(233) int local233 = 0; local233 < 100; local233++) {
			Static200.aBooleanArray21[local233] = true;
		}
		Static476.aBoolean599 = true;
	}
}
