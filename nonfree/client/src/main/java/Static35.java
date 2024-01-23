import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!hc;")
	public static Class51 aClass51_12;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt973;

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "S")
	public static short aShort9 = 256;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString45 = "Hidden";

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public static void method621() {
		if (Static157.anIntArray276 != null && Static120.anIntArray224 != null) {
			return;
		}
		Static120.anIntArray224 = new int[256];
		Static157.anIntArray276 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static157.anIntArray276[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static120.anIntArray224[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)Lclient!wi;")
	public static Class1_Sub2_Sub20 method622(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub20 local8 = (Class1_Sub2_Sub20) Static58.aClass58_7.method2093((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static227.aClass51_76.method1874(26, arg0);
		local8 = new Class1_Sub2_Sub20();
		if (local22 != null) {
			local8.method4203(new Class1_Sub13(local22));
		}
		Static58.aClass58_7.method2089((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Lclient!tg;")
	public static Class127 method624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class127 local14 = local7.aClass127_1;
			local7.aClass127_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IB)V")
	public static void method625() {
		Static201.aClass79_29.method2479(50);
		Static100.aClass79_15.method2479(50);
		Static47.aClass79_5.method2479(50);
	}
}
