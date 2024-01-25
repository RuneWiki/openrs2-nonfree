import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "Lclient!an;")
	public static Class16 aClass16_28;

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLclient!gq;)V")
	public static void method2238(@OriginalArg(1) Class12_Sub17 arg0) {
		if (Static120.aClass37ArrayArrayArray1 == null) {
			return;
		}
		@Pc(13) Interface19 local13 = null;
		if (arg0.anInt3848 == 0) {
			local13 = (Interface19) Static324.method5105(arg0.anInt3849, arg0.anInt3846, arg0.anInt3840);
		}
		if (arg0.anInt3848 == 1) {
			local13 = (Interface19) Static533.method7882(arg0.anInt3849, arg0.anInt3846, arg0.anInt3840);
		}
		if (arg0.anInt3848 == 2) {
			local13 = (Interface19) Static531.method7866(arg0.anInt3849, arg0.anInt3846, arg0.anInt3840, wf.class);
		}
		if (arg0.anInt3848 == 3) {
			local13 = (Interface19) Static160.method3298(arg0.anInt3849, arg0.anInt3846, arg0.anInt3840);
		}
		if (local13 == null) {
			arg0.anInt3842 = -1;
			arg0.anInt3838 = 0;
			arg0.anInt3845 = 0;
		} else {
			arg0.anInt3842 = local13.method7915();
			arg0.anInt3838 = local13.method7918();
			arg0.anInt3845 = local13.method7919();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)[Lclient!af;")
	public static Class10[] method2240() {
		if (Static510.aClass10Array1 == null) {
			@Pc(12) Class10[] local12 = Static396.method6218(Static375.aClass71_3);
			@Pc(16) Class10[] local16 = new Class10[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(62) int local62;
			@Pc(68) Class10 local68;
			label63: for (@Pc(20) int local20 = 0; local20 < local12.length; local20++) {
				@Pc(26) Class10 local26 = local12[local20];
				if ((local26.anInt151 <= 0 || local26.anInt151 >= 24) && local26.anInt154 >= 800 && local26.anInt155 >= 600 && (Static458.anInt8335 >= 96 || Static148.anInt6867 != 0 || local26.anInt154 <= 1024 && local26.anInt155 <= 768)) {
					for (local62 = 0; local62 < local18; local62++) {
						local68 = local16[local62];
						if (local26.anInt154 == local68.anInt154 && local68.anInt155 == local26.anInt155) {
							if (local68.anInt151 < local26.anInt151) {
								local16[local62] = local26;
							}
							continue label63;
						}
					}
					local16[local18] = local26;
					local18++;
				}
			}
			Static510.aClass10Array1 = new Class10[local18];
			Static554.method3497(local16, 0, Static510.aClass10Array1, 0, local18);
			@Pc(124) int[] local124 = new int[Static510.aClass10Array1.length];
			for (local62 = 0; local62 < Static510.aClass10Array1.length; local62++) {
				local68 = Static510.aClass10Array1[local62];
				local124[local62] = local68.anInt154 * local68.anInt155;
			}
			Static504.method7479(local124, Static510.aClass10Array1);
		}
		return Static510.aClass10Array1;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)Z")
	public static boolean method2241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static486.method7266(arg1, arg0) || Static226.method4100(arg1, arg0);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBZIIILclient!an;)V")
	public static void method2242(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class16 arg3) {
		Static512.anInt9218 = arg1;
		Static111.anInt2588 = 1;
		Static444.aClass16_104 = arg3;
		Static83.anInt2006 = 0;
		Static340.aBoolean475 = false;
		Static105.anInt2408 = arg2;
		Static224.anInt8484 = Static493.aClass12_Sub13_Sub2_3.method4265() / arg0;
		if (Static224.anInt8484 < 1) {
			Static224.anInt8484 = 1;
		}
	}
}
