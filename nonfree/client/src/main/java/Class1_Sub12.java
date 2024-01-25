import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class1_Sub12 extends Class1 {

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "I")
	public final int anInt2502;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	public int anInt2500;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V")
	public Class1_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2502 = arg0;
		this.anInt2500 = arg1;
	}
}
