import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class96 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "I")
	public int anInt2898;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "I")
	public int anInt2899;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	public int anInt2900;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class96() {
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!in;)V")
	public Class96(@OriginalArg(0) Class96 arg0) {
		this.anInt2899 = arg0.anInt2899;
		this.anInt2900 = arg0.anInt2900;
		this.anInt2898 = arg0.anInt2898;
	}
}
