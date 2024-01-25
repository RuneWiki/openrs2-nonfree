import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public final int anInt1214;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
	public final int anInt1215;

	static {
		new Class96("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(II)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1214 = arg1;
		this.anInt1215 = arg0;
	}
}
