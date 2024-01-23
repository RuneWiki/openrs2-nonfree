import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!rj;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public static int anInt4497 = 0;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
	public static int anInt4498 = -1;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray31 = new String[100];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public static void method3787(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub7 local8 = Static34.method528(arg0, 7);
		local8.method970();
	}
}
