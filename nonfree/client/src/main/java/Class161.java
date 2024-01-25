import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class161 {

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public int anInt3983;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public int anInt3986;

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	public int anInt3987;

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
	public int anInt3989;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
	public int anInt3991 = -1;

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
	private int anInt3985 = 0;

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
	public int anInt3993 = 128;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "Z")
	public boolean aBoolean263 = true;

	static {
		new Class231("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLclient!hw;)V")
	private void method3222(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt3985 = arg1.method6145();
			this.method3226(this.anInt3985);
		} else if (arg0 == 2) {
			this.anInt3991 = arg1.method6148();
			if (this.anInt3991 == 65535) {
				this.anInt3991 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt3993 = arg1.method6148() << 0;
		} else if (arg0 == 4) {
			this.aBoolean263 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!hw;Z)V")
	public void method3223(@OriginalArg(0) Class2_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6138();
			if (local11 == 0) {
				return;
			}
			this.method3222(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
	private void method3226(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt3983 = (int) (local68 * 256.0D);
		this.anInt3987 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt3983 < 0) {
			this.anInt3983 = 0;
		} else if (this.anInt3983 > 255) {
			this.anInt3983 = 255;
		}
		if (this.anInt3987 < 0) {
			this.anInt3987 = 0;
		} else if (this.anInt3987 > 255) {
			this.anInt3987 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt3986 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt3986 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt3986 < 1) {
			this.anInt3986 = 1;
		}
		this.anInt3989 = (int) ((double) this.anInt3986 * local60);
	}
}
