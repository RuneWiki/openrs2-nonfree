import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class268 {

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "[I")
	public static final int[] anIntArray443 = new int[32];

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "B")
	public final byte aByte87;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "Lclient!id;")
	public Interface9 anInterface9_6;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "B")
	public byte aByte88;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "S")
	public final short aShort90;

	static {
		@Pc(7) int local7 = 2;
		for (@Pc(9) int local9 = 0; local9 < 32; local9++) {
			anIntArray443[local9] = local7 - 1;
			local7 += local7;
		}
	}

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!id;III)V")
	public Class268(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aByte87 = (byte) arg2;
		this.anInterface9_6 = arg0;
		this.aByte88 = (byte) arg3;
		this.aShort90 = (short) arg1;
	}
}
