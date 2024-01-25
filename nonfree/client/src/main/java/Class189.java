import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class189 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	public int anInt5571;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	public int anInt5574;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public int anInt5577;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
	public int anInt5580;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "Z")
	public boolean aBoolean426 = true;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
	private int anInt5572 = 0;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	public int anInt5576 = -1;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	public int anInt5583 = 128;

	static {
		new Class106("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
	private void method5076(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
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
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		this.anInt5571 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		this.anInt5580 = (int) (local62 * 256.0D);
		if (this.anInt5571 < 0) {
			this.anInt5571 = 0;
		} else if (this.anInt5571 > 255) {
			this.anInt5571 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt5574 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt5574 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt5580 < 0) {
			this.anInt5580 = 0;
		} else if (this.anInt5580 > 255) {
			this.anInt5580 = 255;
		}
		if (this.anInt5574 < 1) {
			this.anInt5574 = 1;
		}
		this.anInt5577 = (int) ((double) this.anInt5574 * local60);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!at;I)V")
	public void method5077(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		while (true) {
			@Pc(10) int local10 = arg1.method2132();
			if (local10 == 0) {
				return;
			}
			this.method5078(arg0, local10, arg1);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!at;Z)V")
	private void method5078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt5572 = arg2.method2119();
			this.method5076(this.anInt5572);
		} else if (arg1 == 2) {
			this.anInt5576 = arg2.method2161();
			if (this.anInt5576 == 65535) {
				this.anInt5576 = -1;
				return;
			}
			return;
		} else if (arg1 == 3) {
			this.anInt5583 = arg2.method2161();
			return;
		} else if (arg1 == 4) {
			this.aBoolean426 = false;
			return;
		}
	}
}
