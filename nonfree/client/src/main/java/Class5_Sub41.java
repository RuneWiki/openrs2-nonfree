import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class5_Sub41 extends Class5 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	public int anInt7600;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	private Class5_Sub41() {
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	public Class5_Sub41(@OriginalArg(0) int arg0) {
		this.anInt7600 = arg0;
	}
}
