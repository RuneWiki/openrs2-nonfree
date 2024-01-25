import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_185 = new Class186(90, 8);

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
	public static void method8801() {
		Static74.aClass140_2.method3532();
		Static321.aClass124_7.method2960();
		Static208.aClass29_2.method642();
		Static70.aClass323_1.method7794();
		Static631.aClass85_2.method2216();
		Static243.aClass406_2.method9392();
		Static59.aClass177_1.method4262();
		Static660.aClass307_2.method7491();
		Static135.aClass248_1.method6083();
		Static494.aClass45_1.method897();
		Static101.aClass125_1.method2987();
		Static455.aClass227_1.method5138();
		Static255.aClass238_1.method5900();
		Static567.aClass405_3.method9355();
		Static462.aClass98_2.method2453();
		Static12.aClass94_1.method2431();
		Static646.aClass106_1.method2679();
		Static103.aClass114_1.method2788();
		Static102.aClass126_1.method2992();
		Static605.aClass122_1.method2900();
		Static621.aClass336_2.method7999();
		Static308.aClass321_1.method7785();
		Static610.aClass116_2.method2797();
		Static278.method4242();
		Static219.method3495();
		Static108.method1952();
		Static220.method3501();
		Static449.method6664();
		Static345.aClass338_32.method8047();
		Static670.aClass338_61.method8047();
		Static297.aClass338_27.method8047();
		Static416.aClass338_40.method8047();
		Static185.aClass338_15.method8047();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIBII)V")
	public static void method8803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = arg3;
		@Pc(19) int local19 = -arg3;
		@Pc(21) int local21 = -1;
		Static482.method7040(arg0, arg2 - arg3, Static384.anIntArrayArray38[arg1], arg2 + arg3);
		while (local16 > local7) {
			local21 += 2;
			local7++;
			local19 += local21;
			if (local19 >= 0) {
				local16--;
				local19 -= local16 << 1;
				@Pc(58) int[] local58 = Static384.anIntArrayArray38[local16 + arg1];
				@Pc(65) int[] local65 = Static384.anIntArrayArray38[arg1 - local16];
				@Pc(69) int local69 = local7 + arg2;
				@Pc(74) int local74 = arg2 - local7;
				Static482.method7040(arg0, local74, local58, local69);
				Static482.method7040(arg0, local74, local65, local69);
			}
			@Pc(90) int local90 = local16 + arg2;
			@Pc(95) int local95 = arg2 - local16;
			@Pc(101) int[] local101 = Static384.anIntArrayArray38[arg1 + local7];
			@Pc(108) int[] local108 = Static384.anIntArrayArray38[arg1 - local7];
			Static482.method7040(arg0, local95, local101, local90);
			Static482.method7040(arg0, local95, local108, local90);
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public static void method8804() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static362.anInt8653; local16++) {
			for (@Pc(20) int local20 = 0; local20 < Static206.anInt11291; local20++) {
				if (Static472.method6962(local20, true, Static584.aClass262ArrayArrayArray2, local7, local16)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
