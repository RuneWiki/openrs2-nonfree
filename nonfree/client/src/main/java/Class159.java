import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class159 {

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
	public int anInt4731;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public int anInt4734;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
	public int anInt4735;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
	public int anInt4737;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public int anInt4730 = 512;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "Z")
	public boolean aBoolean414 = true;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Z")
	public boolean aBoolean415 = true;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
	private int anInt4733 = 0;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public int anInt4732 = -1;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	private void method3962(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt4735 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		this.anInt4737 = (int) (local62 * 256.0D);
		if (this.anInt4737 < 0) {
			this.anInt4737 = 0;
		} else if (this.anInt4737 > 255) {
			this.anInt4737 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt4731 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt4731 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt4735 < 0) {
			this.anInt4735 = 0;
		} else if (this.anInt4735 > 255) {
			this.anInt4735 = 255;
		}
		if (this.anInt4731 < 1) {
			this.anInt4731 = 1;
		}
		this.anInt4734 = (int) ((double) this.anInt4731 * local60);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!rba;IZ)V")
	private void method3963(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4733 = arg0.method5307();
			this.method3962(this.anInt4733);
		} else if (arg1 == 2) {
			this.anInt4732 = arg0.method5272();
			if (this.anInt4732 == 65535) {
				this.anInt4732 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt4730 = arg0.method5272() << 2;
			return;
		} else {
			if (arg1 == 4) {
				this.aBoolean415 = false;
			} else if (arg1 == 5) {
				this.aBoolean414 = false;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZLclient!rba;)V")
	public void method3965(@OriginalArg(1) Class3_Sub28 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5322(-9);
			if (local12 == 0) {
				return;
			}
			this.method3963(arg0, local12);
		}
	}
}
