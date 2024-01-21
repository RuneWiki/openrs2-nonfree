import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class10_Sub1_Sub13 extends Class10_Sub1 {

	@OriginalMember(owner = "client!q", name = "M", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "client!q", name = "R", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!q", name = "kb", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
	private int anInt2134 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!tc;ZI)V")
	public void method1232(@OriginalArg(0) Class10_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1111();
			if (local5 == 0) {
				return;
			}
			this.method1239(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
	private void method1236(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		@Pc(27) double local27 = 0.0D;
		@Pc(29) double local29 = local14;
		if (local23 < local14) {
			local29 = local23;
		}
		@Pc(42) double local42 = (double) (arg0 & 0xFF) / 256.0D;
		if (local23 > local14) {
			local25 = local23;
		}
		if (local42 < local29) {
			local29 = local42;
		}
		if (local42 > local25) {
			local25 = local42;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local29 + local25) / 2.0D;
		this.anInt2113 = (int) (local68 * 256.0D);
		if (local29 != local25) {
			if (local25 == local14) {
				local27 = (local23 - local42) / (local25 - local29);
			} else if (local23 == local25) {
				local27 = (local42 - local14) / (-local29 + local25) + 2.0D;
			} else if (local42 == local25) {
				local27 = (local14 - local23) / (-local29 + local25) + 4.0D;
			}
			if (local68 < 0.5D) {
				local62 = (local25 - local29) / (local29 + local25);
			}
			if (local68 >= 0.5D) {
				local62 = (local25 - local29) / (2.0D - local29 - local25);
			}
		}
		if (this.anInt2113 < 0) {
			this.anInt2113 = 0;
		} else if (this.anInt2113 > 255) {
			this.anInt2113 = 255;
		}
		this.anInt2116 = (int) (local62 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt2133 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt2133 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt2116 < 0) {
			this.anInt2116 = 0;
		} else if (this.anInt2116 > 255) {
			this.anInt2116 = 255;
		}
		if (this.anInt2133 < 1) {
			this.anInt2133 = 1;
		}
		local27 /= 6.0D;
		this.anInt2117 = (int) (local27 * (double) this.anInt2133);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!tc;I)V")
	private void method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10_Sub10 arg2) {
		if (arg1 == 1) {
			this.anInt2134 = arg2.method1138();
		}
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(B)V")
	public void method1242() {
		this.method1236(this.anInt2134);
	}
}
