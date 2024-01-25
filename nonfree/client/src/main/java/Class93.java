import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public final class Class93 {

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
	public int anInt2185;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "[I")
	public final int[] anIntArray275;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "[I")
	public final int[] anIntArray276;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V")
	public Class93(@OriginalArg(0) int arg0) {
		this.anInt2185 = arg0;
		this.anIntArray275 = new int[this.anInt2185];
		this.anIntArray276 = new int[this.anInt2185];
	}
}
