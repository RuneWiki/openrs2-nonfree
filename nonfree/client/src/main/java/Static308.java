import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	public static void method4740() {
		Static389.anInt6778 = 0;
		Static76.anInt1848 = -1;
		Static90.anInt1998 = -1;
		Static328.anInt5893 = -1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILjava/lang/String;ZI)V")
	public static void method4741(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static167.method2564(arg1, arg2, false, arg0, null, arg3);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!kba;B)V")
	public static void method4742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20_Sub2_Sub4_Sub1_Sub1 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static600.method3767(local6, 0, local6.length, arg1);
		Static256.method4041(arg0, arg2, local6);
	}
}
