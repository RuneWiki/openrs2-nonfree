import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
	public final int anInt6736;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	public final int anInt6734;

	static {
		new Class140("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(II)V")
	public Class2_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6736 = arg0;
		this.anInt6734 = arg1;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Z")
	public boolean method5635() {
		return (this.anInt6736 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)Z")
	public boolean method5638() {
		return (this.anInt6736 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)I")
	public int method5641() {
		return Static122.method2386(this.anInt6736);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Z")
	public boolean method5642(@OriginalArg(0) int arg0) {
		return (this.anInt6736 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "(I)I")
	public int method5644() {
		return this.anInt6736 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "(I)Z")
	public boolean method5645() {
		return (this.anInt6736 >> 22 & 0x1) != 0;
	}
}
