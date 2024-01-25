import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "Lclient!ac;")
	public static Class5 aClass5_3;

	@OriginalMember(owner = "client!mga", name = "l", descriptor = "Lclient!ri;")
	public static Class284 aClass284_24;

	@OriginalMember(owner = "client!mga", name = "h", descriptor = "I")
	public static int anInt1525 = 0;

	@OriginalMember(owner = "client!mga", name = "k", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_45 = new Class123(48, 4);

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(IIILclient!iq;Lclient!iq;)V")
	public static void method1386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25_Sub2_Sub3 arg3, @OriginalArg(4) Class25_Sub2_Sub3 arg4) {
		@Pc(4) Class333 local4 = Static195.method3408(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass25_Sub2_Sub3_2 = arg3;
		local4.aClass25_Sub2_Sub3_1 = arg4;
		@Pc(19) int local19 = Static256.aClass127Array3 == Static108.aClass127Array5 ? 1 : 0;
		if (!arg3.method6653()) {
			Static69.aClass25_Sub2ArrayArray3[local19][Static473.anIntArray482[local19]++] = arg3;
		} else if (arg3.method6655()) {
			Static468.aClass25_Sub2ArrayArray4[local19][Static154.anIntArray135[local19]++] = arg3;
		} else {
			Static530.aClass25_Sub2ArrayArray5[local19][Static199.anIntArray186[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method6653()) {
			if (arg4.method6655()) {
				Static468.aClass25_Sub2ArrayArray4[local19][Static154.anIntArray135[local19]++] = arg4;
				return;
			}
			Static530.aClass25_Sub2ArrayArray5[local19][Static199.anIntArray186[local19]++] = arg4;
			return;
		}
		Static69.aClass25_Sub2ArrayArray3[local19][Static473.anIntArray482[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method1390(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static592.method5615(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static519.method7216(local7);
			local7 = Static488.method6601("%3a", ":", local7);
			local7 = Static488.method6601("%40", "@", local7);
			local7 = Static488.method6601("%26", "&", local7);
			local7 = Static488.method6601("%23", "#", local7);
			if (Static560.anApplet2 != null) {
				@Pc(103) Class309 local103 = Static210.aClass168_17.method4079(new URL(Static560.anApplet2.getCodeBase(), "clienterror.ws?c=" + Static509.anInt6570 + "&u=" + Static226.aLong108 + "&v1=" + Static268.aString131 + "&v2=" + Static268.aString134 + "&e=" + local7));
				while (local103.anInt8650 == 0) {
					Static373.method5240(1L);
				}
				if (local103.anInt8650 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local103.anObject15;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}
}
