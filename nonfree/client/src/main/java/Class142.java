import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class142 {

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	public int anInt4368;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
	public int anInt4372;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
	public int anInt4375;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "I")
	public int anInt4377;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "Z")
	public boolean aBoolean293 = true;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	public int anInt4371 = 128;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	public int anInt4374 = -1;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
	private int anInt4370 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V")
	private void method3528(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(23) double local23 = local10;
		@Pc(25) double local25 = local10;
		@Pc(34) double local34 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		if (local10 > local34) {
			local23 = local34;
		}
		@Pc(42) double local42 = 0.0D;
		if (local10 < local34) {
			local25 = local34;
		}
		if (local21 < local23) {
			local23 = local21;
		}
		@Pc(58) double local58 = 0.0D;
		if (local25 < local21) {
			local25 = local21;
		}
		@Pc(70) double local70 = (local23 + local25) / 2.0D;
		if (local25 != local23) {
			if (local70 < 0.5D) {
				local42 = (local25 - local23) / (local23 + local25);
			}
			if (local10 == local25) {
				local58 = (local34 - local21) / (local25 - local23);
			} else if (local25 == local34) {
				local58 = (local21 - local10) / (-local23 + local25) + 2.0D;
			} else if (local21 == local25) {
				local58 = (local10 - local34) / (-local23 + local25) + 4.0D;
			}
			if (local70 >= 0.5D) {
				local42 = (local25 - local23) / (2.0D - local23 - local25);
			}
		}
		this.anInt4372 = (int) (local42 * 256.0D);
		this.anInt4368 = (int) (local70 * 256.0D);
		if (this.anInt4368 < 0) {
			this.anInt4368 = 0;
		} else if (this.anInt4368 > 255) {
			this.anInt4368 = 255;
		}
		if (local70 > 0.5D) {
			this.anInt4377 = (int) ((1.0D - local70) * local42 * 512.0D);
		} else {
			this.anInt4377 = (int) (local42 * local70 * 512.0D);
		}
		local58 /= 6.0D;
		if (this.anInt4377 < 1) {
			this.anInt4377 = 1;
		}
		if (this.anInt4372 < 0) {
			this.anInt4372 = 0;
		} else if (this.anInt4372 > 255) {
			this.anInt4372 = 255;
		}
		this.anInt4375 = (int) ((double) this.anInt4377 * local58);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!p;BI)V")
	private void method3530(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub17 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4370 = arg1.method1835();
			this.method3528(this.anInt4370);
		} else if (arg2 == 2) {
			this.anInt4374 = arg1.method1837();
			if (this.anInt4374 == 65535) {
				this.anInt4374 = -1;
			}
		} else if (arg2 == 3) {
			this.anInt4371 = arg1.method1837();
		} else if (arg2 == 4) {
			this.aBoolean293 = false;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!p;BI)V")
	public void method3532(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1874();
			if (local5 == 0) {
				return;
			}
			this.method3530(arg1, arg0, local5);
		}
	}
}
