import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class214_Sub1 extends Class214 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!pfa;I)Lclient!pfa;")
	@Override
	public Class5_Sub3_Sub4 method5272(@OriginalArg(0) Class5_Sub3_Sub4 arg0) {
		return new Class5_Sub3_Sub4_Sub1(arg0.method8129(), arg0.anInt9732);
	}
}
