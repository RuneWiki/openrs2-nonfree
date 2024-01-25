import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
	public static int anInt833;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
	public static final int anInt827 = 1337;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "S")
	public static short aShort12 = 205;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)V")
	public static void method719(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub5_Sub8 local15 = Static49.method760(10, arg0);
		local15.method3257();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!pj;)V")
	public static void method720(@OriginalArg(1) Class248 arg0) {
		Static173.anInt3149 = 0;
		Static435.anInt7738 = 0;
		Static357.aClass349_12 = new Class349();
		Static431.aClass60_Sub1_Sub1_Sub1Array2 = new Class60_Sub1_Sub1_Sub1[1024];
		Static56.aClass60_Sub4Array1 = new Class60_Sub4[Static45.anIntArray34[Static345.anInt6520] + 1];
		Static77.anInt1326 = 0;
		Static23.anInt421 = 0;
		Static422.method5979(arg0);
		Static533.method7264(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method721(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(2, arg0);
		local8.method3256();
		local8.aString35 = arg1;
	}
}
