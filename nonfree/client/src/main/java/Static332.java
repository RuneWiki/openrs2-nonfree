import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
	public static int anInt5505;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray2;

	@OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
	public static int anInt5506;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Ljava/lang/String;ILclient!dt;)I")
	public static int method4726(@OriginalArg(0) String arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		@Pc(6) int local6 = arg1.anInt9739;
		@Pc(10) byte[] local10 = Static542.method6953(arg0);
		arg1.method7911(local10.length);
		arg1.anInt9739 += Static438.aClass264_1.method5892(arg1.aByteArray90, local10.length, local10, arg1.anInt9739, 0);
		return arg1.anInt9739 - local6;
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4727(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		Static10.method336(-1, arg1, -1, arg0);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIBI)V")
	public static void method4728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class3_Sub5_Sub20 local17 = Static447.method6065((long) arg1, 10);
		local17.method8832();
		local17.anInt10754 = arg0;
		local17.anInt10756 = arg2;
		local17.anInt10757 = arg3;
	}
}
