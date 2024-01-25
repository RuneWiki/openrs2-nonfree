import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
	public static int anInt2407;

	@OriginalMember(owner = "client!fl", name = "V", descriptor = "Z")
	public static boolean aBoolean166;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	public static final int anInt2411 = 1339;

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_32 = new Class21(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
	public static int anInt2419 = 0;

	@OriginalMember(owner = "client!fl", name = "T", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_33 = new Class21("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!fl", name = "U", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_87 = new Class214(89, 2);

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public static void method2192() {
		if (Static124.aFrame2 != null) {
			return;
		}
		@Pc(16) Container local16;
		if (Static97.aFrame1 == null) {
			local16 = Static390.aClass255_5.anApplet1;
		} else {
			local16 = Static97.aFrame1;
		}
		Static448.anInt7687 = local16.getSize().width;
		Static4.anInt50 = local16.getSize().height;
		@Pc(35) Insets local35;
		if (Static97.aFrame1 == local16) {
			local35 = Static97.aFrame1.getInsets();
			Static448.anInt7687 -= local35.right + local35.left;
			Static4.anInt50 -= local35.bottom + local35.top;
		}
		if (Static331.method4891() == 1) {
			Static374.anInt6595 = Static146.anInt3029;
			Static331.anInt5897 = (Static448.anInt7687 - Static146.anInt3029) / 2;
			Static464.anInt7952 = 0;
			Static30.anInt518 = Static449.anInt7705;
		} else if (Static263.anInt5007 < 96 && Static192.anInt3828 == 0) {
			@Pc(87) int local87 = Static448.anInt7687 > 1024 ? 1024 : Static448.anInt7687;
			Static331.anInt5897 = (Static448.anInt7687 - local87) / 2;
			@Pc(101) int local101 = Static4.anInt50 <= 768 ? Static4.anInt50 : 768;
			Static374.anInt6595 = local87;
			Static464.anInt7952 = 0;
			Static30.anInt518 = local101;
		} else {
			Static30.anInt518 = Static4.anInt50;
			Static464.anInt7952 = 0;
			Static374.anInt6595 = Static448.anInt7687;
			Static331.anInt5897 = 0;
		}
		if (Static42.aClass219_1 != Static297.aClass219_2) {
			@Pc(127) boolean local127;
			if (Static374.anInt6595 < 1024 && Static30.anInt518 < 768) {
				local127 = true;
			} else {
				local127 = false;
			}
		}
		Static409.aCanvas7.setSize(Static374.anInt6595, Static30.anInt518);
		if (Static30.aClass30_3 != null) {
			Static30.aClass30_3.method2032(Static409.aCanvas7);
		}
		if (Static97.aFrame1 == local16) {
			local35 = Static97.aFrame1.getInsets();
			Static409.aCanvas7.setLocation(local35.left + Static331.anInt5897, local35.top - -Static464.anInt7952);
		} else {
			Static409.aCanvas7.setLocation(Static331.anInt5897, Static464.anInt7952);
		}
		if (Static248.anInt4793 != -1) {
			Static393.method5536(true);
		}
		Static449.method6143();
	}
}
