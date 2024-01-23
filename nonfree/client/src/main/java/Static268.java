import java.awt.Frame;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	public static int anInt4883;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	public static int anInt4885;

	@OriginalMember(owner = "client!td", name = "s", descriptor = "Lclient!ti;")
	public static Class1_Sub2_Sub20 aClass1_Sub2_Sub20_7;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "Lclient!qj;")
	public static Class148 aClass148_11 = new Class148(128);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!rj;IIIIB)Ljava/awt/Frame;")
	public static Frame method4199(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0.method3896()) {
			return null;
		}
		@Pc(25) Class83[] local25 = Static217.method3413(arg0);
		if (local25 == null) {
			return null;
		}
		@Pc(33) boolean local33 = false;
		for (@Pc(35) int local35 = 0; local35 < local25.length; local35++) {
			if (local25[local35].anInt2590 == arg3 && arg2 == local25[local35].anInt2586 && (!local33 || local25[local35].anInt2584 > arg1)) {
				local33 = true;
				arg1 = local25[local35].anInt2584;
			}
		}
		if (!local33) {
			return null;
		}
		@Pc(99) Class185 local99 = arg0.method3884(arg1, arg3, arg2);
		while (local99.anInt5276 == 0) {
			Static282.method4345(10L);
		}
		@Pc(112) Frame local112 = (Frame) local99.anObject6;
		if (local112 == null) {
			return null;
		} else if (local99.anInt5276 == 2) {
			Static75.method1470(arg0, local112);
			return null;
		} else {
			return local112;
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public static void method4200() {
		Static46.aClass187_25.method4530();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	public static void method4202(@OriginalArg(0) int arg0) {
		if (!Static261.aBoolean326) {
			arg0 = -1;
		}
		if (Static31.anInt556 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class63 local25 = Static229.method3547(arg0);
			@Pc(29) Class1_Sub2_Sub1_Sub2 local29 = local25.method1809();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static26.aClass154_1.method3880(local29.method3864(), new Point(local25.anInt2027, local25.anInt2018), Static127.aCanvas1, local29.anInt4447, local29.anInt4446);
				Static31.anInt556 = arg0;
			}
		}
		if (arg0 == -1 && Static31.anInt556 != -1) {
			Static26.aClass154_1.method3880(null, new Point(), Static127.aCanvas1, -1, -1);
			Static31.anInt556 = -1;
		}
	}
}
