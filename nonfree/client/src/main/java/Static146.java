import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fda", name = "y", descriptor = "[[Lclient!gs;")
	public static Class11_Sub1[][] aClass11_Sub1ArrayArray1;

	@OriginalMember(owner = "client!fda", name = "Q", descriptor = "Lclient!jg;")
	public static final Class174 aClass174_5 = new Class174();

	@OriginalMember(owner = "client!fda", name = "R", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_35 = new Class269(10, -1);

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BII)I")
	public static int method2805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static340.method5235(arg1 - 1, arg0 + -1) + Static340.method5235(arg1 - 1, arg0 + 1) + Static340.method5235(arg1 + 1, arg0 - 1) + Static340.method5235(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static340.method5235(arg1, arg0 - 1) + Static340.method5235(arg1, arg0 + 1) + Static340.method5235(arg1 - 1, arg0) + Static340.method5235(arg1 + 1, arg0);
		@Pc(81) int local81 = Static340.method5235(arg1, arg0);
		return local42 / 16 + local76 / 8 + local81 / 4;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ)V")
	public static void method2807(@OriginalArg(1) boolean arg0) {
		Static489.method7000(Static387.anInt6978, arg0, Static585.anInt9606, Static571.anInt9399);
	}

	@OriginalMember(owner = "client!fda", name = "b", descriptor = "(I)V")
	public static void method2808() {
		Static328.method4913(false);
		if (Static583.anInt9579 >= 0 && Static583.anInt9579 != 0) {
			Static352.method5455(false, Static583.anInt9579);
			Static583.anInt9579 = -1;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!tq;ILclient!tq;)V")
	public static void method2811(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_299 != null) {
			arg0.method8599();
		}
		arg0.aClass2_300 = arg1;
		arg0.aClass2_299 = arg1.aClass2_299;
		arg0.aClass2_299.aClass2_300 = arg0;
		arg0.aClass2_300.aClass2_299 = arg0;
	}
}
