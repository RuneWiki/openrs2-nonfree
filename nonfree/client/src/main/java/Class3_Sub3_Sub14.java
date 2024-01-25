import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class3_Sub3_Sub14 extends Class3_Sub3 {

	@OriginalMember(owner = "client!kh", name = "y", descriptor = "Lclient!ml;")
	public final Class1_Sub3_Sub4 aClass1_Sub3_Sub4_1;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class3_Sub3_Sub14(@OriginalArg(0) Class1_Sub3_Sub4 arg0) {
		this.aClass1_Sub3_Sub4_1 = arg0;
	}
}
