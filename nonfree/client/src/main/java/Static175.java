import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	public static int anInt3720 = 0;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray34 = new boolean[112];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static178.aClass12Array5[0].method3927(arg0, arg3);
		@Pc(17) int local17 = arg4 * (arg4 - 32) / arg2;
		Static178.aClass12Array5[1].method3927(arg0, arg3 + arg4 - 16);
		if (local17 < 8) {
			local17 = 8;
		}
		@Pc(50) int local50 = (arg4 - local17 - 32) * arg1 / (arg2 - arg4);
		if (!Static277.aBoolean412) {
			Static50.method954(arg0, arg3 + 16, 16, arg4 - 32, Static114.anInt2617);
			Static50.method954(arg0, arg3 + local50 + 16, 16, local17, Static25.anInt621);
			Static50.method953(arg0, arg3 + local50 + 16, local17, Static180.anInt3782);
			Static50.method953(arg0 + 1, local50 + (arg3 - -16), local17, Static180.anInt3782);
			Static50.method943(arg0, arg3 + local50 + 16, 16, Static180.anInt3782);
			Static50.method943(arg0, arg3 + local50 + 17, 16, Static180.anInt3782);
			Static50.method953(arg0 + 15, arg3 - (-local50 + -16), local17, Static17.anInt5023);
			Static50.method953(arg0 + 14, local50 + arg3 + 17, local17 - 1, Static17.anInt5023);
			Static50.method943(arg0, local50 + arg3 + local17 + 15, 16, Static17.anInt5023);
			Static50.method943(arg0 + 1, arg3 + 14 - -local50 - -local17, 15, Static17.anInt5023);
			return;
		}
		Static41.method832(arg0, arg3 + 16, 16, arg4 - 32, Static114.anInt2617);
		Static41.method832(arg0, local50 + arg3 + 16, 16, local17, Static25.anInt621);
		Static41.method837(arg0, arg3 + local50 + 16, local17, Static180.anInt3782);
		Static41.method837(arg0 + 1, local50 + arg3 - -16, local17, Static180.anInt3782);
		Static41.method848(arg0, arg3 + local50 + 16, 16, Static180.anInt3782);
		Static41.method848(arg0, arg3 + local50 + 17, 16, Static180.anInt3782);
		Static41.method837(arg0 + 15, arg3 - (-local50 + -16), local17, Static17.anInt5023);
		Static41.method837(arg0 + 14, arg3 - (-17 - local50), local17 - 1, Static17.anInt5023);
		Static41.method848(arg0, local17 + local50 + arg3 + 15, 16, Static17.anInt5023);
		Static41.method848(arg0 + 1, local17 + 14 + (arg3 - -local50), 15, Static17.anInt5023);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI)V")
	public static void method2988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static298.aFloat58 = arg0;
		if (Static220.anInt4376 == 2) {
			Static91.anInt2040 = arg0;
			Static134.anInt2950 = arg1;
		}
		Static125.aFloat20 = arg1;
		Static148.method2587();
		Static192.aBoolean301 = true;
	}
}
