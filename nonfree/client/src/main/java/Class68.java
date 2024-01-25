import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class68 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
	public int anInt1726;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "I")
	public int anInt1727;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
	public int anInt1728;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "I")
	public int anInt1729;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "()V")
	public Class68() {
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!cv;)V")
	public Class68(@OriginalArg(0) Class68 arg0) {
		this.anInt1727 = arg0.anInt1727;
		this.anInt1729 = arg0.anInt1729;
		this.anInt1726 = arg0.anInt1726;
		this.anInt1728 = arg0.anInt1728;
	}
}
