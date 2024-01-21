import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class67 {

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	public int anInt2837;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
	public int anInt2838;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	public int anInt2843;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class67() {
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class67(@OriginalArg(0) Class67 arg0) {
		this.anInt2843 = arg0.anInt2843;
		this.anInt2841 = arg0.anInt2841;
		this.anInt2837 = arg0.anInt2837;
		this.anInt2838 = arg0.anInt2838;
	}
}
