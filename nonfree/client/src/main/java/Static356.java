import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
	public static int anInt5939;

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_42 = new Class353();

	@OriginalMember(owner = "client!nm", name = "I", descriptor = "Lclient!wba;")
	public static final Class353 aClass353_43 = new Class353();

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "Ljava/lang/String;")
	public static String aString59 = "";

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
	public static int anInt5940 = 0;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
	public static void method4855(@OriginalArg(0) boolean arg0) {
		if (aString59.length() == 0) {
			return;
		}
		Static165.method2388("--> " + aString59);
		Static512.method7118(arg0, aString59, false);
		Static133.anInt4003 = 0;
		Static184.anInt3252 = 0;
		aString59 = "";
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)Lclient!sn;")
	public static Class308 method4859(@OriginalArg(0) int arg0) {
		@Pc(8) Class308[] local8 = Static146.method7815();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class308 local16 = local8[local10];
			if (arg0 == local16.anInt8097) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method4862(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(12) byte[] local12 = new byte[24];
		if (Static26.aClass363_1 != null) {
			@Pc(26) int local26;
			try {
				Static26.aClass363_1.method7843(0L);
				Static26.aClass363_1.method7841(local12);
				for (local26 = 0; local26 < 24 && local12[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(53) Exception local53) {
				for (local26 = 0; local26 < 24; local26++) {
					local12[local26] = -1;
				}
			}
		}
		arg0.method5781(24, local12);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public static void method4864() {
		@Pc(7) Class91 local7 = null;
		try {
			local7 = Static148.method2167("2");
			@Pc(21) Class1_Sub35 local21 = new Class1_Sub35(Static214.anInt4111 * 6 + 3);
			local21.method5777(1);
			local21.method5776(Static214.anInt4111);
			for (@Pc(31) int local31 = 0; local31 < Static257.anIntArray365.length; local31++) {
				if (Static574.aBooleanArray27[local31]) {
					local21.method5776(local31);
					local21.method5792(Static257.anIntArray365[local31]);
				}
			}
			local7.method1834(local21.anInt7214, 0, local21.aByteArray85);
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (local7 != null) {
				local7.method1833();
			}
		} catch (@Pc(76) Exception local76) {
		}
		Static172.aLong98 = Static413.method5668();
		Static151.aBoolean207 = false;
	}
}
