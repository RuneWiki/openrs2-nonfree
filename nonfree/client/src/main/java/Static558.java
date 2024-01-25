import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "I")
	public static int anInt9993;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public static int anInt9998;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "I")
	public static int anInt9991 = 0;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IF[BFIFLclient!qg;FIBIFI)V")
	public static void method8313(@OriginalArg(1) float arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) Class185 arg5, @OriginalArg(7) float arg6, @OriginalArg(11) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static287.method5230(arg0, arg3, arg2, arg7, arg5, local3, arg6, arg1, arg4);
			arg3 += 16384;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
	public static int method8314(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
	public static void method8316(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		Static291.anInt6172 = arg1;
		Static26.anInt543 = 2;
		Static380.method6293(arg2, false, arg0);
	}
}
