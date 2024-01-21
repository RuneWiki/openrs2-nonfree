import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!rc;")
	public static Class1_Sub5 aClass1_Sub5_3;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	public static int anInt766;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_3;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!gd;")
	public static Class23 aClass23_431 = Static15.method178("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_432 = Static15.method178("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!gd;")
	public static Class23 aClass23_433 = Static15.method178("::hiddenbuttontest");

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public static int anInt759 = 0;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public static int anInt761 = 0;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_434 = Static15.method178("@whi@");

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!o;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_435 = Static15.method178("titlebox");

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!gd;")
	public static Class23 aClass23_436 = Static15.method178("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!mb;I)V")
	public static void method412(@OriginalArg(0) Class1_Sub1_Sub6_Sub3 arg0) {
		for (@Pc(5) int local5 = 0; local5 < Static28.anIntArray261.length; local5++) {
			Static28.anIntArray261[local5] = 0;
		}
		@Pc(28) int local28;
		for (@Pc(19) int local19 = 0; local19 < 5000; local19++) {
			local28 = (int) ((double) 256 * Math.random() * 128.0D);
			Static28.anIntArray261[local28] = (int) (Math.random() * 256.0D);
		}
		@Pc(44) int local44;
		@Pc(47) int local47;
		@Pc(54) int local54;
		for (local28 = 0; local28 < 20; local28++) {
			for (local44 = 1; local44 < 255; local44++) {
				for (local47 = 1; local47 < 127; local47++) {
					local54 = local47 + (local44 << 7);
					Static1.anIntArray9[local54] = (Static28.anIntArray261[local54 - 128] + Static28.anIntArray261[local54 + 1] + Static28.anIntArray261[local54 + -1] + Static28.anIntArray261[local54 - -128]) / 4;
				}
			}
			@Pc(98) int[] local98 = Static28.anIntArray261;
			Static28.anIntArray261 = Static1.anIntArray9;
			Static1.anIntArray9 = local98;
		}
		if (arg0 == null) {
			return;
		}
		local44 = 0;
		for (local47 = 0; local47 < arg0.anInt1883; local47++) {
			for (local54 = 0; local54 < arg0.anInt1878; local54++) {
				if (arg0.aByteArray11[local44++] != 0) {
					@Pc(132) int local132 = local54 + arg0.anInt1879 + 16;
					@Pc(139) int local139 = arg0.anInt1881 + local47 + 16;
					@Pc(145) int local145 = (local139 << 7) + local132;
					Static28.anIntArray261[local145] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
	public static void method413(@OriginalArg(1) int arg0) {
		for (Static36.anInt1279 += arg0; Static36.anInt1279 >= Static109.anInt2826; Static36.anInt1279 -= Static109.anInt2826) {
			Static46.anInt1581 -= Static46.anInt1581 >> 2;
		}
		Static46.anInt1581 -= arg0 * 1000;
		if (Static46.anInt1581 < 0) {
			Static46.anInt1581 = 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!w;IILclient!nd;)V")
	public static void method414(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(3) Class1_Sub7 local3 = new Class1_Sub7();
		local3.aClass55_Sub1_8 = arg0;
		local3.anInt1483 = 1;
		local3.aLong85 = arg1;
		local3.aClass41_1 = arg2;
		@Pc(22) Class45 local22 = Static48.aClass45_4;
		synchronized (Static48.aClass45_4) {
			Static48.aClass45_4.method1295(local3);
		}
		Static61.method1199();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method415() {
		aClass55_Sub1_3 = null;
		aClass23_435 = null;
		aClass23_431 = null;
		aClass23_436 = null;
		aClass23_434 = null;
		aClass23_433 = null;
		aClass1_Sub5_3 = null;
		anIntArray109 = null;
		aClass23_432 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	public static void method416(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static113.aClass29_1);
		arg0.removeFocusListener(Static113.aClass29_1);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public static void method417() {
		Static9.aBoolean7 = false;
		Static103.aBoolean124 = false;
	}
}
