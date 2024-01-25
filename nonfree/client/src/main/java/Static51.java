import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ch", name = "wd", descriptor = "Lclient!it;")
	public static Class122 aClass122_4;

	@OriginalMember(owner = "client!ch", name = "md", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_28 = new Class158("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!ch", name = "vd", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_20 = new Class177(32, 4);

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(III)V")
	public static void method957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(0, 15);
		local8.method2957();
		local8.anInt3819 = arg1;
		local8.anInt3820 = arg0;
	}
}
