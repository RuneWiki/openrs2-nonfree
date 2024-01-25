import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public final class Class180 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "I")
	public int anInt4872;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "I")
	public int anInt4873;

	@OriginalMember(owner = "client!on", name = "c", descriptor = "I")
	public int anInt4874;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "I")
	public int anInt4875;

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "()V")
	public Class180() {
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lclient!on;)V")
	public Class180(@OriginalArg(0) Class180 arg0) {
		this.anInt4874 = arg0.anInt4874;
		this.anInt4872 = arg0.anInt4872;
		this.anInt4873 = arg0.anInt4873;
		this.anInt4875 = arg0.anInt4875;
	}
}
