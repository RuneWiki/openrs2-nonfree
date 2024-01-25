import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!uda", name = "j", descriptor = "I")
	public int anInt8701;

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	private Class3_Sub47() {
	}

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(I)V")
	public Class3_Sub47(@OriginalArg(0) int arg0) {
		this.anInt8701 = arg0;
	}
}
