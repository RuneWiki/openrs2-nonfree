import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
	public static int anInt4197;

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
	public static int anInt4199;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!gt;")
	public static final Class123 aClass123_6 = new Class123();

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "[I")
	public static final int[] anIntArray233 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B[B)Z")
	public static boolean method3427(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class8_Sub8 local8 = new Class8_Sub8(arg0);
		@Pc(17) int local17 = local8.method8525();
		if (local17 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local8.method8525() == 1;
		if (local31) {
			Static158.method3218(local8);
		}
		Static280.method4737(local8);
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Z")
	public static boolean method3429(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public static void method3430() {
		Static95.method2217();
		Static92.method2160();
	}
}
