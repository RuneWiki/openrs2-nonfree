import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class23 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
	public int anInt470;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	public int anInt471;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public int anInt472;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class23() {
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!bf;)V")
	public Class23(@OriginalArg(0) Class23 arg0) {
		this.anInt469 = arg0.anInt469;
		this.anInt472 = arg0.anInt472;
		this.anInt471 = arg0.anInt471;
		this.anInt470 = arg0.anInt470;
	}
}
