import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	public int anInt433;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "I")
	public int anInt442;

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
	private int anInt435 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!dc;I)V")
	private void method375(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt435 = arg1.method660();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!dc;II)V")
	public void method377(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method672();
			if (local15 == 0) {
				return;
			}
			this.method375(local15, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	private void method381(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local30 < local14) {
			local32 = local30;
		}
		if (local30 > local14) {
			local34 = local30;
		}
		if (local34 < local21) {
			local34 = local21;
		}
		if (local32 > local21) {
			local32 = local21;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local34 + local32) / 2.0D;
		this.anInt434 = (int) (local68 * 256.0D);
		if (local32 != local34) {
			if (local68 < 0.5D) {
				local62 = (local34 - local32) / (local34 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local34 - local32) / (2.0D - local34 - local32);
			}
			if (local34 == local14) {
				local60 = (local30 - local21) / (local34 - local32);
			} else if (local30 == local34) {
				local60 = (local21 - local14) / (-local32 + local34) + 2.0D;
			} else if (local21 == local34) {
				local60 = (local14 - local30) / (-local32 + local34) + 4.0D;
			}
		}
		if (local68 > 0.5D) {
			this.anInt433 = (int) (local62 * 512.0D * (1.0D - local68));
		} else {
			this.anInt433 = (int) (local62 * 512.0D * local68);
		}
		if (this.anInt433 < 1) {
			this.anInt433 = 1;
		}
		local60 /= 6.0D;
		if (this.anInt434 < 0) {
			this.anInt434 = 0;
		} else if (this.anInt434 > 255) {
			this.anInt434 = 255;
		}
		this.anInt442 = (int) (local62 * 256.0D);
		if (this.anInt442 < 0) {
			this.anInt442 = 0;
		} else if (this.anInt442 > 255) {
			this.anInt442 = 255;
		}
		this.anInt447 = (int) ((double) this.anInt433 * local60);
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
	public void method384() {
		this.method381(this.anInt435);
	}
}
