import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "I")
	public static int anInt7428 = 0;

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V")
	public static void method6132(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class4_Sub5_Sub16 local12 = Static219.method3587(arg1, 12);
		local12.method7133();
		local12.anInt8736 = arg0;
	}
}
