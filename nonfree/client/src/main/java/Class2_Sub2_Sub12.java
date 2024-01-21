import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ng", name = "bb", descriptor = "[J")
	public static long[] aLongArray14 = new long[256];

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
	public int anInt2339;

	@OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
	public int anInt2342;

	@OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
	public int anInt2343;

	@OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
	public int anInt2346;

	@OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
	private int anInt2336 = 0;

	@OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
	private int anInt2351 = -1;

	static {
		for (@Pc(26) int local26 = 0; local26 < 256; local26++) {
			@Pc(30) long local30 = (long) local26;
			for (@Pc(32) int local32 = 0; local32 < 8; local32++) {
				if ((local30 & 0x1L) == 1L) {
					local30 = local30 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local30 >>>= 0x1;
				}
			}
			aLongArray14[local26] = local30;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBILclient!ja;)V")
	private void method1914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub13 arg2) {
		if (arg0 == 1) {
			this.anInt2336 = arg2.method2942();
			this.method1917(this.anInt2336);
		} else if (arg0 == 2) {
			this.anInt2351 = arg2.method2933();
			if (this.anInt2351 == 65535) {
				this.anInt2351 = -1;
			}
		} else if (arg0 == 3) {
			arg2.method2933();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ja;BI)V")
	public void method1915(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method2962();
			if (local9 == 0) {
				return;
			}
			this.method1914(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)V")
	private void method1917(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		@Pc(34) double local34 = local30;
		@Pc(36) double local36 = 0.0D;
		if (local30 < local21) {
			local32 = local21;
		}
		@Pc(44) double local44 = 0.0D;
		if (local32 < local12) {
			local32 = local12;
		}
		if (local21 < local30) {
			local34 = local21;
		}
		if (local34 > local12) {
			local34 = local12;
		}
		@Pc(68) double local68 = (local32 + local34) / 2.0D;
		this.anInt2342 = (int) (local68 * 256.0D);
		if (local32 != local34) {
			if (local68 < 0.5D) {
				local44 = (local32 - local34) / (local32 + local34);
			}
			if (local32 == local30) {
				local36 = (local21 - local12) / (local32 - local34);
			} else if (local32 == local21) {
				local36 = (local12 - local30) / (local32 - local34) + 2.0D;
			} else if (local32 == local12) {
				local36 = (local30 - local21) / (-local34 + local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local44 = (local32 - local34) / (2.0D - local32 - local34);
			}
		}
		local36 /= 6.0D;
		if (this.anInt2342 < 0) {
			this.anInt2342 = 0;
		} else if (this.anInt2342 > 255) {
			this.anInt2342 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt2339 = (int) (local44 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt2339 = (int) (local68 * local44 * 512.0D);
		}
		this.anInt2346 = (int) (local44 * 256.0D);
		if (this.anInt2339 < 1) {
			this.anInt2339 = 1;
		}
		if (this.anInt2346 < 0) {
			this.anInt2346 = 0;
		} else if (this.anInt2346 > 255) {
			this.anInt2346 = 255;
		}
		this.anInt2343 = (int) (local36 * (double) this.anInt2339);
	}
}
