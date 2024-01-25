import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class Class2_Sub10_Sub4 extends Class2_Sub10 {

	@OriginalMember(owner = "client!hu", name = "G", descriptor = "Lclient!ts;")
	public final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!hu", name = "B", descriptor = "I")
	public final int anInt3516;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!ts;I)V")
	protected Class2_Sub10_Sub4(@OriginalArg(0) Interface10 arg0, @OriginalArg(1) int arg1) {
		this.anInterface10_3 = arg0;
		this.anInt3516 = arg1;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3219();

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "(I)Z")
	public abstract boolean method3222();
}
