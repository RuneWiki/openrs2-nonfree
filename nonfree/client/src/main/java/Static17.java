import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!al", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!al", name = "E", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IILclient!ha;)Lclient!bq;")
	public static Class31 method323(@OriginalArg(0) int arg0, @OriginalArg(2) Class33 arg1) {
		@Pc(14) Class221 local14 = Static233.method3354(arg0, arg1, true);
		return local14 == null ? null : local14.aClass31_7;
	}
}
