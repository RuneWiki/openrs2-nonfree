import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class4_Sub5_Sub15 extends Class4_Sub5 {

	@OriginalMember(owner = "client!pl", name = "u", descriptor = "Lclient!kh;")
	public final Class1_Sub4_Sub2_Sub2 aClass1_Sub4_Sub2_Sub2_1;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!kh;)V")
	public Class4_Sub5_Sub15(@OriginalArg(0) Class1_Sub4_Sub2_Sub2 arg0) {
		this.aClass1_Sub4_Sub2_Sub2_1 = arg0;
	}
}
