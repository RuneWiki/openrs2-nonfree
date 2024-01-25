import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public final class Class159 {

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
	public int anInt4108;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "I")
	public int anInt4109;

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
	public int anInt4110;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V")
	public Class159() {
	}

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!hia;)V")
	public Class159(@OriginalArg(0) Class159 arg0) {
		this.anInt4110 = arg0.anInt4110;
		this.anInt4109 = arg0.anInt4109;
		this.anInt4108 = arg0.anInt4108;
	}
}
