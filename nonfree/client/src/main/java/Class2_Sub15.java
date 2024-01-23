import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!fi", name = "F", descriptor = "Lclient!qe;")
	public Class78 aClass78_305;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class2_Sub15() {
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lclient!qe;)V")
	public Class2_Sub15(@OriginalArg(0) Class78 arg0) {
		this.aClass78_305 = arg0;
	}
}
