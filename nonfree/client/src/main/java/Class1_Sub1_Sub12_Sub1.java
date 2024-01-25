import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class1_Sub1_Sub12_Sub1 extends Class1_Sub1_Sub12 {

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "Ljava/lang/Object;")
	private final Object anObject14;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class1_Sub1_Sub12_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject14 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method4225() {
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4222() {
		return this.anObject14;
	}
}
