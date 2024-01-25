import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static202 {

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
	public static int anInt4434;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "I")
	public static int anInt4430 = 0;

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/awt/Canvas;IILclient!d;)Lclient!ha;")
	public static Class5 method3681(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface7 arg2) {
		return new Class5_Sub1(arg0, arg2, arg1);
	}
}
