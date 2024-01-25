import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_86 = new Class362(38, 12);

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "Lclient!sq;")
	public static final Class307 aClass307_5 = new Class307(5, 1);

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_57 = new Class173(3, 4);

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "[I")
	public static final int[] anIntArray182 = new int[6];

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZI)Z")
	public static boolean method3375(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class4_Sub39 local19 = (Class4_Sub39) Static40.aClass244_4.method5963(); local19 != null; local19 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
			if (Static114.method7979(local19.anInt8541) && local19.aLong219 == (long) arg0) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZZ)Lclient!jn;")
	public static Class176 method3377(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class345 local10 = null;
		if (Static311.aClass134_2 != null) {
			local10 = new Class345(arg0, Static311.aClass134_2, Static226.aClass134Array1[arg0], 1000000);
		}
		Static31.aClass146_Sub1Array1[arg0] = Static413.aClass195_5.method4826(Static320.aClass345_4, arg0, local10);
		Static31.aClass146_Sub1Array1[arg0].method3523();
		return new Class176(Static31.aClass146_Sub1Array1[arg0], arg1, 1);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!ip;Lclient!jk;I)Lclient!eba;")
	public static Class4_Sub14 method3380(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Class173 arg1) {
		@Pc(8) Class4_Sub14 local8 = Static191.method3338();
		local8.aClass173_35 = arg1;
		local8.anInt2414 = arg1.anInt4509;
		if (local8.anInt2414 == -1) {
			local8.aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(260);
		} else if (local8.anInt2414 == -2) {
			local8.aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(10000);
		} else if (local8.anInt2414 <= 18) {
			local8.aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(20);
		} else if (local8.anInt2414 > 98) {
			local8.aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(260);
		} else {
			local8.aClass4_Sub11_Sub1_3 = new Class4_Sub11_Sub1(100);
		}
		local8.aClass4_Sub11_Sub1_3.method1534(arg0);
		local8.aClass4_Sub11_Sub1_3.method1540(local8.aClass173_35.method3954());
		local8.anInt2411 = 0;
		return local8;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Color;ILjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;)V")
	public static void method3381(@OriginalArg(0) Color arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static475.aCanvas12.getGraphics();
			if (Static179.aFont1 == null) {
				Static179.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static9.anImage1 == null) {
					Static9.anImage1 = Static475.aCanvas12.createImage(Static554.anInt9828, Static375.anInt7256);
				}
				@Pc(48) Graphics local48 = Static9.anImage1.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static554.anInt9828, Static375.anInt7256);
				local63 = Static554.anInt9828 / 2 - 152;
				@Pc(69) int local69 = Static375.anInt7256 / 2 - 18;
				local48.setColor(arg4);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg0);
				local48.fillRect(local63 + 2, local69 + 2, arg2 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 - -1, 301, 31);
				local48.fillRect(local63 + arg2 * 3 + 2, local69 + 2, 300 - arg2 * 3, 30);
				local48.setFont(Static179.aFont1);
				local48.setColor(arg3);
				local48.drawString(arg1, (304 - arg1.length() * 6) / 2 + local63, local69 + 22);
				if (Static334.aString62 != null) {
					local48.setFont(Static179.aFont1);
					local48.setColor(arg3);
					local48.drawString(Static334.aString62, Static554.anInt9828 / 2 - Static334.aString62.length() * 6 / 2, Static375.anInt7256 / 2 + -26);
				}
				local2.drawImage(Static9.anImage1, 0, 0, null);
			} catch (@Pc(182) Exception local182) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static554.anInt9828, Static375.anInt7256);
				@Pc(197) int local197 = Static554.anInt9828 / 2 - 152;
				local63 = Static375.anInt7256 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(local197, local63, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local197 + 2, local63 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local197 + 1, local63 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local197 + 2, local63 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static179.aFont1);
				local2.setColor(arg3);
				if (Static334.aString62 != null) {
					local2.setFont(Static179.aFont1);
					local2.setColor(arg3);
					local2.drawString(Static334.aString62, Static554.anInt9828 / 2 - Static334.aString62.length() * 6 / 2, Static375.anInt7256 / 2 - 26);
				}
				local2.drawString(arg1, (304 - arg1.length() * 6) / 2 + local197, local63 + 22);
			}
		} catch (@Pc(310) Exception local310) {
			Static475.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)V")
	public static void method3383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static591.method8355(local7.aClass1_Sub4_Sub4_1);
			if (local7.aClass1_Sub4_Sub4_1 != null) {
				local7.aClass1_Sub4_Sub4_1 = null;
			}
		}
	}
}
