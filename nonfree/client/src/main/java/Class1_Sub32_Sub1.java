import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public final class Class1_Sub32_Sub1 extends Class1_Sub32 {

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	public int anInt5371;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	public int anInt5373;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
	public int anInt5377;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "J")
	public long aLong138;

	static {
		new Class45("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I")
	@Override
	public int method5776() {
		return this.anInt5373;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	@Override
	public int method5772() {
		return this.anInt5377;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)I")
	@Override
	public int method5775() {
		return 0;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)J")
	@Override
	public long method5778() {
		return this.aLong138;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)I")
	@Override
	public int method5774() {
		return this.anInt5371;
	}
}
