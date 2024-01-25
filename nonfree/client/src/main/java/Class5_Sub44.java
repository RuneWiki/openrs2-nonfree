import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class5_Sub44 extends Class5 {

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "J")
	public long aLong203;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	private Class5_Sub44() {
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(J)V")
	public Class5_Sub44(@OriginalArg(0) long arg0) {
		this.aLong203 = arg0;
	}
}
