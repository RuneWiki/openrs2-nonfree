import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class4_Sub38 extends Class4 {

	@OriginalMember(owner = "client!re", name = "l", descriptor = "I")
	public int anInt8496;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	private Class4_Sub38() {
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
	public Class4_Sub38(@OriginalArg(0) int arg0) {
		this.anInt8496 = arg0;
	}
}
