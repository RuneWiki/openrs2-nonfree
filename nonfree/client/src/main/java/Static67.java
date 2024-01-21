import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "I")
	public static int anInt1683;

	@OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
	public static int anInt1701;

	@OriginalMember(owner = "client!mc", name = "vb", descriptor = "I")
	public static int anInt1720;

	@OriginalMember(owner = "client!mc", name = "wb", descriptor = "Lclient!sf;")
	public static Class5 aClass5_49;

	@OriginalMember(owner = "client!mc", name = "Eb", descriptor = "Lclient!uf;")
	public static Class1_Sub23 aClass1_Sub23_2;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "Lclient!sc;")
	private static Class66 aClass66_902 = Static106.method1849("Loaded wordpack");

	@OriginalMember(owner = "client!mc", name = "ab", descriptor = "Lclient!sc;")
	public static Class66 aClass66_903 = aClass66_902;

	@OriginalMember(owner = "client!mc", name = "cb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_904 = Static106.method1849("Sorry invited players only)3");

	@OriginalMember(owner = "client!mc", name = "Ab", descriptor = "Lclient!sc;")
	public static Class66 aClass66_905 = Static106.method1849("<col=00ffff>");

	@OriginalMember(owner = "client!mc", name = "Bb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_906 = Static106.method1849("Connection timed out)3");

	@OriginalMember(owner = "client!mc", name = "Fb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_907 = Static106.method1849("Type");

	@OriginalMember(owner = "client!mc", name = "Gb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_908 = Static106.method1849("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!mc", name = "Lb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_909 = aClass66_906;

	@OriginalMember(owner = "client!mc", name = "Ob", descriptor = "Lclient!sc;")
	public static Class66 aClass66_910 = aClass66_907;

	@OriginalMember(owner = "client!mc", name = "Tb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_911 = aClass66_904;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method1171() {
		aClass66_907 = null;
		aClass66_909 = null;
		aClass1_Sub23_2 = null;
		aClass66_905 = null;
		aClass5_49 = null;
		aClass66_908 = null;
		aClass66_906 = null;
		aClass66_903 = null;
		aClass66_904 = null;
		aClass66_910 = null;
		aClass66_902 = null;
		aClass66_911 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method1179(@OriginalArg(0) Class1_Sub12 arg0) {
		if (Static56.aClass72_4 != null) {
			try {
				Static56.aClass72_4.method1942(0L);
				Static56.aClass72_4.method1935(arg0.anInt1694, 24, arg0.aByteArray12);
			} catch (@Pc(17) Exception local17) {
			}
		}
		arg0.anInt1694 += 24;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(IB)I")
	public static int method1184(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(25) int local25 = (local14 & 0x33333333) + (local14 >>> 2 & 0x73333333);
		@Pc(33) int local33 = (local25 >>> 4) + local25 & 0xF0F0F0F;
		@Pc(39) int local39 = local33 + (local33 >>> 8);
		@Pc(45) int local45 = local39 + (local39 >>> 16);
		return local45 & 0xFF;
	}
}
