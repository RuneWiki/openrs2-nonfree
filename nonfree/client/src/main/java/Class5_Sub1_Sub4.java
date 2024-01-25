import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!hga", name = "m", descriptor = "Ljava/lang/String;")
	private String aString31;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.aString39 = this.aString31;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.aString31 = arg0.method7847();
		arg0.method7804();
	}
}
