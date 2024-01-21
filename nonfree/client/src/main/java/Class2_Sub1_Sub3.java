import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
	public int anInt269;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
	public int anInt270;

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
	public int anInt273;

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
	private int anInt271 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!na;I)V")
	private void method230(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub9 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt271 = arg1.method628();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!na;II)V")
	public void method231(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method640();
			if (local14 == 0) {
				return;
			}
			this.method230(arg1, arg0, local14);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	private void method234(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		if (local30 > local14) {
			local32 = local14;
		}
		@Pc(40) double local40 = local30;
		if (local14 > local30) {
			local40 = local14;
		}
		@Pc(48) double local48 = 0.0D;
		if (local32 > local21) {
			local32 = local21;
		}
		if (local40 < local21) {
			local40 = local21;
		}
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local40 + local32) / 2.0D;
		this.anInt270 = (int) (local68 * 256.0D);
		if (local32 != local40) {
			if (local30 == local40) {
				local62 = (local14 - local21) / (local40 - local32);
			} else if (local40 == local14) {
				local62 = (local21 - local30) / (-local32 + local40) + 2.0D;
			} else if (local21 == local40) {
				local62 = (local30 - local14) / (local40 - local32) + 4.0D;
			}
			if (local68 < 0.5D) {
				local48 = (local40 - local32) / (local32 + local40);
			}
			if (local68 >= 0.5D) {
				local48 = (local40 - local32) / ((2.0D - local40) - local32);
			}
		}
		if (local68 > 0.5D) {
			this.anInt269 = (int) ((1.0D - local68) * 512.0D * local48);
		} else {
			this.anInt269 = (int) (local68 * local48 * 512.0D);
		}
		if (this.anInt270 < 0) {
			this.anInt270 = 0;
		} else if (this.anInt270 > 255) {
			this.anInt270 = 255;
		}
		local62 /= 6.0D;
		this.anInt273 = (int) (local48 * 256.0D);
		if (this.anInt273 < 0) {
			this.anInt273 = 0;
		} else if (this.anInt273 > 255) {
			this.anInt273 = 255;
		}
		if (this.anInt269 < 1) {
			this.anInt269 = 1;
		}
		this.anInt275 = (int) (local62 * (double) this.anInt269);
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(B)V")
	public void method236() {
		this.method234(this.anInt271);
	}
}
