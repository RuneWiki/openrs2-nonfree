import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)Z")
	public static boolean method6683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static594.method7982(arg1, arg0) | Static349.method5204(arg1, arg0) | Static508.method7110(arg1, arg0)) & Static351.method5244(arg1, arg0);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(III)I")
	public static int method6685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(21) int local21 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local21;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V")
	public static void method6686() {
		Static9.anInt273 = Static88.aClass352_7.anInt9290 + Static88.aClass352_7.anInt9302 + 2;
		Static72.anInt1404 = Static552.aClass352_20.anInt9290 + Static552.aClass352_20.anInt9302 + 2;
		Static425.aStringArray26 = new String[500];
		for (@Pc(30) int local30 = 0; local30 < Static425.aStringArray26.length; local30++) {
			Static425.aStringArray26[local30] = "";
		}
		Static415.method5896(Static375.aClass253_5.method5453(Static161.anInt3095));
	}
}
