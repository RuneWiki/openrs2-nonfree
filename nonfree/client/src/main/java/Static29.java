import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bca", name = "n", descriptor = "Lclient!dn;")
	public static Class69 aClass69_10;

	@OriginalMember(owner = "client!bca", name = "q", descriptor = "Lclient!cu;")
	public static final Class54 aClass54_1 = new Class54(5, 4);

	@OriginalMember(owner = "client!bca", name = "r", descriptor = "Lclient!cea;")
	private static final Class45 aClass45_17 = new Class45("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "[I")
	public static final int[] anIntArray60 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILclient!sa;)V")
	public static void method800(@OriginalArg(0) int arg0, @OriginalArg(1) Class7 arg1) {
		Static296.aClass7Array11[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static379.aByteArrayArrayArray13[0][arg0][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static379.aByteArrayArrayArray13[arg1][arg0][arg3] & 0x10) == 0) {
			return arg2 == Static50.method1403(arg1, arg3, arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method806(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static330.anInt6194 >= 100 && !Static132.aBoolean231 || Static330.anInt6194 >= 200) {
			Static484.method7507(Static125.aClass45_46.method1474(Static544.anInt7853));
			return;
		}
		@Pc(27) String local27 = Static442.method6847(arg0);
		if (local27 == null) {
			return;
		}
		@Pc(70) String local70;
		for (@Pc(32) int local32 = 0; local32 < Static330.anInt6194; local32++) {
			@Pc(40) String local40 = Static442.method6847(Static163.aStringArray18[local32]);
			if (local40 != null && local40.equals(local27)) {
				Static484.method7507(arg0 + Static385.aClass45_103.method1474(Static544.anInt7853));
				return;
			}
			if (Static223.aStringArray23[local32] != null) {
				local70 = Static442.method6847(Static223.aStringArray23[local32]);
				if (local70 != null && local70.equals(local27)) {
					Static484.method7507(arg0 + Static385.aClass45_103.method1474(Static544.anInt7853));
					return;
				}
			}
		}
		for (@Pc(100) int local100 = 0; local100 < Static508.anInt8897; local100++) {
			local70 = Static442.method6847(Static537.aStringArray44[local100]);
			if (local70 != null && local70.equals(local27)) {
				Static484.method7507(aClass45_17.method1474(Static544.anInt7853) + arg0 + Static450.aClass45_117.method1474(Static544.anInt7853));
				return;
			}
			if (Static515.aStringArray38[local100] != null) {
				@Pc(143) String local143 = Static442.method6847(Static515.aStringArray38[local100]);
				if (local143 != null && local143.equals(local27)) {
					Static484.method7507(aClass45_17.method1474(Static544.anInt7853) + arg0 + Static450.aClass45_117.method1474(Static544.anInt7853));
					return;
				}
			}
		}
		if (Static442.method6847(Static107.aClass20_Sub1_Sub1_Sub1_1.aString13).equals(local27)) {
			Static484.method7507(Static291.aClass45_85.method1474(Static544.anInt7853));
		} else {
			Static216.method3997(Static3.aClass252_1);
			Static259.aClass1_Sub17_Sub2_1.method4451(Static115.method2266(arg0));
			Static259.aClass1_Sub17_Sub2_1.method4464(arg0);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)Z")
	public static boolean method807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
