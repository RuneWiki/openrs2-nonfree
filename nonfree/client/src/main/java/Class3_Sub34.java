import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class3_Sub34 extends Class3 {

	@OriginalMember(owner = "client!or", name = "q", descriptor = "I")
	public int anInt5289;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	private Class3_Sub34() {
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(I)V")
	public Class3_Sub34(@OriginalArg(0) int arg0) {
		this.anInt5289 = arg0;
	}
}
