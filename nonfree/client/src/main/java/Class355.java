import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class355 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "[I")
	public static final int[] anIntArray591 = new int[4096];

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public int anInt9289;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	public final int[] anIntArray592;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	public final int[] anIntArray593;

	static {
		for (@Pc(7) int local7 = 0; local7 < 4096; local7++) {
			anIntArray591[local7] = Static226.method3534(local7);
		}
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
	public Class355(@OriginalArg(0) int arg0) {
		this.anInt9289 = arg0;
		this.anIntArray592 = new int[this.anInt9289];
		this.anIntArray593 = new int[this.anInt9289];
	}
}
