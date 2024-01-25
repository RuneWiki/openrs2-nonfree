import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class346_Sub1 extends Class346 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLclient!as;)Lclient!as;")
	@Override
	public Class4_Sub5_Sub1 method8107(@OriginalArg(1) Class4_Sub5_Sub1 arg0) {
		return new Class4_Sub5_Sub1_Sub1(arg0.anInterface1_3, arg0.method3332(), arg0.anInt3729);
	}
}
