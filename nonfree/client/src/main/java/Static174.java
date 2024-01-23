import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Lclient!fh;")
	public static Class58 aClass58_76;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
	public static int anInt3336;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
	public static int anInt3335 = 0;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString206 = "Loading world list data";

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)[Lclient!ub;")
	public static Class172[] method2738() {
		if (Static102.aClass172Array1 == null) {
			@Pc(9) Class172[] local9 = Static39.method610(Static276.aClass139_4);
			@Pc(13) Class172[] local13 = new Class172[local9.length];
			@Pc(15) int local15 = 0;
			label54: for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
				@Pc(25) Class172 local25 = local9[local17];
				if ((local25.anInt5280 <= 0 || local25.anInt5280 >= 24) && local25.anInt5277 >= 800 && local25.anInt5276 >= 600) {
					for (@Pc(46) int local46 = 0; local46 < local15; local46++) {
						@Pc(53) Class172 local53 = local13[local46];
						if (local25.anInt5277 == local53.anInt5277 && local53.anInt5276 == local25.anInt5276) {
							if (local53.anInt5280 < local25.anInt5280) {
								local13[local46] = local25;
							}
							continue label54;
						}
					}
					local13[local15] = local25;
					local15++;
				}
			}
			Static102.aClass172Array1 = new Class172[local15];
			Static316.method73(local13, 0, Static102.aClass172Array1, 0, local15);
			@Pc(107) int[] local107 = new int[Static102.aClass172Array1.length];
			for (@Pc(109) int local109 = 0; local109 < Static102.aClass172Array1.length; local109++) {
				@Pc(117) Class172 local117 = Static102.aClass172Array1[local109];
				local107[local109] = local117.anInt5276 * local117.anInt5277;
			}
			Static15.method232(local107, Static102.aClass172Array1);
		}
		return Static102.aClass172Array1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)J")
	public static long method2739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub19 local7 = Static6.aClass4_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass182_1 == null ? 0L : local7.aClass182_1.aLong193;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BIILjava/awt/Component;)Lclient!ob;")
	public static Class59 method2740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("Class59_Sub1");
			@Pc(16) Class59 local16 = (Class59) local12.getDeclaredConstructor().newInstance();
			local16.method4279(arg2, arg1, arg0);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class59_Sub2 local29 = new Class59_Sub2();
			local29.method4279(arg2, arg1, arg0);
			return local29;
		}
	}
}
