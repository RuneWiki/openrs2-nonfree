import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
	public static int anInt2794;

	@OriginalMember(owner = "client!gm", name = "Fb", descriptor = "[I")
	public static int[] anIntArray282;

	@OriginalMember(owner = "client!gm", name = "V", descriptor = "[I")
	public static final int[] anIntArray279 = new int[5];

	@OriginalMember(owner = "client!gm", name = "Jb", descriptor = "I")
	public static int anInt2818 = 0;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "()V")
	public static void method2334() {
		for (@Pc(1) int local1 = 0; local1 < Static270.anInt4750; local1++) {
			@Pc(6) Class24_Sub3 local6 = Static400.aClass24_Sub3Array3[local1];
			Static419.method5515(local6);
			Static400.aClass24_Sub3Array3[local1] = null;
		}
		Static270.anInt4750 = 0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method2343(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static156.anInt3163 = 1;
		Static109.anInt2181 = -1;
		Static161.method2702(arg0, arg1);
	}
}
