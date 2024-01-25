import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "Lclient!gba;")
	public static Class121 aClass121_1;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public static int anInt8495;

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_163 = new Class136(52, 6);

	@OriginalMember(owner = "client!ro", name = "t", descriptor = "Z")
	public static final boolean aBoolean702 = false;

	@OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
	public static int anInt8500 = 0;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V")
	public static void method7307() {
		@Pc(14) Class62 local14 = null;
		try {
			@Pc(22) Class330 local22 = Static214.aClass192_1.method4332("");
			while (local22.anInt9132 == 0) {
				Static452.method7478(1L);
			}
			if (local22.anInt9132 == 1) {
				local14 = (Class62) local22.anObject19;
				@Pc(47) Class5_Sub12 local47 = Static627.aClass5_Sub46_31.method8189();
				local14.method1259(0, local47.anInt10154, local47.aByteArray104);
			}
		} catch (@Pc(57) Exception local57) {
		}
		try {
			if (local14 != null) {
				local14.method1255();
			}
		} catch (@Pc(64) Exception local64) {
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIB)V")
	public static void method7310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static567.method8019(arg1)) {
			Static211.method3222(Static441.aClass357ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBJ)Ljava/lang/String;")
	public static String method7316(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1) {
		Static170.method2647(arg1);
		@Pc(18) int local18 = Static222.aCalendar1.get(5);
		@Pc(22) int local22 = Static222.aCalendar1.get(2);
		@Pc(26) int local26 = Static222.aCalendar1.get(1);
		return arg0 == 3 ? Static250.method3889(arg0, arg1) : Integer.toString(local18 / 10) + local18 % 10 + "-" + Static170.aStringArrayArray1[arg0][local22] + "-" + local26;
	}
}
