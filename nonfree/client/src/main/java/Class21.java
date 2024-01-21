import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class21 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public int anInt723;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class21() {
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!db;)V")
	public Class21(@OriginalArg(0) Class21 arg0) {
		this.anInt717 = arg0.anInt717;
		this.anInt720 = arg0.anInt720;
		this.anInt723 = arg0.anInt723;
		this.anInt716 = arg0.anInt716;
	}
}
