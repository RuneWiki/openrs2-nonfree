import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString60;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
	public static int anInt4967;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method4050(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static27.method979(arg1, 0, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!bda;IB)V")
	public static void method4051(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray434 == null) {
			return;
		}
		@Pc(20) int local20 = arg0.anIntArray434[arg1 + 1];
		if (local20 == arg0.anInt8105) {
			return;
		}
		arg0.anInt8063 = 0;
		arg0.anInt8119 = 0;
		arg0.anInt8105 = local20;
		arg0.anInt8080 = 0;
		arg0.anInt8049 = 1;
		arg0.anInt8140 = arg0.anInt8137;
		if (arg0.anInt8105 != -1) {
			Static522.method7447(arg0, Static28.aClass220_1.method5670(arg0.anInt8105), arg0.anInt8063);
			return;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([BI)[B")
	public static byte[] method4052(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(18) byte[] local18 = new byte[local6];
		Static649.method5532(arg0, 0, local18, 0, local6);
		return local18;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)Lclient!qd;")
	public static Class227 method4053() {
		try {
			return (Class227) Class.forName("Class227_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method4054(@OriginalArg(0) Class8_Sub5_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static34.aClass86Array5 == Static253.aClass86Array4) {
			return;
		}
		@Pc(10) int local10 = Static86.aClass86Array2[arg1].method8088(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class86 local23 = Static86.aClass86Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method8088(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}
}
