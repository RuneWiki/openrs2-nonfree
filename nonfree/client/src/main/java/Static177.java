import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	public static int anInt3986;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
	public static int anInt3990;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	public static int anInt3987 = 0;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString116 = "Loaded defaults";

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "[Lclient!im;")
	public static Class1_Sub16[] aClass1_Sub16Array1 = new Class1_Sub16[2048];

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!ae;")
	public static Class5 method3221(@OriginalArg(0) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class5_Sub2");
			@Pc(10) Class5 local10 = (Class5) local6.getDeclaredConstructor().newInstance();
			local10.method1712(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class5_Sub1 local29 = new Class5_Sub1();
			local29.method1712(arg0, arg1, arg2);
			return local29;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[BI)Z")
	public static boolean method3222(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub16 local6 = new Class1_Sub16(arg1);
		@Pc(8) boolean local8 = true;
		@Pc(10) int local10 = -1;
		label71: while (true) {
			@Pc(22) int local22 = local6.method2647();
			if (local22 == 0) {
				return local8;
			}
			local10 += local22;
			@Pc(33) boolean local33 = false;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(78) int local78;
				@Pc(98) Class30 local98;
				do {
					@Pc(72) int local72;
					@Pc(68) int local68;
					do {
						do {
							do {
								do {
									@Pc(41) int local41;
									while (local33) {
										local41 = local6.method2618();
										if (local41 == 0) {
											continue label71;
										}
										local6.method2655();
									}
									local41 = local6.method2618();
									if (local41 == 0) {
										continue label71;
									}
									local35 += local41 - 1;
									@Pc(58) int local58 = local35 & 0x3F;
									@Pc(64) int local64 = local35 >> 6 & 0x3F;
									local68 = arg0 + local58;
									local72 = arg2 + local64;
									local78 = local6.method2655() >> 2;
								} while (local72 <= 0);
							} while (local68 <= 0);
						} while (local72 >= 103);
					} while (local68 >= 103);
					local98 = Static268.method4511(local10);
				} while (local78 == 22 && !Static135.aBoolean157 && local98.anInt877 == 0 && local98.anInt852 != 1 && !local98.aBoolean58);
				local33 = true;
				if (!local98.method685()) {
					local8 = false;
					Static58.anInt1513++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)I")
	public static int method3224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class91.anIntArray320[arg3 * 1024 / arg2] >> 1;
		return (arg0 * local21 >> 16) + ((65536 - local21) * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!ok;)Lclient!ok;")
	public static Class116 method3225(@OriginalArg(1) Class116 arg0) {
		if (arg0.anInt4344 != -1) {
			return Static115.method1897(arg0.anInt4344);
		}
		@Pc(20) int local20 = arg0.anInt4290 >>> 16;
		@Pc(25) Class109 local25 = new Class109(Static147.aClass117_12);
		for (@Pc(30) Class1_Sub12 local30 = (Class1_Sub12) local25.method3246(); local30 != null; local30 = (Class1_Sub12) local25.method3247()) {
			if (local20 == local30.anInt2230) {
				return Static115.method1897((int) local30.aLong201);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)I")
	public static int method3226(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(9) int local9 = arg1;
			arg1 = arg0;
			arg0 = local9;
		}
		@Pc(21) int local21 = arg3 & 0x3;
		if (local21 == 0) {
			return arg2;
		} else if (local21 == 1) {
			return arg5;
		} else if (local21 == 2) {
			return 7 + 1 - arg2 - arg1;
		} else {
			return 7 + 1 - arg5 - arg0;
		}
	}
}
