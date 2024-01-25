import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public final class Class67 {

	@OriginalMember(owner = "client!dca", name = "l", descriptor = "I")
	public int anInt2257;

	@OriginalMember(owner = "client!dca", name = "g", descriptor = "[I")
	public final int[] anIntArray223;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "[I")
	public final int[] anIntArray222;

	static {
		new Class182("", 73);
	}

	@OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(I)V")
	public Class67(@OriginalArg(0) int arg0) {
		this.anInt2257 = arg0;
		this.anIntArray223 = new int[this.anInt2257];
		this.anIntArray222 = new int[this.anInt2257];
	}
}
