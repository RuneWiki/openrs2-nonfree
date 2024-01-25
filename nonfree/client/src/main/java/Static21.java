import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
	public static int anInt401;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
	public static final int[] anIntArray54 = new int[100];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method388(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static66.aString44 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static327.aString241 + "</col>";
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!vm;I[[[BBIIIIIIIII)V")
	public static void method389(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg3 == 0 || arg11 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg1 = arg1 + 1 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 10) {
			arg3 = 1;
			arg1 = arg1 + 3 & 0x3;
		}
		if (arg3 == 11) {
			arg1 = arg1 + 3 & 0x3;
			arg3 = 8;
		}
		arg0.method4470(arg9, arg5, arg6, arg10, arg7, arg4, arg2[arg3 - 1][arg1], arg11, arg8);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V")
	public static void method390() {
		Static252.aBoolean443 = false;
		Static160.anInt3616 = 2;
		Static59.anInt1267 = -1;
		Static138.anInt3121 = 0;
		Static74.aClass11_38 = null;
		Static177.anInt5898 = 1;
		Static297.anInt6002 = -1;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!vm;IIILclient!mk;)V")
	public static void method391(@OriginalArg(0) Class92 arg0, @OriginalArg(4) Class130 arg1) {
		Static104.aClass130_159.method3514();
		if (Static343.aBoolean583) {
			return;
		}
		for (@Pc(22) Class4_Sub20 local22 = (Class4_Sub20) arg1.method3499(); local22 != null; local22 = (Class4_Sub20) arg1.method3512()) {
			@Pc(31) Class139 local31 = Static20.method377(local22.anInt3082);
			if (Static248.method4313(local31)) {
				@Pc(45) boolean local45 = Static289.method4938(arg0, local22, local31);
				if (local45) {
					Static98.method5504(arg0, local22, local31);
				}
			}
		}
	}
}
