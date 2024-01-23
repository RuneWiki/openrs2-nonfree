import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!td", name = "x", descriptor = "I")
	public int anInt4359;

	@OriginalMember(owner = "client!td", name = "v", descriptor = "I")
	public int anInt4357;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4359 = arg1;
		this.anInt4357 = arg0;
	}
}
