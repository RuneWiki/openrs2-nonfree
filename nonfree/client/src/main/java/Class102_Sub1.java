import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
	private Class102_Sub1() {
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!kea;)Lclient!kea;")
	@Override
	public Class14_Sub2_Sub4 method4054(@OriginalArg(1) Class14_Sub2_Sub4 arg0) {
		return new Class14_Sub2_Sub4_Sub1(arg0.anInterface24_3, arg0.method7557(), arg0.anInt8731);
	}
}
