import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static349 {

	@OriginalMember(owner = "client!rj", name = "Q", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_145 = new Class119("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!rj", name = "R", descriptor = "[B")
	public static final byte[] aByteArray74 = new byte[2048];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4734(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(II)I")
	public static int method4737(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
