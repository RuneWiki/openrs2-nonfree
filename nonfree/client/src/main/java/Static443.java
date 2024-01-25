import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	public static int anInt7682;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!hk;")
	public static final Class154 aClass154_1 = Static562.method7834();

	@OriginalMember(owner = "client!o", name = "a", descriptor = "[B")
	public static final byte[] aByteArray65 = new byte[2048];

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V")
	public static void method6437(@OriginalArg(1) boolean arg0) {
		Static437.aClass181_8.method6355(Static622.aClass67_15.method7683());
		@Pc(10) int[] local10 = Static622.aClass67_15.Y();
		Static516.anInt9693 = local10[2];
		Static23.anInt403 = local10[1];
		Static595.anInt9721 = local10[0];
		Static51.anInt860 = local10[3];
		if (arg0) {
			Static622.aClass67_15.DA(Static636.anInt10299, Static407.anInt7262, Static629.anInt10191, Static707.anInt11052);
			Static340.method4997(Static679.aDouble26);
		} else {
			Static622.aClass67_15.DA(Static657.anInt10509, Static18.anInt10687, Static181.anInt3243, Static488.anInt8458);
			Static340.method4997(Static224.aDouble15);
		}
	}
}
