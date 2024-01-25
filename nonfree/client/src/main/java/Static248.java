import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "Lclient!lg;")
	public static Class60 aClass60_22;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_112 = new Class130();

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "[I")
	public static final int[] anIntArray425 = new int[25];

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4308(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static323.method5319("%0a", "\n", arg0));
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	public static void method4309() {
		Static301.aClass198_34.method5260();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILclient!nk;)V")
	public static void method4310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub5 arg3) {
		if (Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static333.method78(arg0, arg1, arg2);
		}
		Static18.aClass57ArrayArrayArray1[arg0][arg1][arg2].aClass2_Sub5_1 = arg3;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!vm;)V")
	public static void method4311(@OriginalArg(1) Class92 arg0) {
		if (Static173.aBoolean319) {
			Static72.method1363(arg0);
		} else {
			Static212.method3690(arg0);
		}
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)Lclient!ir;")
	public static Class4_Sub20 method4312() {
		if (Static42.aClass130_46 == null || Static179.aClass140_1 == null) {
			return null;
		}
		for (@Pc(21) Class4_Sub20 local21 = (Class4_Sub20) Static179.aClass140_1.method3688(); local21 != null; local21 = (Class4_Sub20) Static179.aClass140_1.method3688()) {
			@Pc(28) Class139 local28 = Static20.method377(local21.anInt3082);
			if (local28 != null && local28.aBoolean372 && local28.method3656()) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!nj;Z)Z")
	public static boolean method4313(@OriginalArg(0) Class139 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean370) {
			return false;
		} else if (!arg0.method3656()) {
			return false;
		} else if (Static51.aClass198_9.method5261((long) arg0.anInt4372) == null) {
			return Static103.aClass198_20.method5261((long) arg0.anInt4370) == null;
		} else {
			return false;
		}
	}
}
