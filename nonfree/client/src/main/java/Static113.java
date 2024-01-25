import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_12 = new Class238();

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	public static int anInt2174 = 0;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public static int anInt2175 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Z")
	public static boolean method1839() {
		try {
			if (Static158.anInt3597 == 2) {
				if (Static217.aClass2_Sub43_2 == null) {
					Static217.aClass2_Sub43_2 = Static651.method6972(Static192.aClass97_53, Static629.anInt10135, Static14.anInt259);
					if (Static217.aClass2_Sub43_2 == null) {
						return false;
					}
				}
				if (Static8.aClass229_1 == null) {
					Static8.aClass229_1 = new Class229(Static533.aClass97_132, Static90.aClass97_20);
				}
				@Pc(35) Class2_Sub2_Sub1 local35 = Static489.aClass2_Sub2_Sub1_4;
				if (Static189.aClass2_Sub2_Sub1_1 != null) {
					local35 = Static189.aClass2_Sub2_Sub1_1;
				}
				if (local35.method168(Static8.aClass229_1, Static217.aClass2_Sub43_2, Static109.aClass97_28)) {
					Static489.aClass2_Sub2_Sub1_4 = local35;
					Static489.aClass2_Sub2_Sub1_4.method187();
					@Pc(74) int local74;
					if (Static157.anInt3573 > 0) {
						Static158.anInt3597 = 3;
						Static489.aClass2_Sub2_Sub1_4.method178(Static157.anInt3573 <= Static119.anInt2867 ? Static157.anInt3573 : Static119.anInt2867);
						for (local74 = 0; local74 < Static236.anIntArray320.length; local74++) {
							Static489.aClass2_Sub2_Sub1_4.method158(Static236.anIntArray320[local74], local74);
							Static236.anIntArray320[local74] = 255;
						}
					} else {
						Static158.anInt3597 = 0;
						Static489.aClass2_Sub2_Sub1_4.method178(Static119.anInt2867);
						for (local74 = 0; local74 < Static236.anIntArray320.length; local74++) {
							Static489.aClass2_Sub2_Sub1_4.method158(Static236.anIntArray320[local74], local74);
							Static236.anIntArray320[local74] = 255;
						}
					}
					if (Static189.aClass2_Sub2_Sub1_1 == null) {
						if (Static1.aLong187 <= 0L) {
							Static489.aClass2_Sub2_Sub1_4.method185(Static217.aClass2_Sub43_2, Static493.aBoolean629);
						} else {
							Static489.aClass2_Sub2_Sub1_4.method159(Static493.aBoolean629, Static217.aClass2_Sub43_2, Static1.aLong187);
						}
					}
					if (Static120.aClass39_3 != null) {
						Static120.aClass39_3.method2884(Static489.aClass2_Sub2_Sub1_4);
					}
					Static192.aClass97_53 = null;
					Static8.aClass229_1 = null;
					Static217.aClass2_Sub43_2 = null;
					Static1.aLong187 = 0L;
					Static189.aClass2_Sub2_Sub1_1 = null;
					return true;
				}
			}
		} catch (@Pc(169) Exception local169) {
			local169.printStackTrace();
			Static489.aClass2_Sub2_Sub1_4.method180();
			Static192.aClass97_53 = null;
			Static158.anInt3597 = 0;
			Static217.aClass2_Sub43_2 = null;
			Static8.aClass229_1 = null;
			Static189.aClass2_Sub2_Sub1_1 = null;
		}
		return false;
	}
}
