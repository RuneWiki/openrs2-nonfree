import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "ib", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_7 = Static120.method1824("<)4col> x");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!bc;Lclient!bb;BLclient!bc;Lclient!bc;)Z")
	public static boolean method63(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class3_Sub4_Sub1 arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) Class1 arg3) {
		Static147.aClass1_26 = arg2;
		Static143.aClass1_24 = arg0;
		Static31.aClass1_4 = arg3;
		Static18.aClass3_Sub4_Sub1_1 = arg1;
		return true;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(IB)V")
	public static void method64(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub7 local12 = (Class3_Sub7) Static6.aClass54_2.method1496((long) arg0);
		if (local12 != null) {
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray103.length; local25++) {
				local12.anIntArray103[local25] = -1;
				local12.anIntArray102[local25] = 0;
			}
		}
	}
}
