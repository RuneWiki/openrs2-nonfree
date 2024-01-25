import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class11 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	public int anInt177;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public int anInt178;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Z")
	public boolean aBoolean10 = true;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	public int anInt173 = -1;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	public int anInt181 = 128;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	private int anInt185 = 0;

	static {
		new Class40("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!co;II)V")
	private void method319(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt185 = arg0.method4182();
			this.method324(this.anInt185);
		} else if (arg1 == 2) {
			this.anInt173 = arg0.method4227();
			if (this.anInt173 == 65535) {
				this.anInt173 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt181 = arg0.method4227() << 0;
		} else if (arg1 == 4) {
			this.aBoolean10 = false;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ILclient!co;)V")
	public void method322(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4220();
			if (local9 == 0) {
				return;
			}
			this.method319(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	private void method324(@OriginalArg(0) int arg0) {
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
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		this.anInt180 = (int) (local68 * 256.0D);
		this.anInt178 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt178 < 0) {
			this.anInt178 = 0;
		} else if (this.anInt178 > 255) {
			this.anInt178 = 255;
		}
		if (this.anInt180 < 0) {
			this.anInt180 = 0;
		} else if (this.anInt180 > 255) {
			this.anInt180 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt177 = (int) (local62 * (1.0D - local68) * 512.0D);
		} else {
			this.anInt177 = (int) (local62 * local68 * 512.0D);
		}
		if (this.anInt177 < 1) {
			this.anInt177 = 1;
		}
		this.anInt184 = (int) (local60 * (double) this.anInt177);
	}
}
