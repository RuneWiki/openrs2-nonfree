import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class2_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!ds", name = "M", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	static {
		new Class221("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ig;Ljava/lang/Object;I)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject4 = arg1;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method1616() {
		return false;
	}

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1618() {
		return this.anObject4;
	}
}
