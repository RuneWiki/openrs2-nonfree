import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kda", name = "N", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!kda", name = "J", descriptor = "[Lclient!pea;")
	public static final Class3_Sub7_Sub15[] aClass3_Sub7_Sub15Array5 = new Class3_Sub7_Sub15[14];

	@OriginalMember(owner = "client!kda", name = "K", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!kda", name = "Q", descriptor = "[I")
	public static final int[] anIntArray242 = new int[32];

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZIIII)V")
	public static void method4180(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static173.aLong85 = 0L;
		@Pc(8) int local8 = Static534.method7318();
		if (arg2 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (!Static319.aClass31_11.method8089()) {
			arg0 = true;
		}
		Static266.method4069(local8, arg2, arg0, arg3, arg1);
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)I")
	public static int method4183(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
