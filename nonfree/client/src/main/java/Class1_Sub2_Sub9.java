import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "Lclient!wo;")
	public final Class10_Sub1_Sub5 aClass10_Sub1_Sub5_1;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class1_Sub2_Sub9(@OriginalArg(0) Class10_Sub1_Sub5 arg0) {
		this.aClass10_Sub1_Sub5_1 = arg0;
	}
}
