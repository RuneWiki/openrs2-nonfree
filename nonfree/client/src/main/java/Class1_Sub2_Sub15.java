import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "Lclient!ke;")
	public final Class26_Sub2_Sub3 aClass26_Sub2_Sub3_1;

	static {
		new Class84("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!ke;)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) Class26_Sub2_Sub3 arg0) {
		this.aClass26_Sub2_Sub3_1 = arg0;
	}
}
