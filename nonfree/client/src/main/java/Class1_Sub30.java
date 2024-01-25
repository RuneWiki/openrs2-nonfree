import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
	public int anInt3799;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	private Class1_Sub30() {
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	public Class1_Sub30(@OriginalArg(0) int arg0) {
		this.anInt3799 = arg0;
	}
}
