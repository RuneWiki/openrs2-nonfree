import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class159_Sub1 extends Class159 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!mh;)Lclient!mh;")
	@Override
	public Class2_Sub1_Sub11 method3126(@OriginalArg(1) Class2_Sub1_Sub11 arg0) {
		return new Class2_Sub1_Sub11_Sub1(arg0.anInterface3_3, arg0.method4480(), arg0.anInt5640);
	}
}
