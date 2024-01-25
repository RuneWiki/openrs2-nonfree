import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	public static int anInt10604;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_153 = new Class90(97, 14);

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "Lclient!au;")
	public static final Class22 aClass22_65 = new Class22();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BB)V")
	public static void method8262(@OriginalArg(0) byte arg0) {
		if (Static159.aByteArrayArrayArray3 == null) {
			Static159.aByteArrayArrayArray3 = new byte[4][Static338.anInt6508][Static390.anInt7654];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static338.anInt6508; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static390.anInt7654; local27++) {
					Static159.aByteArrayArrayArray3[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IBLclient!vj;Lclient!fo;)V")
	public static void method8263(@OriginalArg(0) int arg0, @OriginalArg(2) Class21_Sub1 arg1, @OriginalArg(3) Class111 arg2) {
		if (Static399.anInt7806 >= 50 || (arg2 == null || arg2.anIntArrayArray14 == null || arg0 >= arg2.anIntArrayArray14.length || arg2.anIntArrayArray14[arg0] == null)) {
			return;
		}
		@Pc(40) int local40 = arg2.anIntArrayArray14[arg0][0];
		@Pc(44) int local44 = local40 >> 8;
		@Pc(50) int local50 = local40 >> 5 & 0x7;
		@Pc(54) int local54 = local40 & 0x1F;
		@Pc(73) int local73;
		if (arg2.anIntArrayArray14[arg0].length > 1) {
			local73 = (int) (Math.random() * (double) arg2.anIntArrayArray14[arg0].length);
			if (local73 > 0) {
				local44 = arg2.anIntArrayArray14[arg0][local73];
			}
		}
		local73 = 256;
		if (arg2.anIntArray151 != null && arg2.anIntArray154 != null) {
			local73 = (int) ((double) (arg2.anIntArray154[arg0] - arg2.anIntArray151[arg0]) * Math.random()) + arg2.anIntArray151[arg0];
		}
		@Pc(121) int local121 = arg2.anIntArray152 == null ? 255 : arg2.anIntArray152[arg0];
		if (local54 == 0) {
			if (arg1 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2) {
				if (arg2.aBoolean233) {
					Static414.method6238(false, local121, 0, local73, local50, local44);
					return;
				}
				Static170.method2832(local73, local121, 0, local50, local44);
			}
		} else if (Static455.aClass4_Sub35_Sub1_1.anInt9929 != 0) {
			@Pc(160) int local160 = arg1.anInt10551 - 256 >> 9;
			@Pc(167) int local167 = arg1.anInt10550 - 256 >> 9;
			@Pc(187) int local187 = arg1 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 ? 0 : local54 + (local167 << 8) + (local160 << 16) + (arg1.aByte127 << 24);
			Static256.aClass185Array1[Static399.anInt7806++] = new Class185((byte) (arg2.aBoolean233 ? 2 : 1), local44, local50, 0, local121, local187, local73, arg1);
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
	public static void method8264(@OriginalArg(0) int arg0) {
		Static570.anInt10306 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static10.anInt812; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static255.anInt5209; local6++) {
				if (Static571.aClass182ArrayArrayArray3[arg0][local3][local6] == null) {
					Static571.aClass182ArrayArrayArray3[arg0][local3][local6] = new Class182(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IF)F")
	public static float method8265(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}
}
