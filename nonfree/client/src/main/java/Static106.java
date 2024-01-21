import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1446 = method1849("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "[Lclient!mc;")
	public static Class1_Sub12[] aClass1_Sub12Array1 = new Class1_Sub12[2048];

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1448 = method1849(" seconds)3");

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1447 = aClass66_1448;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1449 = method1849("Texturen geladen)3");

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1450 = method1849("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method1848() {
		aClass66_1449 = null;
		aClass66_1448 = null;
		aClass66_1447 = null;
		aClass66_1450 = null;
		aClass66_1446 = null;
		aClass1_Sub12Array1 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLjava/lang/String;)Lclient!sc;")
	public static Class66 method1849(@OriginalArg(1) String arg0) {
		@Pc(6) byte[] local6 = arg0.getBytes();
		@Pc(9) int local9 = local6.length;
		@Pc(13) Class66 local13 = new Class66();
		local13.aByteArray29 = new byte[local9];
		@Pc(19) int local19 = 0;
		while (local19 < local9) {
			@Pc(27) int local27 = local6[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local19 >= local9) {
					break;
				}
				@Pc(61) int local61 = local6[local19++] & 0xFF;
				local13.aByteArray29[local13.anInt2583++] = (byte) (local61 + local27 * 43 - 48 - 1720);
			} else if (local27 != 0) {
				local13.aByteArray29[local13.anInt2583++] = (byte) local27;
			}
		}
		local13.method1815();
		return local13.method1816();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI)Lclient!sc;")
	public static Class66 method1850(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(45) byte[] local45 = new byte[local27];
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				local27--;
				local45[local27] = Static121.aByteArray40[(int) (local49 - arg0 * 37L)];
			}
			@Pc(81) Class66 local81 = new Class66();
			local81.aByteArray29 = local45;
			local81.anInt2583 = local45.length;
			return local81;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[BIII[Lclient!da;III)V")
	public static void method1851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class13[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (local3 + arg6 > 0 && arg6 + local3 < 103 && arg7 + local7 > 0 && local7 + arg7 < 103) {
					arg5[arg3].anIntArrayArray11[local3 + arg6][local7 + arg7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(74) Class1_Sub12 local74 = new Class1_Sub12(arg2);
		for (@Pc(85) int local85 = 0; local85 < 4; local85++) {
			for (@Pc(89) int local89 = 0; local89 < 64; local89++) {
				for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
					if (local85 == arg8 && arg0 <= local89 && arg0 + 8 > local89 && local93 >= arg1 && local93 < arg1 + 8) {
						Static86.method1605(0, Static79.method1482(local89 & 0x7, arg4, local93 & 0x7) + arg6, Static42.method936(local93 & 0x7, arg4, local89 & 0x7) + arg7, arg4, 0, arg3, local74);
					} else {
						Static86.method1605(0, -1, -1, 0, 0, 0, local74);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIILclient!ae;ZIB)V")
	public static void method1852(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub1 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(10) long local10 = (long) (arg5 + (arg1 << 16));
		@Pc(16) Class1_Sub1_Sub4 local16 = (Class1_Sub1_Sub4) Static24.aClass65_9.method1802(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub4) Static74.aClass65_26.method1802(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub4) Static44.aClass65_18.method1802(local10);
		if (local16 == null) {
			if (!arg4) {
				local16 = (Class1_Sub1_Sub4) Static79.aClass65_28.method1802(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub1_Sub4();
			local16.aByte2 = arg0;
			local16.aClass5_Sub1_12 = arg3;
			local16.anInt893 = arg2;
			if (arg4) {
				Static24.aClass65_9.method1797(local16, local10);
				Static15.anInt2943++;
			} else {
				Static34.aClass42_2.method1307(local16);
				Static44.aClass65_18.method1797(local16, local10);
				Static94.anInt2413++;
			}
		} else if (arg4) {
			local16.method2003();
			Static24.aClass65_9.method1797(local16, local10);
			Static15.anInt2943++;
			Static94.anInt2413--;
		}
	}
}
