import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIB)V")
	public static void method7830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(11, arg1);
		local8.method6098();
		local8.anInt7256 = arg2;
		local8.anInt7258 = arg0;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!fa;Ljava/awt/Canvas;B)Lclient!r;")
	public static Class100 method7831(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Canvas arg1) {
		return new Class100_Sub2(arg1, arg0);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7832(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static451.anInt487; local16++) {
			if (arg0.equalsIgnoreCase(Static306.aStringArray92[local16])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67);
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!qi;Z)I")
	public static int method7833(@OriginalArg(0) Class6_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt7436;
		@Pc(12) Class54 local12 = arg0.method6168();
		if (arg0.aBoolean569) {
			local8 = arg0.anInt7426;
		} else if (arg0.anInt7419 == local12.anInt1387 || arg0.anInt7419 == local12.anInt1386 || local12.anInt1423 == arg0.anInt7419 || local12.anInt1412 == arg0.anInt7419) {
			local8 = arg0.anInt7438;
		} else if (local12.anInt1389 == arg0.anInt7419 || local12.anInt1384 == arg0.anInt7419 || arg0.anInt7419 == local12.anInt1397 || local12.anInt1391 == arg0.anInt7419) {
			local8 = arg0.anInt7451;
		}
		return local8;
	}
}
