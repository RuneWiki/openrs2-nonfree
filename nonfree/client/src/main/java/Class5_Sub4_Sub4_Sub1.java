import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public final class Class5_Sub4_Sub4_Sub1 extends Class5_Sub4_Sub4 {

	@OriginalMember(owner = "client!dt", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub4_Sub4_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4398() {
		return this.anObject1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4399() {
		return false;
	}
}
