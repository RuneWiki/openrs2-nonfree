import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static646 {

	@OriginalMember(owner = "client!wu", name = "je", descriptor = "Lclient!vd;")
	public static Class353 aClass353_63;

	@OriginalMember(owner = "client!wu", name = "lc", descriptor = "I")
	public static final int anInt7035 = Static88.method1511(1600);

	@OriginalMember(owner = "client!wu", name = "Zd", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_125 = new Class268(61, -1);

	@OriginalMember(owner = "client!wu", name = "fe", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_126 = new Class268(97, 6);

	@OriginalMember(owner = "client!wu", name = "ge", descriptor = "[I")
	public static final int[] anIntArray427 = new int[14];

	@OriginalMember(owner = "client!wu", name = "og", descriptor = "Lclient!qg;")
	public static final Class271 aClass271_15 = new Class271("stellardawn", 1);

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(II)I")
	public static int method6043(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)Lclient!ma;")
	public static Class20_Sub2_Sub1 method6138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass20_Sub2_Sub1_2;
	}
}
