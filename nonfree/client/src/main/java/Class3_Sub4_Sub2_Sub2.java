import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class3_Sub4_Sub2_Sub2 extends Class3_Sub4_Sub2 {

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "Ljava/lang/Object;")
	private final Object anObject20;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub2_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject20 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8738() {
		return false;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method8739() {
		return this.anObject20;
	}
}
