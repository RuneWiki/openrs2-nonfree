import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[Lclient!dh;")
	public static Class3_Sub1_Sub4_Sub1[] aClass3_Sub1_Sub4_Sub1Array10;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1335 = Static120.method1824("(Y");

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[104][104];

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1336 = Static120.method1824("(U4");

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(JIIZ)Lclient!rd;")
	public static Class80 method2426(@OriginalArg(0) long arg0) {
		@Pc(36) long local36 = arg0 / (long) 10;
		@Pc(38) int local38 = 1;
		while (local36 != 0L) {
			local38++;
			local36 /= 10;
		}
		@Pc(52) int local52 = local38;
		if (arg0 < 0L) {
			local52 = local38 + 1;
		}
		@Pc(64) byte[] local64 = new byte[local52];
		if (arg0 < 0L) {
			local64[0] = 45;
		}
		for (@Pc(82) int local82 = 0; local82 < local38; local82++) {
			@Pc(90) int local90 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local90 < 0) {
				local90 = -local90;
			}
			if (local90 > 9) {
				local90 += 39;
			}
			local64[local52 - local82 - 1] = (byte) (local90 + 48);
		}
		@Pc(127) Class80 local127 = new Class80();
		local127.anInt3421 = local52;
		local127.aByteArray43 = local64;
		return local127;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method2446(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(15) byte[] local15 = new byte[24];
		if (Static194.aClass74_5 != null) {
			@Pc(19) int local19;
			try {
				local19 = 0;
				Static194.aClass74_5.method2065(0L);
				Static194.aClass74_5.method2066(local15);
				while (local19 < 24 && local15[local19] == 0) {
					local19++;
				}
				if (local19 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(51) Exception local51) {
				for (local19 = 0; local19 < 24; local19++) {
					local15[local19] = -1;
				}
			}
		}
		arg0.method2094(24, local15);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	public static void method2447() {
		if (!Static162.aBoolean147) {
			return;
		}
		@Pc(19) Class77 local19 = Static26.method425(Static118.anInt2619, Static38.anInt864);
		if (local19 != null && local19.anObjectArray27 != null) {
			@Pc(28) Class3_Sub16 local28 = new Class3_Sub16();
			local28.anObjectArray3 = local19.anObjectArray27;
			local28.aClass77_10 = local19;
			Static168.method2710(local28);
		}
		Static162.aBoolean147 = false;
		Static186.method3014(local19);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(JI)V")
	public static void method2457(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(7) InterruptedException local7) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	public static void method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < local7.anInt2014; local12++) {
			@Pc(18) Class4 local18 = local7.aClass4Array3[local12];
			if ((local18.aLong4 >> 29 & 0x3L) == 2L && local18.anInt185 == arg1 && local18.anInt188 == arg2) {
				Static64.method922(local18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[Lclient!rd;)Lclient!rd;")
	public static Class80 method2467(@OriginalArg(1) Class80[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static107.method1629(0, arg0, arg0.length);
	}
}
