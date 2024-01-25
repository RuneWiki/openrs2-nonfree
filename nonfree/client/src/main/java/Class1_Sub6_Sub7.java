import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class1_Sub6_Sub7 extends Class1_Sub6 {

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "Lclient!hd;")
	public final Class25_Sub1_Sub3 aClass25_Sub1_Sub3_1;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class1_Sub6_Sub7(@OriginalArg(0) Class25_Sub1_Sub3 arg0) {
		this.aClass25_Sub1_Sub3_1 = arg0;
	}
}
