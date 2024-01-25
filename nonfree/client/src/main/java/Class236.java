import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public final class Class236 {

	@OriginalMember(owner = "client!oca", name = "h", descriptor = "I")
	public int anInt6600;

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "[I")
	public final int[] anIntArray441;

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "[I")
	public final int[] anIntArray443;

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(I)V")
	public Class236(@OriginalArg(0) int arg0) {
		this.anInt6600 = arg0;
		this.anIntArray441 = new int[this.anInt6600];
		this.anIntArray443 = new int[this.anInt6600];
	}
}
