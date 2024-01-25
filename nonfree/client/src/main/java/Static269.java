import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	public static int anInt5313;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas4;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_56 = new Class103(5);

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[Lclient!kc;")
	public static final Class119_Sub1[] aClass119_Sub1Array2 = new Class119_Sub1[29];

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
	public static int anInt5314 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method4492() {
		for (@Pc(13) Class7_Sub1_Sub13 local13 = (Class7_Sub1_Sub13) Static192.aClass74_29.method1793(); local13 != null; local13 = (Class7_Sub1_Sub13) Static192.aClass74_29.method1798()) {
			@Pc(17) Class22_Sub2_Sub4 local17 = local13.aClass22_Sub2_Sub4_1;
			if (Static168.anInt3508 != local17.aByte69 || local17.anInt5602 < Static212.anInt4234) {
				local13.method5648();
				local17.method4721();
			} else if (Static212.anInt4234 >= local17.anInt5600) {
				if (local17.anInt5608 > 0) {
					@Pc(46) Class22_Sub2_Sub1_Sub2 local46 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local17.anInt5608 - 1];
					if (local46 != null && local46.anInt5973 >= 0 && local46.anInt5973 < Static15.anInt287 * 128 && local46.anInt5967 >= 0 && Static325.anInt6173 * 128 > local46.anInt5967) {
						local17.method4720(Static341.method5540(local17.aByte69, local46.anInt5967, local46.anInt5973) - local17.anInt5593, Static212.anInt4234, local46.anInt5967, local46.anInt5973);
					}
				}
				if (local17.anInt5608 < 0) {
					@Pc(104) int local104 = -local17.anInt5608 - 1;
					@Pc(115) Class22_Sub2_Sub1_Sub1 local115;
					if (Static4.anInt77 == local104) {
						local115 = Static252.aClass22_Sub2_Sub1_Sub1_4;
					} else {
						local115 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local104];
					}
					if (local115 != null && local115.anInt5973 >= 0 && Static15.anInt287 * 128 > local115.anInt5973 && local115.anInt5967 >= 0 && Static325.anInt6173 * 128 > local115.anInt5967) {
						local17.method4720(Static341.method5540(local17.aByte69, local115.anInt5967, local115.anInt5973) - local17.anInt5593, Static212.anInt4234, local115.anInt5967, local115.anInt5973);
					}
				}
				local17.method4719(Static105.anInt6011);
				Static235.method4081(local17, true, true);
			}
		}
	}
}
