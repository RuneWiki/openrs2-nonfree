import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
	public static int anInt4017;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILclient!wv;I)I")
	public static int method3409(@OriginalArg(0) int arg0, @OriginalArg(1) Class365 arg1) {
		if (!Static72.method1565(arg1).method4810(arg0) && arg1.anObjectArray15 == null) {
			return -1;
		} else if (arg1.anIntArray637 == null || arg0 >= arg1.anIntArray637.length) {
			return -1;
		} else {
			return arg1.anIntArray637[arg0];
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!kr;I)I")
	public static int method3412(@OriginalArg(0) Class1_Sub23 arg0) {
		@Pc(12) String local12 = Static209.method3524(arg0);
		@Pc(14) int[] local14 = null;
		if (Static228.method3763(arg0.anInt5147)) {
			local14 = Static46.aClass234_1.method5390((int) arg0.aLong215).anIntArray592;
		} else if (arg0.anInt5143 != -1) {
			local14 = Static46.aClass234_1.method5390(arg0.anInt5143).anIntArray592;
		} else if (Static83.method1702(arg0.anInt5147)) {
			@Pc(47) Class1_Sub39 local47 = (Class1_Sub39) Static131.aClass356_32.method7796((long) arg0.aLong215);
			if (local47 != null) {
				@Pc(52) Class20_Sub2_Sub4_Sub1_Sub2 local52 = local47.aClass20_Sub2_Sub4_Sub1_Sub2_2;
				@Pc(55) Class162 local55 = local52.aClass162_1;
				if (local55.anIntArray267 != null) {
					local55 = local55.method3802(Static121.aClass148_1);
				}
				if (local55 != null) {
					local14 = local55.anIntArray266;
				}
			}
		} else if (Static376.method5467(arg0.anInt5147)) {
			@Pc(89) Class306 local89;
			if (arg0.anInt5147 == 1011) {
				local89 = Static146.aClass214_1.method4897((int) arg0.aLong215);
			} else {
				local89 = Static146.aClass214_1.method4897((int) (arg0.aLong215 >>> 32 & 0x7FFFFFFFL));
			}
			if (local89.anIntArray570 != null) {
				local89 = local89.method6966(Static121.aClass148_1);
			}
			if (local89 != null) {
				local14 = local89.anIntArray573;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static311.method4774(local14);
		}
		@Pc(141) int local141 = Static566.aClass13_15.method465(Static206.aClass10Array13, local12);
		if (arg0.aBoolean390) {
			local141 += Static276.aClass10_18.E() + 4;
		}
		return local141;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
	public static void method3416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static566.aClass13_15.method463(Static103.aClass77_26.method1864(Static562.anInt9127));
		@Pc(24) int local24;
		for (@Pc(18) Class1_Sub23 local18 = (Class1_Sub23) Static3.aClass361_1.method7854(); local18 != null; local18 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
			local24 = method3412(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static135.anInt2684 * 16 + 21;
		@Pc(50) int local50 = arg0 - local13 / 2;
		if (Static443.anInt7718 < local13 + local50) {
			local50 = Static443.anInt7718 - local13;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(66) int local66 = arg1;
		if (Static300.anInt5516 < arg1 + local24) {
			local66 = Static300.anInt5516 - local24;
		}
		Static215.anInt4176 = local50;
		if (local66 < 0) {
			local66 = 0;
		}
		Static294.aBoolean407 = true;
		Static100.anInt2087 = Static135.anInt2684 * 16 + (Static268.aBoolean383 ? 26 : 22);
		Static2.anInt57 = local66;
		Static86.anInt1957 = local13;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BIII)V")
	public static void method3418(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(11, arg1);
		local8.method491();
		local8.anInt548 = arg2;
		local8.anInt545 = arg0;
	}
}
