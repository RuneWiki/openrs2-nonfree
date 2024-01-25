import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_144 = new Class256("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "Lclient!cr;")
	public static Class41 aClass41_14 = null;

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_67 = new Class129(10);

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
	public static int anInt6993 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BII)V")
	public static void method5469(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub2 local8 = Static15.method236(arg1, 7);
		local8.method434();
		local8.anInt657 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	public static void method5472() {
		if (Static226.anInt4327 <= 0) {
			Static224.aString38 = "";
			return;
		}
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static359.aStringArray25.length; local14++) {
			if (Static359.aStringArray25[local14].startsWith("--> ")) {
				local12++;
				if (local12 == Static226.anInt4327) {
					Static224.aString38 = Static359.aStringArray25[local14].substring(4);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)V")
	public static void method5473() {
		if (Static72.aBoolean290) {
			return;
		}
		if (Static399.aClass167_Sub1_1.aBoolean480) {
			Static203.aFloat130 = (int) Static203.aFloat130 - 65 & 0xFFFFFF80;
		} else {
			Static83.aFloat67 += (-24.0F - Static83.aFloat67) / 2.0F;
		}
		Static18.aBoolean33 = true;
		Static72.aBoolean290 = true;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBI)V")
	public static void method5474(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub2_Sub2 local12 = Static15.method236(arg1, 16);
		local12.method434();
		local12.anInt657 = arg0;
	}
}
