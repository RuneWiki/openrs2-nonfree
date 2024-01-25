import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "Lclient!jea;")
	public static final Class173 aClass173_1 = new Class173();

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "Lclient!jea;")
	public static final Class173 aClass173_2 = new Class173();

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "Lclient!jea;")
	public static final Class173 aClass173_3 = new Class173();

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "Lclient!jea;")
	public static final Class173 aClass173_4 = new Class173();

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
	public static int anInt4671 = 13156520;

	@OriginalMember(owner = "client!jea", name = "l", descriptor = "Z")
	public static boolean aBoolean293 = false;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIZJ)Ljava/lang/String;")
	public static String method3979(@OriginalArg(1) int arg0, @OriginalArg(3) long arg1) {
		Static353.method5122(arg1);
		@Pc(22) Calendar local22 = Static43.aCalendar2;
		@Pc(26) int local26 = local22.get(5);
		@Pc(30) int local30 = local22.get(2);
		@Pc(34) int local34 = local22.get(1);
		@Pc(38) int local38 = local22.get(11);
		@Pc(42) int local42 = local22.get(12);
		return arg0 == 3 ? Static165.method2367(arg1, arg0) : Integer.toString(local26 / 10) + local26 % 10 + "-" + Static527.aStringArrayArray2[arg0][local30] + "-" + local34 + " " + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIIIII)V")
	public static void method3980(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) Class167[] local7 = Static539.aClass167Array1;
		for (@Pc(9) int local9 = 0; local9 < local7.length; local9++) {
			@Pc(15) Class167 local15 = local7[local9];
			if (local15 != null && local15.anInt4342 == 2) {
				Static378.method6989(arg2 >> 1, arg3 >> 1, local15.anInt4348, local15.anInt4343, local15.anInt4337 * 2, local15.anInt4344);
				if (Static574.anIntArray632[0] > -1 && Static90.anInt1698 % 20 < 10) {
					@Pc(65) Class9 local65 = Static371.aClass9Array110[local15.anInt4341];
					@Pc(74) int local74 = arg1 + Static574.anIntArray632[0] - 12;
					@Pc(82) int local82 = arg0 + Static574.anIntArray632[1] - 28;
					local65.method8920(local74, local82);
					Static629.method8681(local74 + local65.method8937(), local82, local82 + local65.method8930(), local74);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!aia;Lclient!qk;I)Lclient!iaa;")
	public static Class6_Sub26 method3981(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class289 arg1) {
		@Pc(8) Class6_Sub26 local8 = Static375.method5345();
		local8.aClass289_57 = arg1;
		local8.anInt3956 = arg1.anInt8268;
		if (local8.anInt3956 == -1) {
			local8.aClass6_Sub23_Sub1_2 = new Class6_Sub23_Sub1(260);
		} else if (local8.anInt3956 == -2) {
			local8.aClass6_Sub23_Sub1_2 = new Class6_Sub23_Sub1(10000);
		} else if (local8.anInt3956 <= 18) {
			local8.aClass6_Sub23_Sub1_2 = new Class6_Sub23_Sub1(20);
		} else if (local8.anInt3956 > 98) {
			local8.aClass6_Sub23_Sub1_2 = new Class6_Sub23_Sub1(260);
		} else {
			local8.aClass6_Sub23_Sub1_2 = new Class6_Sub23_Sub1(100);
		}
		local8.aClass6_Sub23_Sub1_2.method2879(arg0);
		local8.aClass6_Sub23_Sub1_2.method2874(local8.aClass289_57.method7045());
		local8.anInt3955 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(B)I")
	public static int method3983() {
		return Static42.aClass252_1.method6256();
	}
}
