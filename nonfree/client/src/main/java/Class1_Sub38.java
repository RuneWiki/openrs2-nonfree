import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class1_Sub38 extends Class1 {

	@OriginalMember(owner = "client!qg", name = "r", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
	private Class1_Sub38() {
	}

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(J)V")
	public Class1_Sub38(@OriginalArg(0) long arg0) {
		this.aLong175 = arg0;
	}
}
