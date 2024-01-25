import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class155 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public int anInt4696;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt4706;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt4707;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public int anInt4708;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	public int anInt4702 = -1;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	private int anInt4705 = 0;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Z")
	public boolean aBoolean269 = true;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
	public int anInt4709 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!fb;II)V")
	public void method4008(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method3643();
			if (local17 == 0) {
				return;
			}
			this.method4013(local17, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
	private void method4010(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(31) double local31 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local31 < local14) {
			local40 = local31;
		}
		if (local38 < local40) {
			local40 = local38;
		}
		@Pc(54) double local54 = local14;
		if (local14 < local31) {
			local54 = local31;
		}
		if (local54 < local38) {
			local54 = local38;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local40) / 2.0D;
		if (local54 != local40) {
			if (local76 < 0.5D) {
				local70 = (local54 - local40) / (local54 + local40);
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local40) / (2.0D - local40 - local54);
			}
			if (local14 == local54) {
				local68 = (local31 - local38) / (local54 - local40);
			} else if (local31 == local54) {
				local68 = (local38 - local14) / (-local40 + local54) + 2.0D;
			} else if (local38 == local54) {
				local68 = (local14 - local31) / (-local40 + local54) + 4.0D;
			}
		}
		this.anInt4708 = (int) (local70 * 256.0D);
		this.anInt4707 = (int) (local76 * 256.0D);
		local68 /= 6.0D;
		if (local76 > 0.5D) {
			this.anInt4696 = (int) (local70 * 512.0D * (1.0D - local76));
		} else {
			this.anInt4696 = (int) (local70 * 512.0D * local76);
		}
		if (this.anInt4707 < 0) {
			this.anInt4707 = 0;
		} else if (this.anInt4707 > 255) {
			this.anInt4707 = 255;
		}
		if (this.anInt4708 < 0) {
			this.anInt4708 = 0;
		} else if (this.anInt4708 > 255) {
			this.anInt4708 = 255;
		}
		if (this.anInt4696 < 1) {
			this.anInt4696 = 1;
		}
		this.anInt4706 = (int) ((double) this.anInt4696 * local68);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!fb;B)V")
	private void method4013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4 arg2) {
		if (arg0 == 1) {
			this.anInt4705 = arg2.method3659();
			this.method4010(this.anInt4705);
		} else if (arg0 == 2) {
			this.anInt4702 = arg2.method3649();
			if (this.anInt4702 == 65535) {
				this.anInt4702 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4709 = arg2.method3649();
		} else if (arg0 == 4) {
			this.aBoolean269 = false;
		}
	}
}
