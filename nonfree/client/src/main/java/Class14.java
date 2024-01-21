import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class14 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	public int anInt508;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public int anInt511;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public int anInt515;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class14() {
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!cc;)V")
	public Class14(@OriginalArg(0) Class14 arg0) {
		this.anInt514 = arg0.anInt514;
		this.anInt515 = arg0.anInt515;
		this.anInt508 = arg0.anInt508;
		this.anInt511 = arg0.anInt511;
	}
}
