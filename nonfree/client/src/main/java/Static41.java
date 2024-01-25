import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString3 = "";

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
	public static void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static190.anInt3736 == 1) {
			Static525.method7623(arg1, Static201.aClass4_Sub39_1, arg0);
		} else if (Static190.anInt3736 == 2) {
			Static225.method3672(arg0, arg1);
		}
		Static190.anInt3736 = 0;
		Static201.aClass4_Sub39_1 = null;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIII)V")
	public static void method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg3 + 1;
		Static306.method5239(Static46.anIntArrayArray4[arg3], arg0, arg4, arg1);
		@Pc(23) int local23 = arg2 - 1;
		Static306.method5239(Static46.anIntArrayArray4[arg2], arg0, arg4, arg1);
		for (@Pc(31) int local31 = local8; local31 <= local23; local31++) {
			@Pc(37) int[] local37 = Static46.anIntArrayArray4[local31];
			local37[arg1] = local37[arg0] = arg4;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!ob;")
	public static Class241 method506(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class241_Sub1(arg0, 7500);
	}
}
