import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class117 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	public int anInt3521;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public int anInt3522;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	public int anInt3526;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	public int anInt3523 = -1;

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "Z")
	public boolean aBoolean279 = true;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
	private int anInt3525 = 0;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "Z")
	public boolean aBoolean280 = true;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
	public int anInt3517 = 512;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!jc;B)V")
	public void method3310(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3030();
			if (local15 == 0) {
				return;
			}
			this.method3313(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZILclient!jc;)V")
	private void method3313(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt3525 = arg1.method2987();
			this.method3314(this.anInt3525);
		} else if (arg0 == 2) {
			this.anInt3523 = arg1.method3018();
			if (this.anInt3523 == 65535) {
				this.anInt3523 = -1;
				return;
			}
		} else if (arg0 == 3) {
			this.anInt3517 = arg1.method3018() << 2;
			return;
		} else if (arg0 == 4) {
			this.aBoolean279 = false;
			return;
		} else if (arg0 == 5) {
			this.aBoolean280 = false;
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	private void method3314(@OriginalArg(1) int arg0) {
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
		@Pc(51) double local51 = local14;
		if (local23 > local14) {
			local51 = local23;
		}
		if (local30 > local51) {
			local51 = local30;
		}
		@Pc(65) double local65 = 0.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(73) double local73 = (local32 + local51) / 2.0D;
		if (local32 != local51) {
			if (local73 < 0.5D) {
				local67 = (local51 - local32) / (local51 + local32);
			}
			if (local14 == local51) {
				local65 = (local23 - local30) / (local51 - local32);
			} else if (local23 == local51) {
				local65 = (local30 - local14) / (local51 - local32) + 2.0D;
			} else if (local30 == local51) {
				local65 = (local14 - local23) / (-local32 + local51) + 4.0D;
			}
			if (local73 >= 0.5D) {
				local67 = (local51 - local32) / (2.0D - local32 - local51);
			}
		}
		this.anInt3522 = (int) (local73 * 256.0D);
		local65 /= 6.0D;
		this.anInt3521 = (int) (local67 * 256.0D);
		if (this.anInt3521 < 0) {
			this.anInt3521 = 0;
		} else if (this.anInt3521 > 255) {
			this.anInt3521 = 255;
		}
		if (local73 > 0.5D) {
			this.anInt3520 = (int) (local67 * (1.0D - local73) * 512.0D);
		} else {
			this.anInt3520 = (int) (local73 * 512.0D * local67);
		}
		if (this.anInt3522 < 0) {
			this.anInt3522 = 0;
		} else if (this.anInt3522 > 255) {
			this.anInt3522 = 255;
		}
		if (this.anInt3520 < 1) {
			this.anInt3520 = 1;
		}
		this.anInt3526 = (int) (local65 * (double) this.anInt3520);
	}
}
