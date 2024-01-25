import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class122_Sub2 extends Class122 implements Interface7 {

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Lclient!lc;")
	private final Class171 aClass171_19;

	static {
		new Class202("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
		new Class202("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
		new Class202("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!qba;Lclient!lc;Z)V")
	public Class122_Sub2(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass171_19 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
	@Override
	public void method6953() {
		super.method6953();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method6952() {
		return super.method6952();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I")
	@Override
	public int method6941() {
		return super.method6941();
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6949(@OriginalArg(1) int arg0) {
		super.method6949(this.aClass171_19.anInt4927 * arg0);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Lclient!lc;")
	@Override
	public Class171 method6955() {
		return this.aClass171_19;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6954() {
		return super.method6954();
	}
}
