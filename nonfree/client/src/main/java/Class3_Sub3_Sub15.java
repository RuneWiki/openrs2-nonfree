import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public final class Class3_Sub3_Sub15 extends Class3_Sub3 {

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "Lclient!bl;")
	public final Class1_Sub2_Sub1 aClass1_Sub2_Sub1_1;

	static {
		new Class174(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class3_Sub3_Sub15(@OriginalArg(0) Class1_Sub2_Sub1 arg0) {
		this.aClass1_Sub2_Sub1_1 = arg0;
	}
}
