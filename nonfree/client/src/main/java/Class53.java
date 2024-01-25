import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class53 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public int anInt1595;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
	public int anInt1596;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	public int anInt1597;

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	public int anInt1598;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
	public Class53() {
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!cl;)V")
	public Class53(@OriginalArg(0) Class53 arg0) {
		this.anInt1595 = arg0.anInt1595;
		this.anInt1598 = arg0.anInt1598;
		this.anInt1597 = arg0.anInt1597;
		this.anInt1596 = arg0.anInt1596;
	}
}
