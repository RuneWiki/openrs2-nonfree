import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!jb;")
	public static Class28 aClass28_52;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!sc;")
	public static Class107 aClass107_772 = Static231.method3737("::noclip");

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

	@OriginalMember(owner = "client!me", name = "w", descriptor = "I")
	public static int anInt2878 = 0;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!sc;")
	public static Class107 aClass107_773 = Static231.method3737("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILclient!qa;ZI)V")
	public static void method2209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class96 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static204.anInt2501 >= 50 || (arg2.anIntArrayArray35 == null || arg4 >= arg2.anIntArrayArray35.length || arg2.anIntArrayArray35[arg4] == null)) {
			return;
		}
		@Pc(37) int local37 = arg2.anIntArrayArray35[arg4][0];
		@Pc(43) int local43 = local37 >> 4 & 0x7;
		@Pc(47) int local47 = local37 >> 8;
		@Pc(51) int local51 = local37 & 0xF;
		@Pc(68) int local68;
		if (arg2.anIntArrayArray35[arg4].length > 1) {
			local68 = (int) (Math.random() * (double) arg2.anIntArrayArray35[arg4].length);
			if (local68 > 0) {
				local47 = arg2.anIntArrayArray35[arg4][local68];
			}
		}
		if (local51 == 0) {
			if (arg3) {
				Static15.method337(local47, 0, local43);
			}
		} else if (Static90.anInt1961 != 0) {
			local68 = (arg1 - 64) / 128;
			Static173.anIntArray331[Static204.anInt2501] = local47;
			Static195.anIntArray352[Static204.anInt2501] = local43;
			Static157.anIntArray303[Static204.anInt2501] = 0;
			Static87.aClass43Array1[Static204.anInt2501] = null;
			@Pc(121) int local121 = (arg0 - 64) / 128;
			Static161.anIntArray308[Static204.anInt2501] = (local68 << 16) + (local121 << 8) + local51;
			Static204.anInt2501++;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Lclient!pd;")
	public static Class1_Sub2_Sub2_Sub1 method2211() {
		@Pc(9) byte[] local9 = Static158.aByteArrayArray7[0];
		@Pc(17) int local17 = Static172.anIntArray329[0] * Static141.anIntArray266[0];
		@Pc(20) int[] local20 = new int[local17];
		for (@Pc(22) int local22 = 0; local22 < local17; local22++) {
			local20[local22] = Static169.anIntArray324[local9[local22] & 0xFF];
		}
		@Pc(61) Class1_Sub2_Sub2_Sub1 local61 = new Class1_Sub2_Sub2_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[0], Static223.anIntArray373[0], Static141.anIntArray266[0], Static172.anIntArray329[0], local20);
		Static158.method2564();
		return local61;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[B")
	public static byte[] method2212(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub2_Sub7 local12 = (Class1_Sub2_Sub7) Static91.aClass8_5.method312((long) arg0);
		if (local12 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(54) int local54 = 255 - local47;
				@Pc(59) int local59 = Static206.method3285(local30, local54);
				@Pc(63) byte local63 = local24[local59];
				local24[local59] = local24[local54];
				local24[local54] = local24[511 - local47] = local63;
			}
			local12 = new Class1_Sub2_Sub7(local24);
			Static91.aClass8_5.method304(local12, (long) arg0);
		}
		return local12.aByteArray28;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)Z")
	public static boolean method2213(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([[II)V")
	public static void method2214(@OriginalArg(0) int[][] arg0) {
		Static231.anIntArrayArray44 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!lg;[BII)V")
	public static void method2215(@OriginalArg(0) Class73 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class1_Sub3 local3 = new Class1_Sub3();
		local3.anInt254 = 0;
		local3.aClass73_1 = arg0;
		local3.aLong177 = arg2;
		local3.aByteArray1 = arg1;
		@Pc(27) Class120 local27 = Static192.aClass120_19;
		synchronized (Static192.aClass120_19) {
			Static192.aClass120_19.method3567(local3);
		}
		Static102.method1715();
	}
}
