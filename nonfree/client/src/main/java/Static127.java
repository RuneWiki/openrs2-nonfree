import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "J")
	public static long aLong106;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_41;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!q;")
	public static Class1_Sub1_Sub13 aClass1_Sub1_Sub13_1;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	public static int anInt3639 = 0;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "Lclient!ea;")
	private static Class18 aClass18_911 = Static8.method128(" from your friend list first)3");

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_912 = null;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!ea;")
	public static Class18 aClass18_913 = aClass18_911;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!ea;")
	public static Class18 aClass18_914 = Static8.method128("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!ea;")
	private static Class18 aClass18_918 = Static8.method128("wave2:");

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_915 = aClass18_918;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "[Lclient!ea;")
	public static Class18[] aClass18Array18 = new Class18[1000];

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "Lclient!ea;")
	private static Class18 aClass18_916 = Static8.method128("Members only world");

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_917 = aClass18_916;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	public static int anInt3641 = -1;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Lclient!ea;")
	public static Class18 aClass18_919 = Static8.method128("Art");

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!ea;")
	public static Class18 aClass18_920 = aClass18_918;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!dd;)V")
	public static void method2491(@OriginalArg(1) Class16 arg0) {
		Static174.aClass16_39 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZILclient!pf;II)V")
	public static void method2492(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class1_Sub1_Sub12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static33.anInt1116 >= 50 || (arg2.anIntArray306 == null || arg2.anIntArray306.length <= arg0)) {
			return;
		}
		@Pc(21) int local21 = arg2.anIntArray306[arg0];
		if (local21 == 0) {
			return;
		}
		@Pc(33) int local33 = local21 & 0xF;
		@Pc(37) int local37 = local21 >> 8;
		@Pc(43) int local43 = local21 >> 4 & 0x7;
		if (local33 == 0) {
			if (arg1) {
				Static137.method2608(0, local43, local37);
			}
		} else if (Static97.anInt3004 != 0) {
			@Pc(65) int local65 = (arg3 - 64) / 128;
			Static101.anIntArray268[Static33.anInt1116] = local37;
			Static71.anIntArray190[Static33.anInt1116] = local43;
			@Pc(79) int local79 = (arg4 - 64) / 128;
			Static167.anIntArray412[Static33.anInt1116] = 0;
			Static159.aClass12Array1[Static33.anInt1116] = null;
			Static124.anIntArray312[Static33.anInt1116] = (local79 << 8) + (local65 << 16) + local33;
			Static33.anInt1116++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method2493() {
		aClass18_918 = null;
		aClass18_916 = null;
		aClass1_Sub1_Sub13_1 = null;
		aClass18Array18 = null;
		aClass18_915 = null;
		aClass18_911 = null;
		aClass16_Sub1_41 = null;
		aClass18_917 = null;
		aClass18_914 = null;
		aClass18_912 = null;
		aClass18_920 = null;
		aClass18_919 = null;
		aClass18_913 = null;
	}
}
