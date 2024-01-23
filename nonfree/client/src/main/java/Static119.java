import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!bn;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_13;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public static int anInt5238 = -1;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger5 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
	public static int anInt5242 = 0;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method4234() {
		if (Static274.aBoolean362) {
			return;
		}
		if (Static41.aBoolean65) {
			Static239.aFloat51 = (int) Static239.aFloat51 + 191 & 0xFFFFFF80;
		} else {
			Static102.aFloat11 += (24.0F - Static102.aFloat11) / 2.0F;
		}
		Static274.aBoolean362 = true;
		Static63.aBoolean100 = true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBII)I")
	public static int method4235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 & 0x3;
		if (local9 == 0) {
			return arg1;
		} else if (local9 == 1) {
			return arg2;
		} else if (local9 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!g;II)Ljava/lang/String;")
	public static String method4238(@OriginalArg(0) Class56 arg0, @OriginalArg(2) int arg1) {
		if (!Static42.method804(arg0).method331(arg1) && arg0.anObjectArray13 == null) {
			return null;
		} else if (arg0.aStringArray15 == null || arg0.aStringArray15.length <= arg1 || arg0.aStringArray15[arg1] == null || arg0.aStringArray15[arg1].trim().length() == 0) {
			return Static199.aBoolean295 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray15[arg1];
		}
	}
}
