import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILclient!dja;)Lclient!dja;")
	@Override
	public Class14_Sub3_Sub6 method2486(@OriginalArg(1) Class14_Sub3_Sub6 arg0) {
		return new Class14_Sub3_Sub6_Sub2(arg0.method6923(), arg0.anInt8329);
	}
}
