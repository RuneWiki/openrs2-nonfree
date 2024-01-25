import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public final class Class1_Sub3_Sub8 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fh", name = "B", descriptor = "Lclient!su;")
	public final Class11_Sub1_Sub5 aClass11_Sub1_Sub5_1;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!su;)V")
	public Class1_Sub3_Sub8(@OriginalArg(0) Class11_Sub1_Sub5 arg0) {
		this.aClass11_Sub1_Sub5_1 = arg0;
	}
}
