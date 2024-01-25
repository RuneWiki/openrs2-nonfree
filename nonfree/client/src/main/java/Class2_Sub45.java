import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class2_Sub45 extends Class2 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "J")
	public long aLong219;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	private Class2_Sub45() {
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(J)V")
	public Class2_Sub45(@OriginalArg(0) long arg0) {
		this.aLong219 = arg0;
	}
}
