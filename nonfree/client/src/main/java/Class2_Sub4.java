import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class2_Sub4 extends Class2 {

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	public int anInt71;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	public final int anInt69;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(II)V")
	public Class2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt71 = arg1;
		this.anInt69 = arg0;
	}
}
