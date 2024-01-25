import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!rm", name = "ab", descriptor = "[Lclient!si;")
	public static Class10_Sub8_Sub1_Sub1[] aClass10_Sub8_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!rm", name = "bb", descriptor = "Lclient!dg;")
	public static Class46 aClass46_2;

	@OriginalMember(owner = "client!rm", name = "U", descriptor = "I")
	public static int anInt5124 = 0;

	@OriginalMember(owner = "client!rm", name = "Y", descriptor = "Lclient!eo;")
	public static final Class62 aClass62_15 = new Class62(10, 3);

	@OriginalMember(owner = "client!rm", name = "Z", descriptor = "[Lclient!wg;")
	public static final Class1_Sub5_Sub1_Sub2[] aClass1_Sub5_Sub1_Sub2Array1 = new Class1_Sub5_Sub1_Sub2[32768];

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "(BI)Lclient!ep;")
	public static Class10_Sub3 method4461(@OriginalArg(1) int arg0) {
		@Pc(7) Class154[] local7 = Class59.aClass154Array1;
		synchronized (Class59.aClass154Array1) {
			@Pc(35) Class10_Sub3 local35;
			if (Class59.aClass154Array1.length <= arg0 || Class59.aClass154Array1[arg0].method3477()) {
				local35 = new Class10_Sub3();
				local35.aClass10_Sub7Array1 = new Class10_Sub7[arg0];
				for (@Pc(57) int local57 = 0; local57 < arg0; local57++) {
					local35.aClass10_Sub7Array1[local57] = new Class10_Sub7();
				}
			} else {
				local35 = (Class10_Sub3) Class59.aClass154Array1[arg0].method3482();
				local35.method4605();
				@Pc(42) int local42 = Static207.anIntArray970[arg0]--;
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V")
	public static void method4462() {
		if (Static1.anIntArray1354 != null && Static61.anIntArray261 != null) {
			return;
		}
		Static1.anIntArray1354 = new int[256];
		Static61.anIntArray261 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static1.anIntArray1354[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static61.anIntArray261[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}
}
