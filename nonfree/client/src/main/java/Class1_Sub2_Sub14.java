import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class1_Sub2_Sub14 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kj", name = "N", descriptor = "Lclient!qh;")
	public final Class5_Sub4 aClass5_Sub4_1;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!qh;)V")
	public Class1_Sub2_Sub14(@OriginalArg(0) Class5_Sub4 arg0) {
		this.aClass5_Sub4_1 = arg0;
	}
}
