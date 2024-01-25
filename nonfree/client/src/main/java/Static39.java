import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!ui;")
	public static Class230 aClass230_13;

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public static int anInt749;

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Lclient!as;")
	public static Class16 aClass16_2;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "I")
	public static int anInt751;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!o;")
	public static final Class169 aClass169_32 = new Class169("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_27 = new Class48(55, -1);

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	public static int anInt750 = -1;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)I")
	public static int method584(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
	public static void method585() {
		for (@Pc(15) int local15 = 0; local15 < Static309.anInt5243; local15++) {
			@Pc(21) int local21 = Static131.anIntArray302[local15];
			@Pc(25) Class25_Sub1_Sub1_Sub2 local25 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local21];
			if (local25 != null) {
				Static268.method4137(local25.aClass59_1.anInt1420, local25);
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method586(@OriginalArg(1) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() > 9) {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static81.aClass169_65.method3680(Static48.anInt952) + " (" + local13 + ")</col>";
		} else if (local13.length() > 6) {
			return " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static266.aClass169_248.method3680(Static48.anInt952) + " (" + local13 + ")</col>";
		} else {
			return " <col=ffff00>" + local13 + "</col>";
		}
	}
}
