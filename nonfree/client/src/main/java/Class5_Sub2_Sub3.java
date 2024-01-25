import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public abstract class Class5_Sub2_Sub3 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ida", name = "w", descriptor = "I")
	public final int anInt5075;

	@OriginalMember(owner = "client!ida", name = "u", descriptor = "Lclient!vp;")
	public final Interface18 anInterface18_3;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!vp;I)V")
	protected Class5_Sub2_Sub3(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) int arg1) {
		this.anInt5075 = arg1;
		this.anInterface18_3 = arg0;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4277();

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(B)Z")
	public abstract boolean method4279();
}
