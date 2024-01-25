import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
	public static int anInt5129;

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
	public static int anInt5133;

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
	public static int anInt5132 = 0;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4440(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static588.aClass351_35.method8691(Static476.anInt8915) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static588.aClass351_37.method8691(Static476.anInt8915) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I[B)V")
	public static synchronized void method4441(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static607.anInt10670 < 1000) {
			Static20.aByteArrayArray2[Static607.anInt10670++] = arg0;
		} else if (arg0.length == 5000 && Static496.anInt9163 < 250) {
			Static381.aByteArrayArray18[Static496.anInt9163++] = arg0;
		} else if (arg0.length == 30000 && Static428.anInt5953 < 50) {
			Static360.aByteArrayArray16[Static428.anInt5953++] = arg0;
		} else if (Static222.aByteArrayArrayArray4 != null) {
			for (@Pc(65) int local65 = 0; local65 < Static621.anIntArray704.length; local65++) {
				if (Static621.anIntArray704[local65] == arg0.length && Static222.aByteArrayArrayArray4[local65].length > Static52.anIntArray77[local65]) {
					Static222.aByteArrayArrayArray4[local65][Static52.anIntArray77[local65]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIII)V")
	public static void method4442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static74.aClass2_Sub13_5.aClass14_Sub6_5.method3223() != 0 && arg0 != 0 && Static395.anInt7569 < 50 && arg5 != -1) {
			Static443.aClass125Array1[Static395.anInt7569++] = new Class125((byte) 1, arg5, arg0, arg2, arg3, arg1, arg4, null);
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method4443(@OriginalArg(0) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static607.anInt10670 > 0) {
			local21 = Static20.aByteArrayArray2[--Static607.anInt10670];
			Static20.aByteArrayArray2[Static607.anInt10670] = null;
			return local21;
		} else if (arg0 == 5000 && Static496.anInt9163 > 0) {
			local21 = Static381.aByteArrayArray18[--Static496.anInt9163];
			Static381.aByteArrayArray18[Static496.anInt9163] = null;
			return local21;
		} else if (arg0 == 30000 && Static428.anInt5953 > 0) {
			local21 = Static360.aByteArrayArray16[--Static428.anInt5953];
			Static360.aByteArrayArray16[Static428.anInt5953] = null;
			return local21;
		} else {
			if (Static222.aByteArrayArrayArray4 != null) {
				for (@Pc(79) int local79 = 0; local79 < Static621.anIntArray704.length; local79++) {
					if (Static621.anIntArray704[local79] == arg0 && Static52.anIntArray77[local79] > 0) {
						@Pc(109) byte[] local109 = Static222.aByteArrayArrayArray4[local79][--Static52.anIntArray77[local79]];
						Static222.aByteArrayArrayArray4[local79][Static52.anIntArray77[local79]] = null;
						return local109;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
