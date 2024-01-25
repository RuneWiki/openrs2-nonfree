import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class58 {

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public int anInt1440;

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
	public int anInt1441;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	public int anInt1447;

	@OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
	public int anInt1438 = -1;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Z")
	public boolean aBoolean108 = true;

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "I")
	private int anInt1445 = 0;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
	public int anInt1446 = 128;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!kk;Z)V")
	public void method1197(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5350();
			if (local9 == 0) {
				return;
			}
			this.method1198(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILclient!kk;)V")
	private void method1198(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.anInt1445 = arg1.method5356();
			this.method1199(this.anInt1445);
		} else if (arg0 == 2) {
			this.anInt1438 = arg1.method5312();
			if (this.anInt1438 == 65535) {
				this.anInt1438 = -1;
			}
		} else if (arg0 == 3) {
			this.anInt1446 = arg1.method5312();
		} else if (arg0 == 4) {
			this.aBoolean108 = false;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V")
	private void method1199(@OriginalArg(1) int arg0) {
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
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local30 == local46) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
		}
		this.anInt1441 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		this.anInt1448 = (int) (local62 * 256.0D);
		if (this.anInt1448 < 0) {
			this.anInt1448 = 0;
		} else if (this.anInt1448 > 255) {
			this.anInt1448 = 255;
		}
		if (this.anInt1441 < 0) {
			this.anInt1441 = 0;
		} else if (this.anInt1441 > 255) {
			this.anInt1441 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt1440 = (int) ((1.0D - local68) * 512.0D * local62);
		} else {
			this.anInt1440 = (int) (local68 * local62 * 512.0D);
		}
		if (this.anInt1440 < 1) {
			this.anInt1440 = 1;
		}
		this.anInt1447 = (int) (local60 * (double) this.anInt1440);
	}
}
