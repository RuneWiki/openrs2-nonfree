import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
	public static int anInt2053;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!fi", name = "H", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_35 = new Class146(79, 7);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!pc;BLclient!ga;ILjava/awt/Canvas;)Lclient!ya;")
	public static Class135 method1632(@OriginalArg(0) Class196 arg0, @OriginalArg(2) Interface5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new qa(arg2, arg3, arg1, arg0);
	}
}
