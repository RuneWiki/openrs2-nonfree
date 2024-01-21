import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class2_Sub1_Sub13 extends Class2_Sub1 {

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
	public int anInt2567;

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
	public int anInt2570;

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
	public int anInt2571;

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
	public int anInt2574;

	@OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
	public int anInt2576;

	@OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
	public int anInt2580;

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "Z")
	public boolean aBoolean210 = true;

	@OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
	public int anInt2577 = 0;

	@OriginalMember(owner = "client!sf", name = "jb", descriptor = "I")
	public int anInt2578 = -1;

	@OriginalMember(owner = "client!sf", name = "kb", descriptor = "I")
	public int anInt2579 = -1;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(B)V")
	public void method1853() {
		if (this.anInt2579 != -1) {
			this.method1856(this.anInt2579);
			this.anInt2571 = this.anInt2576;
			this.anInt2567 = this.anInt2574;
			this.anInt2580 = this.anInt2570;
		}
		this.method1856(this.anInt2577);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!na;)V")
	public void method1855(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub9 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method640();
			if (local13 == 0) {
				return;
			}
			this.method1857(arg0, arg1, local13);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
	private void method1856(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		if (local23 < local10) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local10;
		@Pc(48) double local48 = 0.0D;
		if (local10 < local23) {
			local46 = local23;
		}
		@Pc(56) double local56 = 0.0D;
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		this.anInt2576 = (int) (local68 * 256.0D);
		if (local46 != local32) {
			if (local10 == local46) {
				local48 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local48 = (local30 - local10) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local48 = (local10 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 < 0.5D) {
				local56 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local56 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		if (this.anInt2576 < 0) {
			this.anInt2576 = 0;
		} else if (this.anInt2576 > 255) {
			this.anInt2576 = 255;
		}
		this.anInt2570 = (int) (local56 * 256.0D);
		local48 /= 6.0D;
		if (this.anInt2570 < 0) {
			this.anInt2570 = 0;
		} else if (this.anInt2570 > 255) {
			this.anInt2570 = 255;
		}
		this.anInt2574 = (int) (local48 * 256.0D);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!na;ZI)V")
	private void method1857(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub9 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2577 = arg1.method628();
		} else if (arg2 == 2) {
			this.anInt2578 = arg1.method640();
		} else if (arg2 == 5) {
			this.aBoolean210 = false;
		} else if (arg2 == 7) {
			this.anInt2579 = arg1.method628();
		}
	}
}
