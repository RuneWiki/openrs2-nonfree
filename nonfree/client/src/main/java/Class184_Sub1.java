import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class184_Sub1 extends Class184 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!dw;I)Lclient!dw;")
	@Override
	public Class1_Sub3_Sub5 method3993(@OriginalArg(0) Class1_Sub3_Sub5 arg0) {
		return new Class1_Sub3_Sub5_Sub2(arg0.method5070(), arg0.anInt6283);
	}
}
