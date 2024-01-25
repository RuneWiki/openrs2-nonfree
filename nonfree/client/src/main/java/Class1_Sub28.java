import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "J")
	public long aLong123;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	private Class1_Sub28() {
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(J)V")
	public Class1_Sub28(@OriginalArg(0) long arg0) {
		this.aLong123 = arg0;
	}
}
