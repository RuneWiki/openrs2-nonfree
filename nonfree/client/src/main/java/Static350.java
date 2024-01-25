import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "Lclient!jt;")
	public static Class159 aClass159_6;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
	public static int anInt6854;

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "Z")
	public static boolean aBoolean546 = false;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[Lclient!sba;I)V")
	public static void method5731(@OriginalArg(1) Class302[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class302 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt8936 == 0) {
					if (local9.aClass302Array2 != null) {
						method5731(local9.aClass302Array2, arg1);
					}
					@Pc(33) Class6_Sub25 local33 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local9.anInt8867);
					if (local33 != null) {
						Static375.method5973(arg1, local33.anInt5034);
					}
				}
				@Pc(52) Class6_Sub29 local52;
				if (arg1 == 0 && local9.anObjectArray29 != null) {
					local52 = new Class6_Sub29();
					local52.anObjectArray1 = local9.anObjectArray29;
					local52.aClass302_7 = local9;
					Static435.method6669(local52);
				}
				if (arg1 == 1 && local9.anObjectArray25 != null) {
					if (local9.anInt8898 >= 0) {
						@Pc(80) Class302 local80 = Static299.method5103(local9.anInt8867);
						if (local80 == null || local80.aClass302Array2 == null || local80.aClass302Array2.length <= local9.anInt8898 || local80.aClass302Array2[local9.anInt8898] != local9) {
							continue;
						}
					}
					local52 = new Class6_Sub29();
					local52.aClass302_7 = local9;
					local52.anObjectArray1 = local9.anObjectArray25;
					Static435.method6669(local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Z")
	public static boolean method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static27.method743(arg0, arg1) | (arg0 & 0x10000) != 0 || Static612.method8392(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static405.method6339(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(III[B[BIIII)V")
	public static void method5734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(25) int local25 = -arg0; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg1++;
				arg4[local33] = (byte) (arg4[local33] - arg3[arg2++]);
				@Pc(46) int local46 = arg1++;
				arg4[local46] = (byte) (arg4[local46] - arg3[arg2++]);
				@Pc(59) int local59 = arg1++;
				arg4[local59] = (byte) (arg4[local59] - arg3[arg2++]);
				@Pc(72) int local72 = arg1++;
				arg4[local72] = (byte) (arg4[local72] - arg3[arg2++]);
			}
			for (@Pc(91) int local91 = local15; local91 < 0; local91++) {
				local33 = arg1++;
				arg4[local33] = (byte) (arg4[local33] - arg3[arg2++]);
			}
			arg2 += arg5;
			arg1 += arg6;
		}
	}
}
