import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class5_Sub2_Sub3_Sub1 extends Class5_Sub2_Sub3 {

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "Ljava/lang/Object;")
	private final Object anObject12;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class5_Sub2_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject12 = arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return false;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6866() {
		return this.anObject12;
	}
}
