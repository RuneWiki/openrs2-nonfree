import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public final class Class79 {

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "[I")
	public final int[] anIntArray95;

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "[I")
	public final int[] anIntArray94;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(I)V")
	public Class79(@OriginalArg(0) int arg0) {
		this.anInt1866 = arg0;
		this.anIntArray95 = new int[this.anInt1866];
		this.anIntArray94 = new int[this.anInt1866];
	}
}
