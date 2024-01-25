import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	public static int anInt5150;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_231 = new Class22(98, -1);

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
	public static final int[] anIntArray337 = new int[32];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method3931(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static442.anInt7240 > 0) {
			local21 = Static386.aByteArrayArray14[--Static442.anInt7240];
			Static386.aByteArrayArray14[Static442.anInt7240] = null;
			return local21;
		} else if (arg0 == 5000 && Static388.anInt6496 > 0) {
			local21 = Static116.aByteArrayArray21[--Static388.anInt6496];
			Static116.aByteArrayArray21[Static388.anInt6496] = null;
			return local21;
		} else if (arg0 == 30000 && Static352.anInt6108 > 0) {
			local21 = Static251.aByteArrayArray17[--Static352.anInt6108];
			Static251.aByteArrayArray17[Static352.anInt6108] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method3932() {
		Static228.aClass57_11 = null;
		Static386.anInt3967 = -1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V")
	public static void method3934(@OriginalArg(1) int arg0) {
		Static261.method3775();
		@Pc(15) int local15 = Static183.aClass223_1.method5004(arg0).anInt3365;
		if (local15 == 0) {
			return;
		}
		@Pc(26) int local26 = Static257.aClass114_1.anIntArray220[arg0];
		if (local15 == 5) {
			Static64.anInt1361 = local26;
		}
		if (local15 == 6) {
			Static189.anInt3572 = local26;
		}
	}
}
