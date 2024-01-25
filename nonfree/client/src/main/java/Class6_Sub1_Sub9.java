import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class6_Sub1_Sub9 extends Class6_Sub1 {

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "Lclient!mq;")
	public final Class3_Sub3_Sub4 aClass3_Sub3_Sub4_1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!mq;)V")
	public Class6_Sub1_Sub9(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		this.aClass3_Sub3_Sub4_1 = arg0;
	}
}
