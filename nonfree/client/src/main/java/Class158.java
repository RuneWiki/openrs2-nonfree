import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class158 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	public int anInt4539;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
	public int anInt4540;

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	public int anInt4541;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class158() {
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!ik;)V")
	public Class158(@OriginalArg(0) Class158 arg0) {
		this.anInt4540 = arg0.anInt4540;
		this.anInt4539 = arg0.anInt4539;
		this.anInt4541 = arg0.anInt4541;
	}
}
