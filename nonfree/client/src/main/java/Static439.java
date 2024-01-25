import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!or", name = "k", descriptor = "Lclient!ci;")
	public static final Class57 aClass57_3 = Static215.method3943();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!wm;ILclient!lga;Lclient!lga;Lclient!ng;Lclient!lga;)Z")
	public static boolean method7364(@OriginalArg(0) Class150 arg0, @OriginalArg(2) Class223 arg1, @OriginalArg(3) Class223 arg2, @OriginalArg(4) Class6_Sub17_Sub4 arg3, @OriginalArg(5) Class223 arg4) {
		Static331.anIntArray523 = new int[16];
		Static578.aClass150_3 = arg0;
		Static644.aClass223_118 = arg4;
		Static449.aClass6_Sub17_Sub4_3 = arg3;
		Static427.aClass223_89 = arg2;
		Static346.aClass223_75 = arg1;
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			Static331.anIntArray523[local20] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "([FBI)[F")
	public static float[] method7365(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) float[] local12 = new float[arg1];
		Static695.method5645(arg0, 0, local12, 0, arg1);
		return local12;
	}
}
