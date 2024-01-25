import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "Lclient!pl;")
	public static Class259 aClass259_143;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_223 = new Class363(102, 12);

	@OriginalMember(owner = "client!rga", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray144 = new String[100];

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "F")
	public static float aFloat248 = 1.0F;

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_224 = new Class363(46, 4);

	@OriginalMember(owner = "client!rga", name = "l", descriptor = "Lclient!wl;")
	public static final Class360 aClass360_5 = new Class360("RC", 1);

	@OriginalMember(owner = "client!rga", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray145 = new String[8];

	@OriginalMember(owner = "client!rga", name = "n", descriptor = "[F")
	public static final float[] aFloatArray64 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!rga", name = "o", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_225 = new Class363(59, 8);

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)Lclient!iw;")
	public static Class136_Sub1 method6505() {
		return Static140.anInt2942 < Static225.aClass136_Sub1Array1.length ? Static225.aClass136_Sub1Array1[Static140.anInt2942++] : null;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!pl;IB)Lclient!sa;")
	public static Class294 method6506(@OriginalArg(0) Class259 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5964(arg1);
		return local13 == null ? null : new Class294(local13);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method6507(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(21) String local21 = arg0[arg2];
			return local21 == null ? "null" : local21.toString();
		} else {
			@Pc(32) int local32 = arg2 + arg1;
			@Pc(34) int local34 = 0;
			for (@Pc(41) int local41 = arg2; local41 < local32; local41++) {
				@Pc(47) String local47 = arg0[local41];
				if (local47 == null) {
					local34 += 4;
				} else {
					local34 += local47.length();
				}
			}
			@Pc(66) StringBuffer local66 = new StringBuffer(local34);
			for (@Pc(68) int local68 = arg2; local68 < local32; local68++) {
				@Pc(74) String local74 = arg0[local68];
				if (local74 == null) {
					local66.append("null");
				} else {
					local66.append(local74);
				}
			}
			return local66.toString();
		}
	}
}
