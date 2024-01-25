import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array20;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
	public static int anInt9456 = 0;

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray67 = new String[200];

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "Lclient!he;")
	public static final Class128 aClass128_46 = new Class128(64);

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "Lclient!oi;")
	public static final Class240 aClass240_13 = new Class240("", 11);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	public static void method8036(@OriginalArg(1) int arg0) {
		Static286.anInt5670 = arg0;
		Static385.aClass166_36.method4811();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
	public static void method8038(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class6 local9 = Static284.aClass128_35.method3556(); local9 != null; local9 = Static284.aClass128_35.method3555()) {
			if ((long) arg0 == (local9.aLong278 >> 48 & 0xFFFFL)) {
				local9.method9043();
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIB)V")
	public static void method8039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 * Static348.aClass6_Sub22_19.aClass15_Sub18_2.method5678() >> 8;
		if (arg1 == -1 && !Static166.aBoolean250) {
			Static604.method8483();
		} else if (arg1 != -1 && (Static152.anInt5128 != arg1 || !Static7.method145()) && local12 != 0 && !Static166.aBoolean250) {
			Static310.method5221(arg2, Static364.aClass353_60, local12, arg1);
			Static259.method4619();
		}
		if (arg1 != Static152.anInt5128) {
			Static452.aClass6_Sub3_Sub4_2 = null;
		}
		Static152.anInt5128 = arg1;
	}
}
