import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class344 {

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
	public int anInt9162;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt9163;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	public int anInt9164;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	public int anInt9165;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class344() {
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!ve;)V")
	public Class344(@OriginalArg(0) Class344 arg0) {
		this.anInt9162 = arg0.anInt9162;
		this.anInt9165 = arg0.anInt9165;
		this.anInt9164 = arg0.anInt9164;
		this.anInt9163 = arg0.anInt9163;
	}
}
