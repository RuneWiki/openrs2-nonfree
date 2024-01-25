import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class144 {

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "I")
	public int anInt4097;

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "[I")
	public final int[] anIntArray290;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "[I")
	public final int[] anIntArray289;

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(I)V")
	public Class144(@OriginalArg(0) int arg0) {
		this.anInt4097 = arg0;
		this.anIntArray290 = new int[this.anInt4097];
		this.anIntArray289 = new int[this.anInt4097];
	}
}
