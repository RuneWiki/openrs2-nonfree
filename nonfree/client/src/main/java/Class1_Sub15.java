import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	public int anInt2107;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub15(@OriginalArg(0) int arg0) {
		this.anInt2107 = arg0;
	}
}
