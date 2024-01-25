import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
	public int anInt3348;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V")
	private Class1_Sub27() {
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(I)V")
	public Class1_Sub27(@OriginalArg(0) int arg0) {
		this.anInt3348 = arg0;
	}
}
