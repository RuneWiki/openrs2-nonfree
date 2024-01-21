import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class37 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public int anInt1627;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public int anInt1628;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
	public int anInt1630;

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
	public int anInt1634;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
	public Class37() {
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!jb;)V")
	public Class37(@OriginalArg(0) Class37 arg0) {
		this.anInt1628 = arg0.anInt1628;
		this.anInt1630 = arg0.anInt1630;
		this.anInt1627 = arg0.anInt1627;
		this.anInt1634 = arg0.anInt1634;
	}
}
