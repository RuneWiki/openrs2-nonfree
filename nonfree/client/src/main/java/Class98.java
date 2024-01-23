import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class98 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
	public int anInt2721;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
	public int anInt2723;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public int anInt2727;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	public int anInt2728;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class98() {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!kb;)V")
	public Class98(@OriginalArg(0) Class98 arg0) {
		this.anInt2728 = arg0.anInt2728;
		this.anInt2727 = arg0.anInt2727;
		this.anInt2721 = arg0.anInt2721;
		this.anInt2723 = arg0.anInt2723;
	}
}
