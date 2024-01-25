import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	public static int anInt7376;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
	public static int anInt7378;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Lclient!sl;")
	public static final Class229 aClass229_12 = new Class229("", 14);

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_146 = new Class55("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
	public static int anInt7377 = 765;

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray53 = new String[200];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZI)V")
	public static void method5679(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class7_Sub27 local8 = Static288.method3810(arg0, arg1);
		if (local8 != null) {
			local8.method5802();
		}
	}
}
