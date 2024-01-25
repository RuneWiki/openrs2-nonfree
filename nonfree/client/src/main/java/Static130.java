import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
	public static int anInt2956;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	public static int anInt2957;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
	public static int anInt2951 = 0;

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_58 = new Class73(47, -2);

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
	public static int anInt2954 = 0;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_42 = new Class47(73, 3);

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "Z")
	public static final boolean aBoolean211 = false;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!mi;Z)V")
	public static void method2584(@OriginalArg(0) Class6_Sub18 arg0) {
		arg0.aBoolean549 = false;
		if (arg0.aClass6_Sub19_5 != null) {
			arg0.aClass6_Sub19_5.anInt3208 = 0;
		}
		for (@Pc(18) Class6_Sub18 local18 = arg0.method6374(); local18 != null; local18 = arg0.method6371()) {
			method2584(local18);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method2585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!vw;III)V")
	public static void method2587(@OriginalArg(0) Class348 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static587.aClass348ArrayArray1[arg1][arg2] = arg0;
	}
}
