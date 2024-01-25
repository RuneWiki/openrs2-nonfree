import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public final class Class14_Sub11_Sub11 extends Class14_Sub11 {

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
	private int anInt10306;

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "Ljava/lang/String;")
	private String aString119;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!jc;)V")
	@Override
	public void method9160(@OriginalArg(1) Class14_Sub21 arg0) {
		this.anInt10306 = arg0.method7748();
		this.aString119 = arg0.method7703(0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!aq;I)V")
	@Override
	public void method9161(@OriginalArg(0) Class23 arg0) {
		arg0.method349(this.anInt10306, this.aString119);
	}
}
