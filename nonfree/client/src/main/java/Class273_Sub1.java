import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class273_Sub1 extends Class273 {

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	private Class273_Sub1() {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!mia;)Lclient!mia;")
	@Override
	public Class3_Sub7_Sub8 method6270(@OriginalArg(1) Class3_Sub7_Sub8 arg0) {
		return new Class3_Sub7_Sub8_Sub2(arg0.method2600(), arg0.anInt2840);
	}
}
