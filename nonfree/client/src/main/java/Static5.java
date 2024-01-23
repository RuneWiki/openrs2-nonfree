import java.util.Random;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public static int anInt142;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lclient!db;")
	public static Class2_Sub3_Sub4 method94(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub3_Sub4 local6 = (Class2_Sub3_Sub4) Static224.aClass110_25.method3891((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(35) byte[] local35;
		if (arg0 < 32768) {
			local35 = Static36.aClass72_40.method3197(arg0, 0);
		} else {
			local35 = Static158.aClass72_220.method3197(arg0 & 0x7FFF, 0);
		}
		local6 = new Class2_Sub3_Sub4();
		if (local35 != null) {
			local6.method515(new Class2_Sub23(local35));
		}
		if (arg0 >= 32768) {
			local6.method513();
		}
		Static224.aClass110_25.method3894(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!og;)V")
	public static void method95(@OriginalArg(1) Class5_Sub2 arg0) {
		arg0.anInt1878 = arg0.anInt1879;
		if (arg0.anInt1881 == 0) {
			arg0.anInt1833 = 0;
			return;
		}
		if (arg0.anInt1873 != -1 && arg0.anInt1831 == 0) {
			@Pc(29) Class2_Sub3_Sub3 local29 = Static187.method3447(arg0.anInt1873);
			if (arg0.anInt1876 > 0 && local29.anInt450 == 0) {
				arg0.anInt1833++;
				return;
			}
			if (arg0.anInt1876 <= 0 && local29.anInt440 == 0) {
				arg0.anInt1833++;
				return;
			}
		}
		@Pc(58) int local58 = arg0.anInt1849;
		@Pc(61) int local61 = arg0.anInt1827;
		@Pc(76) int local76 = arg0.anIntArray333[arg0.anInt1881 - 1] * 128 + arg0.anInt1832 * 64;
		@Pc(91) int local91 = arg0.anIntArray334[arg0.anInt1881 - 1] * 128 + arg0.anInt1832 * 64;
		if (local76 - local58 > 256 || local76 - local58 < -256 || local91 - local61 > 256 || local91 - local61 < -256) {
			arg0.anInt1849 = local76;
			arg0.anInt1827 = local91;
			return;
		}
		if (local76 <= local58) {
			if (local58 > local76) {
				if (local61 < local91) {
					arg0.anInt1852 = 768;
				} else if (local61 > local91) {
					arg0.anInt1852 = 256;
				} else {
					arg0.anInt1852 = 512;
				}
			} else if (local91 > local61) {
				arg0.anInt1852 = 1024;
			} else if (local61 > local91) {
				arg0.anInt1852 = 0;
			}
		} else if (local61 < local91) {
			arg0.anInt1852 = 1280;
		} else if (local91 >= local61) {
			arg0.anInt1852 = 1536;
		} else {
			arg0.anInt1852 = 1792;
		}
		@Pc(211) int local211 = arg0.anInt1852 - arg0.anInt1853 & 0x7FF;
		if (local211 > 1024) {
			local211 -= 2048;
		}
		@Pc(220) int local220 = arg0.anInt1855;
		if (local211 >= -256 && local211 <= 256) {
			local220 = arg0.anInt1880;
		} else if (local211 >= 256 && local211 < 768) {
			local220 = arg0.anInt1851;
		} else if (local211 >= -768 && local211 <= -256) {
			local220 = arg0.anInt1863;
		}
		if (local220 == -1) {
			local220 = arg0.anInt1880;
		}
		arg0.anInt1878 = local220;
		@Pc(265) int local265 = 4;
		@Pc(267) boolean local267 = true;
		if (arg0 instanceof Class5_Sub2_Sub1) {
			local267 = ((Class5_Sub2_Sub1) arg0).aClass2_Sub3_Sub9_1.aBoolean46;
		}
		if (local267) {
			if (arg0.anInt1853 != arg0.anInt1852 && arg0.anInt1841 == -1 && arg0.anInt1840 != 0) {
				local265 = 2;
			}
			if (arg0.anInt1881 > 2) {
				local265 = 6;
			}
			if (arg0.anInt1881 > 3) {
				local265 = 8;
			}
			if (arg0.anInt1833 > 0 && arg0.anInt1881 > 1) {
				arg0.anInt1833--;
				local265 = 8;
			}
		} else {
			if (arg0.anInt1881 > 1) {
				local265 = 6;
			}
			if (arg0.anInt1881 > 2) {
				local265 = 8;
			}
			if (arg0.anInt1833 > 0 && arg0.anInt1881 > 1) {
				local265 = 8;
				arg0.anInt1833--;
			}
		}
		if (arg0.aBooleanArray58[arg0.anInt1881 - 1]) {
			local265 <<= 0x1;
		}
		if (local265 >= 8 && arg0.anInt1878 == arg0.anInt1880 && arg0.anInt1824 != -1) {
			arg0.anInt1878 = arg0.anInt1824;
		}
		if (local76 > local58) {
			arg0.anInt1849 += local265;
			if (arg0.anInt1849 > local76) {
				arg0.anInt1849 = local76;
			}
		} else if (local76 < local58) {
			arg0.anInt1849 -= local265;
			if (local76 > arg0.anInt1849) {
				arg0.anInt1849 = local76;
			}
		}
		if (local91 > local61) {
			arg0.anInt1827 += local265;
			if (arg0.anInt1827 > local91) {
				arg0.anInt1827 = local91;
			}
		} else if (local61 > local91) {
			arg0.anInt1827 -= local265;
			if (local91 > arg0.anInt1827) {
				arg0.anInt1827 = local91;
			}
		}
		if (arg0.anInt1849 != local76 || local91 != arg0.anInt1827) {
			return;
		}
		arg0.anInt1881--;
		if (arg0.anInt1876 > 0) {
			arg0.anInt1876--;
			return;
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I")
	public static int method96(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)I")
	public static int method97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)Lclient!pj;")
	public static Class2_Sub3_Sub25 method98(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub3_Sub25 local18 = (Class2_Sub3_Sub25) Static214.aClass110_24.method3891((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(33) byte[] local33;
		if (arg0 < 32768) {
			local33 = Static39.aClass72_48.method3197(arg0, 1);
		} else {
			local33 = Static102.aClass72_138.method3197(arg0 & 0x7FFF, 1);
		}
		local18 = new Class2_Sub3_Sub25();
		if (local33 != null) {
			local18.method2921(new Class2_Sub23(local33));
		}
		if (arg0 >= 32768) {
			local18.method2926();
		}
		Static214.aClass110_24.method3894(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!nh;)Lclient!bg;")
	public static Class14_Sub1 method100(@OriginalArg(1) Class2_Sub23 arg0) {
		return new Class14_Sub1(arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2104(), arg0.method2091(), arg0.method2091(), arg0.method2122());
	}
}
