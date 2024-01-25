import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
	public static int anInt8528;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "Lclient!st;")
	public static final Class314 aClass314_125 = new Class314(75, -1);

	@OriginalMember(owner = "client!rt", name = "G", descriptor = "I")
	public static int anInt8524 = 0;

	@OriginalMember(owner = "client!rt", name = "K", descriptor = "I")
	public static int anInt8527 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method7342(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(23) int local23 = 0; local23 < local8; local23++) {
			@Pc(29) char local29 = arg0.charAt(local23);
			if (local29 > '\u0000' && local29 < '\u0080' || !(local29 < ' ' || local29 > 'ÿ')) {
				local11[local23] = (byte) local29;
			} else if (local29 == '€') {
				local11[local23] = -128;
			} else if (local29 == '‚') {
				local11[local23] = -126;
			} else if (local29 == 'ƒ') {
				local11[local23] = -125;
			} else if (local29 == '„') {
				local11[local23] = -124;
			} else if (local29 == '…') {
				local11[local23] = -123;
			} else if (local29 == '†') {
				local11[local23] = -122;
			} else if (local29 == '‡') {
				local11[local23] = -121;
			} else if (local29 == 'ˆ') {
				local11[local23] = -120;
			} else if (local29 == '‰') {
				local11[local23] = -119;
			} else if (local29 == 'Š') {
				local11[local23] = -118;
			} else if (local29 == '‹') {
				local11[local23] = -117;
			} else if (local29 == 'Œ') {
				local11[local23] = -116;
			} else if (local29 == 'Ž') {
				local11[local23] = -114;
			} else if (local29 == '‘') {
				local11[local23] = -111;
			} else if (local29 == '’') {
				local11[local23] = -110;
			} else if (local29 == '“') {
				local11[local23] = -109;
			} else if (local29 == '”') {
				local11[local23] = -108;
			} else if (local29 == '•') {
				local11[local23] = -107;
			} else if (local29 == '–') {
				local11[local23] = -106;
			} else if (local29 == '—') {
				local11[local23] = -105;
			} else if (local29 == '˜') {
				local11[local23] = -104;
			} else if (local29 == '™') {
				local11[local23] = -103;
			} else if (local29 == 'š') {
				local11[local23] = -102;
			} else if (local29 == '›') {
				local11[local23] = -101;
			} else if (local29 == 'œ') {
				local11[local23] = -100;
			} else if (local29 == 'ž') {
				local11[local23] = -98;
			} else if (local29 == 'Ÿ') {
				local11[local23] = -97;
			} else {
				local11[local23] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLjava/awt/Component;IILclient!rp;)Lclient!efa;")
	public static Class89 method7344(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class298 arg3) {
		if (Static168.anInt3272 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class89 local36 = (Class89) Class.forName("Class89_Sub1").getDeclaredConstructor().newInstance();
			local36.anIntArray272 = new int[(Static411.aBoolean570 ? 2 : 1) * 256];
			local36.anInt4947 = arg2;
			local36.method4217(arg0);
			local36.anInt4952 = (arg2 & 0xFFFFFC00) + 1024;
			if (local36.anInt4952 > 16384) {
				local36.anInt4952 = 16384;
			}
			local36.method4211(local36.anInt4952);
			if (Static146.anInt3002 > 0 && Static63.aClass110_1 == null) {
				Static63.aClass110_1 = new Class110();
				Static63.aClass110_1.aClass298_5 = arg3;
				arg3.method7289(Static146.anInt3002, Static63.aClass110_1);
			}
			if (Static63.aClass110_1 != null) {
				if (Static63.aClass110_1.aClass89Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static63.aClass110_1.aClass89Array1[arg1] = local36;
			}
			return local36;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class89_Sub2 local114 = new Class89_Sub2(arg3, arg1);
				local114.anInt4947 = arg2;
				local114.anIntArray272 = new int[(Static411.aBoolean570 ? 2 : 1) * 256];
				local114.method4217(arg0);
				local114.anInt4952 = 16384;
				local114.method4211(local114.anInt4952);
				if (Static146.anInt3002 > 0 && Static63.aClass110_1 == null) {
					Static63.aClass110_1 = new Class110();
					Static63.aClass110_1.aClass298_5 = arg3;
					arg3.method7289(Static146.anInt3002, Static63.aClass110_1);
				}
				if (Static63.aClass110_1 != null) {
					if (Static63.aClass110_1.aClass89Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static63.aClass110_1.aClass89Array1[arg1] = local114;
				}
				return local114;
			} catch (@Pc(181) Throwable local181) {
				return new Class89();
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZII)Z")
	public static boolean method7347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static275.method4528(arg1, arg0)) {
			return Static159.method2761(arg1, arg0) | (arg0 & 0xB000) != 0 | Static171.method2838(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static175.method2898(arg1, arg0) | Static225.method3900(arg0, arg1));
		} else {
			return false;
		}
	}
}
