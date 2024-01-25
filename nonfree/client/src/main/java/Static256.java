import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!mu", name = "t", descriptor = "I")
	public static int anInt5256;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "J")
	public static long aLong156 = -1L;

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ILclient!ns;)V")
	public static void method4039(@OriginalArg(1) Class166 arg0) {
		Static162.anInt6352 = arg0.method3698("titlebg");
		Static38.anInt985 = arg0.method3698("logo");
	}
}
