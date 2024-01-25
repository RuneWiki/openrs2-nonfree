import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "Lclient!im;")
	public static final Class140 aClass140_45 = new Class140(58, 12);

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
	public static int anInt2511 = 0;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
	public static int anInt2517 = -50;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z[Lclient!jq;I)V")
	public static void method2109(@OriginalArg(1) Class156[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0.length; local8++) {
			@Pc(14) Class156 local14 = arg0[local8];
			if (local14 != null) {
				if (local14.anInt4735 == 0) {
					if (local14.aClass156Array1 != null) {
						method2109(local14.aClass156Array1, arg1);
					}
					@Pc(35) Class1_Sub35 local35 = (Class1_Sub35) Static468.aClass17_36.method738((long) local14.anInt4677);
					if (local35 != null) {
						Static168.method4650(arg1, local35.anInt6103);
					}
				}
				@Pc(51) Class1_Sub30 local51;
				if (arg1 == 0 && local14.anObjectArray27 != null) {
					local51 = new Class1_Sub30();
					local51.aClass156_11 = local14;
					local51.anObjectArray36 = local14.anObjectArray27;
					Static180.method2683(local51);
				}
				if (arg1 == 1 && local14.anObjectArray29 != null) {
					if (local14.anInt4723 >= 0) {
						@Pc(79) Class156 local79 = Static182.method2888(local14.anInt4677);
						if (local79 == null || local79.aClass156Array1 == null || local14.anInt4723 >= local79.aClass156Array1.length || local14 != local79.aClass156Array1[local14.anInt4723]) {
							continue;
						}
					}
					local51 = new Class1_Sub30();
					local51.anObjectArray36 = local14.anObjectArray29;
					local51.aClass156_11 = local14;
					Static180.method2683(local51);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIBI)I")
	public static int method2110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static385.anInt6975 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(25) int local25 = arg0 - Static118.anInt815;
		@Pc(30) int local30 = arg2 - Static118.anInt813;
		for (@Pc(35) Class1_Sub39 local35 = (Class1_Sub39) Static118.aClass37_11.method977(); local35 != null; local35 = (Class1_Sub39) Static118.aClass37_11.method971()) {
			if (local35.anInt7253 == arg1) {
				@Pc(44) int local44 = local35.anInt7249;
				@Pc(47) int local47 = local35.anInt7250;
				@Pc(57) int local57 = Static118.anInt813 + local47 | Static118.anInt815 + local44 << 14;
				@Pc(75) int local75 = (local30 - local47) * (-local47 + local30) + (local25 - local44) * (local25 - local44);
				if (local14 < 0 || local16 > local75) {
					local14 = local57;
					local16 = local75;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)I")
	public static int method2114(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
