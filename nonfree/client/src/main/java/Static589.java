import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static589 {

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "Lclient!th;")
	public static Class322 aClass322_6;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!nga;")
	public static final Class233 aClass233_57 = new Class233(4);

	@OriginalMember(owner = "client!vb", name = "V", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_15 = new Class266(12, 8);

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "[I")
	public static final int[] anIntArray678 = new int[14];

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)Z")
	public static boolean method8141() {
		@Pc(10) Class2_Sub46 local10 = (Class2_Sub46) Static632.aClass238_64.method5833();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt8646; local16++) {
			if (local10.aClass26Array1[local16] != null && local10.aClass26Array1[local16].anInt762 == 0) {
				return false;
			}
			if (local10.aClass26Array2[local16] != null && local10.aClass26Array2[local16].anInt762 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZII)V")
	public static void method8142(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static244.aByteArrayArrayArray9 = new byte[4][arg1][arg0];
	}
}
