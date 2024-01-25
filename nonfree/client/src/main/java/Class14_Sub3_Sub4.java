import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public final class Class14_Sub3_Sub4 extends Class14_Sub3 {

	@OriginalMember(owner = "client!cha", name = "z", descriptor = "Lclient!vq;")
	public final Class12_Sub2_Sub2_Sub5 aClass12_Sub2_Sub2_Sub5_1;

	@OriginalMember(owner = "client!cha", name = "<init>", descriptor = "(Lclient!vq;)V")
	public Class14_Sub3_Sub4(@OriginalArg(0) Class12_Sub2_Sub2_Sub5 arg0) {
		this.aClass12_Sub2_Sub2_Sub5_1 = arg0;
	}
}
