import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!su;")
	public static Class215 aClass215_55;

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	public static int anInt3319;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_104 = new Class175("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
	public static int anInt3335 = 500;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BIIIII)Z")
	public static boolean method2710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg3; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg1; local16++) {
				if (arg0 == Static417.anIntArrayArray56[local12][local16] && Static321.anIntArrayArray46[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Lclient!ef;")
	public static Class3_Sub3_Sub7 method2714() {
		@Pc(13) Class3_Sub3_Sub7 local13 = (Class3_Sub3_Sub7) Static417.aClass248_9.method5661();
		if (local13 != null) {
			local13.method5987();
			local13.method4647();
			return local13;
		}
		do {
			local13 = (Class3_Sub3_Sub7) Static435.aClass248_10.method5661();
			if (local13 == null) {
				return null;
			}
			if (local13.method1564() > Static150.method2672()) {
				return null;
			}
			local13.method5987();
			local13.method4647();
		} while ((Long.MIN_VALUE & local13.aLong175) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZB)V")
	public static void method2715(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static344.anInt6255--;
			if (Static344.anInt6255 == 0) {
				Static168.anIntArray264 = null;
			}
		}
		Static413.anInt3900--;
		if (Static413.anInt3900 == 0) {
			Static351.anIntArray458 = null;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)I")
	public static int method2718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static44.aByteArrayArray21 == null ? 0 : Static44.aByteArrayArray21[arg0][arg1] & 0xFF;
	}
}
