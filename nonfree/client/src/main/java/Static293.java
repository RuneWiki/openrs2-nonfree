import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public static int anInt5243;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	public static int anInt5245;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "[Lclient!ss;")
	public static final Class3_Sub48[] aClass3_Sub48Array1 = new Class3_Sub48[300];

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_49 = new Class286(24, 3);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIII)V")
	public static void method4419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13 = Static405.anInt7239;
		if (local13 == 0) {
			return;
		}
		if (local13 == 1) {
			Static80.anInt1246 = arg2;
			Static584.anInt9538 = arg0;
			Static176.anInt3170 = arg1;
			Static489.anInt8463 = arg3;
			Static405.anInt7239 = 2;
		} else if (local13 == 2) {
			if (arg3 < Static489.anInt8463) {
				Static489.anInt8463 = arg3;
			}
			if (arg2 > Static80.anInt1246) {
				Static80.anInt1246 = arg2;
			}
			if (arg1 > Static176.anInt3170) {
				Static176.anInt3170 = arg1;
			}
			if (arg0 < Static584.anInt9538) {
				Static584.anInt9538 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZII)I")
	public static int method4421(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub51 local8 = Static321.method5223(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray576.length) {
			return local8.anIntArray576[arg1];
		} else {
			return 0;
		}
	}
}
