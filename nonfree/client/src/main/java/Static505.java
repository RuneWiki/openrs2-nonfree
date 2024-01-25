import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!uba", name = "i", descriptor = "Lclient!pq;")
	public static Class251 aClass251_138;

	@OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
	public static int anInt8396;

	@OriginalMember(owner = "client!uba", name = "B", descriptor = "Lclient!bga;")
	public static Class30 aClass30_1;

	@OriginalMember(owner = "client!uba", name = "W", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!uba", name = "y", descriptor = "[C")
	public static final char[] aCharArray10 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!uba", name = "A", descriptor = "Z")
	public static boolean aBoolean576 = false;

	@OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
	public static final int anInt8414 = 1338;

	@OriginalMember(owner = "client!uba", name = "R", descriptor = "I")
	public static int anInt8419 = 0;

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)V")
	public static void method6943() {
		Static375.aClass97ArrayArray1 = new Class97[Static400.aClass251_134.method5847()][];
		Static538.aClass97ArrayArray2 = new Class97[Static400.aClass251_134.method5847()][];
		Static555.aBooleanArray42 = new boolean[Static400.aClass251_134.method5847()];
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([BI[BIIIIBI)V")
	public static void method6945(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg3++;
				arg0[local26] += arg2[arg4++];
				@Pc(38) int local38 = arg3++;
				arg0[local38] += arg2[arg4++];
				@Pc(50) int local50 = arg3++;
				arg0[local50] += arg2[arg4++];
				@Pc(62) int local62 = arg3++;
				arg0[local62] += arg2[arg4++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg3++;
				arg0[local26] += arg2[arg4++];
			}
			arg4 += arg5;
			arg3 += arg7;
		}
	}
}
