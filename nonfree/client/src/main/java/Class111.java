import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class111 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public int anInt3126;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
	public int anInt3127;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
	public int anInt3129;

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
	public int anInt3132;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	private int anInt3131 = 0;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Z")
	public boolean aBoolean269 = true;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	public int anInt3128 = -1;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
	public int anInt3139 = 128;

	static {
		new Class256("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)V")
	private void method2509(@OriginalArg(0) int arg0) {
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
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(74) double local74 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local74 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local74 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		this.anInt3127 = (int) (local74 * 256.0D);
		local60 /= 6.0D;
		this.anInt3132 = (int) (local62 * 256.0D);
		if (local74 > 0.5D) {
			this.anInt3129 = (int) (local62 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt3129 = (int) (local62 * local74 * 512.0D);
		}
		if (this.anInt3127 < 0) {
			this.anInt3127 = 0;
		} else if (this.anInt3127 > 255) {
			this.anInt3127 = 255;
		}
		if (this.anInt3132 < 0) {
			this.anInt3132 = 0;
		} else if (this.anInt3132 > 255) {
			this.anInt3132 = 255;
		}
		if (this.anInt3129 < 1) {
			this.anInt3129 = 1;
		}
		this.anInt3126 = (int) (local60 * (double) this.anInt3129);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!md;)V")
	private void method2514(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt3131 = arg1.method3748();
			this.method2509(this.anInt3131);
		} else if (arg0 == 2) {
			this.anInt3128 = arg1.method3711();
			if (this.anInt3128 == 65535) {
				this.anInt3128 = -1;
				return;
			}
		} else if (arg0 == 3) {
			this.anInt3139 = arg1.method3711() << 0;
		} else if (arg0 == 4) {
			this.aBoolean269 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!md;)V")
	public void method2517(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method3737();
			if (local15 == 0) {
				return;
			}
			this.method2514(local15, arg0);
		}
	}
}
