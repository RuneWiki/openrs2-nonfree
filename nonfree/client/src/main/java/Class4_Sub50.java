import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public final class Class4_Sub50 extends Class4 {

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "Lclient!hfa;")
	public final Class10_Sub1_Sub2_Sub1 aClass10_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lclient!hfa;)V")
	public Class4_Sub50(@OriginalArg(0) Class10_Sub1_Sub2_Sub1 arg0) {
		this.aClass10_Sub1_Sub2_Sub1_1 = arg0;
	}
}
