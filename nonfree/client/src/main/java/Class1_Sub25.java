import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
	public int anInt4102;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
	public int anInt4101;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V")
	public Class1_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4102 = arg0;
		this.anInt4101 = arg1;
	}
}
