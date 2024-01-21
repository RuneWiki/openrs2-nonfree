import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
	public int anInt1427;

	@OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
	public int anInt1431;

	@OriginalMember(owner = "client!ib", name = "mb", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
	public int anInt1435;

	@OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
	public int anInt1436;

	@OriginalMember(owner = "client!ib", name = "Bb", descriptor = "I")
	public int anInt1442;

	@OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
	public int anInt1433 = 0;

	@OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
	public int anInt1430 = -1;

	@OriginalMember(owner = "client!ib", name = "X", descriptor = "Z")
	public boolean aBoolean62 = true;

	@OriginalMember(owner = "client!ib", name = "wb", descriptor = "I")
	public int anInt1439 = -1;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "(B)V")
	public void method903() {
		if (this.anInt1430 != -1) {
			this.method908(this.anInt1430);
			this.anInt1434 = this.anInt1427;
			this.anInt1442 = this.anInt1431;
			this.anInt1436 = this.anInt1435;
		}
		this.method908(this.anInt1433);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILclient!b;)V")
	private void method904(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2 arg2) {
		if (arg0 == 1) {
			this.anInt1433 = arg2.method264();
		} else if (arg0 == 2) {
			this.anInt1439 = arg2.method270();
		} else if (arg0 == 5) {
			this.aBoolean62 = false;
		} else if (arg0 == 7) {
			this.anInt1430 = arg2.method264();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILclient!b;)V")
	public void method906(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method270();
			if (local13 == 0) {
				return;
			}
			this.method904(local13, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	private void method908(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local23 > local14) {
			local34 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		if (local30 > local34) {
			local34 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(76) double local76 = (local34 + local32) / 2.0D;
		this.anInt1435 = (int) (local76 * 256.0D);
		if (this.anInt1435 < 0) {
			this.anInt1435 = 0;
		} else if (this.anInt1435 > 255) {
			this.anInt1435 = 255;
		}
		if (local34 != local32) {
			if (local14 == local34) {
				local60 = (local23 - local30) / (local34 - local32);
			} else if (local23 == local34) {
				local60 = (local30 - local14) / (local34 - local32) + 2.0D;
			} else if (local34 == local30) {
				local60 = (local14 - local23) / (local34 - local32) + 4.0D;
			}
			if (local76 < 0.5D) {
				local62 = (local34 - local32) / (local32 + local34);
			}
			if (local76 >= 0.5D) {
				local62 = (local34 - local32) / ((2.0D - local34) - local32);
			}
		}
		this.anInt1431 = (int) (local62 * 256.0D);
		if (this.anInt1431 < 0) {
			this.anInt1431 = 0;
		} else if (this.anInt1431 > 255) {
			this.anInt1431 = 255;
		}
		local60 /= 6.0D;
		this.anInt1427 = (int) (local60 * 256.0D);
	}
}
