import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!so;")
	public static Class227 aClass227_1;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_21 = new Class27(67, 7);

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "[I")
	public static final int[] anIntArray71 = new int[32];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
	public static void method838() {
		Static265.aClass265_1 = new Class265(8);
		Static217.anInt4140 = 0;
		for (@Pc(21) Class40_Sub6 local21 = (Class40_Sub6) Static364.aClass240_5.method5227(); local21 != null; local21 = (Class40_Sub6) Static364.aClass240_5.method5230()) {
			local21.method4090();
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILclient!gh;)V")
	public static void method839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class89 arg2) {
		Static107.anInt2163 = arg0;
		Static20.anInt355 = arg1;
		Static236.aClass89_8 = arg2;
	}
}
