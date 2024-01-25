import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public final class Class356 {

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	public int anInt10029;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
	public final int[] anIntArray607;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "[I")
	public final int[] anIntArray608;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
	public Class356(@OriginalArg(0) int arg0) {
		this.anInt10029 = arg0;
		this.anIntArray607 = new int[this.anInt10029];
		this.anIntArray608 = new int[this.anInt10029];
	}
}
