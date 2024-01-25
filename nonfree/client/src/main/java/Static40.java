import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_170 = new Class239(33, -2);

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
	public static boolean aBoolean609 = true;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!no;)V")
	public static void method7057(@OriginalArg(1) Class2_Sub29_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static394.anInt7461; local3++) {
			@Pc(9) int local9 = Static327.anIntArray495[local3];
			@Pc(13) Class1_Sub1_Sub2_Sub1 local13 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local9];
			@Pc(17) int local17 = arg0.method5170();
			if ((local17 & 0x10) != 0) {
				local17 += arg0.method5170() << 8;
			}
			if ((local17 & 0x100) != 0) {
				local17 += arg0.method5170() << 16;
			}
			Static35.method703(local9, local13, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I")
	public static int method7059(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
