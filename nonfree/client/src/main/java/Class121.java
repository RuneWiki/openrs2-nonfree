import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class121 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	public int anInt3851;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "I")
	public int anInt3853;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	public int anInt3854;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	public int anInt3858;

	@OriginalMember(owner = "client!km", name = "b", descriptor = "I")
	public int anInt3852 = -1;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	private int anInt3856 = 0;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "Z")
	public boolean aBoolean332 = true;

	@OriginalMember(owner = "client!km", name = "n", descriptor = "I")
	public int anInt3862 = 128;

	static {
		new Class140("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZI)V")
	private void method3372(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(36) double local36 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local14;
		if (local23 < local14) {
			local38 = local23;
		}
		if (local36 < local38) {
			local38 = local36;
		}
		@Pc(52) double local52 = local14;
		if (local14 < local23) {
			local52 = local23;
		}
		if (local36 > local52) {
			local52 = local36;
		}
		@Pc(66) double local66 = 0.0D;
		@Pc(68) double local68 = 0.0D;
		@Pc(74) double local74 = (local52 + local38) / 2.0D;
		if (local38 != local52) {
			if (local74 < 0.5D) {
				local68 = (local52 - local38) / (local52 + local38);
			}
			if (local52 == local14) {
				local66 = (local23 - local36) / (local52 - local38);
			} else if (local23 == local52) {
				local66 = (local36 - local14) / (-local38 + local52) + 2.0D;
			} else if (local52 == local36) {
				local66 = (local14 - local23) / (-local38 + local52) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local68 = (local52 - local38) / (2.0D - local38 - local52);
			}
		}
		this.anInt3858 = (int) (local74 * 256.0D);
		local66 /= 6.0D;
		this.anInt3854 = (int) (local68 * 256.0D);
		if (local74 > 0.5D) {
			this.anInt3853 = (int) (local68 * 512.0D * (1.0D - local74));
		} else {
			this.anInt3853 = (int) (local68 * 512.0D * local74);
		}
		if (this.anInt3858 < 0) {
			this.anInt3858 = 0;
		} else if (this.anInt3858 > 255) {
			this.anInt3858 = 255;
		}
		if (this.anInt3854 < 0) {
			this.anInt3854 = 0;
		} else if (this.anInt3854 > 255) {
			this.anInt3854 = 255;
		}
		if (this.anInt3853 < 1) {
			this.anInt3853 = 1;
		}
		this.anInt3851 = (int) (local66 * (double) this.anInt3853);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ef;II)V")
	public void method3375(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method3124();
			if (local11 == 0) {
				return;
			}
			this.method3377(arg0, local11, arg1);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!ef;BII)V")
	private void method3377(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt3856 = arg0.method3163();
			this.method3372(this.anInt3856);
		} else if (arg1 == 2) {
			this.anInt3852 = arg0.method3104();
			if (this.anInt3852 == 65535) {
				this.anInt3852 = -1;
				return;
			}
		} else if (arg1 == 3) {
			this.anInt3862 = arg0.method3104();
		} else if (arg1 == 4) {
			this.aBoolean332 = false;
			return;
		}
	}
}
