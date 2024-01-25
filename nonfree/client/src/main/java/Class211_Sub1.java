import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class211_Sub1 extends Class211 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLclient!lfa;)Lclient!lfa;")
	@Override
	public Class6_Sub1_Sub1 method5081(@OriginalArg(1) Class6_Sub1_Sub1 arg0) {
		return new Class6_Sub1_Sub1_Sub1(arg0.anInterface18_3, arg0.method2975(), arg0.anInt3433);
	}
}
