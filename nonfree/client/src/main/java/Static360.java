import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public static int anInt6859;

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
	public static int anInt6856 = 1;

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
	public static int anInt6858 = -1;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILclient!ec;Lclient!iq;)V")
	public static void method5736(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class104 arg1) {
		Static219.aClass104_125 = arg1;
		Static209.anInterface3_8 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IB)V")
	public static void method5738(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub9_Sub4 local8 = Static98.method1971(9, arg0);
		local8.method1799();
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)V")
	public static void method5740() {
		Static63.aClass107_8.method3011(5);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILjava/lang/String;Lclient!sc;I)Lclient!bl;")
	public static Class26 method5741(@OriginalArg(1) String arg0, @OriginalArg(2) Class179 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method4895(arg0);
		}
		@Pc(44) Class26 local44;
		if (arg2 == 1) {
			try {
				Static381.method5668("openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, arg1.anApplet1);
				local44 = new Class26();
				local44.anInt484 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class26();
				local44.anInt484 = 2;
				return local44;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local44 = new Class26();
				local44.anInt484 = 1;
				return local44;
			} catch (@Pc(86) Exception local86) {
				local44 = new Class26();
				local44.anInt484 = 2;
				return local44;
			}
		} else if (arg2 == 3) {
			try {
				Static381.method5669(arg1.anApplet1, "loggedout");
			} catch (@Pc(108) Throwable local108) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local44 = new Class26();
				local44.anInt484 = 1;
				return local44;
			} catch (@Pc(130) Exception local130) {
				local44 = new Class26();
				local44.anInt484 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Lclient!os;")
	public static Class2_Sub9_Sub17 method5742() {
		return Static202.aClass2_Sub9_Sub17_2;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!fc;Lclient!dh;ILclient!dr;)V")
	public static void method5743(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class2_Sub8 arg1, @OriginalArg(3) Class37 arg2) {
		@Pc(10) Class46 local10 = arg0.method1810(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method5019();
		if (local10.method5023() > local16) {
			local16 = local10.method5023();
		}
		@Pc(32) int local32 = arg1.anInt1042;
		@Pc(35) int local35 = arg1.anInt1040;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg0.aString18 != null) {
			local37 = Static142.aClass82_6.method2235(null, null, arg0.aString18, Static358.aStringArray43);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static358.aStringArray43[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static173.aClass189_5.method5129(local61);
				if (local82 > local39) {
					local39 = local82;
				}
			}
			local41 = local37 * Static173.aClass189_5.method5128() + Static173.aClass189_5.method5132() / 2;
		}
		local55 = arg1.anInt1042 + local16 / 2;
		@Pc(112) int local112 = arg1.anInt1040;
		if (Static202.anInt4960 + local16 > local32) {
			local32 = Static202.anInt4960;
			local55 = Static202.anInt4960 + local16 / 2 + local39 / 2 + 5 + 10;
		} else if (local32 > Static202.anInt4961 - local16) {
			local32 = Static202.anInt4961 - local16;
			local55 = Static202.anInt4961 - local39 / 2 - local16 / 2 - 5 - 10;
		}
		if (local16 + Static202.anInt4955 > local35) {
			local112 = Static202.anInt4955 + local16 / 2 + 10;
			local35 = Static202.anInt4955;
		} else if (Static202.anInt4951 - local16 < local35) {
			local35 = Static202.anInt4951 - local16;
			local112 = Static202.anInt4951 - local16 / 2 - local41 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg1.anInt1042), (double) (local35 - arg1.anInt1040)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5030((float) local32 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local35, 4096, local82);
		@Pc(261) int local261 = -2;
		@Pc(263) int local263 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		if (arg0.aString18 != null) {
			local263 = local112;
			local261 = local55 - local39 / 2 - 5;
			local267 = local112 + Static173.aClass189_5.method5128() * local37 + 3;
			local265 = local261 + local39 + 10;
			if (arg0.anInt1767 != 0) {
				arg2.method3694(local265 - local261, arg0.anInt1767, local267 - local112, local261, local112);
			}
			if (arg0.anInt1731 != 0) {
				arg2.method3737(local267 - local112, local261, arg0.anInt1731, local112, local265 - local261);
			}
			for (@Pc(337) int local337 = 0; local337 < local37; local337++) {
				@Pc(343) String local343 = Static358.aStringArray43[local337];
				if (local337 < local37 - 1) {
					local343 = local343.substring(0, local343.length() - 4);
				}
				Static173.aClass189_5.method5131(arg2, local343, local55, local112, arg0.anInt1747);
				local112 += Static173.aClass189_5.method5128();
			}
		}
		if (arg0.anInt1739 == -1 && arg0.aString18 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(399) Class2_Sub38 local399 = new Class2_Sub38(arg1);
		local399.anInt5787 = local35 + local16;
		local399.anInt5792 = local265;
		local399.anInt5789 = local261;
		local399.anInt5785 = local32 - local16;
		local399.anInt5786 = local263;
		local399.anInt5790 = local32 + local16;
		local399.anInt5793 = local35 - local16;
		local399.anInt5788 = local267;
		Static284.aClass180_39.method4909(local399);
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	public static void method5744() {
		Static253.method4469();
		Static85.method1710();
		Static97.method1893();
		Static58.method1233();
		Static290.method4855();
		Static310.aClass184_2.method5039();
		Static56.method1227();
		Static310.method5164();
		Static156.method3216();
		Static235.method4288();
		Static165.method3283();
		Static355.method5679();
		Static89.method1796();
		Static10.method153();
		Static125.method2445();
		Static233.method4280();
		Static309.method5159();
		Static120.method52();
		Static19.method276();
		Static229.method4236();
		Static235.method4290();
		Static341.method396();
		Static179.method3444();
		Static288.aClass107_44.method3012();
		Static213.aClass107_28.method3012();
		Static304.aClass107_50.method3012();
		Static345.aClass107_56.method3012();
		Static367.aClass107_62.method3012();
	}
}
