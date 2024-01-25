import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject15;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub3_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject15 = arg0;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method7496() {
		return this.anObject15;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7497() {
		return false;
	}
}
