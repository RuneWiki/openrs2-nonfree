import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!a", name = "q", descriptor = "I")
	public int anInt12;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1() {
	}

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0) {
		this.anInt12 = arg0;
	}
}
