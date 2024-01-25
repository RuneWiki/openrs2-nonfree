import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	private Class154_Sub1() {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!ku;)Lclient!ku;")
	@Override
	public Class3_Sub4_Sub4 method5762(@OriginalArg(1) Class3_Sub4_Sub4 arg0) {
		return new Class3_Sub4_Sub4_Sub2(arg0.method2341(), arg0.anInt2637);
	}
}
