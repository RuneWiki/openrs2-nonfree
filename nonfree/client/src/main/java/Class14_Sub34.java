import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class14_Sub34 extends Class14 {

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	public int anInt6039;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	private Class14_Sub34() {
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(I)V")
	public Class14_Sub34(@OriginalArg(0) int arg0) {
		this.anInt6039 = arg0;
	}
}
