import java.awt.Color;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Lclient!ht;")
	public static final Class151 aClass151_11 = new Class151();

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method7740(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static463.method6857(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static395.method5861(local7);
			local7 = Static321.method4874(local7, ":", "%3a");
			local7 = Static321.method4874(local7, "@", "%40");
			local7 = Static321.method4874(local7, "&", "%26");
			local7 = Static321.method4874(local7, "#", "%23");
			if (Static254.anApplet2 != null) {
				@Pc(106) Class91 local106 = Static401.aClass100_10.method2088(new URL(Static254.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static559.anInt9421 + "&u=" + (Static170.aString37 == null ? String.valueOf(Static344.aLong141) : Static170.aString37) + "&v1=" + Static144.aString32 + "&v2=" + Static144.aString34 + "&e=" + local7));
				while (local106.anInt2271 == 0) {
					Static314.method4821(1L);
				}
				if (local106.anInt2271 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local106.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!ew;BII)Lclient!sw;")
	public static Class5_Sub5_Sub19 method7741(@OriginalArg(0) Class98 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 10 | arg0.anInt2425;
		@Pc(19) Class5_Sub5_Sub19 local19 = (Class5_Sub5_Sub19) Static37.aClass232_1.method5128((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static436.aClass207_88.method4690(Static436.aClass207_88.method4682(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 10 | arg0.anInt2425;
			local19 = (Class5_Sub5_Sub19) Static37.aClass232_1.method5128((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static436.aClass207_88.method4690(Static436.aClass207_88.method4682(local10));
			if (local31 == null) {
				local10 = arg0.anInt2425 | 0x3FFFC00;
				local19 = (Class5_Sub5_Sub19) Static37.aClass232_1.method5128((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static436.aClass207_88.method4690(Static436.aClass207_88.method4682(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static94.method1585(local31);
					} catch (@Pc(194) Exception local194) {
						throw new RuntimeException(local194.getMessage() + " S: " + local10);
					}
					local19.aClass98_43 = arg0;
					Static37.aClass232_1.method5129(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static94.method1585(local31);
				} catch (@Pc(124) Exception local124) {
					throw new RuntimeException(local124.getMessage() + " S: " + local10);
				}
				local19.aClass98_43 = arg0;
				Static37.aClass232_1.method5129(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static94.method1585(local31);
			} catch (@Pc(45) Exception local45) {
				throw new RuntimeException(local45.getMessage() + " S: " + local10);
			}
			local19.aClass98_43 = arg0;
			Static37.aClass232_1.method5129(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public static void method7743() {
		Static45.aClass115_1.method2489();
		Static3.aClass3_3.method8871();
		Static475.aClient1.method1275();
		Static83.aCanvas14.setBackground(Color.black);
		Static403.anInt6726 = -1;
		Static45.aClass115_1 = Static517.method7654(Static83.aCanvas14);
		Static3.aClass3_3 = Static193.method7294(Static83.aCanvas14);
	}
}
