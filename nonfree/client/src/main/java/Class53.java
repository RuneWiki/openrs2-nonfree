import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class53 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public int anInt1823;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
	public int anInt1824;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
	public int anInt1825;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public int anInt1826;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class53() {
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!dn;)V")
	public Class53(@OriginalArg(0) Class53 arg0) {
		this.anInt1824 = arg0.anInt1824;
		this.anInt1826 = arg0.anInt1826;
		this.anInt1825 = arg0.anInt1825;
		this.anInt1823 = arg0.anInt1823;
	}
}
