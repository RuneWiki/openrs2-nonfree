import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "I")
	public int anInt41;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V")
	private Class2_Sub2() {
	}

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2(@OriginalArg(0) int arg0) {
		this.anInt41 = arg0;
	}
}
