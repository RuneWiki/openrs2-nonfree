import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class27 {

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "J")
	public final long aLong18;

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_2;

	static {
		new Class21("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!bt;JI)V")
	public Class27(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong18 = arg1;
		this.aClass30_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass30_Sub1_2.method712(this.aLong18);
		super.finalize();
	}
}
