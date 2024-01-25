import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
	public static int anInt5284;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "Lclient!iq;")
	public static Class104 aClass104_136;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_160 = new Class157(68, 3);

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "[Lclient!ol;")
	public static final Class50[] aClass50Array1 = new Class50[128];

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_161 = new Class157(21, -1);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
	public static void method4486() {
		if (Static99.aFloat33 < 1024.0F) {
			Static99.aFloat33 = 1024.0F;
		}
		if (Static99.aFloat33 > 3072.0F) {
			Static99.aFloat33 = 3072.0F;
		}
		while (Static366.aFloat48 >= 16384.0F) {
			Static366.aFloat48 -= 16384.0F;
		}
		while (Static366.aFloat48 < 0.0F) {
			Static366.aFloat48 += 16384.0F;
		}
		@Pc(50) int local50 = Static98.anInt2002 >> 7;
		@Pc(54) int local54 = Static54.anInt975 >> 7;
		@Pc(60) int local60 = Static97.method1899(Static291.anInt5263, Static54.anInt975, Static98.anInt2002);
		@Pc(62) int local62 = 0;
		@Pc(82) int local82;
		if (local50 > 3 && local54 > 3 && local50 < 100 && local54 < 100) {
			for (local82 = local50 - 4; local82 <= local50 + 4; local82++) {
				for (@Pc(88) int local88 = local54 - 4; local88 <= local54 + 4; local88++) {
					@Pc(92) int local92 = Static291.anInt5263;
					if (local92 < 3 && Static283.method4811(local82, local88)) {
						local92++;
					}
					@Pc(103) int local103 = 0;
					if (Static126.aByteArrayArrayArray4 != null && Static126.aByteArrayArrayArray4[local92] != null) {
						local103 = (Static126.aByteArrayArrayArray4[local92][local82][local88] & 0xFF) * 8;
					}
					@Pc(133) int local133 = local60 + local103 - Static9.aClass105Array1[local92].method4453(local82, local88);
					if (local133 > local62) {
						local62 = local133;
					}
				}
			}
		}
		local82 = local62 * 1536;
		if (local82 > 786432) {
			local82 = 786432;
		}
		if (local82 < 262144) {
			local82 = 262144;
		}
		if (Static12.anInt215 < local82) {
			Static12.anInt215 += (local82 - Static12.anInt215) / 24;
		} else if (local82 < Static12.anInt215) {
			Static12.anInt215 += (local82 - Static12.anInt215) / 80;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!qc;")
	public static Class30 method4487(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class30_Sub2");
			@Pc(15) Class30 local15 = (Class30) local6.getDeclaredConstructor().newInstance();
			local15.method4462(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class30_Sub1 local26 = new Class30_Sub1();
			local26.method4462(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I[IZ[II)V")
	public static void method4488(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg0) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) int local21 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local21;
		@Pc(35) int local35 = arg1[local15];
		arg1[local15] = arg1[arg0];
		arg1[arg0] = local35;
		for (@Pc(47) int local47 = arg3; local47 < arg0; local47++) {
			if ((local47 & 0x1) + local21 > arg2[local47]) {
				@Pc(62) int local62 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17] = local62;
				@Pc(76) int local76 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17++] = local76;
			}
		}
		arg2[arg0] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg0] = arg1[local17];
		arg1[local17] = local35;
		method4488(local17 - 1, arg1, arg2, arg3);
		method4488(arg0, arg1, arg2, local17 + 1);
	}
}
