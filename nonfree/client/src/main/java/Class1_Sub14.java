import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class1_Sub14 extends Class1 {

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "J")
	public long aLong54;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	private Class1_Sub14() {
	}

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(J)V")
	public Class1_Sub14(@OriginalArg(0) long arg0) {
		this.aLong54 = arg0;
	}
}
