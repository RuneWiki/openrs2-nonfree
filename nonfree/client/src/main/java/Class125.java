import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class125 {

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
	public int anInt3753;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
	public final int[] anIntArray378;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "[I")
	public final int[] anIntArray379;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
	public Class125(@OriginalArg(0) int arg0) {
		this.anInt3753 = arg0;
		this.anIntArray378 = new int[this.anInt3753];
		this.anIntArray379 = new int[this.anInt3753];
	}
}
