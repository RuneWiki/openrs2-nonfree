import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class40 {

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
	public int anInt1622;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public int anInt1624;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public int anInt1625;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class40() {
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!hc;)V")
	public Class40(@OriginalArg(0) Class40 arg0) {
		this.anInt1622 = arg0.anInt1622;
		this.anInt1626 = arg0.anInt1626;
		this.anInt1624 = arg0.anInt1624;
		this.anInt1625 = arg0.anInt1625;
	}
}
