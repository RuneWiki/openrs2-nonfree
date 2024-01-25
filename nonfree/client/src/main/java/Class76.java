import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public final class Class76 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public int anInt2176;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "[I")
	public final int[] anIntArray143;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "[I")
	public final int[] anIntArray144;

	@OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(I)V")
	public Class76(@OriginalArg(0) int arg0) {
		this.anInt2176 = arg0;
		this.anIntArray143 = new int[this.anInt2176];
		this.anIntArray144 = new int[this.anInt2176];
	}
}
