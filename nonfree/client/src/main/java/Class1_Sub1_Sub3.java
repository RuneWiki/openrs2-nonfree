import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!af", name = "M", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!af", name = "W", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!af", name = "X", descriptor = "I")
	private int anInt192 = 0;

	@OriginalMember(owner = "client!af", name = "V", descriptor = "I")
	private int anInt190 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!hc;I)V")
	public void method108(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method544();
			if (local9 == 0) {
				return;
			}
			this.method110(local9, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(IZ)V")
	private void method109(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local30;
		if (local21 > local30) {
			local32 = local21;
		}
		@Pc(40) double local40 = local30;
		if (local32 < local12) {
			local32 = local12;
		}
		if (local21 < local30) {
			local40 = local21;
		}
		if (local40 > local12) {
			local40 = local12;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		@Pc(75) double local75 = (local32 + local40) / 2.0D;
		this.anInt182 = (int) (local75 * 256.0D);
		if (this.anInt182 < 0) {
			this.anInt182 = 0;
		} else if (this.anInt182 > 255) {
			this.anInt182 = 255;
		}
		if (local40 != local32) {
			if (local32 == local30) {
				local60 = (local21 - local12) / (local32 - local40);
			} else if (local21 == local32) {
				local60 = (local12 - local30) / (-local40 + local32) + 2.0D;
			} else if (local32 == local12) {
				local60 = (local30 - local21) / (-local40 + local32) + 4.0D;
			}
			if (local75 < 0.5D) {
				local69 = (local32 - local40) / (local40 + local32);
			}
			if (local75 >= 0.5D) {
				local69 = (local32 - local40) / (2.0D - local32 - local40);
			}
		}
		if (local75 > 0.5D) {
			this.anInt186 = (int) ((1.0D - local75) * 512.0D * local69);
		} else {
			this.anInt186 = (int) (local69 * local75 * 512.0D);
		}
		local60 /= 6.0D;
		this.anInt193 = (int) (local69 * 256.0D);
		if (this.anInt186 < 1) {
			this.anInt186 = 1;
		}
		this.anInt191 = (int) (local60 * (double) this.anInt186);
		if (this.anInt193 < 0) {
			this.anInt193 = 0;
		} else if (this.anInt193 > 255) {
			this.anInt193 = 255;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!hc;ZI)V")
	private void method110(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt192 = arg1.method501();
		} else if (arg0 == 2) {
			this.anInt190 = arg1.method546();
			if (this.anInt190 == 65535) {
				this.anInt190 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(Z)V")
	public void method114() {
		this.method109(this.anInt192);
	}
}
