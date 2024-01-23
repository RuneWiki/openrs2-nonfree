import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!d", name = "x", descriptor = "J")
	public long aLong37;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(J)V")
	public Class1_Sub9(@OriginalArg(0) long arg0) {
		this.aLong37 = arg0;
	}
}
