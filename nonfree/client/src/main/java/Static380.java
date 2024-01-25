import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
	public static int anInt6689 = 1;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I[B)V")
	public static synchronized void method5624(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static129.anInt2929 < 1000) {
			Static404.aByteArrayArray23[Static129.anInt2929++] = arg0;
		} else if (arg0.length == 5000 && Static540.anInt4070 < 250) {
			Static122.aByteArrayArray6[Static540.anInt4070++] = arg0;
		} else if (arg0.length == 30000 && Static473.anInt8077 < 50) {
			Static474.aByteArrayArray28[Static473.anInt8077++] = arg0;
		} else if (Static579.aByteArrayArrayArray21 != null) {
			for (@Pc(70) int local70 = 0; local70 < Static385.anIntArray501.length; local70++) {
				if (Static385.anIntArray501[local70] == arg0.length && Static579.aByteArrayArrayArray21[local70].length > Static160.anIntArray201[local70]) {
					Static579.aByteArrayArrayArray21[local70][Static160.anIntArray201[local70]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!oa;Lclient!nt;III)V")
	public static void method5625(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class276 local12;
		if (arg3 < Static401.anInt7022) {
			local12 = Static270.aClass276ArrayArrayArray2[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass4_Sub3_2 != null && local12.aClass4_Sub3_2.method7785()) {
				arg1.method7787(true, arg0, local12.aClass4_Sub3_2, 0, 0, Static112.anInt2178);
			}
		}
		if (arg4 < Static401.anInt7022) {
			local12 = Static270.aClass276ArrayArrayArray2[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass4_Sub3_2 != null && local12.aClass4_Sub3_2.method7785()) {
				arg1.method7787(true, arg0, local12.aClass4_Sub3_2, 0, Static112.anInt2178, 0);
			}
		}
		if (arg3 < Static401.anInt7022 && arg4 < Static555.anInt9182) {
			local12 = Static270.aClass276ArrayArrayArray2[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass4_Sub3_2 != null && local12.aClass4_Sub3_2.method7785()) {
				arg1.method7787(true, arg0, local12.aClass4_Sub3_2, 0, Static112.anInt2178, Static112.anInt2178);
			}
		}
		if (arg3 < Static401.anInt7022 && arg4 > 0) {
			local12 = Static270.aClass276ArrayArrayArray2[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass4_Sub3_2 != null && local12.aClass4_Sub3_2.method7785()) {
				arg1.method7787(true, arg0, local12.aClass4_Sub3_2, 0, -Static112.anInt2178, Static112.anInt2178);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5626(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static129.anInt2929 > 0) {
			local21 = Static404.aByteArrayArray23[--Static129.anInt2929];
			Static404.aByteArrayArray23[Static129.anInt2929] = null;
			return local21;
		} else if (arg0 == 5000 && Static540.anInt4070 > 0) {
			local21 = Static122.aByteArrayArray6[--Static540.anInt4070];
			Static122.aByteArrayArray6[Static540.anInt4070] = null;
			return local21;
		} else if (arg0 == 30000 && Static473.anInt8077 > 0) {
			local21 = Static474.aByteArrayArray28[--Static473.anInt8077];
			Static474.aByteArrayArray28[Static473.anInt8077] = null;
			return local21;
		} else {
			if (Static579.aByteArrayArrayArray21 != null) {
				for (@Pc(76) int local76 = 0; local76 < Static385.anIntArray501.length; local76++) {
					if (Static385.anIntArray501[local76] == arg0 && Static160.anIntArray201[local76] > 0) {
						@Pc(103) byte[] local103 = Static579.aByteArrayArrayArray21[local76][--Static160.anIntArray201[local76]];
						Static579.aByteArrayArrayArray21[local76][Static160.anIntArray201[local76]] = null;
						return local103;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
