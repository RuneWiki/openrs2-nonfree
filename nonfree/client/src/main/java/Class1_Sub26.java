import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	public final int anInt4520;

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
	public final int anInt4522;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
	public Class1_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4520 = arg1;
		this.anInt4522 = arg0;
	}
}
