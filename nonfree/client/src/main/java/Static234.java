import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static int anInt4890;

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "Lclient!ak;")
	public static Class7 aClass7_192;

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	public static int anInt4892;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	public static int anInt4889 = 0;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString159 = "";

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString160 = "Select";

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIII)V")
	public static void method3732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class114 local3 = new Class114();
		local3.anInt3049 = arg1 / 128;
		local3.anInt3043 = arg2 / 128;
		local3.anInt3064 = arg3 / 128;
		local3.anInt3048 = arg4 / 128;
		local3.anInt3050 = arg0;
		local3.anInt3042 = arg1;
		local3.anInt3055 = arg2;
		local3.anInt3044 = arg3;
		local3.anInt3062 = arg4;
		local3.anInt3058 = arg5;
		local3.anInt3045 = arg6;
		Static73.aClass114Array1[Static245.anInt1244++] = local3;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	public static void method3733() {
		@Pc(3) int local3;
		@Pc(11) int local11;
		for (local3 = -1; local3 < Static241.anInt4977; local3++) {
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static143.anIntArray331[local3];
			}
			@Pc(21) Class6_Sub6_Sub2 local21 = Static77.aClass6_Sub6_Sub2Array1[local11];
			if (local21 != null && local21.anInt4563 > 0) {
				local21.anInt4563--;
				if (local21.anInt4563 == 0) {
					local21.aString145 = null;
				}
			}
		}
		for (local3 = 0; local3 < Static293.anInt5831; local3++) {
			local11 = Static75.anIntArray178[local3];
			@Pc(69) Class6_Sub6_Sub1 local69 = Static211.aClass6_Sub6_Sub1Array2[local11];
			if (local69 != null && local69.anInt4563 > 0) {
				local69.anInt4563--;
				if (local69.anInt4563 == 0) {
					local69.aString145 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
	public static void method3735() {
		Static270.aClass1_Sub18_Sub1_3.method3130(138);
		Static270.aClass1_Sub18_Sub1_3.method3123(Static170.anInt3124);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
	public static void method3736() {
		Static214.aClass31_34.method855();
		Static185.aClass31_27.method855();
		Static212.aClass31_38.method855();
		Static100.aClass31_16.method855();
	}
}
