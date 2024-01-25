import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bga", name = "g", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_5 = new Class262();

	@OriginalMember(owner = "client!bga", name = "h", descriptor = "Lclient!cfa;")
	public static final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([BZ)V")
	public static synchronized void method901(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static631.anInt10585 < 1000) {
			Static552.aByteArrayArray45[Static631.anInt10585++] = arg0;
		} else if (arg0.length == 5000 && Static265.anInt4609 < 250) {
			Static304.aByteArrayArray29[Static265.anInt4609++] = arg0;
		} else if (arg0.length == 30000 && Static36.anInt979 < 50) {
			Static469.aByteArrayArray55[Static36.anInt979++] = arg0;
		} else if (Static161.aByteArrayArrayArray7 != null) {
			for (@Pc(68) int local68 = 0; local68 < Static79.anIntArray129.length; local68++) {
				if (arg0.length == Static79.anIntArray129[local68] && Static161.aByteArrayArrayArray7[local68].length > Static42.anIntArray82[local68]) {
					Static161.aByteArrayArrayArray7[local68][Static42.anIntArray82[local68]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V")
	public static void method902() {
		if (!Static601.method8469()) {
			return;
		}
		if (Static286.aStringArray14 == null) {
			Static262.method3785();
		}
		Static527.aBoolean641 = true;
		Static217.anInt4094 = 0;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method903(@OriginalArg(1) int arg0) {
		@Pc(29) byte[] local29;
		if (arg0 == 100 && Static631.anInt10585 > 0) {
			local29 = Static552.aByteArrayArray45[--Static631.anInt10585];
			Static552.aByteArrayArray45[Static631.anInt10585] = null;
			return local29;
		} else if (arg0 == 5000 && Static265.anInt4609 > 0) {
			local29 = Static304.aByteArrayArray29[--Static265.anInt4609];
			Static304.aByteArrayArray29[Static265.anInt4609] = null;
			return local29;
		} else if (arg0 == 30000 && Static36.anInt979 > 0) {
			local29 = Static469.aByteArrayArray55[--Static36.anInt979];
			Static469.aByteArrayArray55[Static36.anInt979] = null;
			return local29;
		} else {
			if (Static161.aByteArrayArrayArray7 != null) {
				for (@Pc(77) int local77 = 0; local77 < Static79.anIntArray129.length; local77++) {
					if (arg0 == Static79.anIntArray129[local77] && Static42.anIntArray82[local77] > 0) {
						@Pc(104) byte[] local104 = Static161.aByteArrayArrayArray7[local77][--Static42.anIntArray82[local77]];
						Static161.aByteArrayArrayArray7[local77][Static42.anIntArray82[local77]] = null;
						return local104;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(B)V")
	public static void method904() {
		Static521.aString85 = "";
		Static133.aLong67 = 0L;
		Static242.anInt4374 = -1;
	}
}
