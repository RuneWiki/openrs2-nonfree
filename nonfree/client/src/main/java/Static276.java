import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!oa;")
	public static Class90 aClass90_9;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "[I")
	public static final int[] anIntArray398 = new int[14];

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!mh;IIIII)V")
	public static void method4134(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt3807 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass6_Sub25Array4[local4] != null) {
				arg0.anInt3807++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt3807; local22++) {
			@Pc(31) long local31 = Static511.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class255 local41;
			while (local31 != 0L) {
				local41 = Static111.aClass255Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub25_3 == arg0.aClass6_Sub25Array4[local22]) {
					continue label51;
				}
			}
			local31 = Static511.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static111.aClass255Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub25_3 == arg0.aClass6_Sub25Array4[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt3807 - 1; local93++) {
				arg0.aClass6_Sub25Array4[local93] = arg0.aClass6_Sub25Array4[local93 + 1];
			}
			arg0.anInt3807--;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZLclient!kw;)I")
	public static int method4135(@OriginalArg(1) Class15_Sub2_Sub4_Sub1 arg0) {
		@Pc(8) Class88 local8 = arg0.aClass88_1;
		if (local8.anIntArray182 != null) {
			local8 = local8.method1940(Static65.aClass51_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local8.anInt2164;
		@Pc(34) Class154 local34 = arg0.method7131();
		if (arg0.aBoolean579) {
			local30 = local8.anInt2154;
		} else if (local34.anInt4538 == arg0.anInt8985 || arg0.anInt8985 == local34.anInt4524 || arg0.anInt8985 == local34.anInt4516 || arg0.anInt8985 == local34.anInt4507) {
			local30 = local8.anInt2161;
		} else if (local34.anInt4523 == arg0.anInt8985 || local34.anInt4506 == arg0.anInt8985 || arg0.anInt8985 == local34.anInt4531 || arg0.anInt8985 == local34.anInt4519) {
			local30 = local8.anInt2158;
		}
		return local30;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!faa;)V")
	public static void method4137(@OriginalArg(1) Class97 arg0) {
		if (arg0.anInt2637 == 5 && arg0.anInt2607 != -1) {
			Static350.method5307(arg0, Static554.aClass90_12);
		}
	}
}
