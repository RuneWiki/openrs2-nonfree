import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class3_Sub36 extends Class3 {

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	public final int anInt5234;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "I")
	public final int anInt5236;

	static {
		new Class174("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(II)V")
	public Class3_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5234 = arg0;
		this.anInt5236 = arg1;
	}
}
