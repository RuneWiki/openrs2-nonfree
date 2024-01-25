import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!lba", name = "Q", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I[ILclient!en;[IIB)Lclient!ao;")
	public static Class20_Sub1 method4511(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class100_Sub1 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		@Pc(25) int local25;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (!arg2.method4794(Static47.aClass42_4, Static104.aClass88_3)) {
			@Pc(75) int[] local75 = new int[arg4 * arg0];
			for (local25 = 0; local25 < arg0; local25++) {
				local35 = arg3[local25] + arg4 * local25;
				for (local37 = 0; local37 < arg1[local25]; local37++) {
					local75[local35++] = -16777216;
				}
			}
			return new Class20_Sub1(arg2, arg4, arg0, local75);
		}
		@Pc(23) byte[] local23 = new byte[arg0 * arg4];
		for (local25 = 0; local25 < arg0; local25++) {
			local35 = arg3[local25] + local25 * arg4;
			for (local37 = 0; local37 < arg1[local25]; local37++) {
				local23[local35++] = -1;
			}
		}
		return new Class20_Sub1(arg2, arg4, arg0, local23);
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(II)Z")
	public static boolean method4512(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(IIII)I")
	public static int method4513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static499.anInt8380 < 100) {
			return -2;
		}
		@Pc(14) int local14 = -2;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(21) int local21 = arg2 - Static270.anInt1801;
		@Pc(25) int local25 = arg0 - Static270.anInt1800;
		for (@Pc(35) Class2_Sub46 local35 = (Class2_Sub46) Static270.aClass8_9.method210(); local35 != null; local35 = (Class2_Sub46) Static270.aClass8_9.method218()) {
			if (local35.anInt9117 == arg1) {
				@Pc(48) int local48 = local35.anInt9115;
				@Pc(51) int local51 = local35.anInt9116;
				@Pc(62) int local62 = local48 + Static270.anInt1801 << 14 | Static270.anInt1800 + local51;
				@Pc(81) int local81 = (local21 - local48) * (local21 - local48) + (local25 - local51) * (-local51 + local25);
				if (local14 < 0 || local16 > local81) {
					local16 = local81;
					local14 = local62;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB)[B")
	public static byte[] method4514(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub3_Sub16 local17 = (Class2_Sub3_Sub16) Static586.aClass209_8.method4599((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static233.method3629(local28, local52);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local17 = new Class2_Sub3_Sub16(local22);
			Static586.aClass209_8.method4596(local17, (long) arg0);
		}
		return local17.aByteArray82;
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(IZ)V")
	public static void method4515(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static270.aClass2_Sub3_Sub3_2 != null) {
			Static50.anInt1258 = Static270.aClass2_Sub3_Sub3_2.anInt2215;
		} else {
			Static50.anInt1258 = -1;
		}
		Static36.aClass8_3 = null;
		Static499.anInt8380 = 0;
		Static270.aClass2_Sub3_Sub3_2 = null;
		Static368.aClass196_6 = null;
		Static270.method1310();
		Static270.aClass8_9.method220();
		Static157.aClass243_4 = null;
		Static407.aClass243_7 = null;
		Static87.aClass243_3 = null;
		Static415.anInt7185 = -1;
		Static80.aClass243_2 = null;
		Static331.aClass243_6 = null;
		Static264.anInt4873 = -1;
		Static488.aClass243_8 = null;
		Static204.aClass243_5 = null;
		Static16.aClass243_1 = null;
		Static270.aClass288_2 = null;
		Static326.aClass39_12 = null;
		if (Static270.aClass25_2 != null) {
			Static270.aClass25_2.method440();
			Static270.aClass25_2.method441(64, 128);
		}
		if (Static270.aClass306_2 != null) {
			Static270.aClass306_2.method6832(64, 64);
		}
		if (Static270.aClass97_3 != null) {
			Static270.aClass97_3.method1792(64);
		}
		Static49.aClass282_1.method6477(64);
	}
}
