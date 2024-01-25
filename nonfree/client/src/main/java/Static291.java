import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "Lclient!wo;")
	public static Class216 aClass216_90;

	@OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
	public static int anInt5765;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "[S")
	public static final short[] aShortArray113 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_161 = new Class34("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLclient!bg;)Lclient!sr;")
	public static Class14_Sub3 method4934(@OriginalArg(1) Class1_Sub8 arg0) {
		return new Class14_Sub3(arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4514(), arg0.method4532());
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZII)Z")
	public static boolean method4935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(12) Class141 local12 = Static119.method2548(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local12.method3842(arg1);
	}
}
