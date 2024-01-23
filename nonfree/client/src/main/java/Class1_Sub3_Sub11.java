import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "[J")
	public static long[] aLongArray3 = new long[256];

	@OriginalMember(owner = "client!e", name = "V", descriptor = "I")
	private int anInt978 = 1;

	@OriginalMember(owner = "client!e", name = "U", descriptor = "I")
	private int anInt977 = 0;

	@OriginalMember(owner = "client!e", name = "ab", descriptor = "I")
	private int anInt980 = 0;

	static {
		for (@Pc(276) int local276 = 0; local276 < 256; local276++) {
			@Pc(280) long local280 = (long) local276;
			for (@Pc(282) int local282 = 0; local282 < 8; local282++) {
				if ((local280 & 0x1L) == 1L) {
					local280 = local280 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local280 >>>= 0x1;
				}
			}
			aLongArray3[local276] = local280;
		}
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(24) int local24 = Static23.anIntArray47[arg0];
			@Pc(30) int local30 = local24 - 2048 >> 1;
			for (@Pc(32) int local32 = 0; local32 < Static76.anInt1531; local32++) {
				@Pc(38) int local38 = Static106.anIntArray202[local32];
				@Pc(44) int local44 = local38 - 2048 >> 1;
				@Pc(55) int local55;
				if (this.anInt980 == 0) {
					local55 = this.anInt978 * (local38 - local24);
				} else {
					@Pc(67) int local67 = local30 * local30 + local44 * local44 >> 12;
					local55 = (int) (Math.sqrt((double) ((float) local67 / 4096.0F)) * 4096.0D);
					local55 = (int) ((double) (this.anInt978 * local55) * 3.141592653589793D);
				}
				local55 -= local55 & 0xFFFFF000;
				if (this.anInt977 == 0) {
					local55 = Static149.anIntArray324[local55 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt977 == 2) {
					local55 -= 2048;
					if (local55 < 0) {
						local55 = -local55;
					}
					local55 = 2048 - local55 << 1;
				}
				local16[local32] = local55;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt980 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt977 = arg1.method2142();
		} else if (arg0 == 3) {
			this.anInt978 = arg1.method2142();
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		Static191.method3137();
	}
}
