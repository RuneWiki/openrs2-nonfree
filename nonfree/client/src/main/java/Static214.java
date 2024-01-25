import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!km", name = "f", descriptor = "Lclient!he;")
	public static Class100 aClass100_41;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString30;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "Lclient!ak;")
	public static final Class10 aClass10_13 = new Class10(11, 0, 1, 2);

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_55 = new Class267("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	public static int anInt3919 = -50;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	public static int anInt3920 = -60;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public static int anInt3921 = 0;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_74 = new Class92(10, 7);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)Z")
	public static boolean method3234(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(III)Z")
	public static boolean method3235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static231.method6542(arg0, arg1) || Static173.method2864(arg0, arg1);
	}
}
