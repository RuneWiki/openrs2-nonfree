import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!lja", name = "E", descriptor = "I")
	public static int anInt6000 = -1;

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;)V")
	public static void method5346(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(6) Graphics local6 = Static626.aCanvas12.getGraphics();
			if (Static430.aFont2 == null) {
				Static430.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(255, 255, 255);
			}
			@Pc(73) int local73;
			try {
				if (Static563.anImage3 == null) {
					Static563.anImage3 = Static626.aCanvas12.createImage(Static563.anInt4939, Static506.anInt8791);
				}
				@Pc(58) Graphics local58 = Static563.anImage3.getGraphics();
				local58.setColor(Color.black);
				local58.fillRect(0, 0, Static563.anInt4939, Static506.anInt8791);
				local73 = Static563.anInt4939 / 2 - 152;
				@Pc(79) int local79 = Static506.anInt8791 / 2 - 18;
				local58.setColor(arg4);
				local58.drawRect(local73, local79, 303, 33);
				local58.setColor(arg2);
				local58.fillRect(local73 + 2, local79 - -2, arg1 * 3, 30);
				local58.setColor(Color.black);
				local58.drawRect(local73 + 1, local79 - -1, 301, 31);
				local58.fillRect(arg1 * 3 + local73 + 2, local79 + 2, 300 - arg1 * 3, 30);
				local58.setFont(Static430.aFont2);
				local58.setColor(arg3);
				local58.drawString(arg0, (304 - arg0.length() * 6) / 2 + local73, local79 + 22);
				if (Static473.aString92 != null) {
					local58.setFont(Static430.aFont2);
					local58.setColor(arg3);
					local58.drawString(Static473.aString92, Static563.anInt4939 / 2 - Static473.aString92.length() * 6 / 2, Static506.anInt8791 / 2 + -26);
				}
				local6.drawImage(Static563.anImage3, 0, 0, (ImageObserver) null);
			} catch (@Pc(202) Exception local202) {
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static563.anInt4939, Static506.anInt8791);
				@Pc(217) int local217 = Static563.anInt4939 / 2 - 152;
				local73 = Static506.anInt8791 / 2 - 18;
				local6.setColor(arg4);
				local6.drawRect(local217, local73, 303, 33);
				local6.setColor(arg2);
				local6.fillRect(local217 + 2, local73 + 2, arg1 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local217 + 1, local73 - -1, 301, 31);
				local6.fillRect(local217 + arg1 * 3 + 2, local73 + 2, 300 - arg1 * 3, 30);
				local6.setFont(Static430.aFont2);
				local6.setColor(arg3);
				if (Static473.aString92 != null) {
					local6.setFont(Static430.aFont2);
					local6.setColor(arg3);
					local6.drawString(Static473.aString92, Static563.anInt4939 / 2 - Static473.aString92.length() * 6 / 2, Static506.anInt8791 / 2 + -26);
				}
				local6.drawString(arg0, (304 - arg0.length() * 6) / 2 + local217, local73 - -22);
			}
		} catch (@Pc(332) Exception local332) {
			Static626.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ILclient!rg;Lclient!d;)V")
	public static void method5347(@OriginalArg(1) Class310 arg0, @OriginalArg(2) Interface4 arg1) {
		Static613.aClass310_120 = arg0;
		Static338.anInterface4_9 = arg1;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IBLclient!nw;)V")
	public static void method5349(@OriginalArg(0) int arg0, @OriginalArg(2) Class259 arg1) {
		if (Static208.anInt7849 >= 50 || (arg1 == null || arg1.anIntArrayArray51 == null || arg0 >= arg1.anIntArrayArray51.length || arg1.anIntArrayArray51[arg0] == null)) {
			return;
		}
		@Pc(42) int local42 = arg1.anIntArrayArray51[arg0][0];
		@Pc(54) int local54 = local42 >> 8;
		@Pc(60) int local60 = local42 >> 5 & 0x7;
		@Pc(79) int local79;
		if (arg1.anIntArrayArray51[arg0].length > 1) {
			local79 = (int) ((double) arg1.anIntArrayArray51[arg0].length * Math.random());
			if (local79 > 0) {
				local54 = arg1.anIntArrayArray51[arg0][local79];
			}
		}
		local79 = 256;
		if (arg1.anIntArray375 != null && arg1.anIntArray374 != null) {
			local79 = Static121.method1921(arg1.anIntArray374[arg0], arg1.anIntArray375[arg0]);
		}
		if (arg1.aBoolean505) {
			Static676.method9511(local60, 255, false, local54, local79, 0);
		} else {
			Static400.method968(255, local54, 0, local79, local60);
		}
	}

	@OriginalMember(owner = "client!lja", name = "c", descriptor = "(B)V")
	public static void method5351() {
		Static482.method7253();
		@Pc(10) int local10 = Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4215();
		if (local10 == 2) {
			Static482.method7256(Static506.anInt8791, Static103.aClass144_3, Static563.anInt4939);
		} else if (local10 == 3) {
			Static218.method3769(Static451.anInt7533, Static563.anInt4939, Static379.anInt6681, Static506.anInt8791, Static103.aClass144_3);
		}
		if (Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4216()) {
			Static170.method2466(Static626.aCanvas12);
		}
		if (Static103.aClass144_3 != null) {
			Static365.method5498();
		}
		Static6.aBoolean9 = Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4215() != 0;
		Static656.aBoolean741 = Static181.aClass14_Sub26_9.aClass43_Sub13_1.method4216();
	}
}
