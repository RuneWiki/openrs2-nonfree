import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
	public static int anInt80;

	@OriginalMember(owner = "client!ada", name = "f", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BLclient!vj;)V")
	public static void method99(@OriginalArg(1) Class2_Sub22 arg0) {
		@Pc(13) int local13 = arg0.method8543();
		Static370.aClass317Array1 = new Class317[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			Static370.aClass317Array1[local18] = new Class317();
			Static370.aClass317Array1[local18].anInt8578 = arg0.method8543();
			Static370.aClass317Array1[local18].aString101 = arg0.method8519();
		}
		Static169.anInt3008 = arg0.method8543();
		Static57.anInt1132 = arg0.method8543();
		Static620.anInt9962 = arg0.method8543();
		Static363.aClass89_Sub1Array4 = new Class89_Sub1[Static57.anInt1132 + 1 - Static169.anInt3008];
		for (@Pc(70) int local70 = 0; local70 < Static620.anInt9962; local70++) {
			@Pc(76) int local76 = arg0.method8543();
			@Pc(84) Class89_Sub1 local84 = Static363.aClass89_Sub1Array4[local76] = new Class89_Sub1();
			local84.anInt2232 = arg0.method8547();
			local84.anInt2233 = arg0.method8542();
			local84.anInt2240 = Static169.anInt3008 + local76;
			local84.aString19 = arg0.method8519();
			local84.aString20 = arg0.method8519();
		}
		Static608.anInt9791 = arg0.method8542();
		Static507.aBoolean634 = true;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)Z")
	public static boolean method100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static482.method6499(arg1, arg0) | (arg1 & 0x800) != 0 || Static293.method4047(arg0, arg1);
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg5 < 512 || arg3 < 512 || (Static228.anInt3704 - 2) * 512 < arg5 || (Static162.anInt2911 - 2) * 512 < arg3) {
			Static526.anIntArray588[0] = Static526.anIntArray588[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static504.method6917(arg5, arg2, arg3) - arg1;
		if (Static319.aBoolean356) {
			Static421.method5624(true);
		} else {
			Static185.aClass177_4.method7872(arg0, 0, 0);
			Static192.aClass95_4.method6941(Static185.aClass177_4);
		}
		if (Static449.aBoolean538) {
			Static192.aClass95_4.HA(arg5, local53, arg3, Static638.anInt7982, Static526.anIntArray588);
		} else {
			Static192.aClass95_4.da(arg5, local53, arg3, Static526.anIntArray588);
		}
		if (Static319.aBoolean356) {
			Static547.method7554();
		} else {
			Static185.aClass177_4.method7872(-arg0, 0, 0);
			Static192.aClass95_4.method6941(Static185.aClass177_4);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(FIFFBFFF)F")
	public static float method103(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(11) float local11 = arg2 - arg3;
		@Pc(16) float local16 = arg4 - arg5;
		@Pc(29) float local29 = arg6 - arg0;
		@Pc(31) float local31 = 0.0F;
		@Pc(33) float local33 = 0.0F;
		@Pc(35) float local35 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(43) float local43 = local11 * local7 + arg3;
			@Pc(49) float local49 = arg5 + local7 * local16;
			@Pc(55) float local55 = local7 * local29 + arg0;
			@Pc(60) int local60 = (int) local43 >> 9;
			@Pc(65) int local65 = (int) local55 >> 9;
			if (local60 > 0 && local65 > 0 && local60 < Static228.anInt3704 && Static162.anInt2911 > local65) {
				@Pc(84) int local84 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127;
				if (local84 < 3 && (Static27.aByteArrayArrayArray1[1][local60][local65] & 0x2) != 0) {
					local84++;
				}
				@Pc(110) int local110 = Static462.aClass76Array3[local84].method7398((int) local43, (int) local55);
				if ((float) local110 < local49) {
					if (arg1 < 2) {
						return local7;
					}
					return method103(local35, arg1 - 1, local43, local31, local49, local33, local55) * 0.1F + local7 - 0.1F;
				}
			}
			local31 = local43;
			local35 = local55;
			local33 = local49;
			local7 += 0.1F;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "(I)I")
	public static int method104() {
		return Static491.anInt8078 == 1 ? Static158.anInt2827 : Static482.anInt7691;
	}
}
