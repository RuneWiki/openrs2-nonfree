import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public final class Class358 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
	public int anInt9148;

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
	public int anInt9149;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
	public int anInt9150;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
	public int anInt9151;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
	public Class358() {
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!uaa;)V")
	public Class358(@OriginalArg(0) Class358 arg0) {
		this.anInt9148 = arg0.anInt9148;
		this.anInt9150 = arg0.anInt9150;
		this.anInt9151 = arg0.anInt9151;
		this.anInt9149 = arg0.anInt9149;
	}
}
