import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
	public static int anInt4630 = 0;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_121 = new Class158(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_122 = new Class158("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public static int anInt4634 = -1;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIII)V")
	public static void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class230 local3 = new Class230();
		local3.anInt6703 = arg1 >> Static198.anInt7947;
		local3.anInt6702 = arg2 >> Static198.anInt7947;
		local3.anInt6722 = arg3 >> Static198.anInt7947;
		local3.anInt6713 = arg4 >> Static198.anInt7947;
		local3.anInt6707 = arg0;
		local3.anInt6701 = arg1;
		local3.anInt6710 = arg2;
		local3.anInt6712 = arg3;
		local3.anInt6715 = arg4;
		local3.anInt6720 = arg5;
		local3.anInt6714 = arg6;
		Static160.aClass230Array1[Static156.anInt3364++] = local3;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	public static void method3566(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg0, 4);
		local8.method2954();
	}
}
