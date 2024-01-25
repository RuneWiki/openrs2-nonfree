import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gca", name = "g", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method2669(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class5_Sub40 local12 = Static25.method507(Static98.aClass208_2, Static563.aClass181_83);
		local12.aClass5_Sub12_Sub2_2.method8647(Static352.method5589(arg1) + 1);
		local12.aClass5_Sub12_Sub2_2.method8619(arg1);
		local12.aClass5_Sub12_Sub2_2.method8647(arg0);
		Static612.method8496(local12);
	}
}
