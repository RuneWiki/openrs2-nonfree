import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class121 {

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public int anInt3940;

	@OriginalMember(owner = "client!is", name = "c", descriptor = "[I")
	public final int[] anIntArray379;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "[I")
	public final int[] anIntArray378;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(I)V")
	public Class121(@OriginalArg(0) int arg0) {
		this.anInt3940 = arg0;
		this.anIntArray379 = new int[this.anInt3940];
		this.anIntArray378 = new int[this.anInt3940];
	}
}
