import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class165 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!vj;")
	public Class6_Sub2 aClass6_Sub2_2;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "I")
	public int anInt4788;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Lclient!np;")
	public Class165 aClass165_2;

	static {
		new Class242("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method3654() {
		if (Static4.anInt163 >= 500) {
			return;
		}
		this.anInt4788 = 0;
		this.aClass6_Sub2_2 = null;
		this.aClass165_2 = Static427.aClass165_3;
		Static427.aClass165_3 = this;
		Static4.anInt163++;
	}
}
