import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!de", name = "o", descriptor = "[J")
	public static long[] aLongArray3 = new long[256];

	@OriginalMember(owner = "client!de", name = "u", descriptor = "I")
	public int anInt1113;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	public int anInt1114;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "I")
	private int anInt1107 = -32768;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(12) long local12 = (long) local6;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray3[local6] = local12;
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		return this.anInt1107;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
		@Pc(13) Class36_Sub2 local13 = Static140.method2222(this.anInt1114).method95(0, -1, null, null, 0, this.anInt1113);
		if (local13 != null) {
			local13.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt1107 = local13.method4175();
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
