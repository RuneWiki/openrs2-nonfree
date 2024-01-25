import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class160 {

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
	public int anInt4277;

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
	public int anInt4278;

	@OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
	public int anInt4281;

	@OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
	public int anInt4287;

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "Z")
	public boolean aBoolean342 = true;

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
	public int anInt4276 = -1;

	@OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
	public int anInt4285 = 128;

	@OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
	private int anInt4286 = 0;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILclient!ti;)V")
	private void method3550(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt4286 = arg1.method4496();
			this.method3552(this.anInt4286);
		} else if (arg0 == 2) {
			this.anInt4276 = arg1.method4498();
			if (this.anInt4276 == 65535) {
				this.anInt4276 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt4285 = arg1.method4498() << 0;
		} else if (arg0 == 4) {
			this.aBoolean342 = false;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
	private void method3552(@OriginalArg(0) int arg0) {
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
		@Pc(64) double local64 = 0.0D;
		@Pc(66) double local66 = 0.0D;
		@Pc(72) double local72 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local72 < 0.5D) {
				local66 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local64 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local64 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local64 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local72 >= 0.5D) {
				local66 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		this.anInt4281 = (int) (local72 * 256.0D);
		local64 /= 6.0D;
		this.anInt4277 = (int) (local66 * 256.0D);
		if (local72 > 0.5D) {
			this.anInt4278 = (int) ((1.0D - local72) * local66 * 512.0D);
		} else {
			this.anInt4278 = (int) (local72 * local66 * 512.0D);
		}
		if (this.anInt4281 < 0) {
			this.anInt4281 = 0;
		} else if (this.anInt4281 > 255) {
			this.anInt4281 = 255;
		}
		if (this.anInt4277 < 0) {
			this.anInt4277 = 0;
		} else if (this.anInt4277 > 255) {
			this.anInt4277 = 255;
		}
		if (this.anInt4278 < 1) {
			this.anInt4278 = 1;
		}
		this.anInt4287 = (int) (local64 * (double) this.anInt4278);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ti;I)V")
	public void method3553(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4548();
			if (local9 == 0) {
				return;
			}
			this.method3550(local9, arg0);
		}
	}
}
