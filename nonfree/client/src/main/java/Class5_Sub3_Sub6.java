import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public abstract class Class5_Sub3_Sub6 extends Class5_Sub3 {

	@OriginalMember(owner = "client!hfa", name = "s", descriptor = "Lclient!ofa;")
	public final Interface20 anInterface20_3;

	@OriginalMember(owner = "client!hfa", name = "u", descriptor = "I")
	public final int anInt9703;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(Lclient!ofa;I)V")
	protected Class5_Sub3_Sub6(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) int arg1) {
		this.anInterface20_3 = arg0;
		this.anInt9703 = arg1;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)Z")
	public abstract boolean method8109();

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method8111();
}
