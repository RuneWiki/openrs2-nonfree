import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "Z")
	public static boolean aBoolean326 = true;

	@OriginalMember(owner = "client!jda", name = "n", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_78 = new Class337(107, 0);

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)I")
	public static int method4163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static361.anIntArrayArray64 == null ? 0 : Static361.anIntArrayArray64[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BII)Z")
	public static boolean method4164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static390.method5791(arg0, arg1) | (arg0 & 0x70000) != 0 || Static62.method1043(arg0, arg1);
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(II)V")
	public static void method4165(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(7, arg0);
		local8.method8961();
	}
}
