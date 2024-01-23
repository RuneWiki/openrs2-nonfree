import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!td;")
	public static Class156 aClass156_6;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!td;")
	public static Class156 aClass156_7;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	public static int anInt2904;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
	public static volatile int anInt2899 = 0;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString168 = "Started 3d Library";

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString169 = "Ok";

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB[BI)I")
	public static int method2240(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg2; local14 < arg0; local14++) {
			local7 = Class145.anIntArray400[(arg1[local14] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZZ)I")
	public static int method2241(@OriginalArg(1) boolean arg0) {
		@Pc(4) long local4 = Static294.method4413();
		for (@Pc(25) Class1_Sub18 local25 = arg0 ? (Class1_Sub18) Static118.aClass70_8.method2074() : (Class1_Sub18) Static118.aClass70_8.method2079(); local25 != null; local25 = (Class1_Sub18) Static118.aClass70_8.method2079()) {
			if ((local25.aLong103 & 0x3FFFFFFFFFFFFFFFL) < local4) {
				if ((local25.aLong103 & 0x4000000000000000L) != 0L) {
					@Pc(52) int local52 = (int) local25.aLong205;
					Static128.anIntArray259[local52] = Static13.anIntArray31[local52];
					local25.method4441();
					return local52;
				}
				local25.method4441();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!km;BI)Lclient!pn;")
	public static Class1_Sub2_Sub11 method2243(@OriginalArg(0) Class91 arg0, @OriginalArg(2) int arg1) {
		return Static163.method2824(arg0, arg1) ? Static229.method3574() : null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	public static void method2244(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static130.method2227(arg0, 4);
		local4.method3911();
	}
}
