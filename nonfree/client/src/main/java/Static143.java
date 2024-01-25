import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static143 {

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_34 = new Class306("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!fp", name = "bb", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_131 = new Class296(66, -1);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIBLclient!kr;Z)V")
	public static void method2311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class171 arg3) {
		Static215.anInt4126 = arg1;
		Static101.anInt7625 = arg2;
		Static351.aClass171_102 = arg3;
		Static55.aBoolean70 = false;
		Static38.anInt834 = 0;
		Static302.anInt5579 = 1;
		Static101.anInt7631 = Static106.aClass1_Sub16_Sub3_1.method5263() / arg0;
		if (Static101.anInt7631 < 1) {
			Static101.anInt7631 = 1;
		}
	}
}
