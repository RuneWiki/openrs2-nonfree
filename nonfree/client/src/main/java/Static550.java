import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vn", name = "V", descriptor = "Lclient!eq;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V")
	public static void method7857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static298.method4854(Static261.aClass181_60);
		Static547.aClass6_Sub26_Sub2_2.method4962(arg1);
		Static547.aClass6_Sub26_Sub2_2.method4979(arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!jo;B)I")
	public static int method7858(@OriginalArg(0) Class168 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4427(Static473.anInt8688)) {
			local5++;
		}
		if (arg0.method4427(Static440.anInt8039)) {
			local5++;
		}
		if (arg0.method4427(Static393.anInt7340)) {
			local5++;
		}
		if (arg0.method4427(Static418.anInt1963)) {
			local5++;
		}
		if (arg0.method4427(Static298.anInt5670)) {
			local5++;
		}
		if (arg0.method4427(Static168.anInt3846)) {
			local5++;
		}
		if (arg0.method4427(Static210.anInt4419)) {
			local5++;
		}
		if (arg0.method4427(Static470.anInt8658)) {
			local5++;
		}
		if (arg0.method4427(Static170.anInt3899)) {
			local5++;
		}
		if (arg0.method4427(Static300.anInt5682)) {
			local5++;
		}
		if (arg0.method4427(Static214.anInt4557)) {
			local5++;
		}
		if (arg0.method4427(Static479.anInt8749)) {
			local5++;
		}
		if (arg0.method4427(Static504.anInt8961)) {
			local5++;
		}
		if (arg0.method4427(Static398.anInt7528)) {
			local5++;
		}
		if (arg0.method4427(Static523.anInt9086)) {
			local5++;
		}
		if (arg0.method4427(Static380.anInt7114)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIII)V")
	public static void method7860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) int local14 = 0; local14 < Static190.anInt4121; local14++) {
			@Pc(20) Rectangle local20 = Class93.aRectangleArray2[local14];
			if (arg3 < local20.x + local20.width && arg0 + arg3 > local20.x && local20.height + local20.y > arg1 && arg1 + arg2 > local20.y) {
				Static429.aBooleanArray27[local14] = true;
			}
		}
	}
}
