import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
	public final int anInt2306;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub19(@OriginalArg(0) int arg0) {
		this.anInt2306 = arg0;
	}
}
