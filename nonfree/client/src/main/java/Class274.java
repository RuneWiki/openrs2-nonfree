import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class274 {

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	public int anInt6888;

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
	public int anInt6891;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
	public int anInt6894;

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
	public int anInt6897;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Z")
	public boolean aBoolean561 = true;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
	public int anInt6886 = 512;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
	public int anInt6885 = -1;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
	private int anInt6887 = 0;

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Z")
	public boolean aBoolean562 = true;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method5650(@OriginalArg(0) Class2_Sub7 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method4464();
			if (local16 == 0) {
				return;
			}
			this.method5654(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!gk;)V")
	private void method5654(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt6887 = arg1.method4503();
			this.method5655(this.anInt6887);
		} else if (arg0 == 2) {
			this.anInt6885 = arg1.method4518();
			if (this.anInt6885 == 65535) {
				this.anInt6885 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt6886 = arg1.method4518() << 2;
		} else if (arg0 == 4) {
			this.aBoolean562 = false;
		} else if (arg0 == 5) {
			this.aBoolean561 = false;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V")
	private void method5655(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(82) double local82 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local82 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local82 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (-local32 + local46);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		local60 /= 6.0D;
		this.anInt6894 = (int) (local62 * 256.0D);
		this.anInt6897 = (int) (local82 * 256.0D);
		if (local82 > 0.5D) {
			this.anInt6891 = (int) (local62 * 512.0D * (1.0D - local82));
		} else {
			this.anInt6891 = (int) (local62 * local82 * 512.0D);
		}
		if (this.anInt6894 < 0) {
			this.anInt6894 = 0;
		} else if (this.anInt6894 > 255) {
			this.anInt6894 = 255;
		}
		if (this.anInt6897 < 0) {
			this.anInt6897 = 0;
		} else if (this.anInt6897 > 255) {
			this.anInt6897 = 255;
		}
		if (this.anInt6891 < 1) {
			this.anInt6891 = 1;
		}
		this.anInt6888 = (int) ((double) this.anInt6891 * local60);
	}
}
