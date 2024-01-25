import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public static int anInt6666;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!bv;)I")
	public static int method5590(@OriginalArg(1) Class42 arg0) {
		if (arg0 == Static53.aClass42_1) {
			return 5120;
		} else if (arg0 == Static53.aClass42_2) {
			return 5122;
		} else if (Static53.aClass42_3 == arg0) {
			return 5124;
		} else if (arg0 == Static53.aClass42_4) {
			return 5121;
		} else if (Static53.aClass42_5 == arg0) {
			return 5123;
		} else if (Static53.aClass42_6 == arg0) {
			return 5125;
		} else if (arg0 == Static53.aClass42_7) {
			return 5131;
		} else if (arg0 == Static53.aClass42_8) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([BI)V")
	public static synchronized void method5592(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static482.anInt8822 < 1000) {
			Static50.aByteArrayArray4[Static482.anInt8822++] = arg0;
		} else if (arg0.length == 5000 && Static266.anInt5121 < 250) {
			Static188.aByteArrayArray12[Static266.anInt5121++] = arg0;
		} else if (arg0.length == 30000 && Static239.anInt8669 < 50) {
			Static358.aByteArrayArray20[Static239.anInt8669++] = arg0;
		} else if (Static451.aByteArrayArrayArray17 != null) {
			for (@Pc(69) int local69 = 0; local69 < Static397.anIntArray386.length; local69++) {
				if (Static397.anIntArray386[local69] == arg0.length && Static147.anIntArray145[local69] < Static451.aByteArrayArrayArray17[local69].length) {
					Static451.aByteArrayArrayArray17[local69][Static147.anIntArray145[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method5593(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static482.anInt8822 > 0) {
			local21 = Static50.aByteArrayArray4[--Static482.anInt8822];
			Static50.aByteArrayArray4[Static482.anInt8822] = null;
			return local21;
		} else if (arg0 == 5000 && Static266.anInt5121 > 0) {
			local21 = Static188.aByteArrayArray12[--Static266.anInt5121];
			Static188.aByteArrayArray12[Static266.anInt5121] = null;
			return local21;
		} else if (arg0 == 30000 && Static239.anInt8669 > 0) {
			local21 = Static358.aByteArrayArray20[--Static239.anInt8669];
			Static358.aByteArrayArray20[Static239.anInt8669] = null;
			return local21;
		} else {
			if (Static451.aByteArrayArrayArray17 != null) {
				for (@Pc(86) int local86 = 0; local86 < Static397.anIntArray386.length; local86++) {
					if (Static397.anIntArray386[local86] == arg0 && Static147.anIntArray145[local86] > 0) {
						@Pc(116) byte[] local116 = Static451.aByteArrayArrayArray17[local86][--Static147.anIntArray145[local86]];
						Static451.aByteArrayArrayArray17[local86][Static147.anIntArray145[local86]] = null;
						return local116;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
