import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
	public int anInt109;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
	private Class3_Sub4() {
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4(@OriginalArg(0) int arg0) {
		this.anInt109 = arg0;
	}
}
