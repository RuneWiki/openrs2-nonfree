import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class Class3_Sub3_Sub9 extends Class3_Sub3 {

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "I")
	public final int anInt4306;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub3_Sub9(@OriginalArg(0) int arg0) {
		this.anInt4306 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z")
	public abstract boolean method3512();

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method3515();
}
