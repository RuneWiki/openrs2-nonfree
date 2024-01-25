import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public final class Class294 {

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
	public int anInt8833;

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "[I")
	public final int[] anIntArray654;

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "[I")
	public final int[] anIntArray655;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V")
	public Class294(@OriginalArg(0) int arg0) {
		this.anInt8833 = arg0;
		this.anIntArray654 = new int[this.anInt8833];
		this.anIntArray655 = new int[this.anInt8833];
	}
}
