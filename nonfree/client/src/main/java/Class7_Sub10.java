import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class7_Sub10 extends Class7 {

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public int anInt2111;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class7_Sub10() {
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V")
	public Class7_Sub10(@OriginalArg(0) int arg0) {
		this.anInt2111 = arg0;
	}
}
