import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "J")
	public long aLong140;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	private Class1_Sub24() {
	}

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(J)V")
	public Class1_Sub24(@OriginalArg(0) long arg0) {
		this.aLong140 = arg0;
	}
}
