import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class56 implements Interface24 {

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public final int anInt1197;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V")
	public Class56(@OriginalArg(0) int arg0) {
		this.anInt1197 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)Lclient!rw;")
	@Override
	public Class297 method7306() {
		return Static1.aClass297_1;
	}
}
