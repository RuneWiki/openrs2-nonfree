import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
	public static int anInt5352 = 0;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "Z")
	public static volatile boolean aBoolean515 = true;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "()V")
	public static void method4652() {
		Static181.method3554(Static113.anInt2651);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!wo;II)Lclient!so;")
	public static Class1_Sub33 method4653(@OriginalArg(0) Class216 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5659(arg1);
		return local13 == null ? null : new Class1_Sub33(local13);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!wo;Lclient!wo;BZI)V")
	public static void method4654(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(4) int arg2) {
		Static131.aClass216_48 = arg1;
		Static129.aBoolean270 = true;
		Static71.anInt3448 = arg2;
		Static42.aClass216_9 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[[BLclient!ip;I[[BLclient!uo;[[BZI[[B[[ILclient!ip;I)V")
	public static void method4655(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class32 arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(10) int[][] arg10, @OriginalArg(11) Class53 arg11) {
		if (Static306.anInt6046 == 0 && !Static348.aBoolean657) {
			Static348.method5583(arg5, arg11, arg10, arg1, arg0, arg2, arg8, arg6, arg4, arg9, arg7, arg3);
		} else {
			Static298.method5000(arg11, arg6, arg1, arg10, arg9, arg7, arg3, arg5, arg0, arg8, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
	public static void method4656(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub4_Sub9 local13 = Static139.method4227(arg0, 10);
		local13.method1868();
	}
}
