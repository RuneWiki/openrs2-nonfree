import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class4_Sub36 extends Class4 {

	@OriginalMember(owner = "client!so", name = "q", descriptor = "I")
	public int anInt5967;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	private Class4_Sub36() {
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(I)V")
	public Class4_Sub36(@OriginalArg(0) int arg0) {
		this.anInt5967 = arg0;
	}
}
