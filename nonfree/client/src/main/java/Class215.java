import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class215 {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	public int anInt6173;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
	public final int[] anIntArray533;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
	public final int[] anIntArray532;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(I)V")
	public Class215(@OriginalArg(0) int arg0) {
		this.anInt6173 = arg0;
		this.anIntArray533 = new int[this.anInt6173];
		this.anIntArray532 = new int[this.anInt6173];
	}
}
