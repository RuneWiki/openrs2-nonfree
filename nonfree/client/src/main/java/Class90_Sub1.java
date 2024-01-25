import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILclient!pl;)Lclient!pl;")
	@Override
	public Class5_Sub1_Sub11 method4915(@OriginalArg(1) Class5_Sub1_Sub11 arg0) {
		return new Class5_Sub1_Sub11_Sub2(arg0.anInterface7_3, arg0.method5569());
	}
}
