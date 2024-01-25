import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!aba", name = "t", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V")
	private Class3_Sub2() {
	}

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2(@OriginalArg(0) int arg0) {
		this.anInt39 = arg0;
	}
}
