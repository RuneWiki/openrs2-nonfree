import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class213_Sub1 extends Class213 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLclient!lk;)Lclient!lk;")
	@Override
	public Class5_Sub2_Sub10 method4664(@OriginalArg(1) Class5_Sub2_Sub10 arg0) {
		return new Class5_Sub2_Sub10_Sub2(arg0.anInterface1_3, arg0.method4847(), arg0.anInt6065);
	}
}
