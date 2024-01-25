import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!pt;Z)Lclient!pt;")
	@Override
	public Class1_Sub5_Sub8 method1322(@OriginalArg(0) Class1_Sub5_Sub8 arg0) {
		return new Class1_Sub5_Sub8_Sub2(arg0.method2923(), arg0.anInt3594);
	}
}
