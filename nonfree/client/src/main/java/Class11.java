import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class11 {

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
	public int anInt732;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public int anInt734;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
	public int anInt735;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	public int anInt736;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class11() {
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!cd;)V")
	public Class11(@OriginalArg(0) Class11 arg0) {
		this.anInt735 = arg0.anInt735;
		this.anInt734 = arg0.anInt734;
		this.anInt736 = arg0.anInt736;
		this.anInt732 = arg0.anInt732;
	}
}
