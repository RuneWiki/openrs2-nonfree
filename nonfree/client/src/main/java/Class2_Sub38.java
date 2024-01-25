import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "I")
	public int anInt5787 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "I")
	public int anInt5786 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "I")
	public int anInt5789 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "I")
	public int anInt5792 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "I")
	public int anInt5788 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
	public int anInt5785 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rp", name = "B", descriptor = "I")
	public int anInt5793 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "I")
	public int anInt5790 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!rp", name = "r", descriptor = "Lclient!dh;")
	public final Class2_Sub8 aClass2_Sub8_1;

	static {
		new Class140("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class2_Sub38(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aClass2_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)Z")
	public boolean method4852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= this.anInt5785 && this.anInt5790 >= arg1 && this.anInt5793 <= arg0 && arg0 <= this.anInt5787) {
			return true;
		} else {
			return this.anInt5789 <= arg1 && this.anInt5792 >= arg1 && this.anInt5786 <= arg0 && this.anInt5788 >= arg0;
		}
	}
}
