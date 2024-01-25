import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class282 implements Interface19 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public final int anInt7404;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(I)V")
	public Class282(@OriginalArg(0) int arg0) {
		this.anInt7404 = arg0;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static332.aClass258_14;
	}
}
