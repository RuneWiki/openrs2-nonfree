import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!me", name = "h", descriptor = "I")
	public static int anInt4080;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "[I")
	public static final int[] anIntArray347 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!tq;I)V")
	public static void method3428(@OriginalArg(0) Class4_Sub7 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static153.aClass149_3 != null) {
			@Pc(20) int local20;
			try {
				Static153.aClass149_3.method3960(0L);
				Static153.aClass149_3.method3952(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method2398(24, local8);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!vm;IIIILclient!ds;)V")
	public static void method3429(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class56 arg4) {
		@Pc(8) Class119 local8 = Static92.method1640(arg4.anInt1306);
		if (local8.anInt3798 == -1) {
			return;
		}
		if (arg4.aBoolean109) {
			@Pc(26) int local26 = arg2 + arg4.anInt1335;
			arg2 = local26 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(38) Class60 local38 = local8.method3213(arg2, arg4.aBoolean103, arg0);
		if (local38 == null) {
			return;
		}
		@Pc(44) int local44 = arg4.anInt1313;
		@Pc(47) int local47 = arg4.anInt1330;
		if ((arg2 & 0x1) == 1) {
			local44 = arg4.anInt1330;
			local47 = arg4.anInt1313;
		}
		@Pc(63) int local63 = local38.method5683();
		@Pc(66) int local66 = local38.method5691();
		if (local8.aBoolean314) {
			local66 = local47 * 4;
			local63 = local44 * 4;
		}
		if (local8.anInt3796 == 0) {
			local38.method5688(arg1, arg3 + 4 - local47 * 4, local63, local66);
		} else {
			local38.method5692(arg1, arg3 + 4 - local47 * 4, local63, local66, 1, local8.anInt3796 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method3431() {
		@Pc(11) Class212 local11 = null;
		try {
			@Pc(15) Class51 local15 = Static212.aClass120_3.method3223();
			while (local15.anInt1229 == 0) {
				Static270.method5481(1L);
			}
			if (local15.anInt1229 == 1) {
				local11 = (Class212) local15.anObject1;
				@Pc(41) Class4_Sub7 local41 = new Class4_Sub7(Static337.anInt5811 * 6 + 3);
				local41.method2416(1);
				local41.method2376(Static337.anInt5811);
				for (@Pc(55) int local55 = 0; local55 < Static289.anIntArray486.length; local55++) {
					if (Static72.aBooleanArray12[local55]) {
						local41.method2376(local55);
						local41.method2387(Static289.anIntArray486[local55]);
					}
				}
				local11.method5530(0, local41.anInt2667, local41.aByteArray42);
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local11 != null) {
				local11.method5533();
			}
		} catch (@Pc(95) Exception local95) {
		}
		Static9.aLong243 = Static274.method4763();
		Static156.aBoolean291 = false;
	}
}
