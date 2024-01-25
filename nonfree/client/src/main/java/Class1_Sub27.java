import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "J")
	public long aLong127;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	private Class1_Sub27() {
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(J)V")
	public Class1_Sub27(@OriginalArg(0) long arg0) {
		this.aLong127 = arg0;
	}
}
