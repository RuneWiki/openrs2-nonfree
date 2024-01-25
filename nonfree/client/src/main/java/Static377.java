import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
	public static int anInt6755;

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_135 = new Class359(44, 4);

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_56 = new Class305(43, 6);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
	public static void method5633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(35) int local35 = local13 << 1;
		@Pc(39) int local39 = arg3 << 1;
		@Pc(48) int local48 = (1 - local39) * local13 + local21;
		@Pc(57) int local57 = local17 - (local39 - 1) * local35;
		@Pc(61) int local61 = local13 << 2;
		@Pc(65) int local65 = local17 << 2;
		@Pc(73) int local73 = local21 * 3;
		@Pc(81) int local81 = local35 * ((arg3 << 1) - 3);
		@Pc(87) int local87 = local65;
		@Pc(93) int local93 = local61 * (arg3 - 1);
		Static197.method3240(arg1 + arg2, Static16.anIntArrayArray2[arg0], arg1 - arg2, arg4);
		while (local9 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local48 += local73;
					local57 += local87;
					local87 += local65;
					local7++;
					local73 += local65;
				}
			}
			if (local57 < 0) {
				local48 += local73;
				local57 += local87;
				local7++;
				local87 += local65;
				local73 += local65;
			}
			local48 += -local93;
			local57 += -local81;
			local81 -= local61;
			local9--;
			local93 -= local61;
			@Pc(182) int local182 = arg0 - local9;
			@Pc(186) int local186 = local9 + arg0;
			@Pc(190) int local190 = arg1 + local7;
			@Pc(194) int local194 = arg1 - local7;
			Static197.method3240(local190, Static16.anIntArrayArray2[local182], local194, arg4);
			Static197.method3240(local190, Static16.anIntArrayArray2[local186], local194, arg4);
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public static void method5635() {
		for (@Pc(4) Class5_Sub3_Sub15 local4 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8322(); local4 != null; local4 = (Class5_Sub3_Sub15) Static609.aClass358_13.method8328()) {
			if (local4.anInt8017 > 1) {
				local4.anInt8017 = 0;
				Static145.aClass340_16.method7986(((Class5_Sub3_Sub20) local4.aClass358_7.aClass5_Sub3_60.aClass5_Sub3_66).aLong290, local4);
				local4.aClass358_7.method8327();
			}
		}
		Static248.anInt4552 = 0;
		Static483.anInt8099 = 0;
		Static231.aClass114_24.method2808();
		Static254.aClass300_18.method7189();
		Static609.aClass358_13.method8327();
		Static493.aBoolean702 = false;
	}
}
