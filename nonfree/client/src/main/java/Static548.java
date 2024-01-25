import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	public static int anInt9027;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
	public static int anInt9028;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_217 = new Class81(46, -1);

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
	public static int anInt9030 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
	public static void method7474(@OriginalArg(1) boolean arg0) {
		if (Static140.aString28.length() == 0) {
			return;
		}
		Static374.method5444("--> " + Static140.aString28);
		Static543.method7368(Static140.aString28, false, arg0);
		Static140.aString28 = "";
		Static279.anInt5136 = 0;
		Static248.anInt4642 = 0;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	public static void method7475() {
		if (Static255.aFrame3 != null) {
			return;
		}
		@Pc(15) int local15 = Static393.anInt6807;
		@Pc(17) int local17 = Static377.anInt6644;
		@Pc(23) int local23 = Static309.anInt5589 - Static443.anInt7718 - local15;
		@Pc(31) int local31 = Static20.anInt611 - local17 - Static300.anInt5516;
		if (local15 <= 0 && local23 <= 0 && local17 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static208.aFrame4 != null) {
				local49 = Static208.aFrame4;
			} else if (Static412.anApplet1 == null) {
				local49 = Static229.anApplet_Sub1_20;
			} else {
				local49 = Static412.anApplet1;
			}
			@Pc(61) int local61 = 0;
			@Pc(63) int local63 = 0;
			if (local49 == Static208.aFrame4) {
				@Pc(69) Insets local69 = Static208.aFrame4.getInsets();
				local63 = local69.top;
				local61 = local69.left;
			}
			@Pc(78) Graphics local78 = local49.getGraphics();
			local78.setColor(Color.black);
			if (local15 > 0) {
				local78.fillRect(local61, local63, local15, Static20.anInt611);
			}
			if (local17 > 0) {
				local78.fillRect(local61, local63, Static309.anInt5589, local17);
			}
			if (local23 > 0) {
				local78.fillRect(Static309.anInt5589 + local61 - local23, local63, local23, Static20.anInt611);
			}
			if (local31 > 0) {
				local78.fillRect(local61, local63 + Static20.anInt611 - local31, Static309.anInt5589, local31);
				return;
			}
		} catch (@Pc(138) Exception local138) {
			return;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!io;I)V")
	public static void method7476(@OriginalArg(0) Class1_Sub20 arg0) {
		@Pc(9) int local9 = arg0.method4427();
		Static194.aClass272Array1 = new Class272[local9];
		for (@Pc(19) int local19 = 0; local19 < local9; local19++) {
			Static194.aClass272Array1[local19] = new Class272();
			Static194.aClass272Array1[local19].anInt7699 = arg0.method4427();
			Static194.aClass272Array1[local19].aString80 = arg0.method4395();
		}
		Static504.anInt8438 = arg0.method4427();
		Static193.anInt3958 = arg0.method4427();
		Static147.anInt2831 = arg0.method4427();
		Static408.aClass208_Sub1Array2 = new Class208_Sub1[Static193.anInt3958 + 1 - Static504.anInt8438];
		for (@Pc(67) int local67 = 0; local67 < Static147.anInt2831; local67++) {
			@Pc(75) int local75 = arg0.method4427();
			@Pc(83) Class208_Sub1 local83 = Static408.aClass208_Sub1Array2[local75] = new Class208_Sub1();
			local83.anInt5555 = arg0.method4393();
			local83.anInt5554 = arg0.method4371();
			local83.anInt5565 = local75 + Static504.anInt8438;
			local83.aString61 = arg0.method4395();
			local83.aString62 = arg0.method4395();
		}
		Static475.anInt8048 = arg0.method4371();
		Static463.aBoolean571 = true;
	}
}
