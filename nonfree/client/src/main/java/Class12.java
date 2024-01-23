import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class12 {

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public int anInt419;

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
	public int anInt421;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	public int anInt422;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	public int anInt423;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class12() {
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!ba;)V")
	public Class12(@OriginalArg(0) Class12 arg0) {
		this.anInt421 = arg0.anInt421;
		this.anInt422 = arg0.anInt422;
		this.anInt423 = arg0.anInt423;
		this.anInt419 = arg0.anInt419;
	}
}
