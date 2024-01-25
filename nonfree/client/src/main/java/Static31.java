import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!br", name = "a", descriptor = "I")
	public static int anInt548;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "I")
	public static int anInt550 = -1;

	@OriginalMember(owner = "client!br", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[8];

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIB)V")
	public static void method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static164.anInt3089 = arg3;
		Static66.anInt2106 = arg1;
		Static169.anInt6316 = arg0;
		Static348.anInt6642 = arg2;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLclient!nq;)V")
	public static void method441(@OriginalArg(1) Class144 arg0) {
		Static314.aClass144_35 = arg0;
	}
}
