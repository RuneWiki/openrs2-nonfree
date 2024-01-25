import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "J")
	public long aLong84;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	private Class3_Sub19() {
	}

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(J)V")
	public Class3_Sub19(@OriginalArg(0) long arg0) {
		this.aLong84 = arg0;
	}
}
