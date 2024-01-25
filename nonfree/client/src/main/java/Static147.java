import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public static int anInt2601;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!de;")
	public static final Class50 aClass50_8 = new Class50(1, 2, 2, 0);

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray11 = new String[100];

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "[Lclient!ef;")
	public static Class64[] aClass64Array1 = new Class64[50];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method2139() {
		@Pc(7) Class93[] local7 = Class7_Sub1.aClass93Array1;
		synchronized (Class7_Sub1.aClass93Array1) {
			for (@Pc(11) int local11 = 0; local11 < Class7_Sub1.aClass93Array1.length; local11++) {
				Class7_Sub1.aClass93Array1[local11] = new Class93();
				Static309.anIntArray435[local11] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BII)I")
	public static int method2145(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII[B[BI)V")
	public static void method2146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(23) int local23 = -arg7; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg2++;
				arg6[local31] = (byte) (arg6[local31] - arg5[arg3++]);
				@Pc(44) int local44 = arg2++;
				arg6[local44] = (byte) (arg6[local44] - arg5[arg3++]);
				@Pc(57) int local57 = arg2++;
				arg6[local57] = (byte) (arg6[local57] - arg5[arg3++]);
				@Pc(70) int local70 = arg2++;
				arg6[local70] = (byte) (arg6[local70] - arg5[arg3++]);
			}
			for (@Pc(89) int local89 = local15; local89 < 0; local89++) {
				local31 = arg2++;
				arg6[local31] = (byte) (arg6[local31] - arg5[arg3++]);
			}
			arg2 += arg0;
			arg3 += arg1;
		}
	}
}
