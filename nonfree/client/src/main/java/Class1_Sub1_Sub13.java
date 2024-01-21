import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!r", name = "W", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "client!r", name = "X", descriptor = "I")
	public int anInt2438;

	@OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
	public int anInt2441;

	@OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
	public int anInt2447;

	@OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
	private int anInt2439 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILclient!mc;B)V")
	public void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method1190();
			if (local5 == 0) {
				return;
			}
			this.method1727(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public void method1726() {
		this.method1728(this.anInt2439);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLclient!mc;I)V")
	private void method1727(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub12 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2439 = arg1.method1215();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	private void method1728(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		if (local14 > local23) {
			local25 = local23;
		}
		@Pc(38) double local38 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local14;
		if (local38 < local25) {
			local25 = local38;
		}
		if (local23 > local14) {
			local40 = local23;
		}
		if (local38 > local40) {
			local40 = local38;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local25 + local40) / 2.0D;
		if (local40 != local25) {
			if (local40 == local14) {
				local62 = (local23 - local38) / (local40 - local25);
			} else if (local40 == local23) {
				local62 = (local38 - local14) / (-local25 + local40) + 2.0D;
			} else if (local38 == local40) {
				local62 = (local14 - local23) / (-local25 + local40) + 4.0D;
			}
			if (local68 < 0.5D) {
				local60 = (local40 - local25) / (local25 + local40);
			}
			if (local68 >= 0.5D) {
				local60 = (local40 - local25) / (2.0D - local40 - local25);
			}
		}
		this.anInt2438 = (int) (local60 * 256.0D);
		if (local68 > 0.5D) {
			this.anInt2447 = (int) ((1.0D - local68) * local60 * 512.0D);
		} else {
			this.anInt2447 = (int) (local60 * 512.0D * local68);
		}
		this.anInt2441 = (int) (local68 * 256.0D);
		local62 /= 6.0D;
		if (this.anInt2438 < 0) {
			this.anInt2438 = 0;
		} else if (this.anInt2438 > 255) {
			this.anInt2438 = 255;
		}
		if (this.anInt2447 < 1) {
			this.anInt2447 = 1;
		}
		this.anInt2437 = (int) (local62 * (double) this.anInt2447);
		if (this.anInt2441 < 0) {
			this.anInt2441 = 0;
		} else if (this.anInt2441 > 255) {
			this.anInt2441 = 255;
			return;
		}
	}
}
