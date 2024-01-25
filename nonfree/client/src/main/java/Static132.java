import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!eha", name = "f", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_47 = new Class180(98, 7);

	@OriginalMember(owner = "client!eha", name = "h", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_48 = new Class180(126, -2);

	@OriginalMember(owner = "client!eha", name = "j", descriptor = "I")
	public static int anInt2721 = 0;

	@OriginalMember(owner = "client!eha", name = "l", descriptor = "[I")
	public static final int[] anIntArray228 = new int[14];

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(IIIZI)V")
	public static void method2498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(4, (long) arg1);
		local9.method2195();
		local9.anInt2401 = arg2;
		local9.anInt2400 = arg0;
		local9.anInt2394 = arg3;
	}

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "(I)V")
	public static void method2500() {
		Static329.method5010((long) Static588.anInt9467, Static674.aClass13_22);
		if (Static110.anInt2265 != -1) {
			Static548.method7838(Static110.anInt2265);
		}
		for (@Pc(20) int local20 = 0; local20 < Static329.anInt5472; local20++) {
			if (Static200.aBooleanArray21[local20]) {
				Static454.aBooleanArray31[local20] = true;
			}
			Static157.aBooleanArray15[local20] = Static200.aBooleanArray21[local20];
			Static200.aBooleanArray21[local20] = false;
		}
		Static187.anInt3786 = Static588.anInt9467;
		if (Static110.anInt2265 != -1) {
			Static329.anInt5472 = 0;
			Static620.method8733();
		}
		Static674.aClass13_22.la();
		Static115.method2166(Static674.aClass13_22);
		@Pc(66) int local66 = Static292.method4567();
		if (local66 == -1) {
			local66 = Static21.anInt510;
		}
		if (local66 == -1) {
			local66 = Static508.anInt8219;
		}
		Static124.method2350(local66);
		Static619.anInt10674 = 0;
	}

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "(I)Lclient!dm;")
	public static Class3_Sub18 method2501() {
		if (Static317.aClass338_136 == null || Static406.aClass167_1 == null) {
			return null;
		}
		for (@Pc(21) Class3_Sub18 local21 = (Class3_Sub18) Static406.aClass167_1.method4437(); local21 != null; local21 = (Class3_Sub18) Static406.aClass167_1.method4437()) {
			@Pc(29) Class308 local29 = Static317.aClass27_3.method693(local21.anInt2277);
			if (local29 != null && local29.aBoolean686 && local29.method7689(Static317.anInterface16_2)) {
				return local21;
			}
		}
		return null;
	}
}
