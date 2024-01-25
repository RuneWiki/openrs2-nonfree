import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class209 {

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "[I")
	public static final int[] anIntArray348 = new int[120];

	@OriginalMember(owner = "client!mba", name = "f", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "Lclient!nu;")
	public Interface16 anInterface16_6;

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "B")
	public final byte aByte97;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 120; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) ((double) local15 + Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D);
			local8 += local28;
			anIntArray348[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!nu;III)V")
	public Class209(@OriginalArg(0) Interface16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort81 = (short) arg1;
		this.aByte96 = (byte) arg3;
		this.anInterface16_6 = arg0;
		this.aByte97 = (byte) arg2;
	}
}
