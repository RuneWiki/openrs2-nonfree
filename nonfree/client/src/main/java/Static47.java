import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics2;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_821 = Static158.method3034("jlv");

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_823 = Static158.method3034("Loaded sprites");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!ob;")
	public static Class60 aClass60_822 = aClass60_823;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_38 = new Class89(30);

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!rf;")
	public static final Class2_Sub21 aClass2_Sub21_2 = new Class2_Sub21(0, 0);

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public static int anInt2935 = 0;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "[I")
	public static final int[] anIntArray336 = new int[128];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIBILclient!ra;)V")
	public static void method2314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class72 arg3) {
		if (Static166.anInt4104 < 3) {
			Static11.aClass2_Sub1_Sub7_Sub4_3.method2152(arg1, arg2, arg3.anInt3878, arg3.anInt3871, Static11.aClass2_Sub1_Sub7_Sub4_3.anInt2694 / 2, Static11.aClass2_Sub1_Sub7_Sub4_3.anInt2691 / 2, Static188.anInt4484, arg3.anIntArray433, arg3.anIntArray434);
		} else {
			Static133.method2128(arg1, arg2, arg3.anIntArray433, arg3.anIntArray434);
		}
		Static196.aBooleanArray19[arg0] = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)I")
	public static int method2315(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!ca;ZIBIII)V")
	public static void method2316(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = (long) ((arg2 << 16) + arg5);
		@Pc(13) Class2_Sub1_Sub20 local13 = (Class2_Sub1_Sub20) Static147.aClass51_10.method2458(local7);
		if (local13 != null) {
			return;
		}
		local13 = (Class2_Sub1_Sub20) Static138.aClass51_2.method2458(local7);
		if (local13 != null) {
			return;
		}
		local13 = (Class2_Sub1_Sub20) Static179.aClass51_14.method2458(local7);
		if (local13 == null) {
			if (!arg1) {
				local13 = (Class2_Sub1_Sub20) Static160.aClass51_4.method2458(local7);
				if (local13 != null) {
					return;
				}
			}
			local13 = new Class2_Sub1_Sub20();
			local13.aByte7 = arg3;
			local13.aClass13_Sub1_26 = arg0;
			local13.anInt4441 = arg4;
			if (arg1) {
				Static147.aClass51_10.method2463(local13, local7);
				Static64.anInt1969++;
			} else {
				Static114.aClass55_1.method2528(local13);
				Static179.aClass51_14.method2463(local13, local7);
				Static85.anInt2515++;
			}
		} else if (arg1) {
			local13.method3415();
			Static147.aClass51_10.method2463(local13, local7);
			Static85.anInt2515--;
			Static64.anInt1969++;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Lclient!ob;")
	public static Class60 method2317(@OriginalArg(0) int arg0) {
		return Static196.aClass60Array26[arg0].method2673() > 0 ? Static193.method3536(new Class60[] { Static22.aClass60Array5[arg0], Static175.aClass60_1175, Static196.aClass60Array26[arg0] }) : Static22.aClass60Array5[arg0];
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!pe;Lclient!pe;Lclient!pe;)V")
	public static void method2319(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) Class13 arg2) {
		Static70.aClass13_14 = arg2;
		Static10.aClass13_5 = arg0;
		Static10.aClass13_4 = arg1;
	}
}
