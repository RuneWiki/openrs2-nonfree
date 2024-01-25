import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public final class Class131_Sub1 extends Class131 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!cm;)Lclient!cm;")
	@Override
	public Class7_Sub4_Sub4 method2953(@OriginalArg(1) Class7_Sub4_Sub4 arg0) {
		return new Class7_Sub4_Sub4_Sub2(arg0.anInterface12_3, arg0.method2643(), arg0.anInt3264);
	}
}
