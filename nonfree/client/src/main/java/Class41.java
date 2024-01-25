import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class41 {

	@OriginalMember(owner = "client!d", name = "c", descriptor = "I")
	public int anInt969;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "[I")
	public final int[] anIntArray110;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
	public final int[] anIntArray111;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		this.anInt969 = arg0;
		this.anIntArray110 = new int[this.anInt969];
		this.anIntArray111 = new int[this.anInt969];
	}
}
