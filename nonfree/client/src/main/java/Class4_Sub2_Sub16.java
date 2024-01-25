import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public abstract class Class4_Sub2_Sub16 extends Class4_Sub2 {

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
	public final int anInt6175;

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "Lclient!hf;")
	public final Interface6 anInterface6_3;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!hf;I)V")
	protected Class4_Sub2_Sub16(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) int arg1) {
		this.anInt6175 = arg1;
		this.anInterface6_3 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4973();

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Z")
	public abstract boolean method4974();
}
