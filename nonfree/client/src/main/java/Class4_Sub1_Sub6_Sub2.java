import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class4_Sub1_Sub6_Sub2 extends Class4_Sub1_Sub6 {

	@OriginalMember(owner = "client!lf", name = "G", descriptor = "Lclient!st;")
	public Class222 aClass222_1;

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
	public int anInt4117;

	static {
		new Class83("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(Z)[B")
	@Override
	public byte[] method3343() {
		if (super.aBoolean381) {
			throw new RuntimeException();
		}
		return this.aByteArray50;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)I")
	@Override
	public int method3342() {
		return super.aBoolean381 ? 0 : 100;
	}
}
