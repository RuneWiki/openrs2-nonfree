import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
	public int anInt2181;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	private Class3_Sub22() {
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V")
	public Class3_Sub22(@OriginalArg(0) int arg0) {
		this.anInt2181 = arg0;
	}
}
