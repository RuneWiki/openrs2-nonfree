import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public final class Class142 {

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
	public int anInt4249;

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "[I")
	public final int[] anIntArray335;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "[I")
	public final int[] anIntArray334;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	public Class142(@OriginalArg(0) int arg0) {
		this.anInt4249 = arg0;
		this.anIntArray335 = new int[this.anInt4249];
		this.anIntArray334 = new int[this.anInt4249];
	}
}
