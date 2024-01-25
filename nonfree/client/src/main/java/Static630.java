import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "I")
	public static int anInt10265;

	@OriginalMember(owner = "client!wfa", name = "t", descriptor = "Lclient!li;")
	public static Class5_Sub4_Sub14 aClass5_Sub4_Sub14_4;

	@OriginalMember(owner = "client!wfa", name = "w", descriptor = "Lclient!ofa;")
	public static Class117 aClass117_10;

	@OriginalMember(owner = "client!wfa", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "[I")
	public static final int[] anIntArray820 = new int[8];

	@OriginalMember(owner = "client!wfa", name = "v", descriptor = "[I")
	public static final int[] anIntArray821 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BI)V")
	public static void method8726(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg0, 5);
		local8.method4132();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)I")
	public static int method8728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static114.anIntArray155[arg0 & 0x3] : Static231.anIntArray335[arg0 & 0x3];
	}
}
