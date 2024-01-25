import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class257 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
	public int anInt7573;

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
	public int anInt7574;

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "I")
	public int anInt7575;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "()V")
	public Class257() {
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!vt;)V")
	public Class257(@OriginalArg(0) Class257 arg0) {
		this.anInt7574 = arg0.anInt7574;
		this.anInt7573 = arg0.anInt7573;
		this.anInt7575 = arg0.anInt7575;
	}
}
