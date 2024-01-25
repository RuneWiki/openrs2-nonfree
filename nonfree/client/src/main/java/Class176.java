import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class176 {

	@OriginalMember(owner = "client!li", name = "c", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	public int anInt5004;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	public int anInt5007;

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	public int anInt5008;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	public int anInt4999 = -1;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	private int anInt5001 = 0;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "Z")
	public boolean aBoolean381 = true;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	public int anInt5005 = 128;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!ps;)V")
	public void method4354(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5170();
			if (local11 == 0) {
				return;
			}
			this.method4357(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	private void method4356(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		this.anInt4998 = (int) (local68 * 256.0D);
		this.anInt5008 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt4998 < 0) {
			this.anInt4998 = 0;
		} else if (this.anInt4998 > 255) {
			this.anInt4998 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt5004 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt5004 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt5008 < 0) {
			this.anInt5008 = 0;
		} else if (this.anInt5008 > 255) {
			this.anInt5008 = 255;
		}
		if (this.anInt5004 < 1) {
			this.anInt5004 = 1;
		}
		this.anInt5007 = (int) (local60 * (double) this.anInt5004);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!ps;I)V")
	private void method4357(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5001 = arg0.method5210();
			this.method4356(this.anInt5001);
		} else if (arg1 == 2) {
			this.anInt4999 = arg0.method5229();
			if (this.anInt4999 == 65535) {
				this.anInt4999 = -1;
				return;
			}
			return;
		} else if (arg1 == 3) {
			this.anInt5005 = arg0.method5229() << 0;
			return;
		} else if (arg1 == 4) {
			this.aBoolean381 = false;
			return;
		}
	}
}
