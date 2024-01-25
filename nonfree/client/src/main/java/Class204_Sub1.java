import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public final class Class204_Sub1 extends Class204 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ie;I)Lclient!ie;")
	@Override
	public Class4_Sub1_Sub12 method4872(@OriginalArg(0) Class4_Sub1_Sub12 arg0) {
		return new Class4_Sub1_Sub12_Sub1(arg0.method5267(), arg0.anInt6450);
	}
}
