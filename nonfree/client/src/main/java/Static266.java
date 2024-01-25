import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_61 = new Class376(38, 8);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
	public static void method3507() {
		for (@Pc(10) Class3_Sub54 local10 = (Class3_Sub54) Static623.aClass62_45.method1680(); local10 != null; local10 = (Class3_Sub54) Static623.aClass62_45.method1681()) {
			if (local10.aClass133_Sub1_1.method2971()) {
				Static492.method7030(local10.anInt10223);
			} else {
				local10.aClass133_Sub1_1.method2973();
				try {
					local10.aClass133_Sub1_1.method2966();
				} catch (@Pc(27) Exception local27) {
					Static81.method1711("TV: " + local10.anInt10223, local27);
					Static492.method7030(local10.anInt10223);
				}
				if (!local10.aBoolean753 && !local10.aBoolean751) {
					@Pc(53) Class3_Sub5_Sub3 local53 = local10.aClass133_Sub1_1.method2964();
					if (local53 != null) {
						@Pc(59) Class3_Sub9_Sub3 local59 = local53.method5275();
						if (local59 != null) {
							local59.method5191(local10.anInt10222);
							Static557.aClass3_Sub9_Sub1_2.method1419(local59);
							local10.aBoolean753 = true;
						}
					}
				}
			}
		}
	}
}
