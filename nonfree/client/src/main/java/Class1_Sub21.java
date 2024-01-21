import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	public final int anInt2619;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
	public Class1_Sub21(@OriginalArg(0) int arg0) {
		this.anInt2619 = arg0;
	}
}
