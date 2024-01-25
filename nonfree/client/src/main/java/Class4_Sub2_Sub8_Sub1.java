import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public final class Class4_Sub2_Sub8_Sub1 extends Class4_Sub2_Sub8 {

	@OriginalMember(owner = "client!ok", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject16;

	static {
		new Class15("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class4_Sub2_Sub8_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject16 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4595() {
		return false;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4596() {
		return this.anObject16;
	}
}
