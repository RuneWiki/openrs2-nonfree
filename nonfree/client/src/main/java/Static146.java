import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "I")
	public static int anInt2916 = 1;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "I")
	public static int anInt2918 = 0;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!mt;")
	public static Class164 aClass164_1 = new Class164(8);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZI)V")
	public static void method2751(@OriginalArg(1) int arg0) {
		Static17.anInt398 = arg0;
		Static121.anInt2597 = 3;
		Static33.anInt699 = 100;
		Static223.anInt3988 = -1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!nl;I)Lclient!kg;")
	public static Class136 method2754(@OriginalArg(1) Class171 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method3762(arg1);
		return local8 == null ? null : new Class136(local8);
	}
}
