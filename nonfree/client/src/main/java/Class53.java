import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class53 {

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
	public int anInt1356;

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "[I")
	public final int[] anIntArray153;

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "[I")
	public final int[] anIntArray154;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(I)V")
	public Class53(@OriginalArg(0) int arg0) {
		this.anInt1356 = arg0;
		this.anIntArray153 = new int[this.anInt1356];
		this.anIntArray154 = new int[this.anInt1356];
	}
}
