import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class288 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
	public int anInt7989;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "[I")
	public final int[] anIntArray530;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "[I")
	public final int[] anIntArray528;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(I)V")
	public Class288(@OriginalArg(0) int arg0) {
		this.anInt7989 = arg0;
		this.anIntArray530 = new int[this.anInt7989];
		this.anIntArray528 = new int[this.anInt7989];
	}
}
