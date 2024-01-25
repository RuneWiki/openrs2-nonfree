import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!qe;I)Lclient!qe;")
	@Override
	public Class5_Sub9_Sub9 method4978(@OriginalArg(0) Class5_Sub9_Sub9 arg0) {
		return new Class5_Sub9_Sub9_Sub1(arg0.method4684());
	}
}
