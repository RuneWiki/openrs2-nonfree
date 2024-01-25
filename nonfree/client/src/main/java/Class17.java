import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class17 {

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	public int anInt459;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "[I")
	public final int[] anIntArray15;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "[I")
	public final int[] anIntArray16;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(I)V")
	public Class17(@OriginalArg(0) int arg0) {
		this.anInt459 = arg0;
		this.anIntArray15 = new int[this.anInt459];
		this.anIntArray16 = new int[this.anInt459];
	}
}
