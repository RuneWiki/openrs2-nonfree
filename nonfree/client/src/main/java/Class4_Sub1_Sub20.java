import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public final class Class4_Sub1_Sub20 extends Class4_Sub1 {

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "Lclient!kj;")
	public final Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!kj;)V")
	public Class4_Sub1_Sub20(@OriginalArg(0) Class2_Sub2_Sub4 arg0) {
		this.aClass2_Sub2_Sub4_1 = arg0;
	}
}
