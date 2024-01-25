import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public final class Class182 {

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
	public int anInt4844;

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
	public int anInt4845;

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
	public int anInt4846;

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V")
	public Class182() {
	}

	@OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(Lclient!jw;)V")
	public Class182(@OriginalArg(0) Class182 arg0) {
		this.anInt4846 = arg0.anInt4846;
		this.anInt4844 = arg0.anInt4844;
		this.anInt4845 = arg0.anInt4845;
	}
}
