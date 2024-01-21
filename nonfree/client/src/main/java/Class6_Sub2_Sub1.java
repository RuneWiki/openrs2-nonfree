import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
	public int anInt261;

	@OriginalMember(owner = "client!bb", name = "sb", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!bb", name = "Ab", descriptor = "I")
	public int anInt272;

	@OriginalMember(owner = "client!bb", name = "Hb", descriptor = "I")
	public int anInt276;

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
	private int anInt256 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
	private void method236(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(25) double local25 = local14;
		if (local23 < local14) {
			local25 = local23;
		}
		@Pc(33) double local33 = local14;
		if (local23 > local14) {
			local33 = local23;
		}
		@Pc(46) double local46 = (double) (arg0 & 0xFF) / 256.0D;
		if (local33 < local46) {
			local33 = local46;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		if (local25 > local46) {
			local25 = local46;
		}
		@Pc(74) double local74 = (local33 + local25) / 2.0D;
		if (local25 != local33) {
			if (local74 < 0.5D) {
				local62 = (local33 - local25) / (local33 + local25);
			}
			if (local33 == local14) {
				local60 = (local23 - local46) / (-local25 + local33);
			} else if (local33 == local23) {
				local60 = (local46 - local14) / (local33 - local25) + 2.0D;
			} else if (local33 == local46) {
				local60 = (local14 - local23) / (local33 - local25) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local62 = (local33 - local25) / (2.0D - local33 - local25);
			}
		}
		local60 /= 6.0D;
		this.anInt261 = (int) (local74 * 256.0D);
		this.anInt276 = (int) (local62 * 256.0D);
		if (this.anInt276 < 0) {
			this.anInt276 = 0;
		} else if (this.anInt276 > 255) {
			this.anInt276 = 255;
		}
		if (this.anInt261 < 0) {
			this.anInt261 = 0;
		} else if (this.anInt261 > 255) {
			this.anInt261 = 255;
		}
		if (local74 > 0.5D) {
			this.anInt272 = (int) ((1.0D - local74) * local62 * 512.0D);
		} else {
			this.anInt272 = (int) (local62 * 512.0D * local74);
		}
		if (this.anInt272 < 1) {
			this.anInt272 = 1;
		}
		this.anInt265 = (int) ((double) this.anInt272 * local60);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!b;)V")
	public void method237(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method1495();
			if (local13 == 0) {
				return;
			}
			this.method240(local13, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!b;Z)V")
	private void method240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub1 arg2) {
		if (arg0 == 1) {
			this.anInt256 = arg2.method1483();
		}
	}

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "(I)V")
	public void method243() {
		this.method236(this.anInt256);
	}
}
