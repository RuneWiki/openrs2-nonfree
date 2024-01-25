import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class14_Sub2_Sub1 extends Class14_Sub2 {

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "Lclient!le;")
	public final Class10_Sub3_Sub4 aClass10_Sub3_Sub4_1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lclient!le;)V")
	public Class14_Sub2_Sub1(@OriginalArg(0) Class10_Sub3_Sub4 arg0) {
		this.aClass10_Sub3_Sub4_1 = arg0;
	}
}
