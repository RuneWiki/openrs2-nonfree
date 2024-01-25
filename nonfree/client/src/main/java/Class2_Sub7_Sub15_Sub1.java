import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class2_Sub7_Sub15_Sub1 extends Class2_Sub7_Sub15 {

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject15;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub7_Sub15_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject15 = arg0;
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7544() {
		return this.anObject15;
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7543() {
		return false;
	}
}
