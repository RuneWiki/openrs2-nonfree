import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public abstract class Class2_Sub2_Sub10 extends Class2_Sub2 {

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "Lclient!pe;")
	public final Interface19 anInterface19_3;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "I")
	public final int anInt9560;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!pe;I)V")
	protected Class2_Sub2_Sub10(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) int arg1) {
		this.anInterface19_3 = arg0;
		this.anInt9560 = arg1;
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)Z")
	public abstract boolean method7664();

	@OriginalMember(owner = "client!nv", name = "h", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7668();
}
