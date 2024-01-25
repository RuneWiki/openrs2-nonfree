import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_173 = new Class268(24, 6);

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Lclient!cq;")
	public static Class6_Sub9 method8156() {
		@Pc(6) Class6_Sub9 local6 = Static147.method2342();
		local6.aClass208_16 = null;
		local6.anInt1709 = 0;
		local6.aClass6_Sub40_Sub2_1 = new Class6_Sub40_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BI)Z")
	public static boolean method8157(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static15.aCharArray9[local7 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method8159(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIII)V")
	public static void method8160(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class6_Sub2_Sub9 local12 = Static144.method2332(4, arg0);
		local12.method3723();
		local12.anInt4293 = arg3;
		local12.anInt4291 = arg2;
		local12.anInt4294 = arg1;
	}
}
