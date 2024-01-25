import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public abstract class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
	public final int anInt6505;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub1_Sub3(@OriginalArg(0) int arg0) {
		this.anInt6505 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method5178();

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)Z")
	public abstract boolean method5179();
}
