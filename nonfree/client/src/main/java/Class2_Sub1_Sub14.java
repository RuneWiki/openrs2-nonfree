import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "Lclient!mf;")
	public final Class7 aClass7_7;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!mf;)V")
	public Class2_Sub1_Sub14(@OriginalArg(0) Class7 arg0) {
		this.aClass7_7 = arg0;
	}
}
