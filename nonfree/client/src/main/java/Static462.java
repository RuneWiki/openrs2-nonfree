import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_126 = new Class6(110, 8);

	@OriginalMember(owner = "client!tj", name = "k", descriptor = "Lclient!h;")
	public static final Class114 aClass114_152 = new Class114("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "Lclient!sl;")
	public static final Class266 aClass266_9 = new Class266("", 13);

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lclient!rm;")
	public static Class125 method6788() {
		try {
			return new Class125_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class125) Class.forName("Class125_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class125_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILclient!pc;)Lclient!kr;")
	public static Class168 method6791(@OriginalArg(1) int arg0, @OriginalArg(2) Class47_Sub2 arg1) {
		@Pc(12) Class168 local12;
		if (Static519.aClass168_3 == null) {
			local12 = new Class168();
		} else {
			local12 = Static519.aClass168_3;
			Static519.aClass168_3 = Static519.aClass168_3.aClass168_1;
			Static446.anInt7517--;
			local12.aClass168_1 = null;
		}
		local12.aClass47_Sub2_2 = arg1;
		local12.anInt4983 = arg0;
		return local12;
	}
}
