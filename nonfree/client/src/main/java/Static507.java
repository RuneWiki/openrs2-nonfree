import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "[Lclient!uf;")
	public static Class325[] aClass325Array1;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "[I")
	public static int[] anIntArray612;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public static int anInt9381 = -1;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
	public static int anInt9382 = 765;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
	public static void method7613() {
		@Pc(8) Class3_Sub21 local8 = (Class3_Sub21) Static283.aClass183_38.method4795();
		@Pc(16) boolean local16 = Static360.aClass305_3 != null || Static510.anInt9429 > 0;
		if (local16) {
			Static470.anInt8805 = 1;
		}
		if (Static42.aBoolean85 && Static212.aClass193_1.method6323(81) && Static309.anInt6170 > 2) {
			if (local16) {
				Static378.aClass3_Sub40_12 = (Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287.aClass3_287;
			} else {
				Static237.method4128(local8.method3916(), local8.method3917(), (Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287.aClass3_287);
			}
		} else if (local16) {
			Static378.aClass3_Sub40_12 = (Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287;
		} else {
			Static237.method4128(local8.method3916(), local8.method3917(), (Class3_Sub40) Static342.aClass183_44.aClass3_161.aClass3_287);
		}
	}
}
