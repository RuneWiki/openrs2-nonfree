import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public abstract class Class4_Sub5_Sub1 extends Class4_Sub5 {

	@OriginalMember(owner = "client!as", name = "w", descriptor = "I")
	public final int anInt3729;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Lclient!be;")
	public final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!be;I)V")
	protected Class4_Sub5_Sub1(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3729 = arg1;
		this.anInterface1_3 = arg0;
	}

	@OriginalMember(owner = "client!as", name = "d", descriptor = "(B)Z")
	public abstract boolean method3330();

	@OriginalMember(owner = "client!as", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method3332();
}
