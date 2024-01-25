import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!bf;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public static int anInt7424 = -2;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_36 = new Class202(8, 17);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIIILclient!an;)V")
	public static void method6189(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class16 arg2) {
		Static340.aBoolean475 = false;
		Static444.aClass16_104 = arg2;
		Static105.anInt2408 = arg0;
		Static512.anInt9218 = arg1;
		Static224.anInt8484 = 2;
		Static83.anInt2006 = 0;
		Static111.anInt2588 = 1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIILclient!fq;)V")
	public static void method6191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class30_Sub5 arg4) {
		@Pc(4) Class37 local4 = Static201.method3812(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt5611 = (arg1 << Static193.anInt4311) + Static225.anInt4810;
		arg4.anInt5609 = arg3;
		arg4.anInt5608 = (arg2 << Static193.anInt4311) + Static225.anInt4810;
		for (@Pc(28) Class243 local28 = local4.aClass243_3; local28 != null; local28 = local28.aClass243_11) {
			if (local28.aClass30_Sub1_2.aBoolean665) {
				@Pc(38) int local38 = local28.aClass30_Sub1_2.method7815();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt5609 += local8;
			arg4.aBoolean428 = true;
		} else if (local4.aClass30_Sub3_1 != null) {
			arg4.anInt5609 -= local4.aClass30_Sub3_1.aShort108;
		}
		local4.aClass30_Sub5_1 = arg4;
	}
}
