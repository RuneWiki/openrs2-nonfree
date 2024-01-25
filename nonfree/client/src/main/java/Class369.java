import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public final class Class369 implements Interface2 {

	@OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
	public final int anInt10606;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(I)V")
	public Class369(@OriginalArg(0) int arg0) {
		this.anInt10606 = arg0;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)Lclient!saa;")
	@Override
	public Class310 method9078() {
		return Static509.aClass310_14;
	}
}
