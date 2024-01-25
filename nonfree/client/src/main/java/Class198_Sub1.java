import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public final class Class198_Sub1 extends Class198 {

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!ci;)Lclient!ci;")
	@Override
	public Class3_Sub4_Sub2 method6192(@OriginalArg(1) Class3_Sub4_Sub2 arg0) {
		return new Class3_Sub4_Sub2_Sub1(arg0.method8739(), arg0.anInt10195);
	}
}
