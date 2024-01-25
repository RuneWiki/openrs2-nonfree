import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public final class Class2_Sub14 extends Class2 {

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
	public int anInt1455;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	private Class2_Sub14() {
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V")
	public Class2_Sub14(@OriginalArg(0) int arg0) {
		this.anInt1455 = arg0;
	}
}
