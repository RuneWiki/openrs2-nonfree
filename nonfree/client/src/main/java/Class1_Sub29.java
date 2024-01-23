import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!si", name = "t", descriptor = "I")
	public int anInt4792;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class1_Sub29() {
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	public Class1_Sub29(@OriginalArg(0) int arg0) {
		this.anInt4792 = arg0;
	}
}
