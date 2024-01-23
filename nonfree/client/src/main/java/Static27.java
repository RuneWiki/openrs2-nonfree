import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
	public static int anInt596;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public static void method577() {
		@Pc(4) Class45 local4 = Static232.aClass45_1;
		synchronized (Static232.aClass45_1) {
			Static272.anInt5429++;
			Static92.anInt1844 = Static268.anInt5352;
			@Pc(21) int local21;
			if (Static9.anInt188 < 0) {
				for (local21 = 0; local21 < 112; local21++) {
					Static113.aBooleanArray18[local21] = false;
				}
				Static9.anInt188 = Static144.anInt2859;
			} else {
				while (Static9.anInt188 != Static144.anInt2859) {
					local21 = Static57.anIntArray125[Static144.anInt2859];
					Static144.anInt2859 = Static144.anInt2859 + 1 & 0x7F;
					if (local21 < 0) {
						Static113.aBooleanArray18[~local21] = false;
					} else {
						Static113.aBooleanArray18[local21] = true;
					}
				}
			}
			Static268.anInt5352 = Static29.anInt626;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lclient!qh;")
	public static Class4_Sub2_Sub18 method578() {
		return Static115.aClass4_Sub2_Sub18_1;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)V")
	public static void method579() {
		Static98.aClass172_19.method4346();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!pi;I)V")
	public static void method580(@OriginalArg(0) Class4_Sub24 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static202.aClass31_4 != null) {
			try {
				Static202.aClass31_4.method952(0L);
				Static202.aClass31_4.method957(local8);
				@Pc(21) int local21;
				for (local21 = 0; local21 < 24 && local8[local21] == 0; local21++) {
				}
				if (local21 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(45) Exception local45) {
				for (@Pc(47) int local47 = 0; local47 < 24; local47++) {
					local8[local47] = -1;
				}
			}
		}
		arg0.method3091(24, local8);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	public static void method581() {
		for (@Pc(14) Class4_Sub20 local14 = (Class4_Sub20) Static46.aClass17_5.method613(); local14 != null; local14 = (Class4_Sub20) Static46.aClass17_5.method607()) {
			if (local14.anInt2621 == -1) {
				local14.anInt2632 = 0;
				Static104.method1787(local14);
			} else {
				local14.method4690();
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I")
	public static int method585(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static103.method1690(4, arg0 + 91923, arg1 + 45365) + (Static103.method1690(2, arg0 + 37821, arg1 + 10294) - 128 >> 1) + (Static103.method1690(1, arg0, arg1) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
