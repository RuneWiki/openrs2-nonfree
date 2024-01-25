import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class14_Sub2_Sub1_Sub1 extends Class14_Sub2_Sub1 {

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class14_Sub2_Sub1_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	@Override
	public Object method8225() {
		return this.anObject1;
	}

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8224() {
		return false;
	}
}
