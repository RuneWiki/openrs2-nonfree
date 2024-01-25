import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class59 {

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
	public int anInt1692;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public int anInt1693;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
	public int anInt1694;

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
	public int anInt1695;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class59() {
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class59(@OriginalArg(0) Class59 arg0) {
		this.anInt1695 = arg0.anInt1695;
		this.anInt1692 = arg0.anInt1692;
		this.anInt1693 = arg0.anInt1693;
		this.anInt1694 = arg0.anInt1694;
	}
}
