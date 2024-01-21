import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!s", name = "J", descriptor = "[I")
	public static int[] anIntArray379 = new int[256];

	@OriginalMember(owner = "client!s", name = "K", descriptor = "S")
	public short aShort36 = -32768;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray379[local8] = local11;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIJ)V")
	public void method3063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class1_Sub1_Sub4_Sub1 local7 = this.method3066();
		if (local7 != null) {
			local7.method3063(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.aShort36 = local7.aShort36;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)Lclient!je;")
	protected Class1_Sub1_Sub4_Sub1 method3066() {
		return null;
	}
}
