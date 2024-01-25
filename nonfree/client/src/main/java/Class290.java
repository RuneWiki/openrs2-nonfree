import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class290 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	public int anInt7884;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
	public int anInt7885;

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
	public int anInt7886;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class290() {
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class290(@OriginalArg(0) Class290 arg0) {
		this.anInt7885 = arg0.anInt7885;
		this.anInt7886 = arg0.anInt7886;
		this.anInt7884 = arg0.anInt7884;
	}
}
