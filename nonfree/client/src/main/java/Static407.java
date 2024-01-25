import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
	public static int anInt7012;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
	public static int anInt7009 = 0;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_46 = new Class293(20);

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!qr;")
	public static final Class293 aClass293_47 = new Class293(4);

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Lclient!dr;")
	public static final Class80 aClass80_5 = new Class80();

	@OriginalMember(owner = "client!oj", name = "i", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_57 = new Class181(64, 8);

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B[B)Lclient!tia;")
	public static Class5_Sub4_Sub19 method6233(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class5_Sub4_Sub19 local9 = new Class5_Sub4_Sub19();
		@Pc(14) Class5_Sub12 local14 = new Class5_Sub12(arg0);
		local14.anInt10154 = local14.aByteArray104.length - 2;
		@Pc(27) int local27 = local14.method8631();
		@Pc(38) int local38 = local14.aByteArray104.length - local27 - 12 - 2;
		local14.anInt10154 = local38;
		@Pc(45) int local45 = local14.method8623();
		local9.anInt9124 = local14.method8631();
		local9.anInt9126 = local14.method8631();
		local9.anInt9127 = local14.method8631();
		local9.anInt9123 = local14.method8631();
		@Pc(78) int local78 = local14.method8645();
		@Pc(89) int local89;
		@Pc(95) int local95;
		if (local78 > 0) {
			local9.aClass81Array1 = new Class81[local78];
			for (local89 = 0; local89 < local78; local89++) {
				local95 = local14.method8631();
				@Pc(102) Class81 local102 = new Class81(Static522.method6795(local95));
				local9.aClass81Array1[local89] = local102;
				while (local95-- > 0) {
					@Pc(113) int local113 = local14.method8623();
					@Pc(117) int local117 = local14.method8623();
					local102.method1607(new Class5_Sub41(local117), (long) local113);
				}
			}
		}
		local14.anInt10154 = 0;
		local9.aString129 = local14.method8618();
		local9.anIntArray702 = new int[local45];
		local9.aStringArray37 = new String[local45];
		local9.anIntArray703 = new int[local45];
		local89 = 0;
		while (local14.anInt10154 < local38) {
			local95 = local14.method8631();
			if (local95 == 3) {
				local9.aStringArray37[local89] = local14.method8617().intern();
			} else if (local95 >= 100 || local95 == 21 || local95 == 38 || local95 == 39) {
				local9.anIntArray702[local89] = local14.method8645();
			} else {
				local9.anIntArray702[local89] = local14.method8623();
			}
			local9.anIntArray703[local89++] = local95;
		}
		return local9;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)Z")
	public static boolean method6234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!kf;IIIII)V")
	public static void method6235(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static36.anInt662) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static129.anInt6336) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static150.anInt2400 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class156 local62 = Static535.aClass156ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static299.aClass40Array1[local17].method8442(local23, local32) + Static299.aClass40Array1[local17].method8442(local23 + 1, local32) + Static299.aClass40Array1[local17].method8442(local23, local32 + 1) + Static299.aClass40Array1[local17].method8442(local23 + 1, local32 + 1)) / 4 - (Static299.aClass40Array1[arg1].method8442(arg2, arg3) + Static299.aClass40Array1[arg1].method8442(arg2 + 1, arg3) + Static299.aClass40Array1[arg1].method8442(arg2, arg3 + 1) + Static299.aClass40Array1[arg1].method8442(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class14_Sub1_Sub3 local151 = local62.aClass14_Sub1_Sub3_1;
									@Pc(154) Class14_Sub1_Sub3 local154 = local62.aClass14_Sub1_Sub3_2;
									if (local151 != null && local151.method7992()) {
										arg0.method7996(local151, Static480.aClass126_12, (local23 - arg2) * anInt7012 + (1 - arg4) * Static617.anInt10032, (local32 - arg3) * anInt7012 + (1 - arg5) * Static617.anInt10032, local1, local148);
									}
									if (local154 != null && local154.method7992()) {
										arg0.method7996(local154, Static480.aClass126_12, (local23 - arg2) * anInt7012 + (1 - arg4) * Static617.anInt10032, (local32 - arg3) * anInt7012 + (1 - arg5) * Static617.anInt10032, local1, local148);
									}
									for (@Pc(227) Class66 local227 = local62.aClass66_2; local227 != null; local227 = local227.aClass66_1) {
										@Pc(231) Class14_Sub1_Sub1 local231 = local227.aClass14_Sub1_Sub1_1;
										if (local231 != null && local231.method7992() && (local23 == local231.aShort74 || local23 == local3) && (local32 == local231.aShort71 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort73 + 1 - local231.aShort74;
											@Pc(268) int local268 = local231.aShort72 + 1 - local231.aShort71;
											arg0.method7996(local231, Static480.aClass126_12, (local231.aShort74 - arg2) * anInt7012 + (local260 - arg4) * Static617.anInt10032, (local231.aShort71 - arg3) * anInt7012 + (local268 - arg5) * Static617.anInt10032, local1, local148);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public static int method6237(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}
}
