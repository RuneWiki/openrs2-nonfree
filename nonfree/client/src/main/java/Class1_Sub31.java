import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!lfa", name = "n", descriptor = "J")
	public long aLong161;

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "()V")
	private Class1_Sub31() {
	}

	@OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(J)V")
	public Class1_Sub31(@OriginalArg(0) long arg0) {
		this.aLong161 = arg0;
	}
}
