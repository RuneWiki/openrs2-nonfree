import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class Class2_Sub7_Sub5 extends Class2_Sub7 {

	@OriginalMember(owner = "client!gf", name = "B", descriptor = "Lclient!vl;")
	public final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
	public final int anInt5759;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!vl;I)V")
	protected Class2_Sub7_Sub5(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		this.anInterface10_3 = arg0;
		this.anInt5759 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5095();

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)Z")
	public abstract boolean method5096();
}
