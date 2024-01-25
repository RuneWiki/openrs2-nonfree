import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!mca", name = "h", descriptor = "[I")
	public static int[] anIntArray53;

	@OriginalMember(owner = "client!mca", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_22 = new Class47(65, -1);

	@OriginalMember(owner = "client!mca", name = "i", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_23 = new Class73(88, 6);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZ)V")
	public static void method1148() {
		@Pc(17) Class6_Sub31 local17 = Static114.method2007(Static547.aClass47_145, Static337.aClass324_1);
		Static534.method7251(local17);
		for (@Pc(25) Class6_Sub11 local25 = (Class6_Sub11) Static224.aClass128_23.method3265(); local25 != null; local25 = (Class6_Sub11) Static224.aClass128_23.method3273()) {
			if (!local25.method7803()) {
				local25 = (Class6_Sub11) Static224.aClass128_23.method3265();
				if (local25 == null) {
					break;
				}
			}
			if (local25.anInt1217 == 0) {
				Static145.method2815(true, true, local25);
			}
		}
		if (Static518.aClass292_13 != null) {
			Static464.method6502(Static518.aClass292_13);
			Static518.aClass292_13 = null;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V")
	public static void method1149(@OriginalArg(0) int arg0) {
		if (Static560.anInt9247 == 1) {
			Static170.anInt3627 = arg0;
		} else if (Static560.anInt9247 == 2 || Static560.anInt9247 == 3) {
			Static349.anInt6232 = arg0;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method1151(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = (arg0 ? Static266.aClass248_2.anInt6818 : Static266.aClass248_2.anInt6817) + local19;
		for (@Pc(31) int local31 = local19; local31 < local29; local31++) {
			@Pc(38) Class6_Sub2_Sub5 local38 = Static266.aClass248_2.method5726(local31);
			if (local38.aBoolean139 && local38.method1827().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static113.aShortArray14 = null;
					Static148.anInt3249 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(68) short[] local68 = new short[local11.length * 2];
					for (@Pc(70) int local70 = 0; local70 < local13; local70++) {
						local68[local70] = local11[local70];
					}
					local11 = local68;
				}
				local11[local13++] = (short) local31;
			}
		}
		Static234.anInt4753 = 0;
		Static148.anInt3249 = local13;
		Static113.aShortArray14 = local11;
		@Pc(107) String[] local107 = new String[Static148.anInt3249];
		for (@Pc(109) int local109 = 0; local109 < Static148.anInt3249; local109++) {
			local107[local109] = Static266.aClass248_2.method5726(local11[local109]).method1827();
		}
		Static430.method6179(local107, Static113.aShortArray14);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)Z")
	public static boolean method1153() {
		@Pc(10) Class6_Sub12 local10 = (Class6_Sub12) Static541.aClass361_51.method7838();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt1290; local16++) {
			if (local10.aClass331Array1[local16] != null && local10.aClass331Array1[local16].anInt8818 == 0) {
				return false;
			}
			if (local10.aClass331Array2[local16] != null && local10.aClass331Array2[local16].anInt8818 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
	public static void method1155() {
		Static421.anInt7365 = 0;
		Static182.aClass361_23.method7842();
		Static182.aClass361_23.method7833(Static34.aClass6_Sub45_1);
		Static421.anInt7365++;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIII)I")
	public static int method1156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 255 - arg1;
		@Pc(30) int local30 = (arg1 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
		return ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local30;
	}
}
