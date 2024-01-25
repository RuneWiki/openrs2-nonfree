import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
	public static int anInt7500 = -60;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V")
	public static void method5784() {
		@Pc(13) Class7_Sub12 local13 = (Class7_Sub12) Static204.aClass85_37.method2010();
		@Pc(21) boolean local21 = Static191.aClass95_9 != null || Static168.anInt3037 > 0;
		if (local21) {
			Static106.anInt2172 = 1;
		}
		if (Static243.aBoolean254 && Static310.aClass130_1.method5069(81) && Static102.anInt2085 > 2) {
			if (local21) {
				Static268.aClass7_Sub39_1 = (Class7_Sub39) Static237.aClass85_26.aClass7_81.aClass7_261.aClass7_261;
			} else {
				Static144.method2238(local13.method943(), (Class7_Sub39) Static237.aClass85_26.aClass7_81.aClass7_261.aClass7_261, local13.method942());
			}
		} else if (local21) {
			Static268.aClass7_Sub39_1 = (Class7_Sub39) Static237.aClass85_26.aClass7_81.aClass7_261;
		} else {
			Static144.method2238(local13.method943(), (Class7_Sub39) Static237.aClass85_26.aClass7_81.aClass7_261, local13.method942());
		}
	}

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "(I)V")
	public static void method5792() {
		@Pc(10) int local10 = Static130.aClass153_Sub1_1.method4230(Static377.anInt6113);
		if (local10 == 0) {
			Static351.aByteArrayArrayArray17 = null;
			Static439.method5622(0);
		} else if (local10 == 1) {
			Static248.method3337((byte) 0);
			Static439.method5622(512);
			if (Static347.aByteArrayArrayArray16 != null) {
				Static237.method3235();
			}
		} else {
			Static248.method3337((byte) (Static143.anInt2745 - 4 & 0xFF));
			Static439.method5622(2);
		}
		Static182.anInt3281 = Static268.anInt4539;
	}
}
