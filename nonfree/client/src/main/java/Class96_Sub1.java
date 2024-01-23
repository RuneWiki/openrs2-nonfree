import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public final class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLclient!sl;)Lclient!sl;")
	@Override
	public Class8_Sub1_Sub16 method2230(@OriginalArg(1) Class8_Sub1_Sub16 arg0) {
		return new Class8_Sub1_Sub16_Sub2(arg0.method4171());
	}
}
