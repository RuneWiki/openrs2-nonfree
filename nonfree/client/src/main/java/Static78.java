import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!k", name = "h", descriptor = "Lclient!ah;")
	public static Class7 aClass7_34;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!k", name = "m", descriptor = "Lclient!ah;")
	public static Class7 aClass7_35;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public static int anInt2318 = 0;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	public static int anInt2319 = 0;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "Lclient!eh;")
	public static Class28 aClass28_729 = Static170.method3101("title_mute");

	@OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
	public static int[] anIntArray380 = new int[1000];

	@OriginalMember(owner = "client!k", name = "g", descriptor = "Lclient!eh;")
	public static Class28 aClass28_730 = Static170.method3101("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!k", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[112];

	@OriginalMember(owner = "client!k", name = "j", descriptor = "Lclient!eh;")
	public static Class28 aClass28_731 = Static170.method3101("Mitglieder)2Welt");

	@OriginalMember(owner = "client!k", name = "o", descriptor = "I")
	public static int anInt2324 = 0;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
	public static int[] anIntArray382 = new int[100];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z")
	public static boolean method1812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1813() {
		anIntArray381 = null;
		aBooleanArray12 = null;
		aClass28_731 = null;
		anIntArray380 = null;
		aClass7_34 = null;
		anIntArray382 = null;
		aClass28_729 = null;
		aClass28_730 = null;
		aClass7_35 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BLclient!eh;Z)V")
	public static void method1814(@OriginalArg(1) Class28 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class28 local7 = arg0.method931();
		@Pc(10) short[] local10 = new short[16];
		@Pc(12) int local12 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static27.anInt878; local21++) {
			@Pc(26) Class3_Sub2_Sub10 local26 = Static76.method1736(local21);
			if ((!arg1 || local26.aBoolean104) && local26.aClass28_566.method931().method903(local7) != -1) {
				if (local12 >= 250) {
					Static73.anInt2180 = -1;
					Static45.aShortArray13 = null;
					return;
				}
				if (local12 >= local10.length) {
					@Pc(58) short[] local58 = new short[local10.length * 2];
					for (@Pc(60) int local60 = 0; local60 < local12; local60++) {
						local58[local60] = local10[local60];
					}
					local10 = local58;
				}
				local10[local12++] = (short) local21;
			}
		}
		Static45.aShortArray13 = local10;
		Static174.anInt4183 = 0;
		Static73.anInt2180 = local12;
		@Pc(96) Class28[] local96 = new Class28[Static73.anInt2180];
		for (@Pc(98) int local98 = 0; local98 < Static73.anInt2180; local98++) {
			local96[local98] = Static76.method1736(local10[local98]).aClass28_566;
		}
		Static144.method1397(local96, Static45.aShortArray13);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!gg;ILclient!fd;I)V")
	public static void method1815(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7_Sub1 arg2) {
		@Pc(5) byte[] local5 = null;
		@Pc(7) Class23 local7 = Static69.aClass23_8;
		synchronized (Static69.aClass23_8) {
			for (@Pc(14) Class3_Sub22 local14 = (Class3_Sub22) Static69.aClass23_8.method858(); local14 != null; local14 = (Class3_Sub22) Static69.aClass23_8.method861()) {
				if ((long) arg1 == local14.aLong144 && arg0 == local14.aClass34_4 && local14.anInt3878 == 0) {
					local5 = local14.aByteArray39;
					break;
				}
			}
		}
		if (local5 == null) {
			@Pc(64) byte[] local64 = arg0.method1214(arg1);
			arg2.method1043(arg1, arg0, true, local64);
		} else {
			arg2.method1043(arg1, arg0, true, local5);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/Object;BLclient!qf;)V")
	public static void method1816(@OriginalArg(0) Object arg0, @OriginalArg(2) Class68 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg1.anEventQueue1.peekEvent() != null; local16++) {
			Static65.method1574(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
