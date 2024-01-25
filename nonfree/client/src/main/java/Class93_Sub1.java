import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILclient!pd;)Lclient!pd;")
	@Override
	public Class1_Sub1_Sub3 method6142(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		return new Class1_Sub1_Sub3_Sub1(arg0.method7496(), arg0.anInt8919);
	}
}
