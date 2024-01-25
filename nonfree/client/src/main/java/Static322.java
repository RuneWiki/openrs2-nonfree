import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "Lclient!ob;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Z")
	public static boolean aBoolean623;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
	public static int anInt5502 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lclient!we;")
	public static Class1_Sub30 method4323(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class1_Sub30_Sub2");
			@Pc(10) Class1_Sub30 local10 = (Class1_Sub30) local6.getDeclaredConstructor().newInstance();
			local10.method4039(arg0);
			return local10;
		} catch (@Pc(17) Throwable local17) {
			@Pc(21) Class1_Sub30_Sub1 local21 = new Class1_Sub30_Sub1();
			local21.method4039(arg0);
			return local21;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIIILclient!fo;I)V")
	public static void method4324(@OriginalArg(2) int arg0, @OriginalArg(4) Class82 arg1, @OriginalArg(5) int arg2) {
		Static72.anInt1316 = 0;
		Static31.anInt497 = 10000;
		Static303.anInt7492 = arg0;
		Static48.anInt814 = arg2;
		Static2.aClass82_1 = arg1;
		Static128.aBoolean263 = false;
		Static255.anInt1147 = 1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!ir;I)V")
	public static void method4325(@OriginalArg(1) int arg0, @OriginalArg(2) Class25_Sub5_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt4270 == arg0 && arg0 != -1) {
			@Pc(17) Class177 local17 = Static174.aClass254_1.method5670(arg0);
			@Pc(20) int local20 = local17.anInt5037;
			if (local20 == 1) {
				arg1.anInt4277 = 0;
				arg1.lb = 1;
				arg1.anInt4271 = 0;
				arg1.anInt4235 = arg2;
				arg1.anInt4301 = 0;
				Static70.method1141(local17, arg1.aByte94, arg1.anInt5518, arg1.anInt5514, false, arg1.anInt4301);
			}
			if (local20 == 2) {
				arg1.anInt4277 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt4270 == -1 || Static174.aClass254_1.method5670(arg0).anInt5039 >= Static174.aClass254_1.method5670(arg1.anInt4270).anInt5039) {
			arg1.anInt4235 = arg2;
			arg1.anInt4316 = arg1.anInt4314;
			arg1.anInt4277 = 0;
			arg1.anInt4301 = 0;
			arg1.anInt4271 = 0;
			arg1.lb = 1;
			arg1.anInt4270 = arg0;
			if (arg1.anInt4270 != -1) {
				Static70.method1141(Static174.aClass254_1.method5670(arg1.anInt4270), arg1.aByte94, arg1.anInt5518, arg1.anInt5514, false, arg1.anInt4301);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
	public static int method4327(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(18) int local18 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
