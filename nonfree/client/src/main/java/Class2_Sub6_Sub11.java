import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class Class2_Sub6_Sub11 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
	public final int anInt6902;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub6_Sub11(@OriginalArg(0) int arg0) {
		this.anInt6902 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6201();

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)Z")
	public abstract boolean method6204();
}
