import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	public static int anInt3296;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "Lclient!wi;")
	public static Class108 aClass108_11 = new Class108();

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "Lclient!i;")
	private static Class41 aClass41_914 = Static184.method2923("K");

	@OriginalMember(owner = "client!og", name = "N", descriptor = "Lclient!i;")
	public static Class41 aClass41_911 = aClass41_914;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "Lclient!i;")
	private static Class41 aClass41_912 = Static184.method2923("Login server offline)3");

	@OriginalMember(owner = "client!og", name = "P", descriptor = "Lclient!i;")
	public static Class41 aClass41_913 = aClass41_914;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "I")
	public static int anInt3299 = 0;

	@OriginalMember(owner = "client!og", name = "S", descriptor = "Lclient!i;")
	public static Class41 aClass41_915 = aClass41_912;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "[Lclient!ba;")
	public static Class8[] aClass8Array1 = new Class8[500];

	@OriginalMember(owner = "client!og", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_916 = Static184.method2923(")3runescape)3com)4l=");

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I")
	public static int method2240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Z")
	public static boolean method2241(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[B")
	public static byte[] method2243(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub2_Sub18 local19 = (Class2_Sub2_Sub18) Static22.aClass43_4.method1464((long) arg0);
		if (local19 == null) {
			@Pc(24) byte[] local24 = new byte[512];
			@Pc(30) Random local30 = new Random((long) arg0);
			for (@Pc(32) int local32 = 0; local32 < 255; local32++) {
				local24[local32] = (byte) local32;
			}
			for (@Pc(47) int local47 = 0; local47 < 255; local47++) {
				@Pc(54) int local54 = 255 - local47;
				@Pc(59) int local59 = Static105.method1788(local54, local30);
				@Pc(63) byte local63 = local24[local59];
				local24[local59] = local24[local54];
				local24[local54] = local24[511 - local47] = local63;
			}
			local19 = new Class2_Sub2_Sub18(local24);
			Static22.aClass43_4.method1462((long) arg0, local19);
		}
		return local19.aByteArray53;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(II)V")
	public static void method2244(@OriginalArg(0) int arg0) {
		Static148.anInt3353 = 1000 / arg0;
	}
}
