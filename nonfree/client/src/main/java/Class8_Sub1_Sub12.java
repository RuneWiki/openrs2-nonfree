import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class8_Sub1_Sub12 extends Class8_Sub1 {

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
	public int anInt1555;

	@OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
	public int anInt1559;

	@OriginalMember(owner = "client!j", name = "kb", descriptor = "I")
	public int anInt1560;

	@OriginalMember(owner = "client!j", name = "pb", descriptor = "I")
	public int anInt1563;

	@OriginalMember(owner = "client!j", name = "V", descriptor = "I")
	private int anInt1551 = 0;

	@OriginalMember(owner = "client!j", name = "fb", descriptor = "I")
	private int anInt1556 = -1;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBLclient!wd;)V")
	private void method925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub20 arg2) {
		if (arg0 == 1) {
			this.anInt1551 = arg2.method1885();
		} else if (arg0 == 2) {
			this.anInt1556 = arg2.method1839();
			if (this.anInt1556 == 65535) {
				this.anInt1556 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!wd;I)V")
	public void method926(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub20 arg1) {
		while (true) {
			@Pc(3) int local3 = arg1.method1872();
			if (local3 == 0) {
				return;
			}
			this.method925(local3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public void method927() {
		this.method930(this.anInt1551);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
	private void method930(@OriginalArg(1) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local8;
		@Pc(32) double local32 = local8;
		if (local8 < local21) {
			local32 = local21;
		}
		if (local32 < local28) {
			local32 = local28;
		}
		if (local8 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local32 + local30) / 2.0D;
		if (local30 != local32) {
			if (local66 < 0.5D) {
				local60 = (local32 - local30) / (local30 + local32);
			}
			if (local32 == local8) {
				local58 = (local21 - local28) / (local32 - local30);
			} else if (local21 == local32) {
				local58 = (local28 - local8) / (-local30 + local32) + 2.0D;
			} else if (local32 == local28) {
				local58 = (local8 - local21) / (-local30 + local32) + 4.0D;
			}
			if (local66 >= 0.5D) {
				local60 = (local32 - local30) / (2.0D - local32 - local30);
			}
		}
		this.anInt1563 = (int) (local60 * 256.0D);
		local58 /= 6.0D;
		this.anInt1555 = (int) (local66 * 256.0D);
		if (this.anInt1555 < 0) {
			this.anInt1555 = 0;
		} else if (this.anInt1555 > 255) {
			this.anInt1555 = 255;
		}
		if (this.anInt1563 < 0) {
			this.anInt1563 = 0;
		} else if (this.anInt1563 > 255) {
			this.anInt1563 = 255;
		}
		if (local66 > 0.5D) {
			this.anInt1560 = (int) (local60 * 512.0D * (1.0D - local66));
		} else {
			this.anInt1560 = (int) (local60 * 512.0D * local66);
		}
		if (this.anInt1560 < 1) {
			this.anInt1560 = 1;
		}
		this.anInt1559 = (int) (local58 * (double) this.anInt1560);
	}
}
