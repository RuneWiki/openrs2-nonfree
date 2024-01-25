import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public final class Class250_Sub1 extends Class250 {

	@OriginalMember(owner = "client!nja", name = "<init>", descriptor = "()V")
	private Class250_Sub1() {
	}

	@OriginalMember(owner = "client!nja", name = "a", descriptor = "(Lclient!js;B)Lclient!js;")
	@Override
	public Class5_Sub5_Sub8 method5815(@OriginalArg(0) Class5_Sub5_Sub8 arg0) {
		return new Class5_Sub5_Sub8_Sub2(arg0.method4379(), arg0.anInt5137);
	}
}
