import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public final class Class187_Sub1 extends Class187 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!vaa;)Lclient!vaa;")
	@Override
	public Class3_Sub7_Sub6 method4633(@OriginalArg(1) Class3_Sub7_Sub6 arg0) {
		return new Class3_Sub7_Sub6_Sub2(arg0.method7415(), arg0.anInt9446);
	}
}
