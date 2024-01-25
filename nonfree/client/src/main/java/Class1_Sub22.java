import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "J")
	public long aLong96;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	private Class1_Sub22() {
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(J)V")
	public Class1_Sub22(@OriginalArg(0) long arg0) {
		this.aLong96 = arg0;
	}
}
