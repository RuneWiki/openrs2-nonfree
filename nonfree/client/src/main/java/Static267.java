import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!nl", name = "v", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_111 = new Class7("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V")
	public static void method3939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = Static38.aClass135_Sub1_1.anInt5109 * arg0 >> 8;
		if (arg2 == -1 && !Static176.aBoolean196) {
			Static405.method5429();
		} else if (arg2 != -1 && (Static105.anInt2176 != arg2 || !Static107.method1964()) && local10 != 0 && !Static176.aBoolean196) {
			Static450.method5913(arg1, arg2, Static312.aClass246_168, local10);
		}
		Static105.anInt2176 = arg2;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLclient!cl;)V")
	public static void method3942(@OriginalArg(1) Class31_Sub2_Sub1_Sub1 arg0) {
		@Pc(11) Class1_Sub35 local11 = (Class1_Sub35) Static348.aClass96_36.method2335((long) arg0.anInt7301);
		if (local11 == null) {
			Static84.method1594(arg0.anIntArray657[0], null, arg0.aByte100, null, 0, arg0.anIntArray658[0], arg0);
		} else {
			local11.method4370();
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
	public static void method3943(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(5, arg0);
		local8.method1775();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IC)Z")
	public static boolean method3944(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(28) char[] local28 = Static289.aCharArray9;
			for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
				@Pc(35) char local35 = local28[local30];
				if (local35 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
