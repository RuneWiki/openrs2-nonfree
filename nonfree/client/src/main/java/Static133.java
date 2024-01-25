import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "Lclient!pq;")
	public static Class229 aClass229_15;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Z")
	public static boolean method7840() {
		try {
			if (Static283.anInt5391 == 2) {
				if (Static353.aClass1_Sub45_1 == null) {
					Static353.aClass1_Sub45_1 = Static554.method6858(Static471.aClass69_91, Static179.anInt3754, Static99.anInt2118);
					if (Static353.aClass1_Sub45_1 == null) {
						return false;
					}
				}
				if (Static92.aClass148_2 == null) {
					Static92.aClass148_2 = new Class148(Static25.aClass69_9, Static280.aClass69_58);
				}
				if (Static518.aClass1_Sub4_Sub4_3.method7996(Static361.aClass69_72, Static353.aClass1_Sub45_1, Static92.aClass148_2)) {
					Static518.aClass1_Sub4_Sub4_3.method7994();
					Static518.aClass1_Sub4_Sub4_3.method7993(Static382.anInt6788);
					Static518.aClass1_Sub4_Sub4_3.method7997(Static129.aBoolean226, Static353.aClass1_Sub45_1);
					Static92.aClass148_2 = null;
					Static353.aClass1_Sub45_1 = null;
					Static471.aClass69_91 = null;
					Static283.anInt5391 = 0;
					return true;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static518.aClass1_Sub4_Sub4_3.method8001();
			Static471.aClass69_91 = null;
			Static283.anInt5391 = 0;
			Static353.aClass1_Sub45_1 = null;
			Static92.aClass148_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZZI)V")
	public static void method7848(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static285.anInt5493--;
			if (Static285.anInt5493 == 0) {
				Static19.anIntArray30 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static193.anInt3953--;
		if (Static193.anInt3953 == 0) {
			Static107.anIntArray176 = null;
			return;
		}
	}
}
