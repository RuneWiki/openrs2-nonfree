import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class185_Sub1 extends Class185 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!tia;)Lclient!tia;")
	@Override
	public Class3_Sub1_Sub14 method5112(@OriginalArg(1) Class3_Sub1_Sub14 arg0) {
		return new Class3_Sub1_Sub14_Sub1(arg0.method7617(), arg0.anInt9225);
	}
}
