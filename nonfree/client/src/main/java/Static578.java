import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "[Lclient!jr;")
	public static Class41_Sub4_Sub1_Sub1[] aClass41_Sub4_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!pb;")
	public static final Class267 aClass267_6 = new Class267("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIZ)Lclient!hq;")
	public static Class41_Sub3 method7877(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class102[] local9 = Class5_Sub6_Sub23.aClass102Array1;
		synchronized (Class5_Sub6_Sub23.aClass102Array1) {
			@Pc(32) Class41_Sub3 local32;
			if (Class5_Sub6_Sub23.aClass102Array1.length <= arg0 || Class5_Sub6_Sub23.aClass102Array1[arg0].method2059()) {
				local32 = new Class41_Sub3();
				local32.aClass41_Sub9Array1 = new Class41_Sub9[arg0];
				for (@Pc(55) int local55 = 0; local55 < arg0; local55++) {
					local32.aClass41_Sub9Array1[local55] = new Class41_Sub9();
				}
			} else {
				local32 = (Class41_Sub3) Class5_Sub6_Sub23.aClass102Array1[arg0].method2061();
				local32.method8644();
				@Pc(41) int local41 = Static618.anIntArray567[arg0]--;
			}
			local32.aBoolean258 = arg1;
			return local32;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBI)Ljava/lang/String;")
	public static String method7878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method7880(@OriginalArg(0) String arg0) {
		if (Class83.aString16.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class83.aString16.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class83.aString16.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILclient!ts;Lclient!kia;IILclient!dja;)V")
	public static void method7881(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41_Sub1_Sub1_Sub3_Sub2 arg2, @OriginalArg(4) Class41_Sub1_Sub1_Sub3_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class81 arg6) {
		@Pc(7) Class5_Sub38 local7 = new Class5_Sub38();
		local7.anInt6691 = arg5 << 9;
		local7.anInt6680 = arg0 << 9;
		local7.anInt6688 = arg4;
		if (arg6 != null) {
			local7.aClass81_1 = arg6;
			@Pc(164) int local164 = arg6.anInt1910;
			@Pc(167) int local167 = arg6.anInt1897;
			if (arg1 == 1 || arg1 == 3) {
				local164 = arg6.anInt1897;
				local167 = arg6.anInt1910;
			}
			local7.anIntArray377 = arg6.anIntArray97;
			local7.aBoolean477 = arg6.aBoolean129;
			local7.aBoolean478 = arg6.aBoolean136;
			local7.anInt6687 = arg6.anInt1872;
			local7.anInt6681 = arg6.anInt1917;
			local7.anInt6677 = arg6.anInt1923;
			local7.anInt6685 = local164 + arg5 << 9;
			local7.anInt6696 = arg6.anInt1882;
			local7.anInt6695 = arg0 + local167 << 9;
			local7.anInt6682 = arg6.anInt1893;
			local7.anInt6684 = arg6.anInt1920;
			local7.anInt6679 = arg6.anInt1890 << 9;
			local7.anInt6690 = arg6.anInt1889 << 9;
			if (arg6.anIntArray100 != null) {
				local7.aBoolean476 = true;
				local7.method5633();
			}
			if (local7.anIntArray377 != null) {
				local7.anInt6689 = local7.anInt6696 + (int) (Math.random() * (double) (local7.anInt6687 - local7.anInt6696));
			}
			Static351.aClass124_58.method2574(local7);
		} else if (arg3 != null) {
			local7.aClass41_Sub1_Sub1_Sub3_Sub1_2 = arg3;
			@Pc(90) Class311 local90 = arg3.aClass311_1;
			if (local90.anIntArray476 != null) {
				local7.aBoolean476 = true;
				local90 = local90.method7325(Static413.aClass63_1);
			}
			if (local90 != null) {
				local7.anInt6685 = arg5 + local90.anInt8641 << 9;
				local7.anInt6695 = arg0 + local90.anInt8641 << 9;
				local7.anInt6677 = Static594.method8045(arg3);
				local7.anInt6679 = local90.anInt8666 << 9;
				local7.anInt6682 = local90.anInt8667;
				local7.aBoolean478 = local90.aBoolean622;
				local7.anInt6684 = local90.anInt8663;
				local7.anInt6681 = local90.anInt8642;
				local7.anInt6690 = local90.anInt8640 << 9;
			}
			Static511.aClass124_97.method2574(local7);
		} else if (arg2 != null) {
			local7.aClass41_Sub1_Sub1_Sub3_Sub2_2 = arg2;
			local7.anInt6685 = arg5 + arg2.method7917() << 9;
			local7.anInt6695 = arg2.method7917() + arg0 << 9;
			local7.anInt6677 = Static166.method2457(arg2);
			local7.aBoolean478 = arg2.aBoolean699;
			local7.anInt6684 = arg2.anInt9533;
			local7.anInt6690 = arg2.anInt9560 << 9;
			local7.anInt6679 = 0;
			local7.anInt6681 = 256;
			local7.anInt6682 = 256;
			Static337.aClass335_25.method7770((long) arg2.anInt9469, local7);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIILclient!ha;Lclient!dja;)V")
	public static void method7882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class143 arg3, @OriginalArg(5) Class81 arg4) {
		@Pc(9) Class392 local9 = Static40.aClass161_1.method3448(arg4.anInt1888);
		if (local9.anInt10405 == -1) {
			return;
		}
		if (arg4.aBoolean133) {
			@Pc(25) int local25 = arg2 + arg4.anInt1903;
			arg2 = local25 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(39) Class59 local39 = local9.method8682(arg2, arg4.aBoolean141, arg3);
		if (local39 == null) {
			return;
		}
		@Pc(45) int local45 = arg4.anInt1910;
		@Pc(48) int local48 = arg4.anInt1897;
		if ((arg2 & 0x1) == 1) {
			local48 = arg4.anInt1910;
			local45 = arg4.anInt1897;
		}
		@Pc(64) int local64 = local39.method8053();
		@Pc(67) int local67 = local39.method8064();
		if (local9.aBoolean767) {
			local67 = local48 * 4;
			local64 = local45 * 4;
		}
		if (local9.anInt10401 == 0) {
			local39.method8055(arg0, arg1 - (local48 - 1) * 4, local64, local67);
		} else {
			local39.method8058(arg0, arg1 - (local48 - 1) * 4, local64, local67, 0, local9.anInt10401 | 0xFF000000, 1);
		}
	}
}
