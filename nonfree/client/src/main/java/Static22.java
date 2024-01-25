import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_7 = new Class252(15, 7);

	@OriginalMember(owner = "client!at", name = "s", descriptor = "Lclient!rp;")
	public static final Class259 aClass259_1 = new Class259();

	@OriginalMember(owner = "client!at", name = "u", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_12 = new Class45("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V")
	public static void method601() {
		Static141.aBoolean240 = true;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method606(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(44) StringBuffer local44 = new StringBuffer(local8 + local10);
		for (@Pc(46) int local46 = 0; local46 < local8; local46++) {
			@Pc(52) char local52 = arg0.charAt(local46);
			if (local52 == '<') {
				local44.append("<lt>");
			} else if (local52 == '>') {
				local44.append("<gt>");
			} else {
				local44.append(local52);
			}
		}
		return local44.toString();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIIIBLclient!dn;I)V")
	public static void method607(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class69 arg2) {
		Static129.aBoolean226 = false;
		Static471.aClass69_91 = arg2;
		Static179.anInt3754 = arg0;
		Static99.anInt2118 = 0;
		Static283.anInt5391 = 1;
		Static322.anInt6116 = 2;
		Static382.anInt6788 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)[Lclient!il;")
	public static Class139[] method608() {
		return new Class139[] { Static334.aClass139_4, Static392.aClass139_6, Static347.aClass139_5, Static291.aClass139_3, Static283.aClass139_2, Static545.aClass139_7 };
	}
}
