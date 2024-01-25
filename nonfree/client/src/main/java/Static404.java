import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V")
	public static void method6438(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub16 local12 = Static422.method6588(3, arg0);
		local12.method6700();
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lclient!n;Ljava/awt/Canvas;I)Lclient!qa;")
	public static Class4 method6440(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Canvas arg1) {
		return new a(arg1, arg0);
	}
}
