import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_124 = new Class221(46, 5);

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "[Lclient!ef;")
	public static final Class2_Sub12[] aClass2_Sub12Array1 = new Class2_Sub12[2048];

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_18 = new Class107(4);

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_89 = new Class140("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3272(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static300.method5057(Static16.aClass157_14);
			Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(arg0));
			Static197.aClass2_Sub12_Sub2_2.method3156(arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/lang/String;III[B)I")
	public static int method3276(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(9) int local9 = arg2;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			@Pc(19) char local19 = arg0.charAt(local11);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				arg3[local11 + arg1] = (byte) local19;
			} else if (local19 == '€') {
				arg3[arg1 + local11] = -128;
			} else if (local19 == '‚') {
				arg3[local11 + arg1] = -126;
			} else if (local19 == 'ƒ') {
				arg3[arg1 + local11] = -125;
			} else if (local19 == '„') {
				arg3[arg1 + local11] = -124;
			} else if (local19 == '…') {
				arg3[local11 + arg1] = -123;
			} else if (local19 == '†') {
				arg3[local11 + arg1] = -122;
			} else if (local19 == '‡') {
				arg3[local11 + arg1] = -121;
			} else if (local19 == 'ˆ') {
				arg3[local11 + arg1] = -120;
			} else if (local19 == '‰') {
				arg3[local11 + arg1] = -119;
			} else if (local19 == 'Š') {
				arg3[arg1 + local11] = -118;
			} else if (local19 == '‹') {
				arg3[local11 + arg1] = -117;
			} else if (local19 == 'Œ') {
				arg3[local11 + arg1] = -116;
			} else if (local19 == 'Ž') {
				arg3[arg1 + local11] = -114;
			} else if (local19 == '‘') {
				arg3[arg1 + local11] = -111;
			} else if (local19 == '’') {
				arg3[arg1 + local11] = -110;
			} else if (local19 == '“') {
				arg3[local11 + arg1] = -109;
			} else if (local19 == '”') {
				arg3[local11 + arg1] = -108;
			} else if (local19 == '•') {
				arg3[local11 + arg1] = -107;
			} else if (local19 == '–') {
				arg3[arg1 + local11] = -106;
			} else if (local19 == '—') {
				arg3[local11 + arg1] = -105;
			} else if (local19 == '˜') {
				arg3[local11 + arg1] = -104;
			} else if (local19 == '™') {
				arg3[local11 + arg1] = -103;
			} else if (local19 == 'š') {
				arg3[arg1 + local11] = -102;
			} else if (local19 == '›') {
				arg3[arg1 + local11] = -101;
			} else if (local19 == 'œ') {
				arg3[arg1 + local11] = -100;
			} else if (local19 == 'ž') {
				arg3[arg1 + local11] = -98;
			} else if (local19 == 'Ÿ') {
				arg3[local11 + arg1] = -97;
			} else {
				arg3[local11 + arg1] = 63;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3277(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static343.method3354(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static209.anInt6939; local25++) {
			@Pc(31) String local31 = Static190.aStringArray42[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static343.method3354(local31);
			if (local31 != null && local31.equals(local20)) {
				Static209.anInt6939--;
				for (@Pc(55) int local55 = local25; local55 < Static209.anInt6939; local55++) {
					Static190.aStringArray42[local55] = Static190.aStringArray42[local55 + 1];
					Static287.aStringArray38[local55] = Static287.aStringArray38[local55 + 1];
					Static219.anIntArray354[local55] = Static219.anIntArray354[local55 + 1];
					Static70.aStringArray6[local55] = Static70.aStringArray6[local55 + 1];
					Static361.anIntArray528[local55] = Static361.anIntArray528[local55 + 1];
					Static197.aBooleanArray12[local55] = Static197.aBooleanArray12[local55 + 1];
				}
				Static193.anInt4255 = Static125.anInt2664;
				Static300.method5057(Static217.aClass157_141);
				Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(arg0));
				Static197.aClass2_Sub12_Sub2_2.method3156(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	public static void method3281() {
		for (@Pc(3) int local3 = 0; local3 < Static243.aByteArrayArrayArray10.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static243.aByteArrayArrayArray10[0].length; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static243.aByteArrayArrayArray10[0][0].length; local13++) {
					Static243.aByteArrayArrayArray10[local3][local9][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method3283() {
		@Pc(6) Class107 local6 = Static338.aClass107_55;
		synchronized (Static338.aClass107_55) {
			Static338.aClass107_55.method3012();
		}
	}
}
