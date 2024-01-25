import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class1_Sub47 extends Class1 {

	@OriginalMember(owner = "client!un", name = "j", descriptor = "J")
	public long aLong349;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	private Class1_Sub47() {
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(J)V")
	public Class1_Sub47(@OriginalArg(0) long arg0) {
		this.aLong349 = arg0;
	}
}
