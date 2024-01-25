import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cs", name = "d", descriptor = "Lclient!wn;")
	public static Class92 aClass92_2;

	@OriginalMember(owner = "client!cs", name = "h", descriptor = "I")
	public static int anInt1241;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "I")
	public static int anInt1237 = 0;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "[B")
	public static final byte[] aByteArray17 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "Z")
	public static final boolean aBoolean107 = false;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IBI)Z")
	public static boolean method1107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static272.method4135(arg1, arg0) | (arg1 & 0x40000) != 0 || Static73.method1405(arg1, arg0);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(ZZLclient!ht;I)V")
	public static void method1108(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6_Sub16 arg2) {
		@Pc(8) int local8 = arg2.anInt2715;
		@Pc(12) int local12 = (int) arg2.aLong217;
		arg2.method5977();
		if (arg1) {
			Static25.method5897(local8);
		}
		Static445.method5944(local8);
		@Pc(27) Class239 local27 = Static299.method4387(local12);
		if (local27 != null) {
			Static354.method4992(local27);
		}
		Static281.method4243();
		if (!arg0 && Static313.anInt5099 != -1) {
			Static277.method4189(1, Static313.anInt5099);
		}
		@Pc(53) Class123 local53 = new Class123(Static20.aClass137_3);
		for (@Pc(65) Class6_Sub16 local65 = (Class6_Sub16) local53.method2751(); local65 != null; local65 = (Class6_Sub16) local53.method2752()) {
			if (!local65.method5980()) {
				local65 = (Class6_Sub16) local53.method2751();
				if (local65 == null) {
					return;
				}
			}
			if (local65.anInt2717 == 3) {
				@Pc(91) int local91 = (int) local65.aLong217;
				if (local91 >>> 16 == local8) {
					method1108(arg0, true, local65);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLclient!qq;)V")
	public static void method1110(@OriginalArg(1) Class28 arg0) {
		if (Static312.aBoolean355) {
			Static434.method5879(arg0);
		} else {
			Static166.method2710(arg0);
		}
	}
}
