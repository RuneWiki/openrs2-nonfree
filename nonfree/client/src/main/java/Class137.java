import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class137 {

	@OriginalMember(owner = "client!va", name = "m", descriptor = "[J")
	public static long[] aLongArray36 = new long[256];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "I")
	public int anInt5238;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public int anInt5239;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public int anInt5245;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "I")
	public int anInt5246;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	private int anInt5244 = 0;

	@OriginalMember(owner = "client!va", name = "l", descriptor = "I")
	private int anInt5247 = -1;

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(16) long local16 = (long) local12;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1L) == 1L) {
					local16 = local16 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local16 >>>= 0x1;
				}
			}
			aLongArray36[local12] = local16;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
	private void method3985(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(29) double local29 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local29;
		@Pc(40) double local40 = 0.0D;
		@Pc(42) double local42 = 0.0D;
		if (local29 > local14) {
			local38 = local14;
		}
		if (local38 > local36) {
			local38 = local36;
		}
		@Pc(56) double local56 = local29;
		if (local14 > local29) {
			local56 = local14;
		}
		if (local36 > local56) {
			local56 = local36;
		}
		@Pc(74) double local74 = (local56 + local38) / 2.0D;
		if (local56 != local38) {
			if (local56 == local29) {
				local40 = (local14 - local36) / (local56 - local38);
			} else if (local56 == local14) {
				local40 = (local36 - local29) / (local56 - local38) + 2.0D;
			} else if (local36 == local56) {
				local40 = (local29 - local14) / (-local38 + local56) + 4.0D;
			}
			if (local74 < 0.5D) {
				local42 = (local56 - local38) / (local56 + local38);
			}
			if (local74 >= 0.5D) {
				local42 = (local56 - local38) / (2.0D - local56 - local38);
			}
		}
		this.anInt5246 = (int) (local42 * 256.0D);
		if (this.anInt5246 < 0) {
			this.anInt5246 = 0;
		} else if (this.anInt5246 > 255) {
			this.anInt5246 = 255;
		}
		local40 /= 6.0D;
		this.anInt5238 = (int) (local74 * 256.0D);
		if (local74 > 0.5D) {
			this.anInt5245 = (int) ((1.0D - local74) * 512.0D * local42);
		} else {
			this.anInt5245 = (int) (local74 * local42 * 512.0D);
		}
		if (this.anInt5238 < 0) {
			this.anInt5238 = 0;
		} else if (this.anInt5238 > 255) {
			this.anInt5238 = 255;
		}
		if (this.anInt5245 < 1) {
			this.anInt5245 = 1;
		}
		this.anInt5239 = (int) (local40 * (double) this.anInt5245);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!ql;II)V")
	private void method3986(@OriginalArg(1) Class1_Sub13 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5244 = arg0.method1773();
			this.method3985(this.anInt5244);
		} else if (arg1 == 2) {
			this.anInt5247 = arg0.method1764();
			if (this.anInt5247 == 65535) {
				this.anInt5247 = -1;
			}
		} else if (arg1 == 3) {
			arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!ql;)V")
	public void method3988(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method1772();
			if (local17 == 0) {
				return;
			}
			this.method3986(arg1, local17, arg0);
		}
	}
}
