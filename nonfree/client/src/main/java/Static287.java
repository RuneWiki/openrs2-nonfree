import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!rg;")
	public static Class151 aClass151_19;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "I")
	public static int anInt5742 = 0;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!rn;)Z")
	public static boolean method4736(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1) {
		@Pc(8) byte[] local8 = arg1.method4137(arg0);
		if (local8 == null) {
			return false;
		} else {
			Static41.method568(local8);
			return true;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
	public static int method4737(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
