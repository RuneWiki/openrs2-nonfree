import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!oq", name = "L", descriptor = "I")
	public static int anInt5568;

	@OriginalMember(owner = "client!oq", name = "O", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_133 = new Class263(39, 8);

	@OriginalMember(owner = "client!oq", name = "P", descriptor = "S")
	public static short aShort79 = 205;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(JLclient!za;B)V")
	public static void method4296(@OriginalArg(0) long arg0, @OriginalArg(1) Class106 arg1) {
		Static35.anInt977 = Static50.anInt1218;
		Static102.anInt2384 = 0;
		Static50.anInt1218 = 0;
		@Pc(14) long local14 = Static250.method3737();
		for (@Pc(26) Class41_Sub1 local26 = (Class41_Sub1) Static30.aClass117_1.method2967(); local26 != null; local26 = (Class41_Sub1) Static30.aClass117_1.method2970()) {
			if (local26.method874(arg1, arg0)) {
				Static102.anInt2384++;
			}
		}
		if (Static307.aBoolean368 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static30.aClass117_1.method2962() + ", running: " + Static102.anInt2384 + ". Particles: " + Static50.anInt1218 + ". Time taken: " + (Static250.method3737() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIZI)V")
	public static void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(17) int local17 = arg2 - 334;
		if (local17 < 0) {
			local17 = 0;
		} else if (local17 > 100) {
			local17 = 100;
		}
		@Pc(38) int local38 = local17 * (aShort79 - Static187.aShort54) / 100 + Static187.aShort54;
		if (Static134.aShort52 > local38) {
			local38 = Static134.aShort52;
		} else if (Static8.aShort1 < local38) {
			local38 = Static8.aShort1;
		}
		@Pc(68) int local68 = arg2 * 512 * local38 / (arg4 * 334);
		@Pc(102) int local102;
		@Pc(108) int local108;
		@Pc(73) short local73;
		if (Static307.aShort86 > local68) {
			local73 = Static307.aShort86;
			local38 = arg4 * 334 * local73 / (arg2 * 512);
			if (Static8.aShort1 < local38) {
				local38 = Static8.aShort1;
				local102 = arg2 * 512 * local38 / (local73 * 334);
				local108 = (arg4 - local102) / 2;
				if (arg3) {
					Static30.aClass106_3.va();
					Static30.aClass106_3.method5941(arg1, local108, arg0, arg2, -16777216);
					Static30.aClass106_3.method5941(arg1, local108, arg4 + arg0 - local108, arg2, -16777216);
				}
				arg4 -= local108 * 2;
				arg0 += local108;
			}
		} else if (Static324.aShort97 < local68) {
			local73 = Static324.aShort97;
			local38 = arg4 * 334 * local73 / (arg2 * 512);
			if (Static134.aShort52 > local38) {
				local38 = Static134.aShort52;
				local102 = arg4 * 334 * local73 / (local38 * 512);
				local108 = (arg2 - local102) / 2;
				if (arg3) {
					Static30.aClass106_3.va();
					Static30.aClass106_3.method5941(arg1, arg4, arg0, local108, -16777216);
					Static30.aClass106_3.method5941(arg1 + arg2 - local108, arg4, arg0, local108, -16777216);
				}
				arg2 -= local108 * 2;
				arg1 += local108;
			}
		}
		Static343.anInt6324 = local38 * arg2 / 334;
		Static265.anInt5119 = arg1;
		Static380.anInt6895 = (short) arg4;
		Static263.anInt5075 = arg0;
		Static133.anInt2957 = (short) arg2;
	}
}
