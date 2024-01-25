import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	public int anInt2354;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	private Class1_Sub18() {
	}

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
	public Class1_Sub18(@OriginalArg(0) int arg0) {
		this.anInt2354 = arg0;
	}
}
