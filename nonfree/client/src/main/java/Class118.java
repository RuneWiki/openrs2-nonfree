import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class118 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	public int anInt3672;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
	public int anInt3677;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	public int anInt3678;

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	public int anInt3684;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	private int anInt3676 = 0;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Z")
	public boolean aBoolean237 = true;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
	public int anInt3682 = -1;

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
	public int anInt3685 = 128;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!pi;B)V")
	private void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub24 arg2) {
		if (arg1 == 1) {
			this.anInt3676 = arg2.method3063();
			this.method2978(this.anInt3676);
		} else if (arg1 == 2) {
			this.anInt3682 = arg2.method3085();
			if (this.anInt3682 == 65535) {
				this.anInt3682 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt3685 = arg2.method3085();
		} else if (arg1 == 4) {
			this.aBoolean237 = false;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!pi;II)V")
	public void method2977(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method3110();
			if (local17 == 0) {
				return;
			}
			this.method2974(arg1, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)V")
	private void method2978(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local14 > local23) {
			local34 = local23;
		}
		if (local34 > local30) {
			local34 = local30;
		}
		@Pc(49) double local49 = 0.0D;
		if (local23 > local14) {
			local32 = local23;
		}
		if (local30 > local32) {
			local32 = local30;
		}
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local32 + local34) / 2.0D;
		this.anInt3672 = (int) (local76 * 256.0D);
		if (this.anInt3672 < 0) {
			this.anInt3672 = 0;
		} else if (this.anInt3672 > 255) {
			this.anInt3672 = 255;
		}
		if (local34 != local32) {
			if (local76 < 0.5D) {
				local70 = (local32 - local34) / (local34 + local32);
			}
			if (local76 >= 0.5D) {
				local70 = (local32 - local34) / ((2.0D - local32) - local34);
			}
			if (local14 == local32) {
				local49 = (local23 - local30) / (-local34 + local32);
			} else if (local32 == local23) {
				local49 = (local30 - local14) / (local32 - local34) + 2.0D;
			} else if (local30 == local32) {
				local49 = (local14 - local23) / (-local34 + local32) + 4.0D;
			}
		}
		if (local76 > 0.5D) {
			this.anInt3678 = (int) (local70 * (1.0D - local76) * 512.0D);
		} else {
			this.anInt3678 = (int) (local76 * local70 * 512.0D);
		}
		this.anInt3684 = (int) (local70 * 256.0D);
		local49 /= 6.0D;
		if (this.anInt3678 < 1) {
			this.anInt3678 = 1;
		}
		this.anInt3677 = (int) ((double) this.anInt3678 * local49);
		if (this.anInt3684 < 0) {
			this.anInt3684 = 0;
		} else if (this.anInt3684 > 255) {
			this.anInt3684 = 255;
		}
	}
}
