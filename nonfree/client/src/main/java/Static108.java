import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "Lclient!am;")
	public static Class11 aClass11_48;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array5;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "Lclient!mk;")
	public static final Class130 aClass130_44 = new Class130();

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_36 = new Class154(5);

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "[S")
	public static final short[] aShortArray48 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
	public static int anInt2385 = 0;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
	public static final int anInt2386 = 52;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)Lclient!jj;")
	public static Class83_Sub1 method2007(@OriginalArg(1) int arg0) {
		return Static258.aBoolean449 && arg0 >= Static94.anInt2089 && Static165.anInt3375 >= arg0 ? Static340.aClass83_Sub1Array2[arg0 - Static94.anInt2089] : null;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[BIILjava/lang/String;I)I")
	public static int method2008(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(10) int local10 = arg3;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg2.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[arg0 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg1[arg0 + local17] = -128;
			} else if (local25 == '‚') {
				arg1[local17 + arg0] = -126;
			} else if (local25 == 'ƒ') {
				arg1[arg0 + local17] = -125;
			} else if (local25 == '„') {
				arg1[local17 + arg0] = -124;
			} else if (local25 == '…') {
				arg1[arg0 + local17] = -123;
			} else if (local25 == '†') {
				arg1[local17 + arg0] = -122;
			} else if (local25 == '‡') {
				arg1[arg0 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg1[arg0 + local17] = -120;
			} else if (local25 == '‰') {
				arg1[local17 + arg0] = -119;
			} else if (local25 == 'Š') {
				arg1[arg0 + local17] = -118;
			} else if (local25 == '‹') {
				arg1[arg0 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg1[arg0 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg1[local17 + arg0] = -114;
			} else if (local25 == '‘') {
				arg1[arg0 + local17] = -111;
			} else if (local25 == '’') {
				arg1[arg0 + local17] = -110;
			} else if (local25 == '“') {
				arg1[arg0 + local17] = -109;
			} else if (local25 == '”') {
				arg1[local17 + arg0] = -108;
			} else if (local25 == '•') {
				arg1[arg0 + local17] = -107;
			} else if (local25 == '–') {
				arg1[arg0 + local17] = -106;
			} else if (local25 == '—') {
				arg1[local17 + arg0] = -105;
			} else if (local25 == '˜') {
				arg1[local17 + arg0] = -104;
			} else if (local25 == '™') {
				arg1[local17 + arg0] = -103;
			} else if (local25 == 'š') {
				arg1[local17 + arg0] = -102;
			} else if (local25 == '›') {
				arg1[arg0 + local17] = -101;
			} else if (local25 == 'œ') {
				arg1[local17 + arg0] = -100;
			} else if (local25 == 'ž') {
				arg1[local17 + arg0] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[arg0 + local17] = -97;
			} else {
				arg1[local17 + arg0] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)V")
	public static void method2014() {
		@Pc(1) Class154 local1 = Static256.aClass154_80;
		synchronized (Static256.aClass154_80) {
			Static256.aClass154_80.method4220(5);
		}
	}
}
