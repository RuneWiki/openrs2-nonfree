import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!jda;")
	public static final Class188 aClass188_3 = new Class188();

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_107 = new Class126(127, 8);

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Z")
	public static boolean method4991(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)I")
	public static int method4993() {
		return Static438.anIntArray459 == null ? 0 : Static438.anIntArray459.length * 2;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IFFFI)F")
	public static float method4994(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(12) float[] local12 = Static117.aFloatArrayArray1[arg0];
		return arg1 * local12[1] + local12[0] * arg2 + local12[2] * arg3;
	}
}
