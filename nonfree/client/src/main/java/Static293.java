import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray119;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "[S")
	public static short[] aShortArray57 = new short[256];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3939(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static252.method4449(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static202.anInt4162; local25++) {
			@Pc(38) String local38 = Static73.aStringArray21[local25];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static252.method4449(local38);
			if (local38 != null && local38.equals(local20)) {
				Static202.anInt4162--;
				for (@Pc(62) int local62 = local25; local62 < Static202.anInt4162; local62++) {
					Static73.aStringArray21[local62] = Static73.aStringArray21[local62 + 1];
					Static345.aStringArray86[local62] = Static345.aStringArray86[local62 + 1];
					Static256.anIntArray425[local62] = Static256.anIntArray425[local62 + 1];
					Static107.aStringArray80[local62] = Static107.aStringArray80[local62 + 1];
					Static202.anIntArray348[local62] = Static202.anIntArray348[local62 + 1];
					Static316.aBooleanArray27[local62] = Static316.aBooleanArray27[local62 + 1];
				}
				Static254.anInt2746 = Static66.anInt1751;
				Static15.aClass4_Sub11_Sub1_2.method706(76);
				Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(arg0));
				Static15.aClass4_Sub11_Sub1_2.method3410(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!wa;ILclient!wa;)V")
	public static void method3940(@OriginalArg(0) Class4_Sub4 arg0, @OriginalArg(2) Class4_Sub4 arg1) {
		if (arg0.aClass4_Sub4_62 != null) {
			arg0.method5678();
		}
		arg0.aClass4_Sub4_62 = arg1;
		arg0.aClass4_Sub4_61 = arg1.aClass4_Sub4_61;
		arg0.aClass4_Sub4_62.aClass4_Sub4_61 = arg0;
		arg0.aClass4_Sub4_61.aClass4_Sub4_62 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIILclient!pn;)V")
	public static void method3942(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class8_Sub1_Sub2_Sub2 arg2) {
		if (arg2.anInt4954 == arg0 && arg0 != -1) {
			@Pc(15) Class14 local15 = Static225.method4042(arg0);
			@Pc(18) int local18 = local15.anInt351;
			if (local18 == 1) {
				arg2.anInt4935 = arg1;
				arg2.anInt4945 = 0;
				arg2.anInt4959 = 0;
				arg2.anInt4961 = 0;
				arg2.anInt4969 = 1;
				Static167.method3265(arg2.anInt6701, arg2.anInt6702, arg2.anInt4961, false, local15);
			}
			if (local18 == 2) {
				arg2.anInt4959 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt4954 == -1 || Static225.method4042(arg0).anInt344 >= Static225.method4042(arg2.anInt4954).anInt344) {
			arg2.anInt4969 = 1;
			arg2.anInt4959 = 0;
			arg2.anInt4954 = arg0;
			arg2.anInt4981 = arg2.anInt4987;
			arg2.anInt4961 = 0;
			arg2.anInt4935 = arg1;
			arg2.anInt4945 = 0;
			if (arg2.anInt4954 != -1) {
				Static167.method3265(arg2.anInt6701, arg2.anInt6702, arg2.anInt4961, false, Static225.method4042(arg2.anInt4954));
			}
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;ZLjava/awt/Color;IILjava/awt/Color;)V")
	public static void method3943(@OriginalArg(0) Color arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Color arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(6) Graphics local6 = Static300.aCanvas5.getGraphics();
			if (Static199.aFont1 == null) {
				Static199.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static24.anInt496, Static23.anInt465);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			try {
				if (Static224.anImage3 == null) {
					Static224.anImage3 = Static300.aCanvas5.createImage(304, 34);
				}
				@Pc(63) Graphics local63 = Static224.anImage3.getGraphics();
				local63.setColor(arg5);
				local63.drawRect(0, 0, 303, 33);
				local63.setColor(arg0);
				local63.fillRect(2, 2, arg4 * 3, 30);
				local63.setColor(Color.black);
				local63.drawRect(1, 1, 301, 31);
				local63.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
				local63.setFont(Static199.aFont1);
				local63.setColor(arg3);
				local63.drawString(arg1, (304 - arg1.length() * 6) / 2, 22);
				local6.drawImage(Static224.anImage3, Static24.anInt496 / 2 - 152, Static23.anInt465 / 2 + -18, null);
			} catch (@Pc(143) Exception local143) {
				@Pc(149) int local149 = Static24.anInt496 / 2 - 152;
				@Pc(155) int local155 = Static23.anInt465 / 2 - 18;
				local6.setColor(arg5);
				local6.drawRect(0, 0, 303, 33);
				local6.setColor(arg0);
				local6.fillRect(local149 + 2, local155 + 2, arg4 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local149 + 1, local155 + 1, 301, 31);
				local6.fillRect(arg4 * 3 + local149 + 2, local155 + 2, 300 - arg4 * 3, 30);
				local6.setFont(Static199.aFont1);
				local6.setColor(arg3);
				local6.drawString(arg1, (304 - arg1.length() * 6) / 2 + local149, local155 + 22);
			}
			if (Static283.aString57 != null) {
				local6.setFont(Static199.aFont1);
				local6.setColor(arg3);
				local6.drawString(Static283.aString57, Static24.anInt496 / 2 - Static283.aString57.length() * 6 / 2, Static23.anInt465 / 2 + -26);
			}
		} catch (@Pc(263) Exception local263) {
			Static300.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method3944(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static15.aClass4_Sub11_Sub1_2.method706(44);
		Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(arg0) + 1);
		Static15.aClass4_Sub11_Sub1_2.method3410(arg0);
		Static15.aClass4_Sub11_Sub1_2.method3434(arg1);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Lclient!li;")
	public static Class121 method3948(@OriginalArg(1) int arg0) {
		@Pc(10) Class121 local10 = (Class121) Static278.aClass198_246.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static340.aClass193_107.method5047(4, arg0);
		local10 = new Class121();
		if (local25 != null) {
			local10.method3487(arg0, new Class4_Sub11(local25));
		}
		local10.method3488(arg0);
		Static278.aClass198_246.method5201(local10, (long) arg0);
		return local10;
	}
}
