import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "[[Lclient!tg;")
	public static Class191[][] aClass191ArrayArray1;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_42 = new Class157(58, 5);

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
	public static int anInt1184 = 0;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_27 = new Class140("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!iq;Lclient!iq;Lclient!iq;I)V")
	public static void method1362(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class104 arg2) {
		Static294.aClass104_150 = arg0;
		Static139.method2700(arg1, arg2);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIB)V")
	public static void method1365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= Static108.anInt2266 && arg1 <= Static205.anInt4504) {
			@Pc(21) int local21 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg2);
			@Pc(27) int local27 = Static12.method187(Static197.anInt4298, Static38.anInt553, arg3);
			Static137.method2632(local21, arg1, local27, arg0);
		}
	}
}
