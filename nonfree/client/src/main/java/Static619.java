import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!w", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray79;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIB)Z")
	public static boolean method8432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!sba;IIIIIIIIILclient!ha;)V")
	public static void method8433(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7_Sub19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class82 arg10) {
		if (arg0 < arg9 && arg9 < arg6 + arg0 && arg8 > arg5 - 13 && arg5 + 3 > arg8 && arg1.aBoolean625) {
			arg4 = arg3;
		}
		@Pc(32) int[] local32 = null;
		if (Static368.method5890(arg1.anInt8564)) {
			local32 = Static298.aClass132_1.method3062((int) arg1.aLong229).anIntArray436;
		} else if (arg1.anInt8567 != -1) {
			local32 = Static298.aClass132_1.method3062(arg1.anInt8567).anIntArray436;
		} else if (Static580.method8102(arg1.anInt8564)) {
			@Pc(63) Class3_Sub43 local63 = (Class3_Sub43) Static545.aClass25_40.method426((long) (int) arg1.aLong229);
			if (local63 != null) {
				@Pc(68) Class9_Sub2_Sub1_Sub2_Sub2 local68 = local63.aClass9_Sub2_Sub1_Sub2_Sub2_2;
				@Pc(71) Class309 local71 = local68.aClass309_1;
				if (local71.anIntArray553 != null) {
					local71 = local71.method7594(Static183.aClass285_1);
				}
				if (local71 != null) {
					local32 = local71.anIntArray554;
				}
			}
		} else if (Static110.method1823(arg1.anInt8564)) {
			@Pc(105) Class330 local105;
			if (arg1.anInt8564 == 1009) {
				local105 = Static370.aClass284_3.method6915((int) arg1.aLong229);
			} else {
				local105 = Static370.aClass284_3.method6915((int) (arg1.aLong229 >>> 32 & 0x7FFFFFFFL));
			}
			if (local105.anIntArray581 != null) {
				local105 = local105.method7892(Static183.aClass285_1);
			}
			if (local105 != null) {
				local32 = local105.anIntArray577;
			}
		}
		@Pc(143) String local143 = Static354.method5709(arg1);
		if (local32 != null) {
			local143 = local143 + Static103.method1716(local32);
		}
		Static374.aClass63_9.method7756(arg0 + 3, Static307.aClass103Array12, arg5, Static234.anIntArray255, local143, arg4);
		if (arg1.aBoolean626) {
			Static519.aClass103_44.method7462(Static426.aClass93_11.method2315(local143) + arg0 + 5, arg5 - 12);
		}
	}
}
