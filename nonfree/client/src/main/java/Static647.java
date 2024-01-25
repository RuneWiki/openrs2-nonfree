import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "Lclient!uj;")
	public static Class251 aClass251_1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "[I")
	public static final int[] anIntArray649 = new int[50];

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_21 = new Class244(1, 2);

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
	public static int anInt10719 = 100;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
	public static void method8996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 != 8 && arg3 != 16) {
			@Pc(160) Class97 local160 = Static272.aClass97ArrayArrayArray3[arg0][arg4][arg2];
			if (local160 == null) {
				local160 = new Class97(arg0);
			}
			if (arg3 == 1) {
				local160.aShort41 = (short) arg1;
				local160.aShort44 = (short) arg5;
			} else if (arg3 == 2) {
				local160.aShort42 = (short) arg1;
				local160.aShort43 = (short) arg5;
			}
			if (Static582.aBoolean667) {
				Static296.method5101();
			}
			return;
		}
		@Pc(19) int local19;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (arg3 != 8) {
			local19 = (arg4 << Static643.anInt10682) + Static246.anInt4917;
			local24 = local19 - Static246.anInt4917;
			local28 = arg2 << Static643.anInt10682;
			local32 = Static246.anInt4917 + local28;
			local42 = Static228.aClass199Array2[arg0].method8532(arg4 + 1, arg2);
			local52 = Static228.aClass199Array2[arg0].method8532(arg4, arg2 + 1);
			Static65.aClass226Array1[Static572.anInt9600++] = new Class226(arg3, arg0, local19, local24, local24, local19, local42, local52, local52 - arg1, -arg1 + local42, local28, local32, local32, local28);
			return;
		}
		local19 = arg4 << Static643.anInt10682;
		local24 = Static246.anInt4917 + local19;
		local28 = arg2 << Static643.anInt10682;
		local32 = local28 + Static246.anInt4917;
		local42 = Static228.aClass199Array2[arg0].method8532(arg4, arg2);
		local52 = Static228.aClass199Array2[arg0].method8532(arg4 + 1, arg2 - -1);
		Static65.aClass226Array1[Static572.anInt9600++] = new Class226(arg3, arg0, local19, local24, local24, local19, local42, local52, local52 - arg1, local42 + -arg1, local28, local32, local32, local28);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!jo;IZ)V")
	public static void method8998(@OriginalArg(0) Class6_Sub3_Sub4 arg0) {
		Static4.aClass190_6.method7490(arg0);
		Static328.method5434(arg0, Static237.aClass353_44, Static517.aClass353_105, Static323.aClass353_55, Static4.aClass190_6);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method8999(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static486.anInt8421 > 0) {
			local21 = Static315.aByteArrayArray98[--Static486.anInt8421];
			Static315.aByteArrayArray98[Static486.anInt8421] = null;
			return local21;
		} else if (arg0 == 5000 && Static474.anInt8293 > 0) {
			local21 = Static72.aByteArrayArray26[--Static474.anInt8293];
			Static72.aByteArrayArray26[Static474.anInt8293] = null;
			return local21;
		} else if (arg0 == 30000 && Static467.anInt8237 > 0) {
			local21 = Static125.aByteArrayArray174[--Static467.anInt8237];
			Static125.aByteArrayArray174[Static467.anInt8237] = null;
			return local21;
		} else {
			if (Static498.aByteArrayArrayArray22 != null) {
				for (@Pc(69) int local69 = 0; local69 < Static469.anIntArray518.length; local69++) {
					if (Static469.anIntArray518[local69] == arg0 && Static26.anIntArray30[local69] > 0) {
						@Pc(96) byte[] local96 = Static498.aByteArrayArrayArray22[local69][--Static26.anIntArray30[local69]];
						Static498.aByteArrayArrayArray22[local69][Static26.anIntArray30[local69]] = null;
						return local96;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method9000(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(17) int local17 = arg2.indexOf(arg0); local17 != -1; local17 = arg2.indexOf(arg0, arg1.length() + local17)) {
			arg2 = arg2.substring(0, local17) + arg1 + arg2.substring(arg0.length() + local17);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I[B)V")
	public static synchronized void method9001(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static486.anInt8421 < 1000) {
			Static315.aByteArrayArray98[Static486.anInt8421++] = arg0;
		} else if (arg0.length == 5000 && Static474.anInt8293 < 250) {
			Static72.aByteArrayArray26[Static474.anInt8293++] = arg0;
		} else if (arg0.length == 30000 && Static467.anInt8237 < 50) {
			Static125.aByteArrayArray174[Static467.anInt8237++] = arg0;
		} else if (Static498.aByteArrayArrayArray22 != null) {
			for (@Pc(72) int local72 = 0; local72 < Static469.anIntArray518.length; local72++) {
				if (arg0.length == Static469.anIntArray518[local72] && Static26.anIntArray30[local72] < Static498.aByteArrayArrayArray22[local72].length) {
					Static498.aByteArrayArrayArray22[local72][Static26.anIntArray30[local72]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/awt/Color;BLjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;)V")
	public static void method9002(@OriginalArg(0) int arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static271.aCanvas6.getGraphics();
			if (Static284.aFont3 == null) {
				Static284.aFont3 = new Font("Helvetica", 1, 13);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			@Pc(67) int local67;
			try {
				if (Static194.anImage1 == null) {
					Static194.anImage1 = Static271.aCanvas6.createImage(Static321.anInt6137, Static356.anInt6630);
				}
				@Pc(52) Graphics local52 = Static194.anImage1.getGraphics();
				local52.setColor(Color.black);
				local52.fillRect(0, 0, Static321.anInt6137, Static356.anInt6630);
				local67 = Static321.anInt6137 / 2 - 152;
				@Pc(73) int local73 = Static356.anInt6630 / 2 - 18;
				local52.setColor(arg3);
				local52.drawRect(local67, local73, 303, 33);
				local52.setColor(arg4);
				local52.fillRect(local67 + 2, local73 + 2, arg0 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(local67 + 1, local73 - -1, 301, 31);
				local52.fillRect(local67 + arg0 * 3 + 2, local73 - -2, 300 - arg0 * 3, 30);
				local52.setFont(Static284.aFont3);
				local52.setColor(arg1);
				local52.drawString(arg2, (304 - arg2.length() * 6) / 2 + local67, local73 + 22);
				if (Static525.aString107 != null) {
					local52.setFont(Static284.aFont3);
					local52.setColor(arg1);
					local52.drawString(Static525.aString107, Static321.anInt6137 / 2 - Static525.aString107.length() * 6 / 2, Static356.anInt6630 / 2 + -26);
				}
				local6.drawImage(Static194.anImage1, 0, 0, (ImageObserver) null);
			} catch (@Pc(196) Exception local196) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static321.anInt6137, Static356.anInt6630);
				@Pc(211) int local211 = Static321.anInt6137 / 2 - 152;
				local67 = Static356.anInt6630 / 2 - 18;
				local6.setColor(arg3);
				local6.drawRect(local211, local67, 303, 33);
				local6.setColor(arg4);
				local6.fillRect(local211 + 2, local67 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local211 + 1, local67 - -1, 301, 31);
				local6.fillRect(local211 + arg0 * 3 + 2, local67 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static284.aFont3);
				local6.setColor(arg1);
				if (Static525.aString107 != null) {
					local6.setFont(Static284.aFont3);
					local6.setColor(arg1);
					local6.drawString(Static525.aString107, Static321.anInt6137 / 2 - Static525.aString107.length() * 6 / 2, Static356.anInt6630 / 2 - 26);
				}
				local6.drawString(arg2, (304 - arg2.length() * 6) / 2 + local211, local67 + 22);
			}
		} catch (@Pc(324) Exception local324) {
			Static271.aCanvas6.repaint();
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method9003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static347.anInt6542 && arg4 <= Static553.anInt9425 && Static347.anInt6542 <= arg0 && arg0 <= Static553.anInt9425 && Static347.anInt6542 <= arg3 && arg3 <= Static553.anInt9425 && arg7 >= Static347.anInt6542 && arg7 <= Static553.anInt9425 && Static100.anInt10042 <= arg5 && arg5 <= Static567.anInt9578 && Static100.anInt10042 <= arg1 && Static567.anInt9578 >= arg1 && Static100.anInt10042 <= arg2 && arg2 <= Static567.anInt9578 && Static100.anInt10042 <= arg6 && Static567.anInt9578 >= arg6) {
			Static393.method6339(arg8, arg4, arg0, arg6, arg7, arg1, arg5, arg3, arg2);
		} else {
			Static184.method3348(arg3, arg7, arg2, arg4, arg0, arg6, arg1, arg5, arg8);
		}
	}
}
