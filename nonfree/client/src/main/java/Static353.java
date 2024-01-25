import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static353 {

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "Lclient!jl;")
	public static Class125 aClass125_1;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "[I")
	public static final int[] anIntArray415 = new int[14];

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
	public static int anInt6050 = -1;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
	public static int anInt6051 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIBI)V")
	public static void method4771(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static147.aByteArrayArrayArray22 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
	public static void method4772() {
		if (Static312.anInt5414 == 2) {
			Static203.method4783(3);
		} else if (Static312.anInt5414 == 6) {
			Static203.method4783(7);
		} else if (Static312.anInt5414 == 9) {
			Static203.method4783(10);
		}
	}
}
