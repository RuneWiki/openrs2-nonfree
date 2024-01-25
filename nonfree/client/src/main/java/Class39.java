import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class39 {

	@OriginalMember(owner = "client!da", name = "e", descriptor = "I")
	public int anInt1107;

	@OriginalMember(owner = "client!da", name = "g", descriptor = "I")
	public int anInt1108;

	@OriginalMember(owner = "client!da", name = "i", descriptor = "I")
	public int anInt1110;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "I")
	public int anInt1111;

	@OriginalMember(owner = "client!da", name = "d", descriptor = "I")
	public int anInt1106 = 128;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	private int anInt1105 = 0;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Z")
	public boolean aBoolean101 = true;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "I")
	public int anInt1113 = -1;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dg;III)V")
	private void method1192(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt1105 = arg0.method4463();
			this.method1194(this.anInt1105);
		} else if (arg1 == 2) {
			this.anInt1113 = arg0.method4464();
			if (this.anInt1113 == 65535) {
				this.anInt1113 = -1;
			}
		} else if (arg1 == 3) {
			this.anInt1106 = arg0.method4464();
		} else if (arg1 == 4) {
			this.aBoolean101 = false;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!dg;ZI)V")
	public void method1193(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method4421();
			if (local5 == 0) {
				return;
			}
			this.method1192(arg0, local5, arg1);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	private void method1194(@OriginalArg(0) int arg0) {
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
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / ((2.0D - local46) - local32);
			}
		}
		this.anInt1108 = (int) (local68 * 256.0D);
		this.anInt1107 = (int) (local62 * 256.0D);
		local60 /= 6.0D;
		if (this.anInt1107 < 0) {
			this.anInt1107 = 0;
		} else if (this.anInt1107 > 255) {
			this.anInt1107 = 255;
		}
		if (this.anInt1108 < 0) {
			this.anInt1108 = 0;
		} else if (this.anInt1108 > 255) {
			this.anInt1108 = 255;
		}
		if (local68 > 0.5D) {
			this.anInt1110 = (int) ((1.0D - local68) * local62 * 512.0D);
		} else {
			this.anInt1110 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt1110 < 1) {
			this.anInt1110 = 1;
		}
		this.anInt1111 = (int) (local60 * (double) this.anInt1110);
	}
}
