import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public final class Class143 {

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
	public int anInt4149;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "I")
	public int anInt4150;

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
	public int anInt4151;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V")
	public Class143() {
	}

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class143(@OriginalArg(0) Class143 arg0) {
		this.anInt4151 = arg0.anInt4151;
		this.anInt4150 = arg0.anInt4150;
		this.anInt4149 = arg0.anInt4149;
	}
}
