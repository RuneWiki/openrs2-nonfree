import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!ns;")
	public static Class166 aClass166_149;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[I")
	public static final int[] anIntArray323 = new int[16];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILclient!mj;Lclient!mj;)V")
	public static void method2947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub1 arg3, @OriginalArg(4) Class6_Sub1 arg4) {
		@Pc(4) Class53 local4 = Static444.method5715(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass6_Sub1_1 = arg3;
			local4.aClass6_Sub1_2 = arg4;
		}
	}
}
