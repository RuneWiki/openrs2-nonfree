import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public final class Class298 {

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "I")
	public int anInt8782;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
	public int anInt8783;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
	public int anInt8784;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
	public int anInt8785;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "()V")
	public Class298() {
	}

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!tea;)V")
	public Class298(@OriginalArg(0) Class298 arg0) {
		this.anInt8782 = arg0.anInt8782;
		this.anInt8783 = arg0.anInt8783;
		this.anInt8784 = arg0.anInt8784;
		this.anInt8785 = arg0.anInt8785;
	}
}
