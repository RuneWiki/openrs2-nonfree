import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
	public static int anInt2399;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "[I")
	public static final int[] anIntArray222 = new int[100];

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)V")
	public static void method2344(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static127.aFloat33 = 3.0F;
		} else if (arg0 == 50) {
			Static127.aFloat33 = 4.0F;
		} else if (arg0 == 75) {
			Static127.aFloat33 = 6.0F;
		} else if (arg0 == 100) {
			Static127.aFloat33 = 8.0F;
		} else if (arg0 == 200) {
			Static127.aFloat33 = 16.0F;
		}
		Static120.anInt2601 = -1;
		Static120.anInt2601 = -1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!ol;IIIII)V")
	public static void method2345(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6003 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass2_Sub36_Sub1Array6[local4] != null) {
				arg0.anInt6003++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6003; local22++) {
			@Pc(31) int local31 = Static99.anIntArrayArrayArray2[arg1][arg2][arg3];
			@Pc(40) Class2_Sub36_Sub1 local40;
			while (local31 != 0) {
				local40 = Static288.aClass2_Sub36_Sub1Array7[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass2_Sub36_Sub1Array6[local22]) {
					continue label51;
				}
			}
			local31 = Static99.anIntArrayArrayArray2[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static288.aClass2_Sub36_Sub1Array7[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass2_Sub36_Sub1Array6[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt6003 - 1; local85++) {
				arg0.aClass2_Sub36_Sub1Array6[local85] = arg0.aClass2_Sub36_Sub1Array6[local85 + 1];
			}
			arg0.anInt6003--;
		}
	}
}
