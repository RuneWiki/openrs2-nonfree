import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class2_Sub48 extends Class2 {

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public final int anInt10050;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
	public final int anInt10052;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
	public Class2_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10050 = arg0;
		this.anInt10052 = arg1;
	}
}
