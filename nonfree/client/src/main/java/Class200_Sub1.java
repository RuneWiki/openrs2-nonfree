import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class200_Sub1 extends Class200 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!ea;)Lclient!ea;")
	@Override
	public Class5_Sub9_Sub2 method5468(@OriginalArg(1) Class5_Sub9_Sub2 arg0) {
		return new Class5_Sub9_Sub2_Sub1(arg0.anInterface3_3, arg0.method1807());
	}
}
