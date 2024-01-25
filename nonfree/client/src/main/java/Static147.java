import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "Lclient!vm;")
	public static Class2_Sub47 aClass2_Sub47_2 = null;

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method2428(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static454.anInt7870 > 0) {
			local21 = Static134.aByteArrayArray12[--Static454.anInt7870];
			Static134.aByteArrayArray12[Static454.anInt7870] = null;
			return local21;
		} else if (arg0 == 5000 && Static453.anInt7851 > 0) {
			local21 = Static252.aByteArrayArray21[--Static453.anInt7851];
			Static252.aByteArrayArray21[Static453.anInt7851] = null;
			return local21;
		} else if (arg0 == 30000 && Static560.anInt9191 > 0) {
			local21 = Static175.aByteArrayArray14[--Static560.anInt9191];
			Static175.aByteArrayArray14[Static560.anInt9191] = null;
			return local21;
		} else {
			if (Static150.aByteArrayArrayArray21 != null) {
				for (@Pc(78) int local78 = 0; local78 < Static315.anIntArray600.length; local78++) {
					if (arg0 == Static315.anIntArray600[local78] && Static374.anIntArray455[local78] > 0) {
						@Pc(108) byte[] local108 = Static150.aByteArrayArrayArray21[local78][--Static374.anIntArray455[local78]];
						Static150.aByteArrayArrayArray21[local78][Static374.anIntArray455[local78]] = null;
						return local108;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([BI)V")
	public static synchronized void method2429(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static454.anInt7870 < 1000) {
			Static134.aByteArrayArray12[Static454.anInt7870++] = arg0;
		} else if (arg0.length == 5000 && Static453.anInt7851 < 250) {
			Static252.aByteArrayArray21[Static453.anInt7851++] = arg0;
		} else if (arg0.length == 30000 && Static560.anInt9191 < 50) {
			Static175.aByteArrayArray14[Static560.anInt9191++] = arg0;
		} else if (Static150.aByteArrayArrayArray21 != null) {
			for (@Pc(65) int local65 = 0; local65 < Static315.anIntArray600.length; local65++) {
				if (arg0.length == Static315.anIntArray600[local65] && Static374.anIntArray455[local65] < Static150.aByteArrayArrayArray21[local65].length) {
					Static150.aByteArrayArrayArray21[local65][Static374.anIntArray455[local65]++] = arg0;
					return;
				}
			}
		}
	}
}
