import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Lclient!ch;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[6][];

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_90 = new Class319(72, 3);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!nu;)I")
	public static int method4258(@OriginalArg(1) Class20_Sub2_Sub4_Sub1_Sub2 arg0) {
		@Pc(13) Class162 local13 = arg0.aClass162_1;
		if (local13.anIntArray267 != null) {
			local13 = local13.method3802(Static121.aClass148_1);
			if (local13 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local13.anInt4398;
		@Pc(32) Class138 local32 = arg0.method5346();
		if (arg0.aBoolean457) {
			local28 = local13.anInt4420;
		} else if (arg0.anInt6454 == local32.anInt3973 || arg0.anInt6454 == local32.anInt3976 || local32.anInt3971 == arg0.anInt6454 || arg0.anInt6454 == local32.anInt3981) {
			local28 = local13.anInt4405;
		} else if (local32.anInt3966 == arg0.anInt6454 || local32.anInt3987 == arg0.anInt6454 || local32.anInt4003 == arg0.anInt6454 || arg0.anInt6454 == local32.anInt4000) {
			local28 = local13.anInt4407;
		}
		return local28;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZBZII)I")
	public static int method4260(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class1_Sub46 local10 = Static365.method5363(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray577.length; local23++) {
			if (local10.anIntArray577[local23] >= 0 && Static46.aClass234_1.anInt6530 > local10.anIntArray577[local23]) {
				@Pc(48) Class322 local48 = Static46.aClass234_1.method5390(local10.anIntArray577[local23]);
				@Pc(58) int local58 = local48.method7109(arg1, Static88.aClass183_1.method4071(arg1).anInt2858);
				if (arg0) {
					local21 += local10.anIntArray576[local23] * local58;
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLclient!ni;II)V")
	public static void method4261(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg0 << 14 | arg3 << 28 | arg2);
		@Pc(22) Class1_Sub37 local22 = (Class1_Sub37) Static186.aClass356_13.method7796(local16);
		if (local22 == null) {
			local22 = new Class1_Sub37();
			Static186.aClass356_13.method7800(local16, local22);
			local22.aClass361_66.method7855(arg1);
			return;
		}
		@Pc(45) Class322 local45 = Static46.aClass234_1.method5390(arg1.anInt6203);
		@Pc(48) int local48 = local45.anInt8618;
		if (local45.anInt8612 == 1) {
			local48 *= arg1.anInt6204 + 1;
		}
		for (@Pc(77) Class1_Sub34 local77 = (Class1_Sub34) local22.aClass361_66.method7854(); local77 != null; local77 = (Class1_Sub34) local22.aClass361_66.method7853()) {
			local45 = Static46.aClass234_1.method5390(local77.anInt6203);
			@Pc(90) int local90 = local45.anInt8618;
			if (local45.anInt8612 == 1) {
				local90 *= local77.anInt6204 + 1;
			}
			if (local48 > local90) {
				Static476.method6702(arg1, local77);
				return;
			}
		}
		local22.aClass361_66.method7855(arg1);
	}
}
