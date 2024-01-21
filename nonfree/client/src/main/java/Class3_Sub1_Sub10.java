import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
	public int anInt2135;

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "I")
	public int anInt2139;

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "I")
	public int anInt2141;

	@OriginalMember(owner = "client!o", name = "vb", descriptor = "I")
	public int anInt2147;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
	private int anInt2136 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!b;II)V")
	public void method1409(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(10) int local10 = arg0.method270();
			if (local10 == 0) {
				return;
			}
			this.method1410(local10, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!b;II)V")
	private void method1410(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			this.anInt2136 = arg1.method264();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	public void method1412() {
		this.method1413(this.anInt2136);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	private void method1413(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(38) double local38 = local10;
		if (local32 > local10) {
			local38 = local32;
		}
		@Pc(46) double local46 = 0.0D;
		@Pc(48) double local48 = 0.0D;
		if (local38 < local17) {
			local38 = local17;
		}
		@Pc(56) double local56 = local10;
		if (local32 < local10) {
			local56 = local32;
		}
		if (local56 > local17) {
			local56 = local17;
		}
		@Pc(74) double local74 = (local38 + local56) / 2.0D;
		this.anInt2141 = (int) (local74 * 256.0D);
		if (this.anInt2141 < 0) {
			this.anInt2141 = 0;
		} else if (this.anInt2141 > 255) {
			this.anInt2141 = 255;
		}
		if (local38 != local56) {
			if (local38 == local10) {
				local46 = (local32 - local17) / (local38 - local56);
			} else if (local32 == local38) {
				local46 = (local17 - local10) / (local38 - local56) + 2.0D;
			} else if (local38 == local17) {
				local46 = (local10 - local32) / (local38 - local56) + 4.0D;
			}
			if (local74 < 0.5D) {
				local48 = (local38 - local56) / (local38 + local56);
			}
			if (local74 >= 0.5D) {
				local48 = (local38 - local56) / ((2.0D - local38) - local56);
			}
		}
		this.anInt2135 = (int) (local48 * 256.0D);
		local46 /= 6.0D;
		if (local74 > 0.5D) {
			this.anInt2147 = (int) (local48 * (1.0D - local74) * 512.0D);
		} else {
			this.anInt2147 = (int) (local48 * local74 * 512.0D);
		}
		if (this.anInt2147 < 1) {
			this.anInt2147 = 1;
		}
		if (this.anInt2135 < 0) {
			this.anInt2135 = 0;
		} else if (this.anInt2135 > 255) {
			this.anInt2135 = 255;
		}
		this.anInt2139 = (int) ((double) this.anInt2147 * local46);
	}
}
