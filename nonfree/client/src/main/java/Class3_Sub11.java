import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!di", name = "k", descriptor = "J")
	public long aLong57;

	static {
		new Class343("", 76);
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	private Class3_Sub11() {
	}

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(J)V")
	public Class3_Sub11(@OriginalArg(0) long arg0) {
		this.aLong57 = arg0;
	}
}
