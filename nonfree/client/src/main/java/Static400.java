import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
	public static int anInt7591;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V")
	public static void method6358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub13_Sub15 local12 = Static370.method5893(arg0, 6);
		local12.method6968();
		local12.anInt8318 = arg1;
	}
}
