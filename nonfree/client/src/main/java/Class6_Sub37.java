import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class6_Sub37 extends Class6 {

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "I")
	public int anInt7833;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "()V")
	private Class6_Sub37() {
	}

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(I)V")
	public Class6_Sub37(@OriginalArg(0) int arg0) {
		this.anInt7833 = arg0;
	}
}
