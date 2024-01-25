import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Lclient!jd;")
	public static Class122 aClass122_1;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "Lclient!gn;")
	public static final Class94 aClass94_16 = new Class94(10, 7);

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!ns;")
	public static final Class175 aClass175_1 = new Class175(0);

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_47 = new Class2(67, 6);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/awt/Color;IZLjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;)V")
	public static void method2150(@OriginalArg(0) Color arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) Color arg5) {
		try {
			@Pc(2) Graphics local2 = Static95.aCanvas3.getGraphics();
			if (Static121.aFont1 == null) {
				Static121.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static251.anInt4258, Static286.anInt4051);
			}
			if (arg5 == null) {
				arg5 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static276.anImage2 == null) {
					Static276.anImage2 = Static95.aCanvas3.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static276.anImage2.getGraphics();
				local59.setColor(arg4);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg5);
				local59.fillRect(2, 2, arg1 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local59.setFont(Static121.aFont1);
				local59.setColor(arg0);
				local59.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
				local2.drawImage(Static276.anImage2, Static251.anInt4258 / 2 - 152, Static286.anInt4051 / 2 + -18, null);
			} catch (@Pc(147) Exception local147) {
				@Pc(153) int local153 = Static251.anInt4258 / 2 - 152;
				@Pc(159) int local159 = Static286.anInt4051 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg5);
				local2.fillRect(local153 + 2, local159 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local153 + 1, local159 + 1, 301, 31);
				local2.fillRect(arg1 * 3 + local153 + 2, local159 - -2, 300 - arg1 * 3, 30);
				local2.setFont(Static121.aFont1);
				local2.setColor(arg0);
				local2.drawString(arg3, (304 - arg3.length() * 6) / 2 + local153, local159 - -22);
			}
			if (Static111.aString20 != null) {
				local2.setFont(Static121.aFont1);
				local2.setColor(arg0);
				local2.drawString(Static111.aString20, Static251.anInt4258 / 2 - Static111.aString20.length() * 6 / 2, Static286.anInt4051 / 2 + -26);
			}
		} catch (@Pc(267) Exception local267) {
			Static95.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)V")
	public static void method2151(@OriginalArg(0) int arg0) {
		if (Static206.anInt3642 == arg0) {
			return;
		}
		if (Static206.anInt3642 == 0) {
			Static88.method1554();
		}
		if (arg0 == 12) {
			Static193.method2787(Static233.anInt5382, Static308.aString53, Static199.aString38);
		}
		if (arg0 != 12 && Static355.aClass247_3 != null) {
			Static355.aClass247_3.method5162();
			Static355.aClass247_3 = null;
		}
		if (arg0 == 2) {
			Static440.method5627(Static100.anInt2033 != Static183.anInt3293);
		}
		if (arg0 == 6) {
			Static415.method5222(Static231.anInt6548 != Static183.anInt3293);
		}
		if (arg0 == 4) {
			Static207.method2975(Static308.aString53, Static199.aString38);
		} else if (arg0 == 5) {
			Static193.method2787(Static233.anInt5382, Static308.aString53, Static199.aString38);
		} else if (arg0 == 8) {
			Static193.method2787(Static233.anInt5382, Static308.aString53, Static199.aString38);
		} else if (arg0 == 11) {
			Static207.method2975(Static308.aString53, Static199.aString38);
		}
		if (Static300.method4008(Static206.anInt3642)) {
			Static413.aClass178_124.anInt4835 = 2;
			Static398.aClass178_122.anInt4835 = 2;
			Static4.aClass178_137.anInt4835 = 2;
			Static106.aClass178_32.anInt4835 = 2;
			Static20.aClass178_34.anInt4835 = 2;
			Static388.aClass178_120.anInt4835 = 2;
			Static419.aClass178_129.anInt4835 = 2;
		}
		if (Static300.method4008(arg0)) {
			Static234.anInt4039 = 0;
			Static395.anInt6313 = 0;
			Static214.anInt2504 = 0;
			Static38.anInt672 = 1;
			Static427.anInt7149 = 1;
			Static179.method5739(true);
			Static413.aClass178_124.anInt4835 = 1;
			Static398.aClass178_122.anInt4835 = 1;
			Static4.aClass178_137.anInt4835 = 1;
			Static106.aClass178_32.anInt4835 = 1;
			Static20.aClass178_34.anInt4835 = 1;
			Static388.aClass178_120.anInt4835 = 1;
			Static419.aClass178_129.anInt4835 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static402.method5074();
		}
		if (arg0 == 1) {
			Static361.method4642(Static25.aClass178_9, Static269.aClass51_9);
		} else {
			Static449.method5708();
		}
		@Pc(220) boolean local220 = arg0 == 1 || Static411.method5164(arg0) || Static459.method5312(arg0);
		@Pc(239) boolean local239 = Static206.anInt3642 == 1 || Static411.method5164(Static206.anInt3642) || Static459.method5312(Static206.anInt3642);
		if (local239 != local220) {
			if (local220) {
				Static128.anInt2476 = Static242.anInt4146;
				if (Static130.aClass153_Sub1_1.anInt5240 == 0) {
					Static4.method5779();
				} else {
					Static33.method463(Static122.aClass178_39, Static130.aClass153_Sub1_1.anInt5240, Static242.anInt4146);
				}
				Static90.aClass120_1.method2649(false);
			} else {
				Static4.method5779();
				Static90.aClass120_1.method2649(true);
			}
		}
		if (Static300.method4008(arg0) || arg0 == 12) {
			Static269.aClass51_9.method5292();
		}
		Static206.anInt3642 = arg0;
	}
}
