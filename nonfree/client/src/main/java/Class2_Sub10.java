import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	public final int anInt1425;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	public final int anInt1422;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(II)V")
	public Class2_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1425 = arg1;
		this.anInt1422 = arg0;
	}
}
