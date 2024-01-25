import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "[Lclient!sa;")
	public static Class8[] aClass8Array6;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!client;")
	public static client aClient4;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!rk;")
	public static Class180 aClass180_94;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!fp;")
	public static Class77 aClass77_10;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_66 = new Class103(50);

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString414 = "Loading...";

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public static int anInt6256 = 0;

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_67 = new Class103(64);

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZJI)Ljava/lang/String;")
	public static String method5273(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) int arg3) {
		@Pc(5) char local5 = ',';
		@Pc(8) char local8 = '.';
		if (arg3 == 0) {
			local5 = '.';
			local8 = ',';
		}
		if (arg3 == 2) {
			local8 = ' ';
		}
		@Pc(21) boolean local21 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local21 = true;
		}
		@Pc(37) StringBuffer local37 = new StringBuffer(26);
		@Pc(41) int local41;
		@Pc(45) int local45;
		if (arg0 > 0) {
			for (local41 = 0; local41 < arg0; local41++) {
				local45 = (int) arg2;
				arg2 /= 10L;
				local37.append((char) (local45 + 48 - (int) arg2 * 10));
			}
			local37.append(local5);
		}
		local41 = 0;
		while (true) {
			local45 = (int) arg2;
			arg2 /= 10L;
			local37.append((char) (local45 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local21) {
					local37.append('-');
				}
				return local37.reverse().toString();
			}
			if (arg1) {
				local41++;
				if (local41 % 3 == 0) {
					local37.append(local8);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class47 local13 = local7.aClass47_3; local13 != null; local13 = local13.aClass47_2) {
			@Pc(17) Class22_Sub2 local17 = local13.aClass22_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort83 == arg1 && local17.aShort81 == arg2) {
				Static179.method3305(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)Lclient!da;")
	public static Class46 method5278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class108[] local10 = null;
		@Pc(14) Class195 local14 = Static204.method3621(arg2);
		if (local14.anIntArray751 != null) {
			local10 = new Class108[local14.anIntArray751.length];
			for (@Pc(24) int local24 = 0; local24 < local10.length; local24++) {
				@Pc(32) Class114 local32 = Static353.method2010(local14.anIntArray751[local24]);
				local10[local24] = new Class108(local32.anInt3284, local32.anInt3282, local32.anInt3286, local32.anInt3283, local32.anInt3279, local32.anInt3277, local32.anInt3285, local32.aBoolean245);
			}
		}
		return new Class46(local14.anInt5904, local10, local14.anInt5911, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!rk;Lclient!pe;B)V")
	public static void method5279(@OriginalArg(0) Class180 arg0, @OriginalArg(1) Class89 arg1) {
		if (Static189.aBoolean293) {
			return;
		}
		arg1.method5405(0);
		Static326.aClass52_29 = arg1.method5411(Static358.method1304(arg0, Static258.anInt5003));
		Static326.aClass52_29.method4123((Static128.anInt2823 - Static326.aClass52_29.method4141()) / 2, (Static214.anInt4266 - Static326.aClass52_29.method4140()) / 2);
		Static149.aClass52_17 = arg1.method5411(Static358.method1304(arg0, Static219.anInt4373));
		Static149.aClass52_17.method4123((Static128.anInt2823 - Static149.aClass52_17.method4141()) / 2, 18);
		Static189.aBoolean293 = true;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)I")
	public static int method5281(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg1;
		}
	}
}
