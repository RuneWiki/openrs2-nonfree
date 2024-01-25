import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class174_Sub1 extends Class174 {

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!fq;)Lclient!fq;")
	@Override
	public Class4_Sub1_Sub8 method4040(@OriginalArg(1) Class4_Sub1_Sub8 arg0) {
		return new Class4_Sub1_Sub8_Sub2(arg0.method3885(), arg0.anInt5084);
	}
}
