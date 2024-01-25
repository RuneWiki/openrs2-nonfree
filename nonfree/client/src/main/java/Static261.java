import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "I")
	public static int anInt5002;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	public static int anInt5003;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Lclient!lc;")
	public static final Class219 aClass219_4 = new Class219();

	@OriginalMember(owner = "client!im", name = "f", descriptor = "[F")
	public static final float[] aFloatArray47 = new float[16];

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([BIIIIFFLclient!kc;FBFIF)V")
	public static void method4521(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) Class11 arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
			Static225.method4049(arg1, arg5, local14, arg6, arg0, arg4, arg3, arg2, arg7);
			arg1 += 16384;
		}
	}
}
