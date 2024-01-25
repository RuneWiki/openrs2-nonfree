import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!sfa", name = "k", descriptor = "J")
	public long aLong224;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "()V")
	private Class3_Sub41() {
	}

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(J)V")
	public Class3_Sub41(@OriginalArg(0) long arg0) {
		this.aLong224 = arg0;
	}
}
