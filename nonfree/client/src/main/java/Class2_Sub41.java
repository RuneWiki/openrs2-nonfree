import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class2_Sub41 extends Class2 {

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
	public int anInt9197;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	private Class2_Sub41() {
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(I)V")
	public Class2_Sub41(@OriginalArg(0) int arg0) {
		this.anInt9197 = arg0;
	}
}
