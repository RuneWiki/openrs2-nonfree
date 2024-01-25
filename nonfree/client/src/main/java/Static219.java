import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public static int anInt4615;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "[I")
	public static final int[] anIntArray414 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public static int anInt4616 = -50;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!wo;Lclient!wo;)V")
	public static void method4142(@OriginalArg(1) Class216 arg0, @OriginalArg(2) Class216 arg1) {
		Static147.aClass216_53 = arg1;
		Static122.aClass216_42 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public static void method4143() {
		@Pc(1) Class87 local1 = Static22.aClass87_44;
		synchronized (Static22.aClass87_44) {
			Static22.aClass87_44.method2473(5);
		}
		local1 = Static337.aClass87_61;
		synchronized (Static337.aClass87_61) {
			Static337.aClass87_61.method2473(5);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIB)V")
	public static void method4147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class1_Sub4_Sub9 local15 = Static139.method4227(arg0, 6);
		local15.method1869();
		local15.anInt2142 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!il;IIIII)V")
	public static void method4148(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6684 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub30_Sub1Array3[local4] != null) {
				arg0.anInt6684++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6684; local22++) {
			@Pc(31) int local31 = Static150.anIntArrayArrayArray9[arg1][arg2][arg3];
			@Pc(40) Class1_Sub30_Sub1 local40;
			while (local31 != 0) {
				local40 = Static309.aClass1_Sub30_Sub1Array2[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass1_Sub30_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static150.anIntArrayArrayArray9[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static309.aClass1_Sub30_Sub1Array2[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass1_Sub30_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt6684 - 1; local85++) {
				arg0.aClass1_Sub30_Sub1Array3[local85] = arg0.aClass1_Sub30_Sub1Array3[local85 + 1];
			}
			arg0.anInt6684--;
		}
	}
}
