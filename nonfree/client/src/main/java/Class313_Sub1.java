import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public final class Class313_Sub1 extends Class313 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!qc;I)Lclient!qc;")
	@Override
	public Class2_Sub7_Sub15 method7249(@OriginalArg(0) Class2_Sub7_Sub15 arg0) {
		return new Class2_Sub7_Sub15_Sub2(arg0.method7544(), arg0.anInt8800);
	}
}
