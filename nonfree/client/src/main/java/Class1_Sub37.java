import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class1_Sub37 extends Class1 {

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
	public int anInt6451;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	private Class1_Sub37() {
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V")
	public Class1_Sub37(@OriginalArg(0) int arg0) {
		this.anInt6451 = arg0;
	}
}
