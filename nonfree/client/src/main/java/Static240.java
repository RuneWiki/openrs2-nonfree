import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString48 = null;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_84 = new Class253(51, 5);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZILjava/lang/String;[BII)I")
	public static int method3260(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = arg3;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg1.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg2[local12 + arg0] = (byte) local20;
			} else if (local20 == '€') {
				arg2[local12 + arg0] = -128;
			} else if (local20 == '‚') {
				arg2[local12 + arg0] = -126;
			} else if (local20 == 'ƒ') {
				arg2[local12 + arg0] = -125;
			} else if (local20 == '„') {
				arg2[arg0 + local12] = -124;
			} else if (local20 == '…') {
				arg2[arg0 + local12] = -123;
			} else if (local20 == '†') {
				arg2[local12 + arg0] = -122;
			} else if (local20 == '‡') {
				arg2[local12 + arg0] = -121;
			} else if (local20 == 'ˆ') {
				arg2[arg0 + local12] = -120;
			} else if (local20 == '‰') {
				arg2[arg0 + local12] = -119;
			} else if (local20 == 'Š') {
				arg2[local12 + arg0] = -118;
			} else if (local20 == '‹') {
				arg2[arg0 + local12] = -117;
			} else if (local20 == 'Œ') {
				arg2[arg0 + local12] = -116;
			} else if (local20 == 'Ž') {
				arg2[arg0 + local12] = -114;
			} else if (local20 == '‘') {
				arg2[arg0 + local12] = -111;
			} else if (local20 == '’') {
				arg2[local12 + arg0] = -110;
			} else if (local20 == '“') {
				arg2[local12 + arg0] = -109;
			} else if (local20 == '”') {
				arg2[local12 + arg0] = -108;
			} else if (local20 == '•') {
				arg2[arg0 + local12] = -107;
			} else if (local20 == '–') {
				arg2[arg0 + local12] = -106;
			} else if (local20 == '—') {
				arg2[arg0 + local12] = -105;
			} else if (local20 == '˜') {
				arg2[arg0 + local12] = -104;
			} else if (local20 == '™') {
				arg2[local12 + arg0] = -103;
			} else if (local20 == 'š') {
				arg2[arg0 + local12] = -102;
			} else if (local20 == '›') {
				arg2[arg0 + local12] = -101;
			} else if (local20 == 'œ') {
				arg2[arg0 + local12] = -100;
			} else if (local20 == 'ž') {
				arg2[local12 + arg0] = -98;
			} else if (local20 == 'Ÿ') {
				arg2[local12 + arg0] = -97;
			} else {
				arg2[arg0 + local12] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([Lclient!go;II)V")
	public static void method3262(@OriginalArg(0) Class95[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class95 local17 = arg0[local11];
			if (local17 != null && local17.anInt2646 == arg1 && !Static52.method717(local17)) {
				if (local17.anInt2616 == 0) {
					method3262(arg0, local17.anInt2583);
					if (local17.aClass95Array1 != null) {
						method3262(local17.aClass95Array1, local17.anInt2583);
					}
					@Pc(51) Class7_Sub44 local51 = (Class7_Sub44) Static23.aClass164_3.method3512((long) local17.anInt2583);
					if (local51 != null) {
						Static459.method5332(local51.anInt7165);
					}
				}
				if (local17.anInt2616 == 6 && local17.anInt2659 != -1) {
					@Pc(71) Class139 local71 = Static364.aClass151_2.method3293(local17.anInt2659);
					if (local71 != null) {
						local17.anInt2582 += Static436.anInt7296;
						while (local71.anIntArray345[local17.anInt2621] < local17.anInt2582) {
							local17.anInt2582 -= local71.anIntArray345[local17.anInt2621];
							local17.anInt2621++;
							if (local71.anIntArray344.length <= local17.anInt2621) {
								local17.anInt2621 -= local71.anInt3945;
								if (local17.anInt2621 < 0 || local71.anIntArray344.length <= local17.anInt2621) {
									local17.anInt2621 = 0;
								}
							}
							local17.anInt2639 = local17.anInt2621 + 1;
							if (local17.anInt2639 >= local71.anIntArray344.length) {
								local17.anInt2639 -= local71.anInt3945;
								if (local17.anInt2639 < 0 || local71.anIntArray344.length <= local17.anInt2639) {
									local17.anInt2639 = -1;
								}
							}
							Static413.method5189(local17);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
	public static void method3264(@OriginalArg(0) int arg0) {
		Static5.anInt16 = -1;
		Static168.anInt3036 = -1;
		Static203.anInt3590 = arg0;
		Static430.method5562();
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
	public static void method3266(@OriginalArg(1) int arg0) {
		Static9.anInt57 = 1000 / arg0;
	}
}
