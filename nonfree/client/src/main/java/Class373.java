import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class373 {

	@OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
	public int anInt10157;

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
	public int anInt10158;

	@OriginalMember(owner = "client!wl", name = "m", descriptor = "I")
	public int anInt10161;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "I")
	public int anInt10163;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Z")
	public boolean aBoolean750 = true;

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "Z")
	public boolean aBoolean752 = true;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	private int anInt10156 = 0;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	public int anInt10155 = -1;

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
	public int anInt10162 = 512;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ud;II)V")
	private void method8490(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10156 = arg0.method6870();
			this.method8491(this.anInt10156);
		} else if (arg1 == 2) {
			this.anInt10155 = arg0.method6884();
			if (this.anInt10155 == 65535) {
				this.anInt10155 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt10162 = arg0.method6884() << 2;
		} else if (arg1 == 4) {
			this.aBoolean750 = false;
		} else if (arg1 == 5) {
			this.aBoolean752 = false;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
	private void method8491(@OriginalArg(1) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local44 < local28) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(60) double local60 = 0.0D;
		@Pc(66) double local66 = (local44 + local30) / 2.0D;
		if (local30 != local44) {
			if (local66 < 0.5D) {
				local60 = (local44 - local30) / (local30 + local44);
			}
			if (local66 >= 0.5D) {
				local60 = (local44 - local30) / ((2.0D - local44) - local30);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (local44 - local30) + 4.0D;
			}
		}
		local58 /= 6.0D;
		this.anInt10158 = (int) (local60 * 256.0D);
		this.anInt10161 = (int) (local66 * 256.0D);
		if (this.anInt10161 < 0) {
			this.anInt10161 = 0;
		} else if (this.anInt10161 > 255) {
			this.anInt10161 = 255;
		}
		if (this.anInt10158 < 0) {
			this.anInt10158 = 0;
		} else if (this.anInt10158 > 255) {
			this.anInt10158 = 255;
		}
		if (local66 > 0.5D) {
			this.anInt10163 = (int) (local60 * 512.0D * (1.0D - local66));
		} else {
			this.anInt10163 = (int) (local60 * local66 * 512.0D);
		}
		if (this.anInt10163 < 1) {
			this.anInt10163 = 1;
		}
		this.anInt10157 = (int) ((double) this.anInt10163 * local58);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!ud;B)V")
	public void method8492(@OriginalArg(0) Class2_Sub34 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6904();
			if (local5 == 0) {
				return;
			}
			this.method8490(arg0, local5);
		}
	}
}
