import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class193 {

	@OriginalMember(owner = "client!na", name = "g", descriptor = "[I")
	public static final int[] anIntArray464 = new int[120];

	@OriginalMember(owner = "client!na", name = "b", descriptor = "B")
	public final byte aByte74;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "B")
	public final byte aByte75;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "I")
	public final int anInt5969;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "S")
	public final short aShort71;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "Z")
	public final boolean aBoolean454;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "S")
	public final short aShort72;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "S")
	public final short aShort70;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray464[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aByte74 = (byte) arg8;
		this.aByte75 = (byte) arg7;
		this.anInt5969 = arg0;
		this.aShort71 = (short) arg5;
		this.aBoolean454 = arg9;
		this.aShort72 = (short) arg4;
		this.aShort70 = (short) arg6;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIII)Lclient!na;")
	public Class193 method5404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class193(arg0, arg1, arg3, arg2, this.aShort72, this.aShort71, this.aShort70, this.aByte75, this.aByte74, this.aBoolean454);
	}
}
