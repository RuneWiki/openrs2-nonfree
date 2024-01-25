import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class270 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	public int anInt7403;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
	public int anInt7404;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	public int anInt7405;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class270() {
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!ws;)V")
	public Class270(@OriginalArg(0) Class270 arg0) {
		this.anInt7405 = arg0.anInt7405;
		this.anInt7403 = arg0.anInt7403;
		this.anInt7404 = arg0.anInt7404;
	}
}
