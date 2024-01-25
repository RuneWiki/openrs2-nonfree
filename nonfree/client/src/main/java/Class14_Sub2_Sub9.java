import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class14_Sub2_Sub9 extends Class14_Sub2 {

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Ljava/lang/String;")
	private String aString101;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!mda;)V")
	@Override
	public void method9307(@OriginalArg(1) Class229 arg0) {
		arg0.aString69 = this.aString101;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!so;)V")
	@Override
	public void method9310(@OriginalArg(1) Class14_Sub29 arg0) {
		this.aString101 = arg0.method5898();
		arg0.method5878();
	}
}
