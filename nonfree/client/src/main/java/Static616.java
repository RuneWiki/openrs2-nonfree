import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray20;

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "Lclient!gp;")
	public static final Class133 aClass133_18 = new Class133("game3", 2);

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "[I")
	public static int[] anIntArray638 = new int[4];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(CI)I")
	public static int method8416(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class313.anIntArray559.length > arg0 ? Class313.anIntArray559[arg0] : -1;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
	public static void method8421() {
		if (Static355.aFrame7 != null) {
			return;
		}
		@Pc(10) int local10 = Static294.anInt5875;
		@Pc(17) int local17 = Static303.anInt8406;
		@Pc(25) int local25 = Static136.anInt2830 - Static330.anInt6254 - local10;
		@Pc(32) int local32 = Static155.anInt3159 - local17 - Static190.anInt3576;
		if (local10 <= 0 && local25 <= 0 && local17 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(53) Container local53;
			if (Static190.aFrame1 != null) {
				local53 = Static190.aFrame1;
			} else if (Static303.anApplet3 == null) {
				local53 = Static467.anApplet_Sub1_1;
			} else {
				local53 = Static303.anApplet3;
			}
			@Pc(65) int local65 = 0;
			@Pc(67) int local67 = 0;
			if (local53 == Static190.aFrame1) {
				@Pc(73) Insets local73 = Static190.aFrame1.getInsets();
				local65 = local73.left;
				local67 = local73.top;
			}
			@Pc(82) Graphics local82 = local53.getGraphics();
			local82.setColor(Color.black);
			if (local10 > 0) {
				local82.fillRect(local65, local67, local10, Static155.anInt3159);
			}
			if (local17 > 0) {
				local82.fillRect(local65, local67, Static136.anInt2830, local17);
			}
			if (local25 > 0) {
				local82.fillRect(local65 + Static136.anInt2830 - local25, local67, local25, Static155.anInt3159);
			}
			if (local32 > 0) {
				local82.fillRect(local65, local67 + Static155.anInt3159 - local32, Static136.anInt2830, local32);
				return;
			}
		} catch (@Pc(139) Exception local139) {
			return;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZZ)V")
	public static void method8422(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class3_Sub31 local10 = (Class3_Sub31) Static402.aClass216_51.method5457(); local10 != null; local10 = (Class3_Sub31) Static402.aClass216_51.method5458()) {
			if (local10.aClass3_Sub3_Sub5_3 != null) {
				Static304.aClass3_Sub3_Sub3_3.method2976(local10.aClass3_Sub3_Sub5_3);
				local10.aClass3_Sub3_Sub5_3 = null;
			}
			if (local10.aClass3_Sub3_Sub5_4 != null) {
				Static304.aClass3_Sub3_Sub3_3.method2976(local10.aClass3_Sub3_Sub5_4);
				local10.aClass3_Sub3_Sub5_4 = null;
			}
			local10.method8682();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class3_Sub31 local54 = (Class3_Sub31) Static413.aClass216_52.method5457(); local54 != null; local54 = (Class3_Sub31) Static413.aClass216_52.method5458()) {
			if (local54.aClass3_Sub3_Sub5_3 != null) {
				Static304.aClass3_Sub3_Sub3_3.method2976(local54.aClass3_Sub3_Sub5_3);
				local54.aClass3_Sub3_Sub5_3 = null;
			}
			local54.method8682();
		}
		for (@Pc(81) Class3_Sub31 local81 = (Class3_Sub31) Static554.aClass25_41.method435(); local81 != null; local81 = (Class3_Sub31) Static554.aClass25_41.method432()) {
			if (local81.aClass3_Sub3_Sub5_3 != null) {
				Static304.aClass3_Sub3_Sub3_3.method2976(local81.aClass3_Sub3_Sub5_3);
				local81.aClass3_Sub3_Sub5_3 = null;
			}
			local81.method8682();
		}
	}
}
