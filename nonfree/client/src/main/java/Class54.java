import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class54 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	public int anInt1652;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
	public int anInt1654;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	public int anInt1656;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	public int anInt1660;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class54() {
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!mf;)V")
	public Class54(@OriginalArg(0) Class54 arg0) {
		this.anInt1660 = arg0.anInt1660;
		this.anInt1654 = arg0.anInt1654;
		this.anInt1652 = arg0.anInt1652;
		this.anInt1656 = arg0.anInt1656;
	}
}
