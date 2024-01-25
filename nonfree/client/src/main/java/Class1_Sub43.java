import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public final class Class1_Sub43 extends Class1 {

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
	public final int anInt6700;

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
	public final int anInt6702;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6700 = arg0;
		this.anInt6702 = arg1;
	}
}
