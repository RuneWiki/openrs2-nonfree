import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class135 {

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public int anInt3818;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public int anInt3820;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	public int anInt3824;

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	public int anInt3827;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public int anInt3821 = 128;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	public int anInt3822 = -1;

	@OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
	public boolean aBoolean233 = true;

	@OriginalMember(owner = "client!km", name = "o", descriptor = "I")
	private int anInt3828 = 0;

	static {
		new Class55("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)V")
	private void method3053(@OriginalArg(1) int arg0) {
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
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		this.anInt3824 = (int) (local62 * 256.0D);
		this.anInt3827 = (int) (local68 * 256.0D);
		if (this.anInt3824 < 0) {
			this.anInt3824 = 0;
		} else if (this.anInt3824 > 255) {
			this.anInt3824 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt3820 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt3820 = (int) (local68 * 512.0D * local62);
		}
		if (this.anInt3827 < 0) {
			this.anInt3827 = 0;
		} else if (this.anInt3827 > 255) {
			this.anInt3827 = 255;
		}
		if (this.anInt3820 < 1) {
			this.anInt3820 = 1;
		}
		this.anInt3818 = (int) (local60 * (double) this.anInt3820);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZLclient!gk;)V")
	public void method3056(@OriginalArg(1) Class7_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3981();
			if (local13 == 0) {
				return;
			}
			this.method3057(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!gk;I)V")
	private void method3057(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt3828 = arg1.method3975();
			this.method3053(this.anInt3828);
		} else if (arg0 == 2) {
			this.anInt3822 = arg1.method3943();
			if (this.anInt3822 == 65535) {
				this.anInt3822 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt3821 = arg1.method3943() << 0;
		} else if (arg0 == 4) {
			this.aBoolean233 = false;
		}
	}
}
