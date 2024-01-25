import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class Class2_Sub9_Sub18 extends Class2_Sub9 {

	@OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
	public final int anInt6661;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(I)V")
	protected Class2_Sub9_Sub18(@OriginalArg(0) int arg0) {
		this.anInt6661 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5574();

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5575();
}
