import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class344 implements Interface23 {

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
	public final int anInt9908;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(I)V")
	public Class344(@OriginalArg(0) int arg0) {
		this.anInt9908 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static134.aClass307_4;
	}
}
