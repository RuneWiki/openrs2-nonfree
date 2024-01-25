import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "J")
	public static long aLong156 = -1L;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Lclient!vr;")
	public static Class117_Sub1 method4103() {
		Static355.anInt6058 = 0;
		return Static407.method5246();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public static void method4104(@OriginalArg(1) int arg0) {
		if (Static171.anIntArray223 == null || arg0 > Static171.anIntArray223.length) {
			Static171.anIntArray223 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)[B")
	public static synchronized byte[] method4105(@OriginalArg(0) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static18.anInt3394 > 0) {
			local19 = Static71.aByteArrayArray3[--Static18.anInt3394];
			Static71.aByteArrayArray3[Static18.anInt3394] = null;
			return local19;
		} else if (arg0 == 5000 && Static259.anInt4917 > 0) {
			local19 = Static343.aByteArrayArray17[--Static259.anInt4917];
			Static343.aByteArrayArray17[Static259.anInt4917] = null;
			return local19;
		} else if (arg0 == 30000 && Static124.anInt7632 > 0) {
			local19 = Static258.aByteArrayArray11[--Static124.anInt7632];
			Static258.aByteArrayArray11[Static124.anInt7632] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
	public static boolean method4106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
