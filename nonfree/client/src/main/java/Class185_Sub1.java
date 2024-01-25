import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class185_Sub1 extends Class185 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLclient!bp;)Lclient!bp;")
	@Override
	public Class4_Sub1_Sub3 method4915(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		return new Class4_Sub1_Sub3_Sub1(arg0.anInterface9_3, arg0.method3144());
	}
}
