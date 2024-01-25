import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	public static int anInt4020;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	public static int anInt4016 = -1;

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_132 = new Class221(84, 8);

	@OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lclient!cm;")
	public static Class41 aClass41_19 = new Class41(128);

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_117 = new Class157(56, -1);

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!mr;)I")
	public static int method3461(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		if (arg0.anInt6919 == 0) {
			return 0;
		}
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (arg0.anInt6916 != -1) {
			@Pc(14) Class1_Sub2_Sub3 local14 = null;
			if (arg0.anInt6916 < 32768) {
				local14 = Static95.aClass1_Sub2_Sub3_Sub2Array1[arg0.anInt6916];
			} else if (arg0.anInt6916 >= 32768) {
				local14 = Static164.aClass1_Sub2_Sub3_Sub1Array1[arg0.anInt6916 - 32768];
			}
			if (local14 != null) {
				local46 = arg0.anInt6893 - local14.anInt6893;
				local52 = arg0.anInt6888 - local14.anInt6888;
				if (local46 != 0 || local52 != 0) {
					arg0.method5773((int) (Math.atan2((double) local46, (double) local52) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class1_Sub2_Sub3_Sub1) {
			@Pc(152) Class1_Sub2_Sub3_Sub1 local152 = (Class1_Sub2_Sub3_Sub1) arg0;
			if (local152.anInt3402 != -1 && (local152.anInt6962 == 0 || local152.anInt6964 > 0)) {
				local152.method5773(local152.anInt3402);
				local152.anInt3402 = -1;
			}
		} else if (arg0 instanceof Class1_Sub2_Sub3_Sub2) {
			@Pc(81) Class1_Sub2_Sub3_Sub2 local81 = (Class1_Sub2_Sub3_Sub2) arg0;
			if (local81.anInt6982 != -1 && (local81.anInt6962 == 0 || local81.anInt6964 > 0)) {
				local46 = local81.anInt6893 - (local81.anInt6982 - Static150.anInt3453 - Static150.anInt3453) * 64;
				local52 = local81.anInt6888 - (local81.anInt6978 - Static287.anInt5776 - Static287.anInt5776) * 64;
				if (local46 != 0 || local52 != 0) {
					local81.method5773((int) (Math.atan2((double) local46, (double) local52) * 2607.5945876176133D) & 0x3FFF);
				}
				local81.anInt6982 = -1;
			}
		}
		return arg0.method5772();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;ZIZJIZI)V")
	public static void method3462(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class2_Sub12 local30 = new Class2_Sub12(128);
		local30.method3147(10);
		local30.method3158((arg5 ? 1 : 0) | (arg3 ? 2 : 0) | (arg8 ? 4 : 0));
		local30.method3130(arg6);
		local30.method3162(local8[0]);
		local30.method3156(arg0);
		local30.method3162(local8[1]);
		local30.method3158(Static206.anInt4520);
		local30.method3147(arg7);
		local30.method3147(arg1);
		local30.method3162(local8[2]);
		local30.method3158(arg9);
		local30.method3158(arg4);
		local30.method3162(local8[3]);
		local30.method3139(Static88.aBigInteger3, Static261.aBigInteger4);
		@Pc(120) Class2_Sub12 local120 = new Class2_Sub12(350);
		local120.method3156(arg2);
		@Pc(133) int local133 = 8 - Static217.method4134(arg2) % 8;
		for (@Pc(135) int local135 = 0; local135 < local133; local135++) {
			local120.method3147((int) (Math.random() * 255.0D));
		}
		local120.method3100(local8);
		Static197.aClass2_Sub12_Sub2_2.anInt3606 = 0;
		Static197.aClass2_Sub12_Sub2_2.method3147(Static217.aClass69_8.anInt1946);
		Static197.aClass2_Sub12_Sub2_2.method3158(local30.anInt3606 + local120.anInt3606 + 2);
		Static197.aClass2_Sub12_Sub2_2.method3158(570);
		Static197.aClass2_Sub12_Sub2_2.method3106(local30.aByteArray30, local30.anInt3606);
		Static197.aClass2_Sub12_Sub2_2.method3106(local120.aByteArray30, local120.anInt3606);
		Static328.anInt6688 = 1;
		Static353.anInt5914 = 0;
		Static91.anInt1783 = -3;
		Static168.anInt3817 = 0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3464(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
	public static void method3466() {
		@Pc(8) int local8 = Static77.aByteArrayArray2.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static77.aByteArrayArray2[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static6.anInt92; local20++) {
					if (Static25.anIntArray50[local10] == Static158.anIntArray284[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static158.anIntArray284[Static6.anInt92] = Static25.anIntArray50[local10];
					local18 = Static6.anInt92++;
				}
				@Pc(60) Class2_Sub12 local60 = new Class2_Sub12(Static77.aByteArrayArray2[local10]);
				@Pc(62) int local62 = 0;
				while (Static77.aByteArrayArray2[local10].length > local60.anInt3606 && local62 < 511 && Static186.anInt4092 < 1023) {
					@Pc(81) int local81 = local18 | local62++ << 6;
					@Pc(85) int local85 = local60.method3104();
					@Pc(89) int local89 = local85 >> 14;
					@Pc(95) int local95 = local85 >> 7 & 0x3F;
					@Pc(99) int local99 = local85 & 0x3F;
					@Pc(111) int local111 = (Static25.anIntArray50[local10] >> 8) * 64 + local95 - Static150.anInt3453;
					@Pc(124) int local124 = (Static25.anIntArray50[local10] & 0xFF) * 64 + local99 - Static287.anInt5776;
					@Pc(130) Class139 local130 = Static90.method1809(local60.method3104());
					if (Static95.aClass1_Sub2_Sub3_Sub2Array1[local81] == null && (local130.aByte51 & 0x1) > 0 && local89 == Static30.anInt483 && local111 >= 0 && Static66.anInt1177 > local111 + local130.anInt4778 && local124 >= 0 && local124 + local130.anInt4778 < Static12.anInt213) {
						Static95.aClass1_Sub2_Sub3_Sub2Array1[local81] = new Class1_Sub2_Sub3_Sub2();
						Static95.aClass1_Sub2_Sub3_Sub2Array1[local81].anInt6896 = local81;
						@Pc(196) Class1_Sub2_Sub3_Sub2 local196 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local81];
						Static171.anIntArray292[Static186.anInt4092++] = local81;
						local196.anInt6932 = Static6.anInt91;
						local196.method5790(local130);
						local196.method5782(local196.aClass139_1.anInt4778);
						local196.anInt6919 = local196.aClass139_1.anInt4805 << 3;
						if (local196.anInt6919 == 0) {
							local196.method5785(0);
						} else {
							local196.method5785((local196.aClass139_1.aByte52 + 4 & 0x49600007) << 11);
						}
						local196.method5791(true, local111, local124, local196.method5787(), local89);
					}
				}
			}
		}
	}
}
