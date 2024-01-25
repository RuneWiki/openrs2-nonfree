import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	public static int anInt1406;

	@OriginalMember(owner = "client!eg", name = "n", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_48 = new Class157(65, -1);

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
	public static int anInt1413 = 0;

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public static int anInt1414 = 0;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	public static int anInt1415 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!mf;IIIII)V")
	public static void method1564(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4637 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub10_Sub1Array4[local4] != null) {
				arg0.anInt4637++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt4637; local22++) {
			@Pc(31) long local31 = Static360.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class2_Sub10_Sub1 local41;
			while (local31 != 0L) {
				local41 = Static120.aClass2_Sub10_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub10_Sub1Array4[local22]) {
					continue label51;
				}
			}
			local31 = Static360.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static120.aClass2_Sub10_Sub1Array2[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41 == arg0.aClass2_Sub10_Sub1Array4[local22]) {
					continue label51;
				}
			}
			for (@Pc(91) int local91 = local22; local91 < arg0.anInt4637 - 1; local91++) {
				arg0.aClass2_Sub10_Sub1Array4[local91] = arg0.aClass2_Sub10_Sub1Array4[local91 + 1];
			}
			arg0.anInt4637--;
		}
	}
}
