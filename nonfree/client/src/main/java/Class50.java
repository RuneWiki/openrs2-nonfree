import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class50 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public int anInt1467;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public int anInt1469;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public int anInt1470;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class50() {
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!cc;)V")
	public Class50(@OriginalArg(0) Class50 arg0) {
		this.anInt1469 = arg0.anInt1469;
		this.anInt1470 = arg0.anInt1470;
		this.anInt1468 = arg0.anInt1468;
		this.anInt1467 = arg0.anInt1467;
	}
}
