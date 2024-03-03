import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!im", name = "E", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_65 = new Class79(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!im", name = "G", descriptor = "I")
	public static int anInt2770 = 0;

	@OriginalMember(owner = "client!im", name = "F", descriptor = "Lclient!om;")
	public final Class11_Sub5_Sub3 aClass11_Sub5_Sub3_1;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!om;)V", line = 7)
	public Class2_Sub2_Sub9(@OriginalArg(0) Class11_Sub5_Sub3 arg0) {
		this.aClass11_Sub5_Sub3_1 = arg0;
	}
}
