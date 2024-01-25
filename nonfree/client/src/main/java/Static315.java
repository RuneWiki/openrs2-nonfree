import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public static int anInt6039;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public static int anInt6041;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
	public static int anInt6044;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)Lclient!sn;")
	public static Class7_Sub1_Sub15 method5104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class7_Sub1_Sub15 local15 = (Class7_Sub1_Sub15) Static280.aClass10_38.method163((long) arg1 | (long) arg0 << 32);
		if (local15 == null) {
			local15 = new Class7_Sub1_Sub15(arg0, arg1);
			Static280.aClass10_38.method161(local15.aLong232, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method5105() {
		Static8.anInt155 = 0;
		Static210.anInt4204 = 0;
		Static203.anInt4016 = 0;
		Static231.anInt4608 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method5106(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static76.anInt1895 > 0) {
			local18 = Static275.aByteArrayArray19[--Static76.anInt1895];
			Static275.aByteArrayArray19[Static76.anInt1895] = null;
			return local18;
		} else if (arg0 == 5000 && Static104.anInt2484 > 0) {
			local18 = Static109.aByteArrayArray2[--Static104.anInt2484];
			Static109.aByteArrayArray2[Static104.anInt2484] = null;
			return local18;
		} else if (arg0 == 30000 && Static259.anInt5007 > 0) {
			local18 = Static254.aByteArrayArray17[--Static259.anInt5007];
			Static254.aByteArrayArray17[Static259.anInt5007] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}
}
