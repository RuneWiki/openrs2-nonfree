import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class189_Sub1 extends Class189 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!kca;I)Lclient!kca;")
	@Override
	public Class14_Sub3_Sub3 method6798(@OriginalArg(0) Class14_Sub3_Sub3 arg0) {
		return new Class14_Sub3_Sub3_Sub1(arg0.anInterface5_3, arg0.method5212(), arg0.anInt6296);
	}
}
