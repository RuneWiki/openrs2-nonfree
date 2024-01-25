import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "[I")
	public static final int[] anIntArray227 = new int[4096];

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "[I")
	public static final int[] anIntArray228 = new int[50];

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!vh;II)Z")
	public static boolean method923(@OriginalArg(0) Class2_Sub16_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method5380(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(98) int local98;
		@Pc(102) int local102;
		@Pc(108) int local108;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg0.method5380(1) != 0) {
				method923(arg0, arg1);
			}
			local28 = arg0.method5380(6);
			local33 = arg0.method5380(6);
			@Pc(43) boolean local43 = arg0.method5380(1) == 1;
			if (local43) {
				Static294.anIntArray1002[Static299.anInt5124++] = arg1;
			}
			if (Static125.aClass1_Sub5_Sub1_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(70) Class1_Sub5_Sub1_Sub1 local70 = Static125.aClass1_Sub5_Sub1_Sub1Array1[arg1] = new Class1_Sub5_Sub1_Sub1();
			local70.anInt6413 = arg1;
			if (Static43.aClass2_Sub16Array1[arg1] != null) {
				local70.method2251(Static43.aClass2_Sub16Array1[arg1]);
			}
			local70.method5542(Static141.anIntArray582[arg1]);
			local70.anInt6410 = Static72.anIntArray892[arg1];
			local98 = Static77.anIntArray337[arg1];
			local102 = local98 >> 28;
			local108 = local98 >> 14 & 0xFF;
			local112 = local98 & 0xFF;
			local70.aByteArray115[0] = Static95.aByteArray114[arg1];
			local70.aByte69 = (byte) local102;
			local70.method2248(local33 + (local112 << 6) - Static319.anInt5425, -Static28.anInt606 + (local108 << 6) - -local28);
			local70.anInt2281 = -1;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method5380(2);
			local33 = Static77.anIntArray337[arg1];
			Static77.anIntArray337[arg1] = ((local28 + (local33 >> 28) & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(196) int local196;
			@Pc(200) int local200;
			if (local8 != 2) {
				local28 = arg0.method5380(18);
				local33 = local28 >> 16;
				local196 = local28 >> 8 & 0xFF;
				local200 = local28 & 0xFF;
				local98 = Static77.anIntArray337[arg1];
				local102 = local33 + (local98 >> 28) & 0x3;
				local108 = local196 + (local98 >> 14) & 0xFF;
				local112 = local98 + local200 & 0xFF;
				Static77.anIntArray337[arg1] = (local102 << 28) + ((local108 << 14) + local112);
				return false;
			}
			local28 = arg0.method5380(5);
			local33 = local28 >> 3;
			local196 = local28 & 0x7;
			local200 = Static77.anIntArray337[arg1];
			local98 = (local200 >> 28) + local33 & 0x3;
			local102 = local200 >> 14 & 0xFF;
			local108 = local200 & 0xFF;
			if (local196 == 0) {
				local108--;
				local102--;
			}
			if (local196 == 1) {
				local108--;
			}
			if (local196 == 2) {
				local108--;
				local102++;
			}
			if (local196 == 3) {
				local102--;
			}
			if (local196 == 4) {
				local102++;
			}
			if (local196 == 5) {
				local102--;
				local108++;
			}
			if (local196 == 6) {
				local108++;
			}
			if (local196 == 7) {
				local108++;
				local102++;
			}
			Static77.anIntArray337[arg1] = local108 + (local98 << 28) + (local102 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method924() {
		Static140.aClass63_4.method1959(((float) Static3.anInt131 * 0.1F + 0.7F) * Static217.aFloat68);
		Static140.aClass63_4.method2038(Static287.anInt4978, Static116.aFloat40, Static300.aFloat7, (float) Static90.anInt1727, (float) Static80.anInt1469, (float) Static237.anInt4229);
		Static140.aClass63_4.method1989(Static215.aClass21_3);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Z")
	public static boolean method926() {
		try {
			if (Static391.anInt6626 == 2) {
				if (Static16.aClass2_Sub3_1 == null) {
					Static16.aClass2_Sub3_1 = Static393.method68(Static198.aClass171_50, Static361.anInt6051, Static356.anInt5999);
					if (Static16.aClass2_Sub3_1 == null) {
						return false;
					}
				}
				if (Static27.aClass220_1 == null) {
					Static27.aClass220_1 = new Class220(Static345.aClass171_99, Static234.aClass171_56);
				}
				if (Static249.aClass2_Sub2_Sub4_42.method5284(Static349.aClass171_71, Static27.aClass220_1, Static16.aClass2_Sub3_1)) {
					Static249.aClass2_Sub2_Sub4_42.method5289();
					Static249.aClass2_Sub2_Sub4_42.method5301(Static257.anInt4521);
					Static249.aClass2_Sub2_Sub4_42.method5304(Static16.aClass2_Sub3_1, Static192.aBoolean276);
					Static16.aClass2_Sub3_1 = null;
					Static27.aClass220_1 = null;
					Static198.aClass171_50 = null;
					Static391.anInt6626 = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static249.aClass2_Sub2_Sub4_42.method5303();
			Static27.aClass220_1 = null;
			Static391.anInt6626 = 0;
			Static198.aClass171_50 = null;
			Static16.aClass2_Sub3_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZ)V")
	public static void method928(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class2_Sub1 local8 = Static72.method4067(arg0, arg1);
		if (local8 != null) {
			local8.method5617();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method929(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static164.aBoolean240) {
			try {
				@Pc(20) Class82 local20 = (Class82) Class.forName("Class82_Sub1").getDeclaredConstructor().newInstance();
				local20.method2413(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static164.aBoolean240 = true;
			}
		}
		return arg0;
	}
}
