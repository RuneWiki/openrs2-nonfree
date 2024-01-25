import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	public static int method612() {
		return Static182.anInt3294;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B)V")
	public static synchronized void method613(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static221.anInt3812 < 1000) {
			Static194.aByteArrayArray6[Static221.anInt3812++] = arg0;
		} else if (arg0.length == 5000 && Static308.anInt4869 < 250) {
			Static461.aByteArrayArray19[Static308.anInt4869++] = arg0;
		} else if (arg0.length == 30000 && Static11.anInt166 < 50) {
			Static488.aByteArrayArray22[Static11.anInt166++] = arg0;
		} else if (Static85.aByteArrayArrayArray17 != null) {
			for (@Pc(65) int local65 = 0; local65 < Static426.anIntArray579.length; local65++) {
				if (arg0.length == Static426.anIntArray579[local65] && Static276.anIntArray719[local65] < Static85.aByteArrayArrayArray17[local65].length) {
					Static85.aByteArrayArrayArray17[local65][Static276.anIntArray719[local65]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method614(@OriginalArg(0) int arg0) {
		@Pc(25) byte[] local25;
		if (arg0 == 100 && Static221.anInt3812 > 0) {
			local25 = Static194.aByteArrayArray6[--Static221.anInt3812];
			Static194.aByteArrayArray6[Static221.anInt3812] = null;
			return local25;
		} else if (arg0 == 5000 && Static308.anInt4869 > 0) {
			local25 = Static461.aByteArrayArray19[--Static308.anInt4869];
			Static461.aByteArrayArray19[Static308.anInt4869] = null;
			return local25;
		} else if (arg0 == 30000 && Static11.anInt166 > 0) {
			local25 = Static488.aByteArrayArray22[--Static11.anInt166];
			Static488.aByteArrayArray22[Static11.anInt166] = null;
			return local25;
		} else {
			if (Static85.aByteArrayArrayArray17 != null) {
				for (@Pc(80) int local80 = 0; local80 < Static426.anIntArray579.length; local80++) {
					if (Static426.anIntArray579[local80] == arg0 && Static276.anIntArray719[local80] > 0) {
						@Pc(107) byte[] local107 = Static85.aByteArrayArrayArray17[local80][--Static276.anIntArray719[local80]];
						Static85.aByteArrayArrayArray17[local80][Static276.anIntArray719[local80]] = null;
						return local107;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
