import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
	public static int anInt10350;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "Z")
	public static boolean aBoolean879 = false;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[I")
	public static final int[] anIntArray563 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "I")
	public static int anInt10351 = 0;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_66 = new Class114();

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "Lclient!rda;")
	public static final Class300 aClass300_47 = new Class300(16);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method8570(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static296.anInt5744 > 0) {
			local21 = Static490.aByteArrayArray26[--Static296.anInt5744];
			Static490.aByteArrayArray26[Static296.anInt5744] = null;
			return local21;
		} else if (arg0 == 5000 && Static141.anInt2769 > 0) {
			local21 = Static190.aByteArrayArray15[--Static141.anInt2769];
			Static190.aByteArrayArray15[Static141.anInt2769] = null;
			return local21;
		} else if (arg0 == 30000 && Static263.anInt4889 > 0) {
			local21 = Static157.aByteArrayArray9[--Static263.anInt4889];
			Static157.aByteArrayArray9[Static263.anInt4889] = null;
			return local21;
		} else {
			if (Static265.aByteArrayArrayArray18 != null) {
				for (@Pc(75) int local75 = 0; local75 < Static660.anIntArray601.length; local75++) {
					if (arg0 == Static660.anIntArray601[local75] && Static212.anIntArray201[local75] > 0) {
						@Pc(102) byte[] local102 = Static265.aByteArrayArrayArray18[local75][--Static212.anIntArray201[local75]];
						Static265.aByteArrayArrayArray18[local75][Static212.anIntArray201[local75]] = null;
						return local102;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method8571() {
		if (Static378.anInt6757 <= 1) {
			Static172.aClass5_Sub50_14.method7531(2, Static172.aClass5_Sub50_14.aClass12_Sub3_1);
		} else {
			Static172.aClass5_Sub50_14.method7531(4, Static172.aClass5_Sub50_14.aClass12_Sub3_1);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([BI)V")
	public static synchronized void method8572(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static296.anInt5744 < 1000) {
			Static490.aByteArrayArray26[Static296.anInt5744++] = arg0;
		} else if (arg0.length == 5000 && Static141.anInt2769 < 250) {
			Static190.aByteArrayArray15[Static141.anInt2769++] = arg0;
		} else if (arg0.length == 30000 && Static263.anInt4889 < 50) {
			Static157.aByteArrayArray9[Static263.anInt4889++] = arg0;
		} else if (Static265.aByteArrayArrayArray18 != null) {
			for (@Pc(69) int local69 = 0; local69 < Static660.anIntArray601.length; local69++) {
				if (Static660.anIntArray601[local69] == arg0.length && Static212.anIntArray201[local69] < Static265.aByteArrayArrayArray18[local69].length) {
					Static265.aByteArrayArrayArray18[local69][Static212.anIntArray201[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
	public static void method8574(@OriginalArg(0) int arg0) {
		Static349.method5305();
		@Pc(11) int local11 = Static294.aClass389_1.method8881(arg0).anInt341;
		if (local11 == 0) {
			return;
		}
		@Pc(28) int local28 = Static161.aClass237_3.anIntArray387[arg0];
		if (local11 == 5) {
			Static51.anInt734 = local28;
		}
		if (local11 == 6) {
			Static62.anInt952 = local28;
		}
	}
}
