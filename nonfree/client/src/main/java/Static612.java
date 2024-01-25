import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
	public static int anInt10334;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray64 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZI)Lclient!bc;")
	public static Class6_Sub6 method8391(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) long local17 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class6_Sub6) Static276.aClass380_47.method8747(local17);
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(III)Z")
	public static boolean method8392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static27.method743(arg0, arg1) | (arg0 & 0x2000) != 0 | Static33.method795(arg1, arg0)) & Static560.method7884(arg1, arg0);
	}
}
