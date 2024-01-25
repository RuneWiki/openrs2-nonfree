import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!kha;")
	public static Class181 aClass181_128;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "[Lclient!rq;")
	public static Class2_Sub3_Sub1[] aClass2_Sub3_Sub1Array3;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "Lclient!bw;")
	public static final Class3_Sub11 aClass3_Sub11_4 = new Class3_Sub11(0, -1);

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	public static int anInt10083 = -1;

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
	public static final int anInt10084 = 1338;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lclient!gaa;")
	public static Class108 method8285(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static85.aClass108ArrayArray2[local12] == null || Static85.aClass108ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static263.method4883(local12);
			if (!local30) {
				return null;
			}
		}
		return Static85.aClass108ArrayArray2[local12][local16];
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
	public static void method8286(@OriginalArg(0) int arg0) {
		Static258.aLong132 = 1000000000L / (long) arg0;
	}
}
