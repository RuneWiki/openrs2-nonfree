import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ee", name = "L", descriptor = "I")
	public int anInt709;

	@OriginalMember(owner = "client!ee", name = "N", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!ee", name = "db", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!ee", name = "M", descriptor = "I")
	private int anInt710 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
	private void method506(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		if (local23 < local14) {
			local25 = local23;
		}
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = 0.0D;
		@Pc(42) double local42 = local14;
		@Pc(44) double local44 = 0.0D;
		if (local23 > local14) {
			local42 = local23;
		}
		if (local38 > local42) {
			local42 = local38;
		}
		if (local38 < local25) {
			local25 = local38;
		}
		@Pc(68) double local68 = (local42 + local25) / 2.0D;
		this.anInt709 = (int) (local68 * 256.0D);
		if (this.anInt709 < 0) {
			this.anInt709 = 0;
		} else if (this.anInt709 > 255) {
			this.anInt709 = 255;
		}
		if (local25 != local42) {
			if (local68 < 0.5D) {
				local40 = (local42 - local25) / (local25 + local42);
			}
			if (local42 == local14) {
				local44 = (local23 - local38) / (-local25 + local42);
			} else if (local42 == local23) {
				local44 = (local38 - local14) / (-local25 + local42) + 2.0D;
			} else if (local38 == local42) {
				local44 = (local14 - local23) / (-local25 + local42) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local40 = (local42 - local25) / (2.0D - local42 - local25);
			}
		}
		if (local68 > 0.5D) {
			this.anInt719 = (int) ((1.0D - local68) * local40 * 512.0D);
		} else {
			this.anInt719 = (int) (local68 * local40 * 512.0D);
		}
		this.anInt711 = (int) (local40 * 256.0D);
		if (this.anInt711 < 0) {
			this.anInt711 = 0;
		} else if (this.anInt711 > 255) {
			this.anInt711 = 255;
		}
		local44 /= 6.0D;
		if (this.anInt719 < 1) {
			this.anInt719 = 1;
		}
		this.anInt718 = (int) (local44 * (double) this.anInt719);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZILclient!jd;)V")
	public void method509(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		while (true) {
			@Pc(10) int local10 = arg1.method719();
			if (local10 == 0) {
				return;
			}
			this.method512(arg0, arg1, local10);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public void method510() {
		this.method506(this.anInt710);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!jd;I)V")
	private void method512(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt710 = arg1.method704();
		}
	}
}
