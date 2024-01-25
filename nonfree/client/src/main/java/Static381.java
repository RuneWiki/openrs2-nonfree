import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "Lclient!fs;")
	public static Class76 aClass76_87;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
	public static int anInt6417;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!fs;")
	public static Class76 aClass76_89;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[5];

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public static int anInt6418 = 0;

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
	public static final int anInt6419 = 2;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)Lclient!ii;")
	public static Class16_Sub2 method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass16_Sub2_3;
	}
}
