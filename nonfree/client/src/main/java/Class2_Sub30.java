import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public final class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "J")
	public long aLong125;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	private Class2_Sub30() {
	}

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(J)V")
	public Class2_Sub30(@OriginalArg(0) long arg0) {
		this.aLong125 = arg0;
	}
}
