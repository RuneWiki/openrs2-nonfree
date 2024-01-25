import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jda", name = "q", descriptor = "I")
	public static int anInt5375;

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "[I")
	public static final int[] anIntArray294 = new int[25];

	@OriginalMember(owner = "client!jda", name = "p", descriptor = "[Lclient!aaa;")
	public static final Class2[] aClass2Array1 = new Class2[6];

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZZ)V")
	public static void method4499(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) Class5_Sub43 local12 = Static10.method153(arg0, arg1);
		if (local12 != null) {
			local12.method9052();
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIII)V")
	public static void method4501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static390.anIntArrayArray33 != null) {
			Static390.anIntArrayArray33[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static293.aShortArrayArray7 != null) {
			Static293.aShortArrayArray7[arg0][arg1] = (short) arg3;
		}
		if (Static25.aByteArrayArray1 != null) {
			Static25.aByteArrayArray1[arg0][arg1] = (byte) arg4;
		}
	}
}
