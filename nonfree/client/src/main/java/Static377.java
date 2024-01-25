import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static377 {

	@OriginalMember(owner = "client!pg", name = "ib", descriptor = "Z")
	public static boolean aBoolean483 = false;

	@OriginalMember(owner = "client!pg", name = "kb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray31 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	public static void method5649(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static245.aFloat313 = 3.0F;
		} else if (arg0 == 50) {
			Static245.aFloat313 = 4.0F;
		} else if (arg0 == 75) {
			Static245.aFloat313 = 6.0F;
		} else if (arg0 == 100) {
			Static245.aFloat313 = 8.0F;
		} else if (arg0 == 200) {
			Static245.aFloat313 = 16.0F;
		}
		Static107.anInt2341 = -1;
		Static107.anInt2341 = -1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!oh;I)V")
	public static void method5650(@OriginalArg(0) Class220 arg0) {
		if (arg0.anInt6632 == Static276.anInt5395) {
			Static345.aBooleanArray24[arg0.anInt6607] = true;
		}
	}
}
