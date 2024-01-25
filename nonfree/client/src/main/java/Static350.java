import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Lclient!fs;")
	public static Class76 aClass76_79;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "Z")
	public static boolean aBoolean556 = true;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "[I")
	public static final int[] anIntArray419 = new int[14];

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "[B")
	public static final byte[] aByteArray83 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "[I")
	public static final int[] anIntArray420 = new int[6];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!jj;IIIII)V")
	public static void method4720(@OriginalArg(0) Class120 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5351 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass4_Sub21Array3[local4] != null) {
				arg0.anInt5351++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5351; local22++) {
			@Pc(31) long local31 = Static444.aLongArrayArrayArray2[arg1][arg2][arg3];
			@Pc(41) Class191 local41;
			while (local31 != 0L) {
				local41 = Static106.aClass191Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub21_2 == arg0.aClass4_Sub21Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static444.aLongArrayArrayArray2[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static106.aClass191Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub21_2 == arg0.aClass4_Sub21Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt5351 - 1; local93++) {
				arg0.aClass4_Sub21Array3[local93] = arg0.aClass4_Sub21Array3[local93 + 1];
			}
			arg0.anInt5351--;
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!mn;")
	public static RuntimeException_Sub1 method4724(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString46 = local9.aString46 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
