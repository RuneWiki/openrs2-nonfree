import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class Class2_Sub3_Sub9 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
	public final int anInt5541;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub3_Sub9(@OriginalArg(0) int arg0) {
		this.anInt5541 = arg0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)Z")
	public abstract boolean method4640();

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4641();
}
