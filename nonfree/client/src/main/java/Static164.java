import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
	public static int anInt3250;

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
	public static int anInt3253;

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
	public static int anInt3257;

	@OriginalMember(owner = "client!ln", name = "W", descriptor = "I")
	public static int anInt3258;

	@OriginalMember(owner = "client!ln", name = "Y", descriptor = "I")
	public static int anInt3260;

	@OriginalMember(owner = "client!ln", name = "L", descriptor = "Lclient!cc;")
	public static Class26 aClass26_30 = new Class26(4);

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "I")
	public static int anInt3256 = 64;

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "S")
	public static short aShort25 = 205;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method2657(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 = (local7 << 5) + Static20.method284(arg0.charAt(local12)) - local7;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public static void method2664(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static241.method3773(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V")
	public static void method2665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 8) {
			arg0 = 4;
		}
		if (arg0 == 4 && !Static303.aBoolean394) {
			arg0 = 2;
			arg1 = 2;
		}
		if (Static281.anInt5331 != arg0) {
			if (Static131.aBoolean175) {
				return;
			}
			if (Static281.anInt5331 != 0) {
				Static254.anInterface2Array1[Static281.anInt5331].method3520();
			}
			if (arg0 != 0) {
				@Pc(42) Interface2 local42 = Static254.anInterface2Array1[arg0];
				local42.method3521();
				local42.method3523(arg1);
			}
			Static11.anInt214 = arg1;
			Static281.anInt5331 = arg0;
		} else if (arg0 != 0 && Static11.anInt214 != arg1) {
			Static254.anInterface2Array1[arg0].method3523(arg1);
			Static11.anInt214 = arg1;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!fh;BII)Lclient!vn;")
	public static Class4_Sub3_Sub14_Sub1 method2667(@OriginalArg(0) Class58 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static12.method197(arg0, arg1, arg2) ? Static132.method2003() : null;
	}
}
