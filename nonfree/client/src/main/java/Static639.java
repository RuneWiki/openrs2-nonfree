import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!on;")
	public static Class262 aClass262_8;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Lclient!mha;")
	public static final Class228 aClass228_13 = new Class228(9, 2);

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_96 = new Class181(40, 2);

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	public static int anInt10354 = 0;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "[I")
	public static final int[] anIntArray831 = new int[1000];

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IB)V")
	public static void method8795(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg0, 10);
		local8.method4132();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
	public static void method8796() {
		if (Static630.aFrame3 != null) {
			return;
		}
		@Pc(10) int local10 = Static552.anInt9135;
		@Pc(12) int local12 = Static649.anInt10495;
		@Pc(20) int local20 = Static489.anInt8353 - Static254.anInt4283 - local10;
		@Pc(27) int local27 = Static374.anInt6594 - local12 - Static438.anInt7403;
		if (local10 <= 0 && local20 <= 0 && local12 <= 0 && local27 <= 0) {
			return;
		}
		try {
			@Pc(54) Container local54;
			if (Static510.aFrame2 != null) {
				local54 = Static510.aFrame2;
			} else if (Static270.anApplet5 == null) {
				local54 = Static3.anApplet_Sub1_1;
			} else {
				local54 = Static270.anApplet5;
			}
			@Pc(66) int local66 = 0;
			@Pc(68) int local68 = 0;
			if (Static510.aFrame2 == local54) {
				@Pc(74) Insets local74 = Static510.aFrame2.getInsets();
				local68 = local74.top;
				local66 = local74.left;
			}
			@Pc(83) Graphics local83 = local54.getGraphics();
			local83.setColor(Color.black);
			if (local10 > 0) {
				local83.fillRect(local66, local68, local10, Static374.anInt6594);
			}
			if (local12 > 0) {
				local83.fillRect(local66, local68, Static489.anInt8353, local12);
			}
			if (local20 > 0) {
				local83.fillRect(Static489.anInt8353 + local66 - local20, local68, local20, Static374.anInt6594);
			}
			if (local27 > 0) {
				local83.fillRect(local66, local68 + Static374.anInt6594 - local27, Static489.anInt8353, local27);
				return;
			}
		} catch (@Pc(133) Exception local133) {
			return;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZILjava/lang/String;)I")
	public static int method8797(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg1.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg1.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(84) int local84;
			if (local48 >= '0' && local48 <= '9') {
				local84 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local84 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local84 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local84 >= arg0) {
				throw new NumberFormatException();
			}
			if (local33) {
				local84 = -local84;
			}
			@Pc(124) int local124 = local84 + local37 * arg0;
			if (local124 / arg0 != local37) {
				throw new NumberFormatException();
			}
			local37 = local124;
			local35 = true;
		}
		if (!local35) {
			throw new NumberFormatException();
		}
		return local37;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIBI)V")
	public static void method8799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static203.anInt130 / (float) Static203.anInt134;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg2 - (arg0 - local13) / 2;
		@Pc(49) int local49 = arg3 - (arg1 - local11) / 2;
		Static100.anInt1573 = -1;
		Static449.anInt7564 = Static203.anInt130 - local40 * Static203.anInt130 / local13;
		Static504.anInt8544 = Static203.anInt134 * local49 / local11;
		Static486.anInt8186 = -1;
		Static503.method3569();
	}
}
