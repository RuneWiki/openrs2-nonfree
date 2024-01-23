import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class1_Sub26 extends Class1 {

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "Lclient!ia;")
	public Class51 aClass51_1609;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class1_Sub26() {
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!ia;)V")
	public Class1_Sub26(@OriginalArg(0) Class51 arg0) {
		this.aClass51_1609 = arg0;
	}
}
