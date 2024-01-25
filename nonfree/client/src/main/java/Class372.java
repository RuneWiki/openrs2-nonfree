import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class372 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public int anInt10220;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "[I")
	public final int[] anIntArray723;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "[I")
	public final int[] anIntArray722;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(I)V")
	public Class372(@OriginalArg(0) int arg0) {
		this.anInt10220 = arg0;
		this.anIntArray723 = new int[this.anInt10220];
		this.anIntArray722 = new int[this.anInt10220];
	}
}
