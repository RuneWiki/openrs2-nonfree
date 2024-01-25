import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class137 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	public final int anInt3909;

	static {
		new Class7("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class137(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3909 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
