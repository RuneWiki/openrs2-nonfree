import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class3_Sub53 extends Class3 {

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
	public int anInt10023;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V")
	private Class3_Sub53() {
	}

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(I)V")
	public Class3_Sub53(@OriginalArg(0) int arg0) {
		this.anInt10023 = arg0;
	}
}
