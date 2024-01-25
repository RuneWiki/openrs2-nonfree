import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!lm;)V")
	@Override
	public void method9472(@OriginalArg(1) Class219 arg0) {
		arg0.aString78 = this.aString3;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLclient!ol;)V")
	@Override
	public void method9470(@OriginalArg(1) Class2_Sub8 arg0) {
		this.aString3 = arg0.method5178();
	}
}
