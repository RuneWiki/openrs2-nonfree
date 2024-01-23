import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
	public static int[] anIntArray331;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!kh;")
	private static Class60 aClass60_868 = Static200.method3116("Create a free account");

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "Lclient!kh;")
	public static Class60 aClass60_869 = Static200.method3116("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_870 = aClass60_868;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
	public static volatile int anInt2624 = 0;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_871 = Static200.method3116("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public static int anInt2627 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[B")
	public static byte[] method1970(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub1_Sub10 local19 = (Class1_Sub1_Sub10) Static168.aClass39_20.method1161((long) arg0);
		if (local19 == null) {
			@Pc(27) Random local27 = new Random((long) arg0);
			@Pc(30) byte[] local30 = new byte[512];
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local30[local32] = (byte) local32;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(51) int local51 = 255 - local45;
				@Pc(56) int local56 = Static199.method3113(local51, local27);
				@Pc(60) byte local60 = local30[local56];
				local30[local56] = local30[local51];
				local30[local51] = local30[511 - local45] = local60;
			}
			local19 = new Class1_Sub1_Sub10(local30);
			Static168.aClass39_20.method1152((long) arg0, local19);
		}
		return local19.aByteArray33;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!kb;Z)V")
	public static void method1972(@OriginalArg(1) Class55 arg0, @OriginalArg(2) boolean arg1) {
		if (Static205.aClass55_4 != null) {
			try {
				Static205.aClass55_4.method1754();
			} catch (@Pc(12) Exception local12) {
			}
			Static205.aClass55_4 = null;
		}
		Static205.aClass55_4 = arg0;
		Static151.method2591(arg1);
		Static86.anInt2000 = 0;
		Static94.aClass1_Sub9_5.anInt1192 = 0;
		Static209.aClass1_Sub1_Sub20_1 = null;
		Static38.aClass1_Sub9_3 = null;
		while (true) {
			@Pc(35) Class1_Sub1_Sub20 local35 = (Class1_Sub1_Sub20) Static204.aClass33_17.method1067();
			if (local35 == null) {
				while (true) {
					local35 = (Class1_Sub1_Sub20) Static64.aClass33_3.method1067();
					if (local35 == null) {
						if (Static177.aByte13 != 0) {
							try {
								@Pc(87) Class1_Sub9 local87 = new Class1_Sub9(4);
								local87.method899(4);
								local87.method899(Static177.aByte13);
								local87.method890(0);
								Static205.aClass55_4.method1756(local87.aByteArray20, 4);
							} catch (@Pc(108) IOException local108) {
								try {
									Static205.aClass55_4.method1754();
								} catch (@Pc(113) Exception local113) {
								}
								Static205.aClass55_4 = null;
								Static4.anInt104++;
							}
						}
						Static114.anInt2615 = 0;
						Static41.aLong34 = Static3.method57();
						return;
					}
					Static34.aClass52_1.method1675(local35);
					Static25.aClass33_2.method1072(local35.aLong150, local35);
					Static32.anInt813++;
					Static193.anInt4131--;
				}
			}
			Static85.aClass33_5.method1072(local35.aLong150, local35);
			Static165.anInt2955--;
			Static43.anInt924++;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)I")
	public static int method1973(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + ((arg1 >> 2 << 10) + (arg0 >> 5 << 7));
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!kh;Lclient!ai;Lclient!kh;Lclient!ai;)Lclient!mg;")
	public static Class1_Sub1_Sub14 method1974(@OriginalArg(1) Class60 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class60 arg2, @OriginalArg(4) Class7 arg3) {
		@Pc(4) int local4 = arg3.method3222(arg2);
		@Pc(19) int local19 = arg3.method3240(arg0, local4);
		return Static121.method2029(arg1, arg3, local19, local4);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)Lclient!kh;")
	public static Class60 method1975(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static40.method681(arg0) : Static85.aClass60_654;
	}
}
