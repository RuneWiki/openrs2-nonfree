import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
	public final int anInt1474;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
	public final int anInt1473;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(II)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1474 = arg1;
		this.anInt1473 = arg0;
	}
}
