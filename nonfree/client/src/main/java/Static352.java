import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "[C")
	public static final char[] aCharArray8 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5550(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(27) String local27 = Static329.method5266(arg0);
		if (local27 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static178.anInt4133; local32++) {
			@Pc(38) String local38 = Static520.aStringArray49[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static329.method5266(local38);
			if (local38 != null && local38.equals(local27)) {
				Static178.anInt4133--;
				for (@Pc(64) int local64 = local32; local64 < Static178.anInt4133; local64++) {
					Static520.aStringArray49[local64] = Static520.aStringArray49[local64 + 1];
					Static368.aStringArray40[local64] = Static368.aStringArray40[local64 + 1];
					Static463.anIntArray711[local64] = Static463.anIntArray711[local64 + 1];
					Static35.aStringArray7[local64] = Static35.aStringArray7[local64 + 1];
					Static298.anIntArray775[local64] = Static298.anIntArray775[local64 + 1];
					Static356.aBooleanArray31[local64] = Static356.aBooleanArray31[local64 + 1];
				}
				Static305.anInt5997 = Static446.anInt8177;
				Static278.method4791(Static273.aClass158_71);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(arg0));
				Static515.aClass3_Sub27_Sub1_2.method7608(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BI)Lclient!em;")
	public static Class75 method5552(@OriginalArg(1) int arg0) {
		@Pc(10) Class75 local10 = (Class75) Static120.aClass125_18.method3512((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static20.aClass161_8.method4243(arg0, 1);
		local10 = new Class75();
		local10.anInt2489 = arg0;
		if (local20 != null) {
			local10.method2134(new Class3_Sub27(local20));
		}
		local10.method2136();
		if (local10.anInt2483 == 2 && Static44.aClass267_4.method6644((long) arg0) == null) {
			Static44.aClass267_4.method6640(new Class3_Sub47(Static232.anInt4926), (long) arg0);
			Static73.aClass75Array7[Static232.anInt4926++] = local10;
		}
		Static120.aClass125_18.method3519((long) arg0, local10);
		return local10;
	}
}
