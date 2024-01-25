import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class6_Sub44 extends Class6 {

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	public int anInt7027;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	private Class6_Sub44() {
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V")
	public Class6_Sub44(@OriginalArg(0) int arg0) {
		this.anInt7027 = arg0;
	}
}
