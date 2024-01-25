import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public final class Class52_Sub1 extends Class52 {

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!jg;)Lclient!jg;")
	@Override
	public Class8_Sub5_Sub3 method1719(@OriginalArg(1) Class8_Sub5_Sub3 arg0) {
		return new Class8_Sub5_Sub3_Sub1(arg0.anInterface19_3, arg0.method7785(), arg0.anInt9632);
	}
}
