import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public static int anInt5161;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Lclient!mn;")
	public static Class171 aClass171_68;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "I")
	public static int anInt5171 = -1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIIIZ)V")
	public static void method4086(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static68.method1063(0, arg2, arg1, arg0, arg3, Static117.aClass65_Sub1Array1.length - 1);
		Static271.anInt4921 = 0;
		Static397.aClass2_Sub44_2 = null;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(Z)V")
	public static void method4090() {
		@Pc(11) Class213 local11 = null;
		try {
			@Pc(17) Class136 local17 = Static138.aClass194_2.method4405(false, "3");
			while (local17.anInt3418 == 0) {
				Static167.method6157(1L);
			}
			if (local17.anInt3418 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local11 = (Class213) local17.anObject10;
			@Pc(44) byte[] local44 = new byte[(int) local11.method4949()];
			if (local44.length == 0) {
				Static13.aString2 = "";
				Static281.aString39 = "";
			} else {
				@Pc(62) int local62;
				for (@Pc(49) int local49 = 0; local49 < local44.length; local49 += local62) {
					local62 = local11.method4945(local44, local49, local44.length - local49);
					if (local62 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(84) Class2_Sub17 local84 = new Class2_Sub17(local44);
				@Pc(88) int local88 = local84.method6138();
				if (local88 > 50) {
					throw new RuntimeException("Bad length");
				}
				local84.anInt7523 = local88 + 1;
				if (!local84.method6159()) {
					throw new RuntimeException("Invalid CRC");
				}
				local84.anInt7523 = 1;
				@Pc(117) int local117 = local84.method6138();
				if (local117 != 0) {
					throw new RuntimeException("Invalid version " + local117);
				}
				Static13.aString2 = local84.method6143();
				Static281.aString39 = local84.method6143();
			}
		} catch (@Pc(146) Exception local146) {
			Static281.aString39 = "";
			Static13.aString2 = "";
		}
		try {
			if (local11 != null) {
				local11.method4946();
			}
		} catch (@Pc(157) Exception local157) {
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!gh;II)V")
	public static void method4091(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0.anInt7665 && arg2 != -1) {
			@Pc(23) Class109 local23 = Static37.aClass80_1.method1879(arg2);
			@Pc(26) int local26 = local23.anInt2788;
			if (local26 == 1) {
				arg0.anInt7662 = arg1;
				arg0.anInt7637 = 0;
				arg0.anInt7693 = 0;
				arg0.anInt7704 = 1;
				arg0.anInt7654 = 0;
				Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7693, local23, arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
			}
			if (local26 == 2) {
				arg0.anInt7637 = 0;
				return;
			}
		} else if (arg2 == -1 || arg0.anInt7665 == -1 || Static37.aClass80_1.method1879(arg2).anInt2777 >= Static37.aClass80_1.method1879(arg0.anInt7665).anInt2777) {
			arg0.anInt7637 = 0;
			arg0.anInt7654 = 0;
			arg0.anInt7705 = arg0.anInt7707;
			arg0.anInt7665 = arg2;
			arg0.anInt7662 = arg1;
			arg0.anInt7693 = 0;
			arg0.anInt7704 = 1;
			if (arg0.anInt7665 == -1) {
				return;
			}
			Static245.method3411(arg0 == Static127.aClass11_Sub5_Sub2_Sub1_2, arg0.anInt7693, Static37.aClass80_1.method1879(arg0.anInt7665), arg0.anInt7626, arg0.anInt7622, arg0.aByte101);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[ILclient!wq;[I[I)V")
	public static void method4093(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class11_Sub5_Sub2_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(18) int local18 = arg3[local7];
			@Pc(22) int local22 = arg0[local7];
			@Pc(26) int local26 = arg2[local7];
			@Pc(28) int local28 = 0;
			while (local22 != 0 && arg1.aClass92Array3.length > local28) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg1.aClass92Array3[local28] = null;
					} else {
						@Pc(46) Class109 local46 = Static37.aClass80_1.method1879(local18);
						@Pc(49) int local49 = local46.anInt2788;
						@Pc(54) Class92 local54 = arg1.aClass92Array3[local28];
						if (local54 != null) {
							if (local18 == local54.anInt2199) {
								if (local49 == 0) {
									local54 = arg1.aClass92Array3[local28] = null;
								} else if (local49 == 1) {
									local54.anInt2201 = 0;
									local54.anInt2198 = local26;
									local54.anInt2200 = 0;
									local54.anInt2193 = 0;
									local54.anInt2197 = 1;
									Static245.method3411(false, 0, local46, arg1.anInt7626, arg1.anInt7622, arg1.aByte101);
								} else if (local49 == 2) {
									local54.anInt2200 = 0;
								}
							} else if (local46.anInt2777 >= Static37.aClass80_1.method1879(local54.anInt2199).anInt2777) {
								local54 = arg1.aClass92Array3[local28] = null;
							}
						}
						if (local54 == null) {
							local54 = arg1.aClass92Array3[local28] = new Class92();
							local54.anInt2193 = 0;
							local54.anInt2198 = local26;
							local54.anInt2197 = 1;
							local54.anInt2200 = 0;
							local54.anInt2201 = 0;
							local54.anInt2199 = local18;
							Static245.method3411(false, 0, local46, arg1.anInt7626, arg1.anInt7622, arg1.aByte101);
						}
					}
				}
				local28++;
				local22 >>>= 0x1;
			}
		}
	}
}
