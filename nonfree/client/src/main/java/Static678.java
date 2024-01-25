import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
	public static int anInt10878;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "[I")
	public static int[] anIntArray612 = new int[2];

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
	public static int anInt10875 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)Z")
	public static boolean method9038(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method9039(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class5_Sub21 local12 = Static64.method905(Static263.aClass49_1, Static495.aClass305_75);
		local12.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(arg1) + 1);
		local12.aClass5_Sub41_Sub2_1.method7840(arg0);
		local12.aClass5_Sub41_Sub2_1.method7854(arg1);
		Static495.method7092(local12);
	}
}
