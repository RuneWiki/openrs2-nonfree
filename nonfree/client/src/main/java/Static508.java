import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
	public static int anInt8074;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas8;

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_136 = new Class397(110, 8);

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "Lclient!le;")
	public static final Class222 aClass222_5 = new Class222();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[5];

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method6908(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static657.aBoolean674) {
			try {
				@Pc(25) Class130 local25 = (Class130) Class.forName("oj").getDeclaredConstructor().newInstance();
				local25.method6351(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static657.aBoolean674 = true;
			}
		}
		return arg0;
	}
}
