import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class3_Sub6 extends Class3 {

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "J")
	public long aLong12;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	private Class3_Sub6() {
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(J)V")
	public Class3_Sub6(@OriginalArg(0) long arg0) {
		this.aLong12 = arg0;
	}
}
