import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!hm;)Lclient!hm;")
	@Override
	public Class4_Sub6_Sub1 method1149(@OriginalArg(1) Class4_Sub6_Sub1 arg0) {
		return new Class4_Sub6_Sub1_Sub2(arg0.anInterface5_3, arg0.method6875(), arg0.anInt8961);
	}
}
