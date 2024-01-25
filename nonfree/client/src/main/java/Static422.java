import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[Lclient!ta;")
	public static Class327[] aClass327Array4;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method5643() {
		@Pc(10) int local10 = Static234.aClass2_Sub5_48.aClass6_Sub18_2.method5409();
		if (local10 == 0) {
			Static148.aByteArrayArrayArray4 = null;
			Static392.method5364(0);
		} else if (local10 == 1) {
			Static42.method4969((byte) 0);
			Static392.method5364(512);
			if (Static27.aByteArrayArrayArray1 != null) {
				Static244.method8152();
			}
		} else {
			Static42.method4969((byte) (Static482.anInt7692 - 4 & 0xFF));
			Static392.method5364(2);
		}
		Static297.anInt4861 = Static91.anInt1705;
	}
}
