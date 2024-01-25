import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class184_Sub1 extends Class184 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!dha;B)Lclient!dha;")
	@Override
	public Class5_Sub2_Sub3 method3869(@OriginalArg(0) Class5_Sub2_Sub3 arg0) {
		return new Class5_Sub2_Sub3_Sub2(arg0.method6866(), arg0.anInt8079);
	}
}
