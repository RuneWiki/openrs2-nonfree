import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "J")
	public long aLong51;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(J)V")
	public Class1_Sub9(@OriginalArg(0) long arg0) {
		this.aLong51 = arg0;
	}
}
