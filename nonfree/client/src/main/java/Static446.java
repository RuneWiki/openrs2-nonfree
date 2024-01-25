import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_20 = new Class60(9, 6);

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method5946() {
		@Pc(1) Class151 local1 = Static34.aClass151_21;
		synchronized (Static34.aClass151_21) {
			Static34.aClass151_21.method3299();
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!m;Lclient!ci;ILjava/awt/Canvas;)Lclient!qa;")
	public static Class121 method5947(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new h(arg2, arg3, arg0, arg1);
	}
}
