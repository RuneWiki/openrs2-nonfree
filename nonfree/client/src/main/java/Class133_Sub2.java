import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class133_Sub2 extends Class133 {

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "Lclient!oi;")
	public final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_3;

	static {
		new Class7("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!kd;II[B)V")
	public Class133_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass3_Sub2_Sub1_3 = Static64.method1316(arg1, arg2, arg0, arg3);
		this.aClass3_Sub2_Sub1_3.method4163(false, false);
	}
}
