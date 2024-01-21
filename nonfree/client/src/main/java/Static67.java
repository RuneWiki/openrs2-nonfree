import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!cd;")
	public static Class13 aClass13_10 = new Class13();

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray11 = new boolean[100];

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!pe;")
	public static Class65 aClass65_678 = Static119.method1462("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public static int anInt1593 = 0;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	public static int anInt1595 = 0;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8 = new int[4][105][105];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!na;Lclient!na;)V")
	public static void method1210(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Class56 arg1) {
		Static30.aClass56_13 = arg1;
		Static18.aClass56_10 = arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1211() {
		aBooleanArray11 = null;
		aClass13_10 = null;
		aClass65_678 = null;
		anIntArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZI)Lclient!pe;")
	public static Class65 method1212(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = 1;
		@Pc(19) int local19 = arg0 / 10;
		while (local19 != 0) {
			local19 /= 10;
			local15++;
		}
		@Pc(37) int local37 = local15;
		if (arg0 < 0 || arg1) {
			local37 = local15 + 1;
		}
		@Pc(48) byte[] local48 = new byte[local37];
		if (arg0 < 0) {
			local48[0] = 45;
		} else if (arg1) {
			local48[0] = 43;
		}
		for (@Pc(66) int local66 = 0; local66 < local15; local66++) {
			@Pc(71) int local71 = arg0 % 10;
			if (local71 < 0) {
				local71 = -local71;
			}
			if (local71 > 9) {
				local71 += 39;
			}
			local48[local37 - local66 - 1] = (byte) (local71 + 48);
			arg0 /= 10;
		}
		@Pc(104) Class65 local104 = new Class65();
		local104.anInt2005 = local37;
		local104.aByteArray27 = local48;
		return local104;
	}
}
