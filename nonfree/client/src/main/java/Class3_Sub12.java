import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!df", name = "t", descriptor = "I")
	public final int anInt2334;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "I")
	public final int anInt2332;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(II)V")
	public Class3_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2334 = arg0;
		this.anInt2332 = arg1;
	}
}
