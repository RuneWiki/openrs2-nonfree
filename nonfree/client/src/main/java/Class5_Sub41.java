import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class5_Sub41 extends Class5 {

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public int anInt7411;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	private Class5_Sub41() {
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(I)V")
	public Class5_Sub41(@OriginalArg(0) int arg0) {
		this.anInt7411 = arg0;
	}
}
