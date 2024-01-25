import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
	public final int anInt4015;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
	public final int anInt4014;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II)V")
	public Class1_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4015 = arg1;
		this.anInt4014 = arg0;
	}
}
