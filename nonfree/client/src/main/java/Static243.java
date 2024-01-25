import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!os", name = "L", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!os", name = "gb", descriptor = "I")
	public static int anInt5174;

	@OriginalMember(owner = "client!os", name = "kb", descriptor = "I")
	public static int anInt5176;

	@OriginalMember(owner = "client!os", name = "K", descriptor = "I")
	public static int anInt5157 = 0;

	@OriginalMember(owner = "client!os", name = "U", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_122 = new Class140("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!os", name = "mb", descriptor = "Z")
	public static boolean aBoolean451 = true;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
	public static void method4362() {
		Static356.aClass6_1.method4871();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static128.aLongArray4[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static302.aLongArray9[local24] = 0L;
		}
		Static135.anInt2908 = 0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
	public static void method4364(@OriginalArg(1) boolean arg0) {
		Static286.aBoolean512 = arg0;
		Static304.aBoolean539 = !Static230.method4872();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method4367() {
		@Pc(10) String local10 = "www";
		if (Static260.anInt5453 != 0) {
			local10 = "www-wtqa";
		}
		@Pc(16) String local16 = "";
		if (Static71.aString12 != null) {
			local16 = "/p=" + Static71.aString12;
		}
		return "http://" + local10 + "." + Static13.aClass172_1.aString55 + ".com/l=" + Static239.anInt2803 + "/a=" + Static206.anInt4520 + local16 + "/";
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5) {
		Static30.method404(arg1, arg3, arg5, arg2, arg4, 0, arg0);
	}

	@OriginalMember(owner = "client!os", name = "i", descriptor = "(I)V")
	public static void method4371() {
		if (Static51.aClass37_1.method3690()) {
			Static263.method4650();
			Static51.aClass37_1.method3707(Static95.aCanvas3);
			Static35.method5765();
		} else {
			Static212.method3988(Static114.anInt2421);
		}
	}
}
