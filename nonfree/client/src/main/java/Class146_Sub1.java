import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public final class Class146_Sub1 extends Class146 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!fw;I)Lclient!fw;")
	@Override
	public Class6_Sub4_Sub5 method3944(@OriginalArg(0) Class6_Sub4_Sub5 arg0) {
		return new Class6_Sub4_Sub5_Sub1(arg0.method6327(), arg0.anInt7586);
	}
}
