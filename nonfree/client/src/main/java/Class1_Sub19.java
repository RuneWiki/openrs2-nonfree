import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
	public final int anInt1822;

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
	public final int anInt1823;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(II)V")
	public Class1_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1822 = arg1;
		this.anInt1823 = arg0;
	}
}
