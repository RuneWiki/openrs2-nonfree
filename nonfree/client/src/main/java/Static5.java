import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "Lclient!um;")
	public static Class244 aClass244_1;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	public static int anInt113;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "Z")
	public static boolean aBoolean13 = true;

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "Z")
	public static volatile boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!ki;)V")
	public static void method94(@OriginalArg(1) Class137 arg0) {
		Static75.aClass1_Sub11_Sub1_1.method3343(arg0.method2806());
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(CI)B")
	public static byte method95(@OriginalArg(0) char arg0) {
		@Pc(49) byte local49;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local49 = (byte) arg0;
		} else if (arg0 == '€') {
			local49 = -128;
		} else if (arg0 == '‚') {
			local49 = -126;
		} else if (arg0 == 'ƒ') {
			local49 = -125;
		} else if (arg0 == '„') {
			local49 = -124;
		} else if (arg0 == '…') {
			local49 = -123;
		} else if (arg0 == '†') {
			local49 = -122;
		} else if (arg0 == '‡') {
			local49 = -121;
		} else if (arg0 == 'ˆ') {
			local49 = -120;
		} else if (arg0 == '‰') {
			local49 = -119;
		} else if (arg0 == 'Š') {
			local49 = -118;
		} else if (arg0 == '‹') {
			local49 = -117;
		} else if (arg0 == 'Œ') {
			local49 = -116;
		} else if (arg0 == 'Ž') {
			local49 = -114;
		} else if (arg0 == '‘') {
			local49 = -111;
		} else if (arg0 == '’') {
			local49 = -110;
		} else if (arg0 == '“') {
			local49 = -109;
		} else if (arg0 == '”') {
			local49 = -108;
		} else if (arg0 == '•') {
			local49 = -107;
		} else if (arg0 == '–') {
			local49 = -106;
		} else if (arg0 == '—') {
			local49 = -105;
		} else if (arg0 == '˜') {
			local49 = -104;
		} else if (arg0 == '™') {
			local49 = -103;
		} else if (arg0 == 'š') {
			local49 = -102;
		} else if (arg0 == '›') {
			local49 = -101;
		} else if (arg0 == 'œ') {
			local49 = -100;
		} else if (arg0 == 'ž') {
			local49 = -98;
		} else if (arg0 == 'Ÿ') {
			local49 = -97;
		} else {
			local49 = 63;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!ic;)Lclient!sh;")
	public static Class1_Sub37 method96(@OriginalArg(1) int arg0, @OriginalArg(2) Class113 arg1) {
		@Pc(16) byte[] local16 = arg1.method2273(arg0);
		return local16 == null ? null : new Class1_Sub37(local16);
	}
}
