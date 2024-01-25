import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
	public int anInt1173;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	private Class1_Sub9() {
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V")
	public Class1_Sub9(@OriginalArg(0) int arg0) {
		this.anInt1173 = arg0;
	}
}
