import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public final class Class202_Sub1 extends Class202 {

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lclient!aw;I)Lclient!aw;")
	@Override
	public Class6_Sub4_Sub1 method5412(@OriginalArg(0) Class6_Sub4_Sub1 arg0) {
		return new Class6_Sub4_Sub1_Sub2(arg0.anInterface27_3, arg0.method5714(), arg0.anInt6666);
	}
}
