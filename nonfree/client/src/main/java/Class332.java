import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class332 {

	@OriginalMember(owner = "client!so", name = "g", descriptor = "[I")
	public static final int[] anIntArray594 = new int[32];

	@OriginalMember(owner = "client!so", name = "h", descriptor = "S")
	public final short aShort116;

	@OriginalMember(owner = "client!so", name = "k", descriptor = "Lclient!aj;")
	public Interface2 anInterface2_6;

	@OriginalMember(owner = "client!so", name = "j", descriptor = "B")
	public final byte aByte136;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "B")
	public byte aByte137;

	static {
		@Pc(66) int local66 = 2;
		for (@Pc(68) int local68 = 0; local68 < 32; local68++) {
			anIntArray594[local68] = local66 - 1;
			local66 += local66;
		}
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!aj;III)V")
	public Class332(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort116 = (short) arg1;
		this.anInterface2_6 = arg0;
		this.aByte136 = (byte) arg2;
		this.aByte137 = (byte) arg3;
	}
}
