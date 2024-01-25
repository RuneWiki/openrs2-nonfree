import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public static int anInt10534 = 0;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!ee;")
	public static final Class79 aClass79_23 = new Class79();

	@OriginalMember(owner = "client!we", name = "h", descriptor = "I")
	public static int anInt10536 = -1;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLjava/awt/Component;)Lclient!fa;")
	public static Class91 method8564(@OriginalArg(1) Component arg0) {
		return new Class91_Sub1(arg0);
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
	public static void method8565() {
		if (!Static387.aBoolean575) {
			return;
		}
		while (true) {
			while (Static87.anInt2631 < Static56.aClass67_Sub1Array1.length) {
				@Pc(29) Class67_Sub1 local29 = Static56.aClass67_Sub1Array1[Static87.anInt2631];
				if (local29 != null && local29.anInt5771 == -1) {
					if (Static392.aClass6_Sub7_7 == null) {
						Static392.aClass6_Sub7_7 = Static126.aClass279_1.method6967(local29.aString59);
					}
					@Pc(53) int local53 = Static392.aClass6_Sub7_7.anInt1412;
					if (local53 == -1) {
						return;
					}
					Static392.aClass6_Sub7_7 = null;
					Static87.anInt2631++;
					local29.anInt5771 = local53;
				} else {
					Static87.anInt2631++;
				}
			}
			return;
		}
	}
}
