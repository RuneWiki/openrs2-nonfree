import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class Class6_Sub2_Sub10 extends Class6_Sub2 {

	@OriginalMember(owner = "client!te", name = "A", descriptor = "Lclient!vm;")
	public final Interface26 anInterface26_3;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "I")
	public final int anInt8104;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!vm;I)V")
	protected Class6_Sub2_Sub10(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) int arg1) {
		this.anInterface26_3 = arg0;
		this.anInt8104 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method6996();

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)Z")
	public abstract boolean method6997();
}
