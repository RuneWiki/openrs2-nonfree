import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "J")
	public long aLong106;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(J)V")
	public Class1_Sub21(@OriginalArg(0) long arg0) {
		this.aLong106 = arg0;
	}
}
