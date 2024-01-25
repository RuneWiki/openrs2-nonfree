import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class9 {

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
	public int anInt224;

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
	public int anInt228;

	@OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
	public int anInt230;

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
	public int anInt231;

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
	private int anInt225 = 0;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Z")
	public boolean aBoolean29 = true;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	public int anInt235 = -1;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
	public int anInt238 = 128;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIILclient!eb;)V")
	private void method293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt225 = arg2.method3137();
			this.method295(this.anInt225);
		} else if (arg1 == 2) {
			this.anInt235 = arg2.method3115();
			if (this.anInt235 == 65535) {
				this.anInt235 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt238 = arg2.method3115();
		} else if (arg1 == 4) {
			this.aBoolean29 = false;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)V")
	private void method295(@OriginalArg(0) int arg0) {
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
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt230 = (int) (local68 * 256.0D);
		this.anInt231 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt231 < 0) {
			this.anInt231 = 0;
		} else if (this.anInt231 > 255) {
			this.anInt231 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt228 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt228 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt230 < 0) {
			this.anInt230 = 0;
		} else if (this.anInt230 > 255) {
			this.anInt230 = 255;
		}
		if (this.anInt228 < 1) {
			this.anInt228 = 1;
		}
		this.anInt224 = (int) ((double) this.anInt228 * local60);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILclient!eb;)V")
	public void method296(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method3141();
			if (local13 == 0) {
				return;
			}
			this.method293(arg0, local13, arg1);
		}
	}
}
