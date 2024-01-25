import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame5;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	public static int anInt6190 = 0;

	@OriginalMember(owner = "client!sr", name = "t", descriptor = "[I")
	public static final int[] anIntArray567 = new int[1000];

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILjava/lang/String;IIZIZLjava/lang/String;IIJ)V")
	public static void method5165(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		if (!Static385.aBoolean436 && Static217.anInt4004 < 500) {
			@Pc(24) int local24 = arg8 == -1 ? Static221.anInt2659 : arg8;
			@Pc(38) Class1_Sub3 local38 = new Class1_Sub3(arg7, arg1, local24, arg5, arg0, arg9, arg2, arg3, arg4, arg6);
			Static55.aClass181_63.method4102(local38);
			Static217.anInt4004++;
		}
	}

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "(I)V")
	public static void method5167() {
		Static193.method2984(Static210.aClass179_47);
		Static92.aClass1_Sub5_Sub1_1.method5396(0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B[B)[B")
	public static byte[] method5168(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static468.method4329(arg0, 0, local14, 0, local6);
		return local14;
	}
}
