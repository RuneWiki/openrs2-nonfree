import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static371 {

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "Lclient!gga;")
	public static final Class5_Sub24 aClass5_Sub24_1 = new Class5_Sub24(0, 0);

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(III)Z")
	public static boolean method5567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(BLclient!vc;)V")
	public static void method5568(@OriginalArg(1) Class28_Sub8 arg0) {
		arg0.aClass28_Sub1_Sub4_Sub2_1 = null;
		if (Static33.anInt549 < 20) {
			Static455.aClass156_8.method3774(arg0);
			Static33.anInt549++;
		}
	}
}
