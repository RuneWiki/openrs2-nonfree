import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public final class Class4_Sub45 extends Class4 {

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "Lclient!vk;")
	public final Class3_Sub1_Sub2_Sub2_Sub2 aClass3_Sub1_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lclient!vk;)V")
	public Class4_Sub45(@OriginalArg(0) Class3_Sub1_Sub2_Sub2_Sub2 arg0) {
		this.aClass3_Sub1_Sub2_Sub2_Sub2_2 = arg0;
	}
}
