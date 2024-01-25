import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
	public static int anInt7103;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	public static int anInt7100 = -1;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(II)Lclient!qm;")
	public static Class3_Sub4_Sub18 method5957(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub18 local10 = (Class3_Sub4_Sub18) Static567.aClass13_3.method324((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static300.aClass221_87.method5089(0, arg0);
		if (local21 == null || local21.length <= 1) {
			return null;
		}
		try {
			local10 = Static476.method6993(local21);
		} catch (@Pc(38) Exception local38) {
			throw new RuntimeException(local38.getMessage() + " S: " + arg0);
		}
		Static567.aClass13_3.method322(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)I")
	public static int method5958(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)[Lclient!qq;")
	public static Class309[] method5960() {
		return new Class309[] { Static504.aClass309_1, Static504.aClass309_2, Static504.aClass309_3, Static504.aClass309_4, Static504.aClass309_5, Static504.aClass309_6, Static504.aClass309_7, Static504.aClass309_8, Static504.aClass309_9, Static504.aClass309_10, Static504.aClass309_11, Static504.aClass309_12, Static504.aClass309_13 };
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIII)V")
	public static void method5961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg3;
		@Pc(14) int local14 = arg4 - arg2;
		if (local14 == 0) {
			if (local10 != 0) {
				Static679.method8950(arg2, arg1, arg3, arg0);
			}
		} else if (local10 == 0) {
			Static580.method7996(arg3, arg2, arg1, arg4);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(65) boolean local65 = local14 < local10;
			@Pc(69) int local69;
			@Pc(73) int local73;
			if (local65) {
				local69 = arg2;
				arg2 = arg3;
				local73 = arg4;
				arg3 = local69;
				arg4 = arg0;
				arg0 = local73;
			}
			if (arg4 < arg2) {
				local69 = arg2;
				local73 = arg3;
				arg2 = arg4;
				arg4 = local69;
				arg3 = arg0;
				arg0 = local73;
			}
			local69 = arg3;
			local73 = arg4 - arg2;
			@Pc(115) int local115 = arg0 - arg3;
			@Pc(120) int local120 = -(local73 >> 1);
			if (local115 < 0) {
				local115 = -local115;
			}
			@Pc(140) int local140 = arg0 <= arg3 ? -1 : 1;
			@Pc(144) int local144;
			if (local65) {
				for (local144 = arg2; local144 <= arg4; local144++) {
					Static384.anIntArrayArray38[local144][local69] = arg1;
					local120 += local115;
					if (local120 > 0) {
						local120 -= local73;
						local69 += local140;
					}
				}
			} else {
				for (local144 = arg2; local144 <= arg4; local144++) {
					Static384.anIntArrayArray38[local69][local144] = arg1;
					local120 += local115;
					if (local120 > 0) {
						local120 -= local73;
						local69 += local140;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZI)V")
	public static void method5962() {
		Static271.aClass338_24.method8052(5);
	}
}
