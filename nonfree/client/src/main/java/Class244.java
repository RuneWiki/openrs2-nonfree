import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public final class Class244 {

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
	private final int anInt6414;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V")
	public Class244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6414 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)I")
	public int method5675() {
		return this.anInt6414;
	}
}
