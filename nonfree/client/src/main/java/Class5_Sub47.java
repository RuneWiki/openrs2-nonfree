import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public final class Class5_Sub47 extends Class5 {

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
	public int anInt8308;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
	private Class5_Sub47() {
	}

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(I)V")
	public Class5_Sub47(@OriginalArg(0) int arg0) {
		this.anInt8308 = arg0;
	}
}
