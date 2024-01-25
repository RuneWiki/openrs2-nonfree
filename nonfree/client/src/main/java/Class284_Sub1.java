import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class284_Sub1 extends Class284 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLclient!rd;)Lclient!rd;")
	@Override
	public Class6_Sub5_Sub5 method6361(@OriginalArg(1) Class6_Sub5_Sub5 arg0) {
		return new Class6_Sub5_Sub5_Sub1(arg0.anInterface23_3, arg0.method3392(), arg0.anInt3924);
	}
}
