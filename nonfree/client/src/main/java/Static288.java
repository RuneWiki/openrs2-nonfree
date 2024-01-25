import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[5];

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public static int anInt5695 = -1;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "[I")
	public static final int[] anIntArray444 = new int[14];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
	public static void method4788() {
		Static7.anIntArray10 = null;
		Static240.aByteArrayArrayArray8 = null;
		Static155.aByteArrayArrayArray5 = null;
		Static263.anIntArrayArrayArray13 = null;
		Static166.anIntArray217 = null;
		Static39.aByteArrayArrayArray2 = null;
		Static184.anIntArray281 = null;
		Static277.aByteArrayArrayArray11 = null;
		Static56.aByteArrayArrayArray3 = null;
		Static237.anIntArray377 = null;
		Static193.anIntArray304 = null;
		Static258.anIntArray400 = null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!gr;IIIII)V")
	public static void method4789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4161 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass11_Sub5_Sub1Array3[local4] != null) {
				arg0.anInt4161++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt4161; local22++) {
			@Pc(31) int local31 = Static117.anIntArrayArrayArray9[arg1][arg2][arg3];
			@Pc(40) Class11_Sub5_Sub1 local40;
			while (local31 != 0) {
				local40 = Static171.aClass11_Sub5_Sub1Array2[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass11_Sub5_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static117.anIntArrayArrayArray9[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static171.aClass11_Sub5_Sub1Array2[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass11_Sub5_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt4161 - 1; local85++) {
				arg0.aClass11_Sub5_Sub1Array3[local85] = arg0.aClass11_Sub5_Sub1Array3[local85 + 1];
			}
			arg0.anInt4161--;
		}
	}
}
