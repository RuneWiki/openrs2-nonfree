import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IBI)V")
	public static void method7198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) Class3_Sub7_Sub21 local23 = Static136.method2378((long) arg1 | (long) arg0 << 32, 18);
		local23.method9260();
	}
}
