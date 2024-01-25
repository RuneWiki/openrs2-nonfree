import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class86 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	public int anInt2751;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	public int anInt2752;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public int anInt2753;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
	public int anInt2754;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class86() {
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!gp;)V")
	public Class86(@OriginalArg(0) Class86 arg0) {
		this.anInt2751 = arg0.anInt2751;
		this.anInt2752 = arg0.anInt2752;
		this.anInt2753 = arg0.anInt2753;
		this.anInt2754 = arg0.anInt2754;
	}
}
