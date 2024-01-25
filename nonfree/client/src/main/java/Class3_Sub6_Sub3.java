import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public abstract class Class3_Sub6_Sub3 extends Class3_Sub6 {

	@OriginalMember(owner = "client!caa", name = "v", descriptor = "I")
	public final int anInt8306;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(I)V")
	protected Class3_Sub6_Sub3(@OriginalArg(0) int arg0) {
		this.anInt8306 = arg0;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method7027();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
	public abstract boolean method7028();
}
