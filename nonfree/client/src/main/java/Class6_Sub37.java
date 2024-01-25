import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class6_Sub37 extends Class6 {

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "J")
	public long aLong193;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	private Class6_Sub37() {
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(J)V")
	public Class6_Sub37(@OriginalArg(0) long arg0) {
		this.aLong193 = arg0;
	}
}
