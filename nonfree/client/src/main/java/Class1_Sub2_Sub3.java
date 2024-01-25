import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
	public final int anInt2924;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub2_Sub3(@OriginalArg(0) int arg0) {
		this.anInt2924 = arg0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method2525();

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "(I)Z")
	public abstract boolean method2528();
}
