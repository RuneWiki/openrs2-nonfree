import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
	public int anInt2277;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	private Class1_Sub13() {
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13(@OriginalArg(0) int arg0) {
		this.anInt2277 = arg0;
	}
}
