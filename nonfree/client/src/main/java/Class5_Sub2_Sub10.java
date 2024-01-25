import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
	public final int anInt6065;

	@OriginalMember(owner = "client!lk", name = "D", descriptor = "Lclient!bg;")
	public final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!bg;I)V")
	protected Class5_Sub2_Sub10(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1) {
		this.anInt6065 = arg1;
		this.anInterface1_3 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method4847();

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)Z")
	public abstract boolean method4853();
}
