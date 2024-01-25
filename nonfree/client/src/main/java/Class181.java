import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class181 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public int anInt5368;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public int anInt5369;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public int anInt5371;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public int anInt5379;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Z")
	public boolean aBoolean371 = true;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public int anInt5370 = -1;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	private int anInt5381 = 0;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public int anInt5380 = 128;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ec;III)V")
	private void method4883(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5381 = arg0.method3996();
			this.method4884(this.anInt5381);
		} else if (arg2 == 2) {
			this.anInt5370 = arg0.method4021();
			if (this.anInt5370 == 65535) {
				this.anInt5370 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt5380 = arg0.method4021();
		} else if (arg2 == 4) {
			this.aBoolean371 = false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	private void method4884(@OriginalArg(1) int arg0) {
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
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local72 < 0.5D) {
				local66 = (local46 - local32) / (local32 + local46);
			}
			if (local72 >= 0.5D) {
				local66 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local46 == local14) {
				local64 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local64 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local64 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		this.anInt5379 = (int) (local66 * 256.0D);
		local64 /= 6.0D;
		this.anInt5371 = (int) (local72 * 256.0D);
		if (local72 > 0.5D) {
			this.anInt5368 = (int) (local66 * 512.0D * (1.0D - local72));
		} else {
			this.anInt5368 = (int) (local72 * local66 * 512.0D);
		}
		if (this.anInt5371 < 0) {
			this.anInt5371 = 0;
		} else if (this.anInt5371 > 255) {
			this.anInt5371 = 255;
		}
		if (this.anInt5379 < 0) {
			this.anInt5379 = 0;
		} else if (this.anInt5379 > 255) {
			this.anInt5379 = 255;
		}
		if (this.anInt5368 < 1) {
			this.anInt5368 = 1;
		}
		this.anInt5369 = (int) (local64 * (double) this.anInt5368);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ec;I)V")
	public void method4886(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method3972();
			if (local15 == 0) {
				return;
			}
			this.method4883(arg0, arg1, local15);
		}
	}
}
