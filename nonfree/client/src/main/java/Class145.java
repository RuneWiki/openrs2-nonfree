import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class145 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	public int anInt4065;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
	public int anInt4066;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
	public int anInt4067;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
	public Class145() {
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!lo;)V")
	public Class145(@OriginalArg(0) Class145 arg0) {
		this.anInt4067 = arg0.anInt4067;
		this.anInt4065 = arg0.anInt4065;
		this.anInt4066 = arg0.anInt4066;
	}
}
