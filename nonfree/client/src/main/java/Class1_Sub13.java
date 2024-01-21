import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
	public final int anInt2555;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13(@OriginalArg(0) int arg0) {
		this.anInt2555 = arg0;
	}
}
