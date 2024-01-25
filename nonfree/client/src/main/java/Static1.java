import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "j", descriptor = "[S")
	public static short[] aShortArray10;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_4 = new Class214(2, 7);

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!di;")
	public static final Class54 aClass54_18 = new Class54(10, 8);

	@OriginalMember(owner = "client!a", name = "g", descriptor = "[I")
	public static final int[] anIntArray67 = new int[250];

	@OriginalMember(owner = "client!a", name = "h", descriptor = "[B")
	public static final byte[] aByteArray21 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(JILjava/lang/String;ZIILjava/lang/String;IIZZ)V")
	public static void method701(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 3; local15++) {
			local8[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(33) Class2_Sub23 local33 = new Class2_Sub23(128);
		local33.method5449(10);
		local33.method5502((arg3 ? 1 : 0) | (arg8 ? 2 : 0) | (arg9 ? 4 : 0));
		local33.method5450(arg0);
		local33.method5506(local8[0]);
		local33.method5496(arg6);
		local33.method5506(local8[1]);
		local33.method5502(Static352.anInt5971);
		local33.method5449(arg1);
		local33.method5449(arg7);
		local33.method5506(local8[2]);
		local33.method5502(arg4);
		local33.method5502(arg5);
		local33.method5506(local8[3]);
		local33.method5510(Static100.aBigInteger2, Static57.aBigInteger1);
		@Pc(119) Class2_Sub23 local119 = new Class2_Sub23(350);
		local119.method5496(arg2);
		@Pc(132) int local132 = 8 - Static287.method4138(arg2) % 8;
		for (@Pc(134) int local134 = 0; local134 < local132; local134++) {
			local119.method5449((int) (Math.random() * 255.0D));
		}
		local119.method5512(local8);
		Static424.aClass2_Sub23_Sub2_1.anInt6952 = 0;
		Static424.aClass2_Sub23_Sub2_1.method5449(Static94.aClass240_8.anInt6576);
		Static424.aClass2_Sub23_Sub2_1.method5502(local33.anInt6952 + local119.anInt6952 + 2);
		Static424.aClass2_Sub23_Sub2_1.method5502(591);
		Static424.aClass2_Sub23_Sub2_1.method5462(local33.anInt6952, local33.aByteArray130);
		Static424.aClass2_Sub23_Sub2_1.method5462(local119.anInt6952, local119.aByteArray130);
		Static103.anInt2416 = 0;
		Static449.anInt7307 = 0;
		Static3.anInt113 = -3;
		Static10.anInt258 = 1;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIII)V")
	public static void method703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = Static40.aShort2 + (Static414.aShort94 - Static40.aShort2) * local7 / 100;
		@Pc(40) int local40 = arg0 * local34 >> 8;
		@Pc(47) int local47 = 16384 - arg3 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg5 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local40;
		if (local47 != 0) {
			local57 = Class162.anIntArray388[local47] * -local40 >> 15;
			local59 = Class162.anIntArray387[local47] * local40 >> 15;
		}
		if (local53 != 0) {
			local55 = Class162.anIntArray388[local53] * local59 >> 15;
			local59 = local59 * Class162.anIntArray387[local53] >> 15;
		}
		Static364.anInt6270 = arg6 - local55;
		Static23.anInt567 = arg1 - local59;
		Static130.anInt2796 = 0;
		Static355.anInt6031 = arg2 - local57;
		Static140.anInt2975 = arg5;
		Static119.anInt2680 = arg3;
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
	public static void method708() {
		for (@Pc(10) Class8_Sub7 local10 = (Class8_Sub7) Static121.aClass112_7.method2544(); local10 != null; local10 = (Class8_Sub7) Static121.aClass112_7.method2544()) {
			Static391.method3867(local10);
		}
		@Pc(29) int local29;
		@Pc(31) int local31;
		if (Static12.aClass79_Sub1_1.method3966(Static399.anInt6653)) {
			local29 = 0;
			local31 = 3;
		} else {
			local31 = Static427.anInt7117;
			local29 = Static427.anInt7117;
		}
		Static47.method780();
		for (@Pc(48) int local48 = local29; local48 <= local31; local48++) {
			Static47.method788();
			Static47.method790(local48);
			Static47.method789(local48);
		}
		Static47.method784();
		Static47.method796();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)I")
	public static int method710(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(16) int local16 = (arg0 & 0x7F) * 96 >> 7;
		if (local16 < 2) {
			local16 = 2;
		} else if (local16 > 126) {
			local16 = 126;
		}
		return (arg0 & 0xFF80) + local16;
	}
}
