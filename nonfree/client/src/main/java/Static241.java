import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
	public static int anInt4879;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString240 = "purple:";

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[8];

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString241 = "Loading defaults - ";

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static243.anInt3774 = -1;
			Static202.anInt4222 = -1;
			return;
		}
		@Pc(40) int local40 = Static99.method1894(Static208.anInt4335, arg2, arg0) - arg4;
		@Pc(44) int local44 = Class66.anIntArray148[Static210.anInt4376];
		@Pc(48) int local48 = local40 - Static133.anInt2729;
		@Pc(52) int local52 = arg0 - Static271.anInt5632;
		@Pc(56) int local56 = arg2 - Static255.anInt5182;
		@Pc(60) int local60 = Class66.anIntArray153[Static210.anInt4376];
		@Pc(64) int local64 = Class66.anIntArray148[Static265.anInt5500];
		@Pc(68) int local68 = Class66.anIntArray153[Static265.anInt5500];
		@Pc(79) int local79 = local64 * local56 + local68 * local52 >> 16;
		@Pc(90) int local90 = local68 * local56 - local52 * local64 >> 16;
		@Pc(92) int local92 = local79;
		@Pc(102) int local102 = local60 * local48 - local44 * local90 >> 16;
		@Pc(112) int local112 = local44 * local48 + local90 * local60 >> 16;
		if (local112 < 50) {
			Static202.anInt4222 = -1;
			Static243.anInt3774 = -1;
		} else if (Static60.aBoolean106) {
			@Pc(131) int local131 = arg3 * 512 >> 8;
			@Pc(137) int local137 = arg6 * 512 >> 8;
			Static243.anInt3774 = local102 * local137 / local112 + arg5;
			Static202.anInt4222 = local92 * local131 / local112 + arg1;
		} else {
			Static202.anInt4222 = (local92 << 9) / local112 + arg1;
			Static243.anInt3774 = (local102 << 9) / local112 + arg5;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!wm;)Lclient!ta;")
	public static Class74_Sub2 method3940(@OriginalArg(1) Class2_Sub26 arg0) {
		return new Class74_Sub2(arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4255(), arg0.method4245(), arg0.method4245(), arg0.method4261());
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public static void method3944() {
		@Pc(12) int local12 = Static239.anInt4867;
		@Pc(14) int local14 = Static10.anInt283;
		@Pc(22) int local22 = Static112.anInt2423 - local14 - Static20.anInt1235;
		@Pc(29) int local29 = Static7.anInt240 - Static257.anInt5343 - local12;
		if (local12 <= 0 && local29 <= 0 && local14 <= 0 && local22 <= 0) {
			return;
		}
		try {
			@Pc(47) int local47 = 0;
			@Pc(51) Container local51;
			if (Static8.aFrame1 != null) {
				local51 = Static8.aFrame1;
			} else if (Static298.aFrame3 == null) {
				local51 = Static299.aClass177_5.anApplet1;
			} else {
				local51 = Static298.aFrame3;
			}
			@Pc(64) int local64 = 0;
			if (Static298.aFrame3 == local51) {
				@Pc(70) Insets local70 = Static298.aFrame3.getInsets();
				local47 = local70.left;
				local64 = local70.top;
			}
			@Pc(79) Graphics local79 = local51.getGraphics();
			local79.setColor(Color.black);
			if (local12 > 0) {
				local79.fillRect(local47, local64, local12, Static112.anInt2423);
			}
			if (local14 > 0) {
				local79.fillRect(local47, local64, Static7.anInt240, local14);
			}
			if (local29 > 0) {
				local79.fillRect(Static7.anInt240 + local47 - local29, local64, local29, Static112.anInt2423);
			}
			if (local22 > 0) {
				local79.fillRect(local47, local64 + Static112.anInt2423 - local22, Static7.anInt240, local22);
			}
		} catch (@Pc(137) Exception local137) {
		}
	}
}
