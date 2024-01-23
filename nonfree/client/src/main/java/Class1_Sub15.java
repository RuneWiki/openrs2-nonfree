import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "J")
	public long aLong99;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(J)V")
	public Class1_Sub15(@OriginalArg(0) long arg0) {
		this.aLong99 = arg0;
	}
}
