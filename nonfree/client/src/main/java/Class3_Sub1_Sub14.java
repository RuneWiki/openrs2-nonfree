import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!va", name = "L", descriptor = "I")
	public int anInt2637;

	@OriginalMember(owner = "client!va", name = "R", descriptor = "I")
	public int anInt2640;

	@OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
	public int anInt2646;

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!va", name = "V", descriptor = "I")
	private int anInt2643 = 0;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V")
	public void method1831() {
		this.method1833(this.anInt2643);
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(II)V")
	private void method1833(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		@Pc(27) double local27 = local14;
		if (local23 > local14) {
			local27 = local23;
		}
		@Pc(35) double local35 = 0.0D;
		if (local23 < local14) {
			local25 = local23;
		}
		@Pc(47) double local47 = 0.0D;
		@Pc(54) double local54 = (double) (arg0 & 0xFF) / 256.0D;
		if (local27 < local54) {
			local27 = local54;
		}
		if (local54 < local25) {
			local25 = local54;
		}
		@Pc(72) double local72 = (local25 + local27) / 2.0D;
		this.anInt2646 = (int) (local72 * 256.0D);
		if (local25 != local27) {
			if (local72 < 0.5D) {
				local35 = (local27 - local25) / (local27 + local25);
			}
			if (local27 == local14) {
				local47 = (local23 - local54) / (-local25 + local27);
			} else if (local27 == local23) {
				local47 = (local54 - local14) / (-local25 + local27) + 2.0D;
			} else if (local27 == local54) {
				local47 = (local14 - local23) / (-local25 + local27) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local35 = (local27 - local25) / (2.0D - local25 - local27);
			}
		}
		if (local72 > 0.5D) {
			this.anInt2640 = (int) (local35 * 512.0D * (1.0D - local72));
		} else {
			this.anInt2640 = (int) (local72 * local35 * 512.0D);
		}
		if (this.anInt2646 < 0) {
			this.anInt2646 = 0;
		} else if (this.anInt2646 > 255) {
			this.anInt2646 = 255;
		}
		this.anInt2647 = (int) (local35 * 256.0D);
		local47 /= 6.0D;
		if (this.anInt2640 < 1) {
			this.anInt2640 = 1;
		}
		this.anInt2637 = (int) (local47 * (double) this.anInt2640);
		if (this.anInt2647 < 0) {
			this.anInt2647 = 0;
		} else if (this.anInt2647 > 255) {
			this.anInt2647 = 255;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILclient!ob;)V")
	private void method1835(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7 arg2) {
		if (arg0 == 1) {
			this.anInt2643 = arg2.method639();
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IILclient!ob;)V")
	public void method1836(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method647();
			if (local5 == 0) {
				return;
			}
			this.method1835(local5, arg0, arg1);
		}
	}
}
