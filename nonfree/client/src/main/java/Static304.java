import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!pg", name = "Nc", descriptor = "[I")
	public static final int[] anIntArray426 = new int[4096];

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(BII)V")
	public static void method4185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(7, arg1);
		local8.method3098();
		local8.anInt3911 = arg0;
	}
}
