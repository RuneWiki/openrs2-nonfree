import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Lclient!ff;")
	public static final Class115 aClass115_1 = new Class115(0, 3, Static243.aClass158_14);

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Lclient!ff;")
	public static final Class115 aClass115_2 = new Class115(1, 3, Static243.aClass158_14);

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "Lclient!ff;")
	public static final Class115 aClass115_3 = new Class115(2, 4, Static243.aClass158_10);

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "Lclient!ff;")
	public static final Class115 aClass115_4 = new Class115(3, 1, Static243.aClass158_14);

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "Lclient!ff;")
	public static final Class115 aClass115_5 = new Class115(4, 2, Static243.aClass158_14);

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "Lclient!ff;")
	public static final Class115 aClass115_6 = new Class115(5, 3, Static243.aClass158_14);

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "Lclient!ff;")
	public static final Class115 aClass115_7 = new Class115(6, 4, Static243.aClass158_14);

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	public static final int anInt2911 = Static496.method7088(16);

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "[I")
	public static final int[] anIntArray220 = new int[1000];

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)Lclient!ff;")
	public static Class115 method2529(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass115_1;
		} else if (arg0 == 1) {
			return aClass115_2;
		} else if (arg0 == 2) {
			return aClass115_3;
		} else if (arg0 == 3) {
			return aClass115_4;
		} else if (arg0 == 4) {
			return aClass115_5;
		} else if (arg0 == 5) {
			return aClass115_6;
		} else if (arg0 == 6) {
			return aClass115_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([[BILclient!jm;)V")
	public static void method2530(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class199_Sub1 arg1) {
		@Pc(17) int local17 = Static671.aByteArrayArray26.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) byte[] local25 = arg0[local19];
			if (local25 != null) {
				@Pc(37) int local37 = (Static148.anIntArray187[local19] >> 8) * 64 - Static243.anInt3820;
				@Pc(48) int local48 = (Static148.anIntArray187[local19] & 0xFF) * 64 - Static224.anInt11062;
				Static165.method2505();
				arg1.method4281(local48, Static396.aClass145_6, local25, Static626.aClass226Array1, local37);
			}
		}
	}
}
