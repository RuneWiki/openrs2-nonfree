import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "Lclient!jc;")
	public static final Class145 aClass145_8 = new Class145();

	@OriginalMember(owner = "client!wa", name = "E", descriptor = "Lclient!h;")
	public static final Class114 aClass114_168 = new Class114(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "Lclient!gf;")
	public static final Class102 aClass102_5 = new Class102();

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "Lclient!mo;")
	public static final Class196 aClass196_6 = new Class196();

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_140 = new Class6(33, 3);

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "[I")
	public static final int[] anIntArray770 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
	public static int anInt8926 = -1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILclient!lca;)V")
	public static void method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class47_Sub1 arg4) {
		@Pc(4) Class206 local4 = Static64.method1808(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1857 = (arg1 << Static246.anInt4759) + Static444.anInt7507;
		arg4.anInt1858 = arg3;
		arg4.anInt1855 = (arg2 << Static246.anInt4759) + Static444.anInt7507;
		for (@Pc(28) Class168 local28 = local4.aClass168_2; local28 != null; local28 = local28.aClass168_1) {
			if (local28.aClass47_Sub2_2.aBoolean553) {
				@Pc(38) int local38 = local28.aClass47_Sub2_2.method6953();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1858 += local8;
			arg4.aBoolean142 = true;
		} else if (local4.aClass47_Sub3_1 != null) {
			arg4.anInt1858 -= local4.aClass47_Sub3_1.aShort112;
		}
		local4.aClass47_Sub1_1 = arg4;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!wca;I)I")
	public static int method7501(@OriginalArg(0) Class1_Sub50 arg0) {
		@Pc(7) String local7 = Static255.method4303(arg0);
		@Pc(9) int[] local9 = null;
		if (Static34.method1308(arg0.anInt8983)) {
			local9 = Static454.aClass153_2.method4007((int) arg0.aLong236).anIntArray410;
		} else if (arg0.anInt8980 != -1) {
			local9 = Static454.aClass153_2.method4007(arg0.anInt8980).anIntArray410;
		} else if (Static270.method4524(arg0.anInt8983)) {
			@Pc(86) Class1_Sub10 local86 = (Class1_Sub10) Static258.aClass174_15.method4422((long) arg0.aLong236);
			if (local86 != null) {
				@Pc(91) Class47_Sub2_Sub3_Sub1 local91 = local86.aClass47_Sub2_Sub3_Sub1_2;
				@Pc(94) Class238 local94 = local91.aClass238_1;
				if (local94.anIntArray511 != null) {
					local94 = local94.method5866(Static343.aClass286_1);
				}
				if (local94 != null) {
					local9 = local94.anIntArray509;
				}
			}
		} else if (Static460.method6777(arg0.anInt8983)) {
			@Pc(55) Class288 local55;
			if (arg0.anInt8983 == 1012) {
				local55 = Static365.aClass194_6.method5084((int) arg0.aLong236);
			} else {
				local55 = Static365.aClass194_6.method5084((int) (arg0.aLong236 >>> 32 & 0x7FFFFFFFL));
			}
			if (local55.anIntArray650 != null) {
				local55 = local55.method7065(Static343.aClass286_1);
			}
			if (local55 != null) {
				local9 = local55.anIntArray649;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static300.method5019(local9);
		}
		@Pc(135) int local135 = Static159.aClass177_3.method4662(local7, Static274.aClass12Array17);
		if (arg0.aBoolean621) {
			local135 += Static125.aClass12_2.c() + 4;
		}
		return local135;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[II[II)V")
	public static void method7502(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(21) int local21 = (arg1 + arg3) / 2;
		@Pc(23) int local23 = arg1;
		@Pc(27) int local27 = arg0[local21];
		arg0[local21] = arg0[arg3];
		arg0[arg3] = local27;
		@Pc(41) int local41 = arg2[local21];
		arg2[local21] = arg2[arg3];
		arg2[arg3] = local41;
		@Pc(60) int local60 = ~local27 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg1; local62 < arg3; local62++) {
			if ((local60 & local62) + local27 > arg0[local62]) {
				@Pc(80) int local80 = arg0[local62];
				arg0[local62] = arg0[local23];
				arg0[local23] = local80;
				@Pc(94) int local94 = arg2[local62];
				arg2[local62] = arg2[local23];
				arg2[local23++] = local94;
			}
		}
		arg0[arg3] = arg0[local23];
		arg0[local23] = local27;
		arg2[arg3] = arg2[local23];
		arg2[local23] = local41;
		method7502(arg0, arg1, arg2, local23 - 1);
		method7502(arg0, local23 + 1, arg2, arg3);
	}
}
