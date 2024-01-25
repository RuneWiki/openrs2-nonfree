import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "[B")
	public static final byte[] aByteArray59;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	public final int anInt5040;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	public final int anInt5041;

	static {
		@Pc(3) int local3 = 0;
		aByteArray59 = new byte[32896];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray59[local3++] = (byte) (255.0D / Math.sqrt((double) ((float) (local8 * local8 + local11 * local11 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!ct;Lclient!rc;IIIIIIIII)V")
	public Class9_Sub3(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5040 = arg10;
		this.anInt5041 = arg9;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lclient!wea;")
	@Override
	public Class357 method7127() {
		return Static95.aClass357_2;
	}
}
