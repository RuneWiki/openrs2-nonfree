import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lea", name = "Q", descriptor = "Lclient!wca;")
	public static Class5_Sub53 aClass5_Sub53_6;

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "Lclient!vaa;")
	public static final Class361 aClass361_14 = new Class361(3, 2);

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILjava/lang/String;BII[B)I")
	public static int method5110(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			@Pc(30) char local30 = arg1.charAt(local20);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg3[local20 + arg0] = (byte) local30;
			} else if (local30 == '€') {
				arg3[arg0 + local20] = -128;
			} else if (local30 == '‚') {
				arg3[local20 + arg0] = -126;
			} else if (local30 == 'ƒ') {
				arg3[arg0 + local20] = -125;
			} else if (local30 == '„') {
				arg3[local20 + arg0] = -124;
			} else if (local30 == '…') {
				arg3[local20 + arg0] = -123;
			} else if (local30 == '†') {
				arg3[local20 + arg0] = -122;
			} else if (local30 == '‡') {
				arg3[arg0 + local20] = -121;
			} else if (local30 == 'ˆ') {
				arg3[local20 + arg0] = -120;
			} else if (local30 == '‰') {
				arg3[arg0 + local20] = -119;
			} else if (local30 == 'Š') {
				arg3[arg0 + local20] = -118;
			} else if (local30 == '‹') {
				arg3[arg0 + local20] = -117;
			} else if (local30 == 'Œ') {
				arg3[local20 + arg0] = -116;
			} else if (local30 == 'Ž') {
				arg3[arg0 + local20] = -114;
			} else if (local30 == '‘') {
				arg3[local20 + arg0] = -111;
			} else if (local30 == '’') {
				arg3[arg0 + local20] = -110;
			} else if (local30 == '“') {
				arg3[local20 + arg0] = -109;
			} else if (local30 == '”') {
				arg3[arg0 + local20] = -108;
			} else if (local30 == '•') {
				arg3[local20 + arg0] = -107;
			} else if (local30 == '–') {
				arg3[arg0 + local20] = -106;
			} else if (local30 == '—') {
				arg3[local20 + arg0] = -105;
			} else if (local30 == '˜') {
				arg3[local20 + arg0] = -104;
			} else if (local30 == '™') {
				arg3[local20 + arg0] = -103;
			} else if (local30 == 'š') {
				arg3[local20 + arg0] = -102;
			} else if (local30 == '›') {
				arg3[local20 + arg0] = -101;
			} else if (local30 == 'œ') {
				arg3[local20 + arg0] = -100;
			} else if (local30 == 'ž') {
				arg3[local20 + arg0] = -98;
			} else if (local30 == 'Ÿ') {
				arg3[local20 + arg0] = -97;
			} else {
				arg3[local20 + arg0] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!la;IZII)V")
	public static void method5111(@OriginalArg(0) int arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(5) int arg2) {
		Static69.method1119((long) 0, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!ib;)V")
	public static void method5112(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(21) byte[] local21 = new byte[24];
		if (Static620.aClass176_10 != null) {
			@Pc(33) int local33;
			try {
				Static620.aClass176_10.method3782(0L);
				Static620.aClass176_10.method3778(local21);
				for (local33 = 0; local33 < 24 && local21[local33] == 0; local33++) {
				}
				if (local33 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(69) Exception local69) {
				for (local33 = 0; local33 < 24; local33++) {
					local21[local33] = -1;
				}
			}
		}
		arg0.method8528(24, 0, local21);
	}
}
