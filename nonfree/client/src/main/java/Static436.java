import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "[C")
	public static final char[] aCharArray10 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString87 = "";

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIILclient!jb;)V")
	public static void method6199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1_Sub4 arg3) {
		@Pc(4) Class360 local4 = Static570.method7679(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass11_Sub1_Sub4_1 = arg3;
		@Pc(16) int local16 = Static310.aClass129Array5 == Static150.aClass129Array4 ? 1 : 0;
		if (arg3.method7209()) {
			if (arg3.method7217()) {
				Static267.aClass11_Sub1ArrayArray2[local16][Static512.anIntArray540[local16]++] = arg3;
				return;
			}
			Static319.aClass11_Sub1ArrayArray3[local16][Static420.anIntArray440[local16]++] = arg3;
			return;
		}
		Static176.aClass11_Sub1ArrayArray1[local16][Static275.anIntArray276[local16]++] = arg3;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IB)V")
	public static void method6201(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub8_Sub9 local13 = Static465.method6470(arg0, 11);
		local13.method4835();
	}
}
