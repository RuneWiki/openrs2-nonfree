import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class12_Sub40 extends Class12 {

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "J")
	public long aLong171;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	private Class12_Sub40() {
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(J)V")
	public Class12_Sub40(@OriginalArg(0) long arg0) {
		this.aLong171 = arg0;
	}
}
