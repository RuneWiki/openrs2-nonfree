import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!us", name = "M", descriptor = "Lclient!rb;")
	public static Class297 aClass297_9;

	@OriginalMember(owner = "client!us", name = "A", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_96 = new Class187(47, 3);

	@OriginalMember(owner = "client!us", name = "E", descriptor = "I")
	public static final int anInt9882 = 52;

	@OriginalMember(owner = "client!us", name = "h", descriptor = "(I)V")
	public static void method8227() {
		if (!Static19.aBoolean7) {
			Static644.aFloat196 += (-24.0F - Static644.aFloat196) / 2.0F;
			Static19.aBoolean7 = true;
			Static550.aBoolean649 = true;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "()V")
	public static void method8231() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static392.aClass313ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static392.aClass313ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static665.anInt7330; local6++) {
					for (local9 = 0; local9 < Static92.anInt1526; local9++) {
						if (Static392.aClass313ArrayArrayArray4[local3][local6][local9] != null) {
							Static392.aClass313ArrayArrayArray4[local3][local6][local9].method7334();
						}
						Static392.aClass313ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static392.aClass313ArrayArrayArray4 = null;
		Static230.aClass88Array2 = null;
		if (Static549.aClass313ArrayArrayArray6 != null) {
			for (local3 = 0; local3 < Static549.aClass313ArrayArrayArray6.length; local3++) {
				for (local6 = 0; local6 < Static665.anInt7330; local6++) {
					for (local9 = 0; local9 < Static92.anInt1526; local9++) {
						if (Static549.aClass313ArrayArrayArray6[local3][local6][local9] != null) {
							Static549.aClass313ArrayArrayArray6[local3][local6][local9].method7334();
						}
						Static549.aClass313ArrayArrayArray6[local3][local6][local9] = null;
					}
				}
			}
		}
		Static549.aClass313ArrayArrayArray6 = null;
		Static176.aClass88Array1 = null;
		Static129.aClass313ArrayArrayArray7 = null;
		Static298.aClass88Array3 = null;
		Static10.aBooleanArrayArray1 = null;
		Static115.aBooleanArrayArray3 = null;
		Static652.anIntArray595 = null;
		Static630.aBooleanArrayArrayArray2 = null;
		Static11.aBooleanArrayArrayArray1 = null;
		Static631.method8402();
		if (Static545.aClass41_Sub1_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static89.anInt1482; local3++) {
				Static545.aClass41_Sub1_Sub1Array1[local3] = null;
			}
			Static89.anInt1482 = 0;
		}
		Static271.aClass41_Sub1Array4 = null;
		Static227.aClass41_Sub1Array3 = null;
		Static126.aClass41_Sub1Array2 = null;
		if (Static284.aClass41_Sub1Array5 != null) {
			for (local3 = 0; local3 < Static284.aClass41_Sub1Array5.length; local3++) {
				Static284.aClass41_Sub1Array5[local3] = null;
			}
			Static26.anInt350 = 0;
		}
		if (Static5.aClass41_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static5.aClass41_Sub1Array1.length; local3++) {
				Static5.aClass41_Sub1Array1[local3] = null;
			}
			Static676.anInt9313 = 0;
		}
		if (Static602.aClass371Array5 != null) {
			for (local3 = 0; local3 < Static111.anInt10678; local3++) {
				Static602.aClass371Array5[local3] = null;
			}
			for (local6 = 0; local6 < Static202.anInt3256; local6++) {
				for (local9 = 0; local9 < Static665.anInt7330; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static92.anInt1526; local195++) {
						Static98.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static111.anInt10678 = 0;
		}
		Static352.method5232();
		Static508.aClass89_1 = Static508.aClass89_2;
		Static508.aClass89_1.method1907();
		Static106.aByteArrayArray2 = null;
		Static498.anIntArrayArray67 = null;
		Static288.aShortArrayArray13 = null;
		if (Static460.aClass360Array1 != null) {
			Static93.method1443();
			Static267.aClass143_6.method6253(1);
			Static267.aClass143_6.method6218(0);
		}
		if (Static472.aClass345Array1 != null) {
			Static472.aClass345Array1 = null;
		}
		Static267.aClass143_6 = null;
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(B)Lclient!dd;")
	public static Class5_Sub16 method8232() {
		return Static311.anInt5526 == 0 ? new Class5_Sub16() : Static65.aClass5_Sub16Array1[--Static311.anInt5526];
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IBIIIIII)V")
	public static void method8233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = Static346.aShort85 + local7 * (Static242.aShort113 - Static346.aShort85) / 100;
		@Pc(37) int local37 = arg1 * local31 >> 8;
		Static663.anInt10391 = local31 * Static663.anInt10392 >> 8;
		@Pc(50) int local50 = 16384 - arg5 & 0x3FFF;
		@Pc(57) int local57 = 16384 - arg0 & 0x3FFF;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = 0;
		@Pc(63) int local63 = local37;
		if (local50 != 0) {
			local61 = -local37 * Class242.anIntArray384[local50] >> 14;
			local63 = Class242.anIntArray383[local50] * local37 >> 14;
		}
		if (local57 != 0) {
			local59 = local63 * Class242.anIntArray384[local57] >> 14;
			local63 = Class242.anIntArray383[local57] * local63 >> 14;
		}
		Static78.anInt1274 = 0;
		Static546.anInt8938 = arg6 - local61;
		Static105.anInt1868 = arg2 - local63;
		Static570.anInt9347 = arg4 - local59;
		Static498.anInt8495 = arg5;
		Static493.anInt8442 = arg0;
	}
}
