import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!ea;")
	public static Class21 aClass21_5;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "Lclient!ig;")
	public static Class30_Sub1 aClass30_Sub1_11;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method2101(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt1828 == Static26.anInt845 || arg0.anInt1842 == -1 || arg0.anInt1846 != 0 || arg0.anInt1862 + 1 > Static157.method2652(arg0.anInt1842).anIntArray601[arg0.anInt1849]) {
			@Pc(41) int local41 = arg0.anInt1828 - arg0.anInt1854;
			@Pc(52) int local52 = arg0.anInt1858 * 128 + arg0.anInt1824 * 64;
			@Pc(58) int local58 = Static26.anInt845 - arg0.anInt1854;
			@Pc(69) int local69 = arg0.anInt1811 * 128 + arg0.anInt1824 * 64;
			@Pc(79) int local79 = arg0.anInt1847 * 128 + arg0.anInt1824 * 64;
			arg0.anInt1838 = ((local41 - local58) * local52 + local79 * local58) / local41;
			@Pc(104) int local104 = arg0.anInt1861 * 128 + arg0.anInt1824 * 64;
			arg0.anInt1825 = (local104 * local58 + (local41 - local58) * local69) / local41;
		}
		if (arg0.anInt1815 == 0) {
			arg0.anInt1860 = 1024;
		}
		arg0.anInt1814 = 0;
		if (arg0.anInt1815 == 1) {
			arg0.anInt1860 = 1536;
		}
		if (arg0.anInt1815 == 2) {
			arg0.anInt1860 = 0;
		}
		if (arg0.anInt1815 == 3) {
			arg0.anInt1860 = 512;
		}
		arg0.anInt1843 = arg0.anInt1860;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method2102() {
		aClass21_5 = null;
		aClass30_Sub1_11 = null;
		aShortArrayArray5 = null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!jg;II)Lclient!ed;")
	public static Class23 method2103(@OriginalArg(0) Class1_Sub8 arg0) {
		try {
			@Pc(12) Class23 local12 = new Class23();
			local12.anInt1053 = arg0.method856();
			if (local12.anInt1053 > 32767) {
				local12.anInt1053 = 32767;
			}
			local12.aByteArray10 = new byte[local12.anInt1053];
			arg0.anInt1357 += Static128.aClass67_1.method2314(local12.aByteArray10, arg0.anInt1357, 0, local12.anInt1053, arg0.aByteArray12);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static60.aClass23_1660;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)Lclient!ob;")
	public static Class60 method2104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class60 local7 = Static111.method1964(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass60Array1 == null || local7.aClass60Array1.length <= arg1) {
			return null;
		} else {
			return local7.aClass60Array1[arg1];
		}
	}
}
