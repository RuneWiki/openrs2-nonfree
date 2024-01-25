import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!ju", name = "p", descriptor = "I")
	public final int anInt3914;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
	public final int anInt3912;

	static {
		new Class189("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(II)V")
	public Class3_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3914 = arg0;
		this.anInt3912 = arg1;
	}
}
