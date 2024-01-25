import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class202 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public int anInt5488;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
	public final int[] anIntArray366;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
	public final int[] anIntArray365;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V")
	public Class202(@OriginalArg(0) int arg0) {
		this.anInt5488 = arg0;
		this.anIntArray366 = new int[this.anInt5488];
		this.anIntArray365 = new int[this.anInt5488];
	}
}
