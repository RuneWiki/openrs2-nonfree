import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "[Lclient!ya;")
	public static Class139[] aClass139Array3;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_271 = new Class67(111, 7);

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "Lclient!wm;")
	public static final Class1_Sub19 aClass1_Sub19_7 = new Class1_Sub19(new byte[5000]);

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	public static int anInt7194 = 1;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "Lclient!td;")
	public static final Class236 aClass236_1 = new Class236();

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_120 = new Class242(16, 8);

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "Lclient!du;")
	public static final Class62 aClass62_40 = new Class62(4, 5);

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([Ljava/lang/Object;[IIZI)V")
	public static void method5826(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg3 + arg2) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) int local25 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local25;
		@Pc(39) Object local39 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local39;
		@Pc(58) int local58 = ~local25 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg2; local60 < arg3; local60++) {
			if ((local58 & local60) + local25 > arg1[local60]) {
				@Pc(75) int local75 = arg1[local60];
				arg1[local60] = arg1[local21];
				arg1[local21] = local75;
				@Pc(89) Object local89 = arg0[local60];
				arg0[local60] = arg0[local21];
				arg0[local21++] = local89;
			}
		}
		arg1[arg3] = arg1[local21];
		arg1[local21] = local25;
		arg0[arg3] = arg0[local21];
		arg0[local21] = local39;
		method5826(arg0, arg1, arg2, local21 - 1);
		method5826(arg0, arg1, local21 + 1, arg3);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B)Lclient!vf;")
	public static Class1_Sub3_Sub17 method5827(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class1_Sub3_Sub17 local9 = new Class1_Sub3_Sub17();
		@Pc(14) Class1_Sub19 local14 = new Class1_Sub19(arg0);
		local14.anInt3698 = local14.aByteArray38.length - 2;
		@Pc(25) int local25 = local14.method2896();
		@Pc(36) int local36 = local14.aByteArray38.length - local25 - 2 - 12;
		local14.anInt3698 = local36;
		@Pc(43) int local43 = local14.method2877();
		local9.anInt6849 = local14.method2896();
		local9.anInt6844 = local14.method2896();
		local9.anInt6842 = local14.method2896();
		local9.anInt6847 = local14.method2896();
		@Pc(67) int local67 = local14.method2915();
		@Pc(75) int local75;
		@Pc(81) int local81;
		if (local67 > 0) {
			local9.aClass208Array1 = new Class208[local67];
			for (local75 = 0; local75 < local67; local75++) {
				local81 = local14.method2896();
				@Pc(90) Class208 local90 = new Class208(Static191.method2764(local81));
				local9.aClass208Array1[local75] = local90;
				while (local81-- > 0) {
					@Pc(101) int local101 = local14.method2877();
					@Pc(105) int local105 = local14.method2877();
					local90.method4413((long) local101, new Class1_Sub18(local105));
				}
			}
		}
		local14.anInt3698 = 0;
		local9.aString67 = local14.method2939();
		local9.anIntArray488 = new int[local43];
		local9.anIntArray489 = new int[local43];
		local9.aStringArray50 = new String[local43];
		local75 = 0;
		while (local14.anInt3698 < local36) {
			local81 = local14.method2896();
			if (local81 == 3) {
				local9.aStringArray50[local75] = local14.method2914().intern();
			} else if (local81 >= 100 || local81 == 21 || local81 == 38 || local81 == 39) {
				local9.anIntArray489[local75] = local14.method2915();
			} else {
				local9.anIntArray489[local75] = local14.method2877();
			}
			local9.anIntArray488[local75++] = local81;
		}
		return local9;
	}
}
