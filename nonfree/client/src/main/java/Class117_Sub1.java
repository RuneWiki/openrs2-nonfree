import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!te;B)Lclient!te;")
	@Override
	public Class2_Sub11_Sub12 method3478(@OriginalArg(0) Class2_Sub11_Sub12 arg0) {
		return new Class2_Sub11_Sub12_Sub2(arg0.method5152());
	}
}
