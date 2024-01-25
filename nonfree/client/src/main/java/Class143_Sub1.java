import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ks;B)Lclient!ks;")
	@Override
	public Class12_Sub4_Sub11 method3827(@OriginalArg(0) Class12_Sub4_Sub11 arg0) {
		return new Class12_Sub4_Sub11_Sub1(arg0.method7120(), arg0.anInt8655);
	}
}
