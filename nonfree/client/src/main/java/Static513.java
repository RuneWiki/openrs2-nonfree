import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!qfa", name = "w", descriptor = "Lclient!ra;")
	public static final Class317 aClass317_7 = new Class317();

	@OriginalMember(owner = "client!qfa", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[6][];

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILjava/lang/String;IIIIII)V")
	public static void method7265(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class4_Sub3 local7 = new Class4_Sub3();
		local7.anInt644 = Static528.anInt8386 + arg0;
		local7.anInt650 = arg3;
		local7.anInt648 = arg5;
		local7.anInt651 = arg6;
		local7.anInt649 = arg4;
		local7.aString2 = arg1;
		local7.anInt647 = arg2;
		Static480.aClass320_6.method7600(local7);
	}

	@OriginalMember(owner = "client!qfa", name = "e", descriptor = "(B)V")
	public static void method7268() {
		for (@Pc(6) Class2_Sub6_Sub20 local6 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local6 != null; local6 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
			if (Static672.method9169(local6.anInt9603)) {
				Static202.method2862(local6);
			}
		}
	}
}
