import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	public static int anInt5066 = 0;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_83 = new Class268(112, 0);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIILclient!ns;I)V")
	public static void method4524(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class20_Sub2_Sub2_Sub1 arg3) {
		Static298.method5521(arg3.anInt10729, 0, arg1, arg3.anInt10725, arg2, arg3.aByte131, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ)I")
	public static int method4531(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = Static469.anInt8256;
		if (local10 == 0) {
			return arg0 ? 0 : Static617.anInt10193;
		} else if (local10 == 1) {
			return Static617.anInt10193;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I")
	public static int method4533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZZI)V")
	public static void method4536(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static441.anInt7960--;
			if (Static441.anInt7960 == 0) {
				Static91.anIntArray99 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static96.anInt1893--;
		if (Static96.anInt1893 == 0) {
			Static152.anIntArray292 = null;
			return;
		}
	}
}
