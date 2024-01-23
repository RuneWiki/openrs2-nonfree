import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!md", name = "p", descriptor = "J")
	public long aLong120;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(J)V")
	public Class1_Sub19(@OriginalArg(0) long arg0) {
		this.aLong120 = arg0;
	}
}
