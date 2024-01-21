import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
	public int anInt2673;

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
	public int anInt2675;

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
	public int anInt2678;

	@OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!sf", name = "gb", descriptor = "I")
	public int anInt2681;

	@OriginalMember(owner = "client!sf", name = "mb", descriptor = "I")
	public int anInt2684;

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
	public int anInt2671 = 0;

	@OriginalMember(owner = "client!sf", name = "cb", descriptor = "Z")
	public boolean aBoolean151 = true;

	@OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
	public int anInt2682 = -1;

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
	public int anInt2680 = -1;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILclient!of;)V")
	private void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub19 arg2) {
		if (arg0 == 1) {
			this.anInt2671 = arg2.method2048();
		} else if (arg0 == 2) {
			this.anInt2682 = arg2.method2072();
		} else if (arg0 == 5) {
			this.aBoolean151 = false;
		} else if (arg0 == 7) {
			this.anInt2680 = arg2.method2048();
		}
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public void method1796() {
		if (this.anInt2680 != -1) {
			this.method1799(this.anInt2680);
			this.anInt2679 = this.anInt2675;
			this.anInt2684 = this.anInt2681;
			this.anInt2678 = this.anInt2673;
		}
		this.method1799(this.anInt2671);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!of;)V")
	public void method1797(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method2072();
			if (local9 == 0) {
				return;
			}
			this.method1795(local9, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)V")
	private void method1799(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 > local14) {
			local32 = local23;
		}
		if (local32 < local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(48) double local48 = 0.0D;
		@Pc(50) double local50 = local14;
		if (local23 < local14) {
			local50 = local23;
		}
		if (local30 < local50) {
			local50 = local30;
		}
		@Pc(68) double local68 = (local32 + local50) / 2.0D;
		this.anInt2673 = (int) (local68 * 256.0D);
		if (this.anInt2673 < 0) {
			this.anInt2673 = 0;
		} else if (this.anInt2673 > 255) {
			this.anInt2673 = 255;
		}
		if (local50 != local32) {
			if (local68 < 0.5D) {
				local48 = (local32 - local50) / (local32 + local50);
			}
			if (local32 == local14) {
				local46 = (local23 - local30) / (-local50 + local32);
			} else if (local32 == local23) {
				local46 = (local30 - local14) / (local32 - local50) + 2.0D;
			} else if (local30 == local32) {
				local46 = (local14 - local23) / (local32 - local50) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local48 = (local32 - local50) / (2.0D - local32 - local50);
			}
		}
		this.anInt2681 = (int) (local48 * 256.0D);
		local46 /= 6.0D;
		this.anInt2675 = (int) (local46 * 256.0D);
		if (this.anInt2681 < 0) {
			this.anInt2681 = 0;
		} else if (this.anInt2681 > 255) {
			this.anInt2681 = 255;
			return;
		}
	}
}
