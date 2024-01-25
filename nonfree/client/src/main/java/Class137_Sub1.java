import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class137_Sub1 extends Class137 {

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
	private Class137_Sub1() {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLclient!ps;)Lclient!ps;")
	@Override
	public Class3_Sub7_Sub16 method3541(@OriginalArg(1) Class3_Sub7_Sub16 arg0) {
		return new Class3_Sub7_Sub16_Sub1(arg0.anInterface17_3, arg0.method6647(), arg0.anInt7701);
	}
}
