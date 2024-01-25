import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Lclient!cg;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Lclient!qca;")
	public static final Class271 aClass271_10 = new Class271(10, 2, 2, 0);

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public static int anInt8422 = 0;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIB)Lclient!dm;")
	public static Class78 method7080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class78 local7 = Static180.method3291(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass78Array9 == null || local7.aClass78Array9.length <= arg1) {
			return null;
		} else {
			return local7.aClass78Array9[arg1];
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILclient!kg;I)Lclient!wga;")
	public static Class2_Sub5_Sub21 method7081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2) {
		@Pc(10) int local10 = arg2.anInt5469 | arg1 << 10;
		@Pc(19) Class2_Sub5_Sub21 local19 = (Class2_Sub5_Sub21) Static282.aClass117_4.method3041((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static224.aClass97_59.method2570(Static224.aClass97_59.method2568(local10));
		if (local31 == null) {
			local10 = arg0 + 65536 << 10 | arg2.anInt5469;
			local19 = (Class2_Sub5_Sub21) Static282.aClass117_4.method3041((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static224.aClass97_59.method2570(Static224.aClass97_59.method2568(local10));
			if (local31 == null) {
				local10 = arg2.anInt5469 | 0x3FFFC00;
				local19 = (Class2_Sub5_Sub21) Static282.aClass117_4.method3041((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static224.aClass97_59.method2570(Static224.aClass97_59.method2568(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static91.method1611(local31);
					} catch (@Pc(197) Exception local197) {
						throw new RuntimeException(local197.getMessage() + " S: " + local10);
					}
					local19.aClass188_10 = arg2;
					Static282.aClass117_4.method3042((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static91.method1611(local31);
				} catch (@Pc(125) Exception local125) {
					throw new RuntimeException(local125.getMessage() + " S: " + local10);
				}
				local19.aClass188_10 = arg2;
				Static282.aClass117_4.method3042((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static91.method1611(local31);
			} catch (@Pc(49) Exception local49) {
				throw new RuntimeException(local49.getMessage() + " S: " + local10);
			}
			local19.aClass188_10 = arg2;
			Static282.aClass117_4.method3042((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII)V")
	public static void method7082(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		if (Static2.anInt31 == 2) {
			Static103.anInt2093 = 0;
			Static512.anInt8589 = local11;
			Static105.anInt2114 = local7;
		}
		Static378.aFloat160 = local7;
		Static189.aFloat109 = local11;
		Static475.method7381();
		Static620.aBoolean745 = true;
	}
}
