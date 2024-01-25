import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class313 {

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
	public int anInt8902;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "[I")
	public final int[] anIntArray621;

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "[I")
	public final int[] anIntArray622;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(I)V")
	public Class313(@OriginalArg(0) int arg0) {
		this.anInt8902 = arg0;
		this.anIntArray621 = new int[this.anInt8902];
		this.anIntArray622 = new int[this.anInt8902];
	}
}
