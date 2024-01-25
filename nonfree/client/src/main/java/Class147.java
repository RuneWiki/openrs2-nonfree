import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class147 {

	@OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
	public int anInt3619;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
	public int anInt3622;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
	public int anInt3626;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
	public int anInt3628;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
	public int anInt3613 = 128;

	@OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
	private int anInt3621 = 0;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
	public boolean aBoolean262 = true;

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public int anInt3617 = -1;

	static {
		new Class57("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!rp;I)V")
	public void method3167(@OriginalArg(0) Class3_Sub5 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2739();
			if (local9 == 0) {
				return;
			}
			this.method3171(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)V")
	private void method3168(@OriginalArg(0) int arg0) {
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
		if (local46 < local30) {
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
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		this.anInt3619 = (int) (local62 * 256.0D);
		this.anInt3628 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt3628 < 0) {
			this.anInt3628 = 0;
		} else if (this.anInt3628 > 255) {
			this.anInt3628 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt3626 = (int) (local62 * 512.0D * (1.0D - local68));
		} else {
			this.anInt3626 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt3619 < 0) {
			this.anInt3619 = 0;
		} else if (this.anInt3619 > 255) {
			this.anInt3619 = 255;
		}
		if (this.anInt3626 < 1) {
			this.anInt3626 = 1;
		}
		this.anInt3622 = (int) (local60 * (double) this.anInt3626);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLclient!rp;)V")
	private void method3171(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub5 arg1) {
		if (arg0 == 1) {
			this.anInt3621 = arg1.method2786();
			this.method3168(this.anInt3621);
		} else if (arg0 == 2) {
			this.anInt3617 = arg1.method2767();
			if (this.anInt3617 != 65535) {
				return;
			}
			this.anInt3617 = -1;
		} else if (arg0 == 3) {
			this.anInt3613 = arg1.method2767();
			return;
		} else if (arg0 == 4) {
			this.aBoolean262 = false;
			return;
		}
	}
}
