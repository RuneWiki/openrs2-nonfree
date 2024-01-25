import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "[Lclient!wv;")
	public static Class350[] aClass350Array1;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!e;I)Lclient!oa;")
	public static Class9 method5639(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		return new da(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZLclient!oa;)Lclient!ed;")
	public static Class82 method5643(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		@Pc(9) Class141 local9 = Static335.method5314(arg0, arg1);
		return local9 == null ? null : local9.aClass82_5;
	}
}
