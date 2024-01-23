import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ph;)Lclient!ph;")
	@Override
	public Class1_Sub2_Sub13 method3233(@OriginalArg(1) Class1_Sub2_Sub13 arg0) {
		return new Class1_Sub2_Sub13_Sub2(arg0.method3208());
	}
}
