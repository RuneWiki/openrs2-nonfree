import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!m", name = "M", descriptor = "Lclient!kd;")
	public final Class6_Sub5 aClass6_Sub5_1;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class1_Sub2_Sub16(@OriginalArg(0) Class6_Sub5 arg0) {
		this.aClass6_Sub5_1 = arg0;
	}
}
