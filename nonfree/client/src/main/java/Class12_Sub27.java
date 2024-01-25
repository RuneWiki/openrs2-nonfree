import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class12_Sub27 extends Class12 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
	public final int anInt4887;

	@OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
	public final int anInt4888;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(II)V")
	public Class12_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4887 = arg0;
		this.anInt4888 = arg1;
	}
}
