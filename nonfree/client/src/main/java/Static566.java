import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "J")
	public static long aLong276;

	@OriginalMember(owner = "client!tea", name = "k", descriptor = "Lclient!el;")
	public static final Class109 aClass109_200 = new Class109(115, 3);

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "Lclient!gq;")
	public static final Class149 aClass149_9 = new Class149();

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
	public static int anInt9503 = 0;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8150(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(18) Class5_Sub50 local18 = Static457.method6722(Static228.aClass387_45, Static80.aClass313_1);
			local18.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(arg0));
			local18.aClass5_Sub23_Sub2_2.method8538(arg0);
			Static494.method7120(local18);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZLclient!ib;)Lclient!ph;")
	public static Class31_Sub1_Sub1 method8152(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(13) Class31_Sub1 local13 = Static420.method6285(arg0);
		@Pc(17) int local17 = arg0.method8516();
		return new Class31_Sub1_Sub1(local13.aClass219_12, local13.aClass368_11, local13.anInt9298, local13.anInt9300, local13.anInt9301, local13.anInt9302, local13.anInt9305, local13.anInt9299, local13.anInt9306, local13.anInt7740, local13.anInt7737, local13.anInt7734, local13.anInt7732, local13.anInt7731, local13.anInt7741, local17);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IILclient!um;I)Lclient!nf;")
	public static Class5_Sub5_Sub17 method8153(@OriginalArg(0) int arg0, @OriginalArg(2) Class354 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 10 | arg1.anInt10108;
		@Pc(19) Class5_Sub5_Sub17 local19 = (Class5_Sub5_Sub17) Static44.aClass90_1.method1632((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(32) byte[] local32 = Static343.aClass208_76.method4997(Static343.aClass208_76.method4978(local10));
		if (local32 == null) {
			local10 = arg0 + 65536 << 10 | arg1.anInt10108;
			local19 = (Class5_Sub5_Sub17) Static44.aClass90_1.method1632((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local32 = Static343.aClass208_76.method4997(Static343.aClass208_76.method4978(local10));
			if (local32 == null) {
				local10 = arg1.anInt10108 | 0x3FFFC00;
				local19 = (Class5_Sub5_Sub17) Static44.aClass90_1.method1632((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local32 = Static343.aClass208_76.method4997(Static343.aClass208_76.method4978(local10));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static606.method8453(local32);
					} catch (@Pc(216) Exception local216) {
						throw new RuntimeException(local216.getMessage() + " S: " + local10);
					}
					local19.aClass354_13 = arg1;
					Static44.aClass90_1.method1631(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static606.method8453(local32);
				} catch (@Pc(131) Exception local131) {
					throw new RuntimeException(local131.getMessage() + " S: " + local10);
				}
				local19.aClass354_13 = arg1;
				Static44.aClass90_1.method1631(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static606.method8453(local32);
			} catch (@Pc(51) Exception local51) {
				throw new RuntimeException(local51.getMessage() + " S: " + local10);
			}
			local19.aClass354_13 = arg1;
			Static44.aClass90_1.method1631(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZI)V")
	public static void method8155(@OriginalArg(0) boolean arg0) {
		if (Static497.aString134.length() == 0) {
			return;
		}
		Static619.method3013("--> " + Static497.aString134);
		Static676.method8313(false, arg0, Static497.aString134);
		Static440.anInt7528 = 0;
		Static497.aString134 = "";
		Static287.anInt5059 = 0;
	}
}
