import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Z")
	public boolean aBoolean586 = false;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "Z")
	public boolean aBoolean587 = false;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	protected final int anInt6536;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	protected int anInt6534;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "I")
	protected int anInt6539;

	static {
		new Class140("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6536 = arg1;
		this.aBoolean587 = arg4;
		this.aBoolean586 = arg3;
		this.anInt6534 = arg0;
		this.anInt6539 = arg2;
	}
}
