import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	public static int anInt4656;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V", line = 3)
	public static void method4344(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static293.method5414(5, arg0);
		local8.method2314();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLclient!mr;IIII)V", line = 18)
	public static void method4345(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub5_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static301.method5542(arg0, arg1.anInt6770, arg1.aByte78, 0, arg2, arg1.anInt6768, arg3);
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)V", line = 46)
	public static void method4347(@OriginalArg(0) int arg0) {
		Class2_Sub6.anInt1105 = 1000 / arg0;
	}
}
