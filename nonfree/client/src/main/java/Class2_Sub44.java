import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	public int anInt6631;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	private Class2_Sub44() {
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class2_Sub44(@OriginalArg(0) int arg0) {
		this.anInt6631 = arg0;
	}
}
