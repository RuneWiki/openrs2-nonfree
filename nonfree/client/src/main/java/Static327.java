import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!iq;")
	public static Class104 aClass104_166;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString67;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "Z")
	public static boolean aBoolean566 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lclient!kn;")
	public static Class2_Sub9_Sub12 method5348(@OriginalArg(1) int arg0) {
		@Pc(19) Class2_Sub9_Sub12 local19 = (Class2_Sub9_Sub12) Static308.aClass144_9.method4186((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(29) byte[] local29 = Static331.aClass104_168.method2756(5, arg0);
		local19 = new Class2_Sub9_Sub12();
		if (local29 != null) {
			local19.method3393(new Class2_Sub12(local29));
		}
		Static308.aClass144_9.method4188((long) arg0, local19);
		return local19;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method5350() {
		Static122.aClass180_17 = new Class180();
	}
}
