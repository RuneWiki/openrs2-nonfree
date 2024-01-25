import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class80 implements Interface22 {

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
	public final int anInt2180;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(I)V")
	public Class80(@OriginalArg(0) int arg0) {
		this.anInt2180 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Lclient!ib;")
	@Override
	public Class140 method7197() {
		return Static364.aClass140_5;
	}
}
