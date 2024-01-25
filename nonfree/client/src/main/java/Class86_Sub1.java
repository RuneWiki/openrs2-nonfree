import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!qo;I)Lclient!qo;")
	@Override
	public Class3_Sub5_Sub1 method1776(@OriginalArg(0) Class3_Sub5_Sub1 arg0) {
		return new Class3_Sub5_Sub1_Sub2(arg0.anInterface24_3, arg0.method9015(), arg0.anInt10932);
	}
}
