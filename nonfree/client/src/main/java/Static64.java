import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "[[Lclient!me;")
	public static Class71[][] aClass71ArrayArray1;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!mb;")
	public static Class70 aClass70_17;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Lclient!k;")
	public static Class1_Sub16 aClass1_Sub16_4 = new Class1_Sub16(new byte[5000]);

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Lclient!ia;")
	public static Class51 aClass51_461 = method1101(" <col=00ff80>");

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!ia;")
	private static Class51 aClass51_462 = method1101("Loaded wordpack");

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!ia;")
	public static Class51 aClass51_463 = aClass51_462;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Lclient!sf;")
	public static Class105 aClass105_7 = new Class105();

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/lang/String;)Lclient!ia;")
	public static Class51 method1101(@OriginalArg(1) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(4) int local4 = 0;
		@Pc(7) int local7 = local2.length;
		@Pc(11) Class51 local11 = new Class51();
		local11.aByteArray17 = new byte[local7];
		while (local4 < local7) {
			@Pc(27) int local27 = local2[local4++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local4 >= local7) {
					break;
				}
				@Pc(63) int local63 = local2[local4++] & 0xFF;
				local11.aByteArray17[local11.anInt1858++] = (byte) (local63 + (local27 + -40) * 43 - 48);
			} else if (local27 != 0) {
				local11.aByteArray17[local11.anInt1858++] = (byte) local27;
			}
		}
		local11.method1434();
		return local11.method1391();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBI)V")
	public static void method1103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static23.aClass102_3.method3093((long) arg0);
		if (local12 == null) {
			local12 = new Class1_Sub10();
			Static23.aClass102_3.method3083(local12, (long) arg0);
		}
		if (arg2 >= local12.anIntArray95.length) {
			@Pc(34) int[] local34 = new int[arg2 + 1];
			@Pc(39) int[] local39 = new int[arg2 + 1];
			for (@Pc(41) int local41 = 0; local41 < local12.anIntArray95.length; local41++) {
				local34[local41] = local12.anIntArray95[local41];
				local39[local41] = local12.anIntArray96[local41];
			}
			for (@Pc(71) int local71 = local12.anIntArray95.length; local71 < arg2; local71++) {
				local34[local71] = -1;
				local39[local71] = 0;
			}
			local12.anIntArray95 = local34;
			local12.anIntArray96 = local39;
		}
		local12.anIntArray95[arg2] = arg1;
		local12.anIntArray96[arg2] = arg3;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public static void method1104() {
		if (Static103.aClass50_2 != null) {
			@Pc(8) Class50 local8 = Static103.aClass50_2;
			synchronized (Static103.aClass50_2) {
				Static103.aClass50_2 = null;
			}
		}
	}
}
