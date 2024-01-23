import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
	public int anInt2543;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16(@OriginalArg(0) int arg0) {
		this.anInt2543 = arg0;
	}
}
