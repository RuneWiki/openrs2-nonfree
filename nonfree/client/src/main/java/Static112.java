import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "[F")
	public static final float[] aFloatArray23 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!dw", name = "t", descriptor = "[Lclient!gba;")
	public static final Class3_Sub4_Sub8[] aClass3_Sub4_Sub8Array1 = new Class3_Sub4_Sub8[14];

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method2304(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static364.aClass51Array3 == Static2.aClass51Array1) {
			return;
		}
		@Pc(10) int local10 = Static559.aClass51Array4[arg1].method7839(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class51 local23 = Static559.aClass51Array4[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method7839(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I[Lclient!qk;Z)V")
	public static void method2305(@OriginalArg(0) int arg0, @OriginalArg(1) Class279[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class279 local9 = arg1[local3];
			if (local9 != null) {
				if (local9.anInt8204 == 0) {
					if (local9.aClass279Array2 != null) {
						method2305(arg0, local9.aClass279Array2);
					}
					@Pc(33) Class3_Sub29 local33 = (Class3_Sub29) Static356.aClass280_29.method7107((long) local9.anInt8185);
					if (local33 != null) {
						Static596.method8356(arg0, local33.anInt4601);
					}
				}
				@Pc(52) Class3_Sub21 local52;
				if (arg0 == 0 && local9.anObjectArray5 != null) {
					local52 = new Class3_Sub21();
					local52.aClass279_5 = local9;
					local52.anObjectArray1 = local9.anObjectArray5;
					Static304.method4843(local52);
				}
				if (arg0 == 1 && local9.anObjectArray3 != null) {
					if (local9.anInt8147 >= 0) {
						@Pc(78) Class279 local78 = Static433.method6771(local9.anInt8185);
						if (local78 == null || local78.aClass279Array2 == null || local9.anInt8147 >= local78.aClass279Array2.length || local78.aClass279Array2[local9.anInt8147] != local9) {
							continue;
						}
					}
					local52 = new Class3_Sub21();
					local52.anObjectArray1 = local9.anObjectArray3;
					local52.aClass279_5 = local9;
					Static304.method4843(local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(II)Lclient!sn;")
	public static Class312 method2306(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static571.aClass312Array1[arg0] : null;
	}
}
