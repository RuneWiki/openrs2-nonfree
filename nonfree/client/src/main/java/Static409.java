import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!uf", name = "t", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "[Lclient!uv;")
	public static Class253[] aClass253Array2 = new Class253[50];

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
	public static int anInt701 = 0;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)Z")
	public static boolean method687(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[S[Ljava/lang/String;I)V")
	public static void method693(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(12) int local12 = (arg0 + arg3) / 2;
		@Pc(14) int local14 = arg3;
		@Pc(18) String local18 = arg2[local12];
		arg2[local12] = arg2[arg0];
		arg2[arg0] = local18;
		@Pc(32) short local32 = arg1[local12];
		arg1[local12] = arg1[arg0];
		arg1[arg0] = local32;
		for (@Pc(44) int local44 = arg3; local44 < arg0; local44++) {
			if (local18 == null || arg2[local44] != null && arg2[local44].compareTo(local18) < (local44 & 0x1)) {
				@Pc(64) String local64 = arg2[local44];
				arg2[local44] = arg2[local14];
				arg2[local14] = local64;
				@Pc(78) short local78 = arg1[local44];
				arg1[local44] = arg1[local14];
				arg1[local14++] = local78;
			}
		}
		arg2[arg0] = arg2[local14];
		arg2[local14] = local18;
		arg1[arg0] = arg1[local14];
		arg1[local14] = local32;
		method693(local14 - 1, arg1, arg2, arg3);
		method693(arg0, arg1, arg2, local14 + 1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!tm;I)Lclient!pc;")
	public static Class195 method694(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub5 arg1) {
		@Pc(9) Class195 local9;
		if (Static364.aClass195_3 == null) {
			local9 = new Class195();
		} else {
			local9 = Static364.aClass195_3;
			Static364.aClass195_3 = Static364.aClass195_3.aClass195_2;
			Static88.anInt4390--;
			local9.aClass195_2 = null;
		}
		local9.aClass11_Sub5_1 = arg1;
		local9.anInt5542 = arg0;
		return local9;
	}
}
