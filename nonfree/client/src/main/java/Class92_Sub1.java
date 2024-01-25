import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!cm;I)Lclient!cm;")
	@Override
	public Class2_Sub7_Sub1 method3774(@OriginalArg(0) Class2_Sub7_Sub1 arg0) {
		return new Class2_Sub7_Sub1_Sub1(arg0.method2352(), arg0.anInt2931);
	}
}
