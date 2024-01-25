import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public final class Class2_Sub17 extends Class2 {

	@OriginalMember(owner = "client!cka", name = "n", descriptor = "J")
	public long aLong54;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "()V")
	private Class2_Sub17() {
	}

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(J)V")
	public Class2_Sub17(@OriginalArg(0) long arg0) {
		this.aLong54 = arg0;
	}
}
