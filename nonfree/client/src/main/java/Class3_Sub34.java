import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Lclient!oh;")
	public final Class41_Sub2_Sub1_Sub4_Sub1 aClass41_Sub2_Sub1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!oh;)V")
	public Class3_Sub34(@OriginalArg(0) Class41_Sub2_Sub1_Sub4_Sub1 arg0) {
		this.aClass41_Sub2_Sub1_Sub4_Sub1_2 = arg0;
	}
}
