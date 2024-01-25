import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class100 {

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	public int anInt2592;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "[I")
	public final int[] anIntArray176;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "[I")
	public final int[] anIntArray177;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(I)V")
	public Class100(@OriginalArg(0) int arg0) {
		this.anInt2592 = arg0;
		this.anIntArray176 = new int[this.anInt2592];
		this.anIntArray177 = new int[this.anInt2592];
	}
}
