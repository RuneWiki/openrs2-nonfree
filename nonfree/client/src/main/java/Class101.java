import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class101 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public int anInt2974;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public int anInt2975;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public int anInt2976;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class101() {
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!jb;)V")
	public Class101(@OriginalArg(0) Class101 arg0) {
		this.anInt2974 = arg0.anInt2974;
		this.anInt2976 = arg0.anInt2976;
		this.anInt2975 = arg0.anInt2975;
	}
}
