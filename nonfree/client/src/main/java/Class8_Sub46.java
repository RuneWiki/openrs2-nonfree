import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class8_Sub46 extends Class8 {

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "J")
	public long aLong258;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
	private Class8_Sub46() {
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(J)V")
	public Class8_Sub46(@OriginalArg(0) long arg0) {
		this.aLong258 = arg0;
	}
}
