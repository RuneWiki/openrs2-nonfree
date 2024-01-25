import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!rl", name = "H", descriptor = "Z")
	public static boolean aBoolean554 = false;

	@OriginalMember(owner = "client!rl", name = "x", descriptor = "Z")
	public static boolean aBoolean555 = false;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
	public static final int anInt8347 = 1405;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V")
	public static void method7160() {
		Static543.aClass168_79.method3856();
		Static481.aClass168_67.method3856();
		Static267.aClass168_45.method3856();
		Static38.aClass168_9.method3856();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!sg;ILclient!ha;Lclient!rfa;)V")
	public static void method7161(@OriginalArg(0) Class5_Sub49 arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) Class313 arg2) {
		@Pc(10) Class155 local10 = arg2.method7058(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(17) int local17 = local10.method7213();
		if (local17 < local10.method7198()) {
			local17 = local10.method7198();
		}
		@Pc(33) int local33 = arg0.anInt8672;
		@Pc(41) int local41 = arg0.anInt8673;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(61) int local61;
		@Pc(84) int local84;
		if (arg2.aString93 != null) {
			local43 = Static511.aClass196_36.method4565(Static20.aStringArray4, arg2.aString93, (Class155[]) null, (int[]) null);
			for (local61 = 0; local61 < local43; local61++) {
				@Pc(67) String local67 = Static20.aStringArray4[local61];
				if (local61 < local43 - 1) {
					local67 = local67.substring(0, local67.length() - 4);
				}
				local84 = Static512.aClass371_11.method8491(local67);
				if (local84 > local45) {
					local45 = local84;
				}
			}
			local47 = local43 * Static512.aClass371_11.method8490() + Static512.aClass371_11.method8488() / 2;
		}
		local61 = local17 / 2 + arg0.anInt8672;
		if (local33 < Static491.anInt620 + local17) {
			local61 = local45 / 2 + local17 / 2 + Static491.anInt620 + 5 + 10;
			local33 = Static491.anInt620;
		} else if (local33 > Static491.anInt621 - local17) {
			local61 = Static491.anInt621 - local17 / 2 - local45 / 2 - 10 - 5;
			local33 = Static491.anInt621 - local17;
		}
		@Pc(173) int local173 = arg0.anInt8673;
		if (local41 < Static491.anInt627 + local17) {
			local41 = Static491.anInt627;
			local173 = Static491.anInt627 + local17 / 2 + 10;
		} else if (local41 > Static491.anInt628 - local17) {
			local173 = Static491.anInt628 - local17 / 2 - local47 - 10;
			local41 = Static491.anInt628 - local17;
		}
		local84 = (int) (Math.atan2((double) (local33 - arg0.anInt8672), (double) (local41 - arg0.anInt8673)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7211((float) local33 + (float) local17 / 2.0F, (float) local41 + (float) local17 / 2.0F, 4096, local84);
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		if (arg2.aString93 != null) {
			local257 = local61 - local45 / 2 - 5;
			local259 = local173;
			local261 = local45 + local257 + 10;
			local263 = Static512.aClass371_11.method8490() * local43 + local173 + 3;
			if (arg2.anInt8166 != 0) {
				arg1.method8644(local173, arg2.anInt8166, local261 - local257, local257, local263 - local173);
			}
			if (arg2.anInt8190 != 0) {
				arg1.method8620(local173, arg2.anInt8190, local261 - local257, local257, local263 - local173);
			}
			for (@Pc(333) int local333 = 0; local333 < local43; local333++) {
				@Pc(339) String local339 = Static20.aStringArray4[local333];
				if (local43 - 1 > local333) {
					local339 = local339.substring(0, local339.length() - 4);
				}
				Static512.aClass371_11.method8489(arg1, local339, local61, local173, arg2.anInt8173);
				local173 += Static512.aClass371_11.method8490();
			}
		}
		if (arg2.anInt8179 == -1 && arg2.aString93 == null) {
			return;
		}
		local17 >>= 0x1;
		@Pc(398) Class5_Sub52 local398 = new Class5_Sub52(arg0);
		local398.anInt10414 = local33 - local17;
		local398.anInt10420 = local259;
		local398.anInt10412 = local41 + local17;
		local398.anInt10417 = local263;
		local398.anInt10415 = local17 + local33;
		local398.anInt10411 = local257;
		local398.anInt10416 = local41 - local17;
		local398.anInt10419 = local261;
		Static542.aClass20_47.method370(local398);
	}
}
