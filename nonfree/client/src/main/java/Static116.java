import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_85 = new Class157(35, 7);

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_82 = new Class221(19, 1);

	@OriginalMember(owner = "client!gs", name = "i", descriptor = "[I")
	public static int[] anIntArray200 = new int[2];

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_62 = new Class140("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Lclient!kq;")
	public static Class57_Sub5 method2281(@OriginalArg(1) int arg0) {
		@Pc(15) Class193[] local15 = Class49.aClass193Array3;
		synchronized (Class49.aClass193Array3) {
			@Pc(31) Class57_Sub5 local31;
			if (arg0 >= Class49.aClass193Array3.length || Class49.aClass193Array3[arg0].method5220()) {
				local31 = new Class57_Sub5();
				local31.aClass57_Sub4Array1 = new Class57_Sub4[arg0];
				for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
					local31.aClass57_Sub4Array1[local37] = new Class57_Sub4();
				}
			} else {
				local31 = (Class57_Sub5) Class49.aClass193Array3[arg0].method5221();
				local31.method5452();
				@Pc(66) int local66 = Static331.anIntArray497[arg0]--;
			}
			return local31;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)V")
	public static void method2282() {
		@Pc(10) Class107 local10 = Static300.aClass107_49;
		synchronized (Static300.aClass107_49) {
			Static300.aClass107_49.method3011(5);
		}
		local10 = Static58.aClass107_7;
		synchronized (Static58.aClass107_7) {
			Static58.aClass107_7.method3011(5);
		}
	}
}
