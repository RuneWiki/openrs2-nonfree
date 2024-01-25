import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class1_Sub2_Sub9_Sub1 extends Class1_Sub2_Sub9 {

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject5;

	static {
		new Class84("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!cg;Ljava/lang/Object;I)V")
	public Class1_Sub2_Sub9_Sub1(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject5 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4433() {
		return false;
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4434() {
		return this.anObject5;
	}
}
