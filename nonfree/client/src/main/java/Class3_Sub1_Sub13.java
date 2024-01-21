import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
	public int anInt2101;

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
	public int anInt2104;

	@OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
	public int anInt2114;

	@OriginalMember(owner = "client!pc", name = "pb", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "I")
	public int anInt2117;

	@OriginalMember(owner = "client!pc", name = "sb", descriptor = "I")
	public int anInt2118;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public int anInt2100 = 0;

	@OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
	public int anInt2108 = -1;

	@OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
	public int anInt2116 = -1;

	@OriginalMember(owner = "client!pc", name = "ib", descriptor = "Z")
	public boolean aBoolean123 = true;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BILclient!kd;)V")
	public void method1280(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		while (true) {
			@Pc(12) int local12 = arg1.method1803();
			if (local12 == 0) {
				return;
			}
			this.method1282(arg0, local12, arg1);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
	private void method1281(@OriginalArg(0) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		if (local23 < local10) {
			local32 = local23;
		}
		@Pc(40) double local40 = local10;
		if (local10 < local23) {
			local40 = local23;
		}
		@Pc(48) double local48 = 0.0D;
		if (local40 < local30) {
			local40 = local30;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(66) double local66 = (local32 + local40) / 2.0D;
		@Pc(68) double local68 = 0.0D;
		this.anInt2115 = (int) (local66 * 256.0D);
		if (this.anInt2115 < 0) {
			this.anInt2115 = 0;
		} else if (this.anInt2115 > 255) {
			this.anInt2115 = 255;
		}
		if (local32 != local40) {
			if (local40 == local10) {
				local48 = (local23 - local30) / (-local32 + local40);
			} else if (local23 == local40) {
				local48 = (local30 - local10) / (local40 - local32) + 2.0D;
			} else if (local30 == local40) {
				local48 = (local10 - local23) / (local40 - local32) + 4.0D;
			}
			if (local66 < 0.5D) {
				local68 = (local40 - local32) / (local32 + local40);
			}
			if (local66 >= 0.5D) {
				local68 = (local40 - local32) / (2.0D - local32 - local40);
			}
		}
		local48 /= 6.0D;
		this.anInt2104 = (int) (local68 * 256.0D);
		if (this.anInt2104 < 0) {
			this.anInt2104 = 0;
		} else if (this.anInt2104 > 255) {
			this.anInt2104 = 255;
		}
		this.anInt2118 = (int) (local48 * 256.0D);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIILclient!kd;)V")
	private void method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub8 arg2) {
		if (arg1 == 1) {
			this.anInt2100 = arg2.method1786();
		} else if (arg1 == 2) {
			this.anInt2108 = arg2.method1803();
		} else if (arg1 == 5) {
			this.aBoolean123 = false;
		} else if (arg1 == 7) {
			this.anInt2116 = arg2.method1786();
		}
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	public void method1284() {
		if (this.anInt2116 != -1) {
			this.method1281(this.anInt2116);
			this.anInt2114 = this.anInt2118;
			this.anInt2101 = this.anInt2115;
			this.anInt2117 = this.anInt2104;
		}
		this.method1281(this.anInt2100);
	}
}
