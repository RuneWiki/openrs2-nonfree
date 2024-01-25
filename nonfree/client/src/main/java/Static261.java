import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	public static int anInt5107;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Lclient!tq;")
	public static Class191 aClass191_169;

	@OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
	public static int anInt5114 = -1;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public static void method4666() {
		for (@Pc(10) Class2_Sub11_Sub13 local10 = (Class2_Sub11_Sub13) Static347.aClass216_36.method5992(); local10 != null; local10 = (Class2_Sub11_Sub13) Static347.aClass216_36.method6000()) {
			@Pc(15) Class62_Sub1_Sub4 local15 = local10.aClass62_Sub1_Sub4_1;
			if (Static182.anInt3603 != local15.aByte56 || local15.aBoolean334) {
				local10.method5945();
				local15.method3505();
			} else if (local15.anInt3810 <= Static212.anInt4090) {
				local15.method3504(Static220.anInt4246);
				if (local15.aBoolean334) {
					local10.method5945();
				} else {
					Static289.method5131(local15, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
	public static void method4667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(6, arg1);
		local8.method5537();
		local8.anInt6362 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method4668(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static74.aClass2_Sub10_Sub1_2.method2049(211);
		Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(arg1) + 1);
		Static74.aClass2_Sub10_Sub1_2.method4443(arg1);
		Static74.aClass2_Sub10_Sub1_2.method4458(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4670(@OriginalArg(1) String arg0) {
		if (Static158.aStringArray28 == null) {
			Static335.method5802();
		}
		@Pc(14) String[] local14 = Static336.method5829(arg0, '\n');
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(28) int local28 = Static324.anInt6551; local28 > 0; local28--) {
				Static158.aStringArray28[local28] = Static158.aStringArray28[local28 - 1];
			}
			Static158.aStringArray28[0] = local14[local16];
			if (Static324.anInt6551 < Static158.aStringArray28.length - 1) {
				if (Static235.anInt4515 > 0) {
					Static235.anInt4515++;
				}
				Static324.anInt6551++;
			}
		}
	}
}
