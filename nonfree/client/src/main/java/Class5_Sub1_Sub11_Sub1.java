import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class5_Sub1_Sub11_Sub1 extends Class5_Sub1_Sub11 {

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	static {
		new Class85("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
		new Class85("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!m;Ljava/lang/Object;)V")
	public Class5_Sub1_Sub11_Sub1(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5569() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5571() {
		return false;
	}
}
