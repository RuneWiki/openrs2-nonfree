import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class184 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
	public int anInt5739;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
	public int anInt5740;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public int anInt5741;

	@OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
	public int anInt5742;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V")
	public Class184() {
	}

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class184(@OriginalArg(0) Class184 arg0) {
		this.anInt5742 = arg0.anInt5742;
		this.anInt5741 = arg0.anInt5741;
		this.anInt5739 = arg0.anInt5739;
		this.anInt5740 = arg0.anInt5740;
	}
}
