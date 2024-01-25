import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_137 = new Class211(0, 12);

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public static void method4944(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class16 local8 = Static4.method73(arg2, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray29 != null) {
			@Pc(18) Class2_Sub44 local18 = new Class2_Sub44();
			local18.anInt7165 = arg3;
			local18.aClass16_20 = local8;
			local18.aString202 = arg1;
			local18.anObjectArray36 = local8.anObjectArray29;
			Static191.method2562(local18);
		}
		if (Static290.anInt4777 != 9) {
			return;
		}
		@Pc(39) boolean local39 = true;
		if (local8.anInt252 != 0) {
			local39 = Static267.method3626(local8);
		}
		if (!local39 || !Static55.method815(local8).method1536(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static29.method451(Static157.aClass102_89);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 2) {
			Static29.method451(Static38.aClass102_27);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 3) {
			Static29.method451(Static379.aClass102_203);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 4) {
			Static29.method451(Static263.aClass102_122);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 5) {
			Static29.method451(Static349.aClass102_173);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 6) {
			Static29.method451(Static246.aClass102_123);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 7) {
			Static29.method451(Static46.aClass102_31);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 8) {
			Static29.method451(Static164.aClass102_145);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 9) {
			Static29.method451(Static219.aClass102_182);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
		if (arg3 == 10) {
			Static29.method451(Static316.aClass102_156);
			Static434.method5455(arg2, local8.anInt301, arg0);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILclient!bn;)Z")
	public static boolean method4945(@OriginalArg(1) Interface2 arg0) {
		@Pc(10) Class192 local10 = Static50.aClass190_1.method4218(arg0.method5292());
		if (local10.anInt5328 == -1) {
			return true;
		} else {
			@Pc(30) Class165 local30 = Static70.aClass97_1.method2130(local10.anInt5328);
			return local30.anInt4279 == -1 ? true : local30.method3502();
		}
	}
}
