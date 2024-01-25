import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class153 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
	public int anInt4497;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
	public int anInt4498;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
	public int anInt4499;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class153() {
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class153(@OriginalArg(0) Class153 arg0) {
		this.anInt4499 = arg0.anInt4499;
		this.anInt4497 = arg0.anInt4497;
		this.anInt4498 = arg0.anInt4498;
	}
}
