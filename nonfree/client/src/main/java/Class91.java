import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class91 {

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	public int anInt2356;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	public int anInt2357;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
	public int anInt2358;

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public int anInt2362;

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "Z")
	public boolean aBoolean264 = true;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
	public int anInt2361 = 128;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
	public int anInt2363 = -1;

	@OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
	private int anInt2367 = 0;

	static {
		new Class119("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method2029(@OriginalArg(0) Class1_Sub28 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5337();
			if (local5 == 0) {
				return;
			}
			this.method2030(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!ug;II)V")
	private void method2030(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2367 = arg0.method5345();
			this.method2032(this.anInt2367);
		} else if (arg1 == 2) {
			this.anInt2363 = arg0.method5335();
			if (this.anInt2363 == 65535) {
				this.anInt2363 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt2361 = arg0.method5335() << 0;
		} else if (arg1 == 4) {
			this.aBoolean264 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V")
	private void method2032(@OriginalArg(1) int arg0) {
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
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
		}
		this.anInt2358 = (int) (local62 * 256.0D);
		this.anInt2362 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt2358 < 0) {
			this.anInt2358 = 0;
		} else if (this.anInt2358 > 255) {
			this.anInt2358 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt2357 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt2357 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt2362 < 0) {
			this.anInt2362 = 0;
		} else if (this.anInt2362 > 255) {
			this.anInt2362 = 255;
		}
		if (this.anInt2357 < 1) {
			this.anInt2357 = 1;
		}
		this.anInt2356 = (int) ((double) this.anInt2357 * local60);
	}
}
