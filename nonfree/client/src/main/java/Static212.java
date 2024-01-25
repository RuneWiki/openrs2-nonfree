import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!it", name = "d", descriptor = "Lclient!kp;")
	public static final Class167 aClass167_7 = new Class167(1);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public static int anInt4650 = 0;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3884(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static408.anInt7481 > 0) {
			local16 = Static190.aByteArrayArray14[--Static408.anInt7481];
			Static190.aByteArrayArray14[Static408.anInt7481] = null;
			return local16;
		} else if (arg0 == 5000 && Static529.anInt9226 > 0) {
			local16 = Static368.aByteArrayArray19[--Static529.anInt9226];
			Static368.aByteArrayArray19[Static529.anInt9226] = null;
			return local16;
		} else if (arg0 == 30000 && Static321.anInt6160 > 0) {
			local16 = Static384.aByteArrayArray22[--Static321.anInt6160];
			Static384.aByteArrayArray22[Static321.anInt6160] = null;
			return local16;
		} else {
			if (Static108.aByteArrayArrayArray4 != null) {
				for (@Pc(72) int local72 = 0; local72 < Static353.anIntArray566.length; local72++) {
					if (arg0 == Static353.anIntArray566[local72] && Static285.anIntArray516[local72] > 0) {
						@Pc(98) byte[] local98 = Static108.aByteArrayArrayArray4[local72][--Static285.anIntArray516[local72]];
						Static108.aByteArrayArrayArray4[local72][Static285.anIntArray516[local72]] = null;
						return local98;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I")
	public static int method3885() {
		if (Static258.aFrame2 == null) {
			return Static388.aBoolean632 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)I")
	public static int method3886(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
